import java.io.*;
import java.net.*;



public class client {
	
	private final static String hostname = "localhost";
	private final static int PORT = 8080;

	public static void main(String[] args) throws IOException {
		
		try(Socket clientSocket = new Socket(hostname, PORT);
		InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
				BufferedReader in = new BufferedReader(isr);
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)){
			System.out.println("Connected: " + hostname + " port:" + PORT);
			
			String data = "Hello";
			System.out.println("To server: \n" + data);
			out.print("data");
			String line;
			
			while((line = in.readLine()) != null) {
				System.out.println("Received:" + line);
				
			}
			
			
		}
						
				
		

	}

}
