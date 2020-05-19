package socket.prac01.sample;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerObject {

	public void serverStart() {

		// 1. 서버의 포트번호를 정함
		int port = 8080;
		ServerSocket server = null;
		try {
			// 2. ServerSocket 열기
			server = new ServerSocket(port);
			// 3. 클라이언트 쪽에서 접속 요청이 오길 기다림
			// 4. 접속 요청이 오면 요청 수락후 해당 클라이언트에 대한 소켓 객체 생성
			Socket client = server.accept();
			String clientIp = client.getInetAddress().getHostAddress();
			System.out.println(clientIp + "와 연결 되었습니다.");

			// 5. 연결된 클라이언트와 입출력 스트림 생성
			ObjectInputStream ois = new ObjectInputStream(client.getInputStream());

			OutputStream output = client.getOutputStream();
			Object res = ois.readObject();
			System.out.println(res);

			// 6. 보조스트림을 통한 성능 개선
			// 7. 스트림을 통해서 읽고 쓰기
			PrintWriter pw = new PrintWriter(output);
			pw.print("exit");
			pw.flush();
			
			//8. 통신 종료
			pw.close();
			ois.close();
			server.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
