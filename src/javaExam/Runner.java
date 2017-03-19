package javaExam;

public class Runner {

	public static void main(String[] args) {
		
		try {
			JFrameRegistration regAndLog = new JFrameRegistration();
			regAndLog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
