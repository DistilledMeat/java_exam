package javaExam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameSummary extends JFrame {
	
	public String testResult;
	
	Database db = new Database();
	UserInfo ui = new UserInfo();

	
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public JFrameSummary(UserInfo userInfo) {
		this.ui = userInfo;
		
		setTitle("Exam Summary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExamineeName = new JLabel("Examinee Name:");
		lblExamineeName.setBounds(25, 25, 90, 14);
		contentPane.add(lblExamineeName);
		
		JLabel JLabelExamineeName = new JLabel(ui.getLastName() + ", " +  ui.getFirstName());
		JLabelExamineeName.setBounds(125, 25, 130, 14);
		contentPane.add(JLabelExamineeName);
		
		JLabel lblExamineeNo = new JLabel("Examinee No.:");
		lblExamineeNo.setBounds(25, 50, 90, 14);
		contentPane.add(lblExamineeNo);
		
		JLabel JLabelExamineeNo = new JLabel(String.valueOf(ui.getExamineeNo()));
		JLabelExamineeNo.setBounds(125, 50, 130, 14);
		contentPane.add(JLabelExamineeNo);
		
		JLabel lblScore = new JLabel("Score:");
		lblScore.setBounds(25, 100, 90, 14);
		contentPane.add(lblScore);
		
		JLabel JLabelExamineeScore = new JLabel(ui.getTotalScore() + "/" + db.getQuestions().length);
		JLabelExamineeScore.setBounds(125, 100, 45, 14);
		contentPane.add(JLabelExamineeScore);
	
			if (ui.getTotalScore() >= 60){
				testResult = "Passed";
			}
			else {
				testResult = "Failed";
			}
		
		JLabel JLabelTestResult = new JLabel(testResult);
		JLabelTestResult.setBounds(209, 100, 46, 14);
		contentPane.add(JLabelTestResult);
		
		JButton btnOk = new JButton("Back to Login Page");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			JFrameLogin log = new JFrameLogin();
			log.setVisible(true);
			}
		});
		btnOk.setBounds(135, 127, 149, 23);
		contentPane.add(btnOk);
		
	}
}
