//server side code
package DataGrams;
import java.net.*;
import java.io.*;
import java.util.*;
public class Server {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ServerSocket ss = new ServerSocket(5000);
		Socket s = ss.accept();
		System.out.println("Client connected ");
		
		while(true) {
		//receiving message
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		String str = bf.readLine();
		System.out.println("Client:" + str);
		
		//replying
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		System.out.print("Enter message: ");
		String input = sc.nextLine();
		pr.println(input);
		pr.flush();
		}
		
	}
}
