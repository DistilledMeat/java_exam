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
import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class JFrameQuit extends JFrame {

	private JPanel contentPane;
//	private JFrameExam examFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameQuit frame = new JFrameQuit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//	public JFrameExam getExamFrame() {
//		return examFrame;
//	}
	
	/**
	 * Create the frame.
	 */
	public JFrameQuit() {
		setTitle("Quit Examination");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 145);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAreYouSure = new JLabel("Are you sure?");
		lblAreYouSure.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAreYouSure.setBounds(25, 25, 104, 23);
		contentPane.add(lblAreYouSure);
		
//		examFrame = new JFrameExam();
//		examFrame.getContentPane().setLayout(new BorderLayout());
//		examFrame.setDefaultCloseOperation(examFrame.DISPOSE_ON_CLOSE);
		
		JButton yesButton = new JButton("Yes");
		yesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
//			setVisible(false);
//			dispose();
			}
		});
		
		JButton noButton = new JButton("No");
		noButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			}
		});
		noButton.setBounds(191, 72, 89, 23);
		contentPane.add(noButton);
		
		yesButton.setBounds(92, 72, 89, 23);
		contentPane.add(yesButton);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{yesButton, noButton}));
	}
}
