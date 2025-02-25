package pack2network;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class NetClient1 {
	
	
	
	// 일회용 echo server에 접속후 메세지 전송용
	public static void main(String[] args) {
		try {
			// 서버 socket과 통신하기 위한 socket 객체를 생성 후 접속(server의 serverSocket.accept()를 만남)
			Socket socket = new Socket("192.168.0.85", 8888);
			
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
			writer.println("안녕하세요 from client" + "\n");	// 서버로 자료 전송
			writer.close();
			socket.close();
			
		} catch (Exception e) {
			System.out.println("client err: " + e);
		}
	}

}
