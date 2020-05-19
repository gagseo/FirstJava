package io.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilePrac {

	// 1. ����� : �ܺ��ڿ�(Ű����, ����, �����ͺ��̽� ����, ��Ʈ��ũ�� �ٸ� PC���)
	// �ڹ� ���α׷� Ȥ�� �޸𸮷� �����͸� �о���ų�(�Է�) �ݴ�� �ܺ��ڿ����� ���⸦ �ϴ°�(���)

	// 2. Stream : �����͸� ����� �ϱ� ���� ���� ���/
	// Stream�� �⺻������ �� �����̴�.
	// ���� �� �����Ͱ� ���� ���´�(FIFO)
	// �ݵ�� close()�޼��带 ȣ���� ��θ� �ݾ���� �Ѵ�!!!!

	// 3. ��Ʈ���� ����
	// �з� :
	// ����Ʈ ��Ʈ��, ���� ��Ʈ��
	// ��� ��Ʈ��, ������Ʈ��
	// 1)��� ��Ʈ��: � ���� �����͸� ��������� �����ִ� ��Ʈ��Ŭ����
	// FileInputStream/FileOutputStream : ���� ����� ��Ʈ��
	// ByteArrayInputStream/ByteArrayOutputStream : ����Ʈ�迭 ����� ��Ʈ��
	// PipedInputStream/PipedOutputStream : �����尣 ������ �ְ� ���� �� ����ϴ� ��Ʈ��
	// StringBufferInputStream/StringBufferOutputStream :
	// ���ڿ��� ����Ʈ�� �о���̰� ���� ��Ʈ���� �����Ѵ�.

	// 2)���� ��Ʈ��: ��� ��Ʈ���� ������ �����ϴ� Ŭ����(�ӵ�, ����߰�, ��ȯ�۾� ���)
	// ���ͽ�Ʈ���� ��ӹ޾Ƽ� ���ͽ�Ʈ���̶�� �θ��⵵ �Ѵ�.
	// (1) BufferedInputStream/BufferedOutputStream
	// ���ۿ� �����͸� ��� �Ѳ����� �۾��� �Ͽ� ���༺���� �������ش�.
	// (2) ObjectInputStream/ObjectOutputStream
	// ��ü�� ���� �Ǵ� ��Ʈ��ũ�� ������� �� �ֵ��� �����ش�.
	// �� �ݵ�� ����ȭ ó���� �ؾ��Ѵ�.
	// (3) DataInputStream/DataOutputStream
	// �⺻ �ڷ��� �����͸� �а� ���Ⱑ �����ϵ��� ����� �����Ѵ�.
	// (4) InputStreamReader/InputStreamWriter
	// �ҽ���Ʈ���� ����Ʈ ��� ��Ʈ��������, �����Ͱ� ������ ���
	// ���ڴ���(2byte)�� ������� �ϰԲ� ���ش�.

	public void fMethods() {

		// �ڹٿ��� Ư����ȣ�� ó���ϴ� ���
		// \ �� ���ָ� �ȴ�.
		// ������
		// \t : ��
		// \n(�ƽ�Ű�ڵ�10) : �ٹٲ�
		// \r(�ƽ�Ű�ڵ�13) : �ٹٲ� ver2 : ���� ���� ó������ Ŀ���� �̵�

		// System.out.println("\"������ �����غ�������\"");

		// File Class �޼���
		// ���, ���� �������ִ� �޼���
		// 1. createNewFile() : File��ü�� ������ �Ű������� ���� ��ο� ���ϸ���
		// ����� ������ ������ش�.
		// 2. mkdirs : File ��ü�� ������ �Ű������� ���� ����� ������ ����� �ش�.
		// mkdir

		// �۾��ϴ� �ڹ�������Ʈ�� ���� ����(��θ� �ۼ����� ����)
		File f = new File("test.txt");
		try {
			f.createNewFile();

			// ������ �����ϴ� ��ο� ���� �����ϱ�.
			f = new File("AAA\\bbb\\ccc");
			// f.createNewFile();

			// ��ο� ���� ����� �ֱ�
			f.mkdirs(); // �߰� ����� ������ �ѹ��� ���� ���ش�.
			// f.mkdir(); //�߰� ����� ������ �������� ������ ������ ������ �ʴ´�.

			f = new File("AAA\\bbb\\ccc");
			f.createNewFile();

			// ./ ������ġ
			// ������ġ
			// ../ �θ���ġ

			// �ش� ������ ������ �����ϴ���
			System.out.println(f.exists());
			if (!f.exists()) {  // ��ΰ� �������� �ʴ´ٸ�
				f.mkdirs(); // ��θ� �������
			}

			String fileName = "AGB.txt";
			String fileRes = f.getPath() + "\\" + fileName;
			f = new File(fileRes);
			f.createNewFile();

			// �׿� �޼���
			System.out.println("���ϸ� : " + f.getName());
			System.out.println("���� ����� : " + f.getPath());
			System.out.println("���� ������ : " + f.getAbsolutePath());
			System.out.println("���� ���� : " + f.getParent());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void fInOut() {

		OutputStream os = null;
		InputStream is = null;

		// OutputStream : ��½�Ʈ��, �ڹ����α׷� ---> �����͸�����

		try {
			os = new FileOutputStream("test.txt");
			String str = "���̿� �ʹ� ����."; // �ѱ��� 256�� ������ �Ѿ��. FileRW class Ȯ��
			os.write(str.getBytes()); // String�� byte�迭�� ����

			is = new FileInputStream("test.txt");
			int check = is.read(); //�����͸� �о���� �޼ҵ� - 1byte�� �о�´�.
			System.out.println(check);
			System.out.println((char) check + "");

			while ((check = is.read()) != -1) {
				System.out.println((char) check);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close(); // �ݵ�� �ݾ�����Ѵ�.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
