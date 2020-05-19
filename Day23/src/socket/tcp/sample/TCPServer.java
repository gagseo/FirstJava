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
	// - ������ ���� ����Ǿ� Ŭ���̾�Ʈ�� ��û�� ��ٸ���.
	// - ����, Ŭ���̾�Ʈ�� ���α׷��� ���� �����Ѵ�.

	// Socket
	// - ���μ������� ����� ����Ѵ�.
	// InputStream, OutputStream�� ������ �ִ�.

	// ServerSocket
	// - ��Ʈ�� ����Ǿ �ܺο�û�� ��ٸ��ٰ�, ��û�� ������ Socket�� �������ش�.
	// ServerSocket ������ ���ϰ� Ŭ���̾�Ʈ�� ���ϰ� ����� �̷�� ������ ���ش�.
	// �� ��Ʈ�� �ϳ��� ServerSocket�� ������ �� �ִ�.

	public void serverStart() {

		// ������ ���� ���α׷��� ����(�߿�)
		// 1. ������ ��Ʈ�� ����
		int port = 8080;

		// 2. ������ ���� ��ü ����
		try {
			ServerSocket server = new ServerSocket(port);

			// 3. Ŭ���̾�Ʈ �ʿ��� ���� ��û�� ���� ��ٸ�
			// 4. ���� ��û�� ���� ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			Socket client = server.accept();

			String clientIp = client.getInetAddress().getHostAddress(); // Ŭ���̾�Ʈ IPȮ��
			System.out.println(clientIp + "�� ������ ��û��...");

			// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();

			// 6. ������Ʈ���� ���� ���� ����
			// �������� : Reader / Writer ���
			// �ӵ���� : BufferedReader / BufferedWriter

			InputStreamReader isr = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(isr);

			// �޼��� ������ ���ؼ� printWriter
			PrintWriter pw = new PrintWriter(output);

			// 7. ��Ʈ���� ���� �а� ����
			String message = br.readLine();
			System.out.println(clientIp + "�� ���� �޼���" + message);

			pw.println("�ڵ帶���� ���");
			pw.flush();

			// 8. ��� ����
			pw.close();
			br.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
