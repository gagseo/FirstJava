package socket.tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {

	public void clientStart() {

		// 1. ������ IP�ּҿ� ������ ���� ��Ʈ��ȣ�� �Ű������� �Ͽ� Ŭ���̾�Ʈ�� ���� ���
		// ������ IP�ּ� : �����е� ��ǻ�� �ּ� IP
		// ��Ʈ��ȣ : 8080;

		int port = 8080;
		String serverIp = "192.168.10.33";

		try {
			Socket server = new Socket(serverIp, port);
			// ���ῡ ���ῡ ������ ��� null�� ��ȯ���ش�.

			if (server != null) {

				// 2. �������� ����� ��Ʈ�� ����
				// 3. ���� ��Ʈ���� ���� ���� ����
				BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
				PrintWriter pw = new PrintWriter(server.getOutputStream());

				// 4. ��Ʈ���� ���� �а� ����
				// ����
				pw.println("�ݰ�����!!");
				pw.flush();

				// �б�
				System.out.println(br.readLine());

				// 5. ��� ����
				pw.close();
				br.close();

			}
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
