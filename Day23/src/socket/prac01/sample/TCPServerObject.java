package socket.prac01.sample;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerObject {

	public void serverStart() {

		// 1. ������ ��Ʈ��ȣ�� ����
		int port = 8080;
		ServerSocket server = null;
		try {
			// 2. ServerSocket ����
			server = new ServerSocket(port);
			// 3. Ŭ���̾�Ʈ �ʿ��� ���� ��û�� ���� ��ٸ�
			// 4. ���� ��û�� ���� ��û ������ �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			Socket client = server.accept();
			String clientIp = client.getInetAddress().getHostAddress();
			System.out.println(clientIp + "�� ���� �Ǿ����ϴ�.");

			// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			ObjectInputStream ois = new ObjectInputStream(client.getInputStream());

			OutputStream output = client.getOutputStream();
			Object res = ois.readObject();
			System.out.println(res);

			// 6. ������Ʈ���� ���� ���� ����
			// 7. ��Ʈ���� ���ؼ� �а� ����
			PrintWriter pw = new PrintWriter(output);
			pw.print("exit");
			pw.flush();
			
			//8. ��� ����
			pw.close();
			ois.close();
			server.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
