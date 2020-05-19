package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.zxing.qrcode.encoder.QRCode;

import model.service.QRCodeMaker;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class MainFram extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private JTextArea Title;
	private JTextArea URL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFram frame = new MainFram();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFram() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("QRCodeMaker");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(145, 24, 165, 50);
		contentPane.add(lblNewLabel);

		Title = new JTextArea();
		Title.setBounds(50, 109, 150, 150);
		contentPane.add(Title);

		JLabel lblTitle2 = new JLabel("URL");
		lblTitle2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTitle2.setBounds(258, 84, 57, 15);
		contentPane.add(lblTitle2);

		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTitle.setBounds(96, 84, 57, 15);
		contentPane.add(lblTitle);

		URL = new JTextArea();
		URL.setBounds(213, 109, 150, 150);
		contentPane.add(URL);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(145, 307, 97, 23);
		contentPane.add(btnNewButton);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Click");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			String titles = Title.getText();
			String[] titleArr = titles.split("[\r\n]");
			String urls = URL.getText();
			String[] urlArr = urls.split("[\r\n]");

			QRCodeMaker qm = new QRCodeMaker();
			qm.qrmaker(urlArr, titleArr);
			JOptionPane.showMessageDialog(null, "작업완료되었습니다.");
			
			// 프로그램창 가운데 띄우기
			
			// 작업완료 후 자동 종료하기
			System.exit(0);

		}
	}
}
