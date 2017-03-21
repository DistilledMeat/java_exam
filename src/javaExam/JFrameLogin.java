package javaExam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import com.services.DatabaseService;

import java.awt.Component;

public class JFrameLogin extends JFrame {

	private JPanel contentPane;
	private JTextField userNameJF;
	private JPasswordField pwordJF;
	private JButton btnRegister;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameLogin frame = new JFrameLogin();
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
	public JFrameLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrameRegistration reg = new JFrameRegistration();
				setVisible(false);
				reg.setVisible(true);
			}
		});
		btnRegister.setBounds(106, 127, 89, 23);
		contentPane.add(btnRegister);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			UserInfo userInfo = DatabaseService.findByUsername(userNameJF.getText());
				if(userInfo != null && userInfo.getPword().equals(String.valueOf(pwordJF.getPassword()))){
					setVisible(false);
					JFrameExam exam = new JFrameExam(userInfo);
					exam.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Username or password not valid");
				}
			}
		});
		File file = new File("db/UserInfo.txt");
			if (file.exists()){
				btnLogin.setEnabled(true);
			} else {
				btnLogin.setEnabled(false);
			}
		btnLogin.setBounds(205, 127, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setBounds(10, 30, 70, 14);
		contentPane.add(lblUserName);
		
		userNameJF = new JTextField();
		userNameJF.setColumns(10);
		userNameJF.setBounds(80, 27, 135, 20);
		contentPane.add(userNameJF);
		
		pwordJF = new JPasswordField();
		pwordJF.setEchoChar('*');
		pwordJF.setColumns(10);
		pwordJF.setBounds(80, 55, 135, 20);
		contentPane.add(pwordJF);
		
		JLabel label_2 = new JLabel("Password:");
		label_2.setBounds(10, 58, 70, 14);
		contentPane.add(label_2);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{userNameJF, pwordJF, btnLogin, btnRegister}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{userNameJF, pwordJF, btnLogin, btnRegister, lblUserName, label_2, contentPane}));
		

	}

}
