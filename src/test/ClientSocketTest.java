package test;

import java.io.IOException;
import java.net.Socket;

public class ClientSocketTest {
	public static void main(String[] args) {
		Socket socket;
		String serverIp = "192.168.112.103";
		
		try {
			socket = new Socket(serverIp, 7777);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
