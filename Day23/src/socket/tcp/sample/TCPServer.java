package socket.tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	// TCP(Transmission Control Protocol)
	// - 서버가 먼저 실행되어 클라이언트의 요청을 기다린다.
	// - 서버, 클라이언트용 프로그램을 따로 구현한다.

	// Socket
	// - 프로세스간의 통신을 담당한다.
	// InputStream, OutputStream을 가지고 있다.

	// ServerSocket
	// - 포트와 연결되어서 외부요청을 기다리다가, 요청이 들어오면 Socket을 생성해준다.
	// ServerSocket 생성한 소켓과 클라이언트의 소켓간 통신이 이루어 지도록 해준다.
	// 한 포트에 하나의 ServerSocket만 연결할 수 있다.

	public void serverStart() {

		// 서버용 소켓 프로그래밍 순서(중요)
		// 1. 서버의 포트를 정함
		int port = 8080;

		// 2. 서버의 소켓 객체 생성
		try {
			ServerSocket server = new ServerSocket(port);

			// 3. 클라이언트 쪽에서 접속 요청이 오길 기다림
			// 4. 접속 요청이 오면 수락 후 해당 클라이언트에 대해 소켓 객체 생성
			Socket client = server.accept();

			String clientIp = client.getInetAddress().getHostAddress(); // 클라이언트 IP확인
			System.out.println(clientIp + "가 연결을 요청함...");

			// 5. 연결된 클라이언트와 입출력 스트림 생성
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();

			// 6. 보조스트림을 통해 성능 개선
			// 문자형태 : Reader / Writer 사용
			// 속도향상 : BufferedReader / BufferedWriter

			InputStreamReader isr = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(isr);

			// 메세지 전송을 위해서 printWriter
			PrintWriter pw = new PrintWriter(output);

			// 7. 스트림을 통해 읽고 쓰기
			String message = br.readLine();
			System.out.println(clientIp + "가 보낸 메세지" + message);

			pw.println("코드마스터 고고");
			pw.flush();

			// 8. 통신 종료
			pw.close();
			br.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
