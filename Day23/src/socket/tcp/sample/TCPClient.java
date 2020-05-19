package socket.tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {

	public void clientStart() {

		// 1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 사용
		// 서버의 IP주소 : 여러분들 컴퓨터 주소 IP
		// 포트번호 : 8080;

		int port = 8080;
		String serverIp = "192.168.10.33";

		try {
			Socket server = new Socket(serverIp, port);
			// 만얀에 연결에 실패할 경우 null을 반환해준다.

			if (server != null) {

				// 2. 서버와의 입출력 스트림 오픈
				// 3. 보조 스트림을 통해 성능 개선
				BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
				PrintWriter pw = new PrintWriter(server.getOutputStream());

				// 4. 스트림을 통해 읽고 쓰기
				// 쓰기
				pw.println("반가워요!!");
				pw.flush();

				// 읽기
				System.out.println(br.readLine());

				// 5. 통신 종료
				pw.close();
				br.close();

			}
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
