package javaExam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JFrameSummary extends JFrame {
	
	Database db = new Database();
	UserInfo ui = new UserInfo();
	JFrameExam exam = new JFrameExam();
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameSummary frame = new JFrameSummary();
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
	public JFrameSummary() {
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
		
		JLabel JLabelExamineeName = new JLabel("Doe, John");
		JLabelExamineeName.setBounds(125, 25, 130, 14);
		contentPane.add(JLabelExamineeName);
		
		JLabel lblExamineeNo = new JLabel("Examinee No.:");
		lblExamineeNo.setBounds(25, 50, 90, 14);
		contentPane.add(lblExamineeNo);
		
		JLabel JLabelExamineeNo = new JLabel("1");
		JLabelExamineeNo.setBounds(125, 50, 130, 14);
		contentPane.add(JLabelExamineeNo);
		
		JLabel lblScore = new JLabel("Score:");
		lblScore.setBounds(25, 100, 90, 14);
		contentPane.add(lblScore);
		
		JLabel JLabelExamineeScore = new JLabel(ui.getTotalScore() + "/" + db.getQuestions().length);
		JLabelExamineeScore.setBounds(125, 100, 45, 14);
		contentPane.add(JLabelExamineeScore);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(195, 127, 89, 23);
		contentPane.add(btnOk);
	}
}