//client side code
package DataGrams;
import java.net.*;
import java.io.*;
import java.util.*;
public class Client {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 5000);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		//send message to server
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		System.out.print("Enter mesage:");
		String input = sc.nextLine();
		pr.println(input);
		pr.flush();
		// receive message from server
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		String str = bf.readLine();
		System.out.println("Server: " + str);
		}
	}
}