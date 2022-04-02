import java.io.*;

import java.net.*;


public class server {
	
	private final static int PORT = 8080;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket serverSocket = new ServerSocket(PORT);
		
		System.out.println("Waiting for " + PORT);
		
		while(true) {
			try (Socket socket = serverSocket.accept();
				InputStreamReader isr = new InputStreamReader(socket.getInputStream());
					BufferedReader in = new BufferedReader(isr);
					PrintWriter out = new PrintWriter(socket.getOutputStream());
					
				) { 
				System.out.println("Connected!");
				
				String line;
				while ((line = in.readLine()) != null) {
					System.out.println("Message Received: " + line + ". To Client");
					out.println(line);
					
					if(line.equals("Goodbye")) {
						break;
					}
				}
				
			}
					
			
		}
		
		
		
		
		
		

	}

}
