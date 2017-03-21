package javaExam;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import com.services.DatabaseService;

import java.awt.Component;

public class JFrameExam extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup answersRBButtonGroup = new ButtonGroup();
	private int index = 0;
	
	Database db = new Database();
	UserInfo ui;


	/**
	 * Create the frame.
	 */
	public JFrameExam(UserInfo userInfo) {
		ui = userInfo;
		ui.setTotalScore(0);	// reset total score
		DatabaseService.update(ui);
		
		setTitle("Java Exam");
		
		System.out.println("No. of questions: " + db.getUserAnswer().length);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
/*------------------------------------<Test Question>-------------------------------------*/
		JLabel testQuestion = new JLabel("<html><body style='width: " + "425" + "px'>" + db.getQuestions()[0]);
		testQuestion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		testQuestion.setBounds(10, 11, 562, 67);
		contentPane.add(testQuestion);
/*------------------------------------</Test Question>-------------------------------------*/	
		
/*--------------------------------------<ABCD Label>---------------------------------------*/		
		JLabel lblA = new JLabel("A.");
		lblA.setBounds(10, 104, 15, 14);
		contentPane.add(lblA);
		JLabel lblB = new JLabel("B.");
		lblB.setBounds(10, 162, 15, 14);
		contentPane.add(lblB);
		JLabel lblC = new JLabel("C.");
		lblC.setBounds(321, 104, 15, 14);
		contentPane.add(lblC);
		JLabel lblD = new JLabel("D.");
		lblD.setBounds(321, 162, 15, 14);
		contentPane.add(lblD);
/*--------------------------------------</ABCD Label>---------------------------------------*/		

/*------------------------------------<Radio Buttons>-------------------------------------*/
		JRadioButton aRadioButton = new JRadioButton("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB1()[0]);
		aRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		answersRBButtonGroup.add(aRadioButton);
		aRadioButton.setBounds(31, 88, 230, 45);
		contentPane.add(aRadioButton);
		JRadioButton bRadioButton = new JRadioButton("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB2()[0]);
		bRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		answersRBButtonGroup.add(bRadioButton);
		bRadioButton.setBounds(31, 146, 230, 45);
		contentPane.add(bRadioButton);
		JRadioButton cRadioButton = new JRadioButton("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB3()[0]);
		cRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		answersRBButtonGroup.add(cRadioButton);
		cRadioButton.setBounds(342, 88, 230, 45);
		contentPane.add(cRadioButton);
		JRadioButton dRadioButton = new JRadioButton("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB4()[0]);
		dRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		answersRBButtonGroup.add(dRadioButton);
		dRadioButton.setBounds(342, 146, 230, 45);
		contentPane.add(dRadioButton);
/*------------------------------------</Radio Buttons>------------------------------------*/
		
/*------------------------------------<Selected Answer>-------------------------------------*/
		JLabel answerLabel = new JLabel("Selected Answer: ");
		answerLabel.setBounds(10, 225, 109, 14);
		contentPane.add(answerLabel);
		
		JLabel selectedAnswerLabel = new JLabel("");
		selectedAnswerLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		selectedAnswerLabel.setBounds(129, 225, 40, 14);
		contentPane.add(selectedAnswerLabel);
/*------------------------------------</Selected Answer>------------------------------------*/
		
/*--------------------------------<Display Chosen Answer>---------------------------------*/
		aRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedAnswerLabel.setText("A");

			}
		});
		
		bRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedAnswerLabel.setText("B");	
				
			}
		});
		
		cRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedAnswerLabel.setText("C");	
				
			}
		});
		dRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedAnswerLabel.setText("D");	
				
			}
		});
/*--------------------------------</Display Chosen Answer>----------------------------------*/
		
/*--------------------------------------<Next Button>---------------------------------------*/
//Next
		JButton btnNxt = new JButton("Next");
		btnNxt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

// TODO: save answer
				if (aRadioButton.isSelected()) {
					db.setUserAnswer("a", index);
				}
				else if (bRadioButton.isSelected()) {
					db.setUserAnswer("b", index);
				}
				else if (cRadioButton.isSelected()) {
					db.setUserAnswer("c", index);
				}
				else if (dRadioButton.isSelected()) {
					db.setUserAnswer("d", index);
				}
				else {
				}
				
// Increment totalScore
/*Right*/		if (db.getUserAnswer()[index] == db.getRightAnswer()[index]){
					ui.setTotalScore(ui.getTotalScore() + 1);
					//TEST: See Answers and points on Console
					System.out.println("Selected Choice: " + db.getUserAnswer()[index]);
					System.out.println("Points: " + ui.getTotalScore());
					index++;
					// clear selection
					answersRBButtonGroup.clearSelection();
					selectedAnswerLabel.setText("");
					// Display next question and answer
					testQuestion.setText("<html><body style='width: " + "425" + "px'>" + db.getQuestions()[index]);
					aRadioButton.setText("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB1()[index]);
					bRadioButton.setText("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB2()[index]);
					cRadioButton.setText("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB3()[index]);
					dRadioButton.setText("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB4()[index]);
				}
/*None*/		else if (db.getUserAnswer()[index] == null){
					int skip = JOptionPane.showConfirmDialog(null, "Are you sure?", "Skip Question", JOptionPane.YES_NO_OPTION);
						if (skip == JOptionPane.YES_OPTION){
							//TEST: See Answers and points on Console
							System.out.println("Selected Choice: " + db.getUserAnswer()[index]);
							System.out.println("Points: " + ui.getTotalScore());
							index++;
							// clear selection
							answersRBButtonGroup.clearSelection();
							selectedAnswerLabel.setText("");
							// Display next question and answer
							testQuestion.setText("<html><body style='width: " + "425" + "px'>" + db.getQuestions()[index]);
							aRadioButton.setText("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB1()[index]);
							bRadioButton.setText("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB2()[index]);
							cRadioButton.setText("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB3()[index]);
							dRadioButton.setText("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB4()[index]);
						}
						else {
							JOptionPane.getRootFrame().dispose();
						}
				}
/*Wrong*/		else {
					//TEST: See Answers and points on Console
					System.out.println("Selected Choice: " + db.getUserAnswer()[index]);
					System.out.println("Points: " + ui.getTotalScore());
					index++;
					// clear selection
					answersRBButtonGroup.clearSelection();
					selectedAnswerLabel.setText("");
					// Display next question and answer
					testQuestion.setText("<html><body style='width: " + "425" + "px'>" + db.getQuestions()[index]);
					aRadioButton.setText("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB1()[index]);
					bRadioButton.setText("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB2()[index]);
					cRadioButton.setText("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB3()[index]);
					dRadioButton.setText("<html><body style='width: " + "150" + "px'>" + db.getAnswersRB4()[index]);
				}
			}

		});
		
		btnNxt.setBounds(321, 229, 65, 32);
		contentPane.add(btnNxt);
/*--------------------------------------</Next Button>--------------------------------------*/

/*--------------------------------------<Submit Button>---------------------------------------*/		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int submit = JOptionPane.showConfirmDialog(null, "Are you sure?", "Submit Exam", JOptionPane.YES_NO_OPTION);
					if (submit == JOptionPane.YES_OPTION){
						DatabaseService.update(ui);
						JFrameSummary sum = new JFrameSummary(ui);
						sum.setVisible(true);
						setVisible(false);
					}
					else {
						JOptionPane.getRootFrame().dispose();
					}
			}
		});
		btnSubmit.setBounds(417, 229, 80, 32);
		contentPane.add(btnSubmit);
/*--------------------------------------</Submit Button>---------------------------------------*/	

/*--------------------------------------<Quit Button>---------------------------------------*/
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*Enter Quit Program*/
			JFrameQuit quit = new JFrameQuit();
			quit.setVisible(true);
			}
		});
		quitButton.setBounds(507, 229, 65, 32);
		contentPane.add(quitButton);		
/*--------------------------------------</Quit Button>--------------------------------------*/
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{aRadioButton, bRadioButton, cRadioButton, dRadioButton, btnNxt, quitButton}));
	
	}
}