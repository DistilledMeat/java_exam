package com.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javaExam.UserInfo;

public class DatabaseService {

	public static int save(Object obj) {
		
		if (obj instanceof UserInfo) {
			UserInfo user = (UserInfo) obj;
			// get UserInfo file
			FileWriter writer;

			// create the "db" directory
			File directory = new File("db");
			if (!directory.exists()) {	// if "db" directory does not exist
				directory.mkdirs();	// create "db" directory
			}
			// create "UserInfo.txt" inside db directory
			File file = new File("db/UserInfo.txt");
			
			try {
				if (!file.exists()) {
					writer = new FileWriter(file);
					writer.write("id|username|firstName|lastName|pword|totalScore\r\n");
					writer.write(toPipeDelimitedString(user));
				} else {
					// get last ID
					int lastID = getLastID(user);
					user.setExamineeNo(lastID + 1);
					writer = new FileWriter(file, true); // instantiate FileWriter to "append" mode (which means it will not replace existing contents of file)
					writer.write(toPipeDelimitedString(user));
				}
				writer.flush();
				writer.close();
				
				return 0;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return -1;
	}
	
	public static int update(Object obj) {
		if (obj instanceof UserInfo) {
			// prepare readers
			File file = new File("db/UserInfo.txt");
			FileReader fr;
			
			try {
				fr = new FileReader(file);
				BufferedReader reader = new BufferedReader(fr);
				String line;
				
				while ((line = reader.readLine()) != null) {
					// TODO: replace line in text file
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return -1;
	}
	
	public static UserInfo findByUsername(String username) {
		// prepare readers
		File file = new File("db/UserInfo.txt");
		FileReader fr;
		
		try {
			fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			String line;
			
			while ((line = reader.readLine()) != null) {
				String selectedUsername = line.split("|")[1];
				if (selectedUsername.equals(username)) {
					return getByID(line.split("|")[0]);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
	public static UserInfo getByID(String id) {
		// prepare readers
		File file = new File("db/UserInfo.txt");
		FileReader fr;
		
		try {
			fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			String line;
			
			while ((line = reader.readLine()) != null) {
				if (id.equals(line.split("|")[0])) {
					UserInfo user = new UserInfo();
					user.setExamineeNo(Integer.parseInt(line.split("|")[0]));
					user.setUsername(line.split("|")[1]);
					user.setFirstName(line.split("|")[2]);
					user.setLastName(line.split("|")[3]);
					user.setPword(line.split("|")[4]);
					try {
						user.setTotalScore(Integer.parseInt(line.split("|")[5]));
					} catch (Exception e) {
						user.setTotalScore(0);
					}
					
					return user;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

	public static int getLastID(Object obj) {
		int output = -1;
		
		if (obj instanceof UserInfo) {
			File file = new File("db/UserInfo.txt");
			FileReader fr;
			try {
				fr = new FileReader(file);
				BufferedReader reader = new BufferedReader(fr);
				String line;
				
				while ((line = reader.readLine()) != null) {
					try {
						output = Integer.parseInt(line.split("|")[0]);
					} catch (Exception e) {
						// parsing exception
					}
				}
				reader.close();
				return output;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return -1;
	}

	private static String toPipeDelimitedString(UserInfo UserInfo) {
		String output = "";
		if (Integer.valueOf(UserInfo.getExamineeNo()) != null) {
			output += UserInfo.getExamineeNo();
		}
		output += "|";
		if (UserInfo.getUsername() != null) {
			output += UserInfo.getUsername();
		}
		output += "|";
		if (UserInfo.getFirstName() != null) {
			output += UserInfo.getFirstName();
		}
		output += "|";
		if (UserInfo.getLastName() != null) {
			output += UserInfo.getLastName();
		}
		output += "|";
		if (UserInfo.getPword() != null) {
			output += UserInfo.getPword();
		}
		output += "|";
		if (Integer.valueOf(UserInfo.getTotalScore()) != null) {
			output += UserInfo.getTotalScore();
		}
		output += System.lineSeparator();
		
		return output;
	}
	
}