package javaExam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.services.DatabaseService;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class JFrameRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameJF;
	private JLabel lblLastName;
	private JTextField lastNameJF;
	private JLabel lblPassword;
	private JPasswordField pwordJF;
	private JLabel lblUserName;
	private JTextField userNameJF;

	/**
	 * Create the frame.
	 */
	public JFrameRegistration() {
		
		UserInfo ui = new UserInfo();
		
		setTitle("Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 30, 70, 14);
		contentPane.add(lblFirstName);
		
		firstNameJF = new JTextField();
		firstNameJF.setBounds(80, 27, 135, 20);
		contentPane.add(firstNameJF);
		firstNameJF.setColumns(10);
		
		lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(10, 58, 70, 14);
		contentPane.add(lblLastName);
		
		lastNameJF = new JTextField();
		lastNameJF.setColumns(10);
		lastNameJF.setBounds(80, 55, 135, 20);
		contentPane.add(lastNameJF);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 131, 70, 14);
		contentPane.add(lblPassword);
		
		pwordJF = new JPasswordField();
		pwordJF.setEchoChar('*');
		pwordJF.setColumns(10);
		pwordJF.setBounds(80, 128, 135, 20);
		contentPane.add(pwordJF);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
		JFrameLogin login = new JFrameLogin();
			public void actionPerformed(ActionEvent arg0) {
				ui.setFirstName(firstNameJF.getText());
				ui.setLastName(lastNameJF.getText());
				ui.setUsername(userNameJF.getText());
				ui.setPword(String.valueOf(pwordJF.getPassword()));
				DatabaseService.save(ui);
				setVisible(false);
				login.setVisible(true);
			}
		});
		btnOk.setBounds(205, 177, 89, 23);
		contentPane.add(btnOk);
		
		lblUserName = new JLabel("User Name:");
		lblUserName.setBounds(10, 103, 70, 14);
		contentPane.add(lblUserName);
		
		userNameJF = new JTextField();
		userNameJF.setColumns(10);
		userNameJF.setBounds(80, 100, 135, 20);
		contentPane.add(userNameJF);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{firstNameJF, lastNameJF, userNameJF, pwordJF, btnOk}));
		
		contentPane.setVisible(true);
	}
}
