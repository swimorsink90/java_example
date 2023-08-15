package tcp.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		
		Socket socket = null;
		try {
			//소켓 생성
			socket = new Socket();
			
			//연결요청
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost",5001));
			
			System.out.println("[연결 성공]");
		}catch(Exception e) {
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			}catch(IOException e) {
				
			}
		}

	}

}
