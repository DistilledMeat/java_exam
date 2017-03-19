package javaExam;

public class UserInfo {
	private static int examineeCounter = 0;
	private int examineeNo, totalScore;
	private String firstName, lastName, username, pword;
	
	public UserInfo() {
		examineeCounter++;
		examineeNo = examineeCounter;
	}
	
	public int getExamineeNo() {
		return examineeNo;
	}
	public void setExamineeNo(int examineeNo) {
		this.examineeNo = examineeNo;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	
}
