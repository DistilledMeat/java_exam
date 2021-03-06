package javaExam;

public class Database {
	private String 
	questions[] = {"Which of these keyword must be used to inherit a class?", "Which of these keywords is used to refer to member of base class from a sub class?", "A class member declared protected becomes member of subclass of which type?", "Which of these is correct way of inheriting class A by class B?", "Which of the following statements are incorrect?", "What type of inheritance does Java have?", "Say that there are three classes: Computer, AppleComputer, and IBMComputer. What are the likely relationships between these classes?", "Can an object be a subclass of another object?", "How many objects of a given class can there be in a program?", "What restriction is there on using the super reference in a constructor?", "Which of the following is correct syntax for defining a new class Jolt based on the superclass SoftDrink?", "A class Car and its subclass Yugo both have a method run() which was written by the programmer as part of the class definition. If junker refers to an object of type Yugo, what will the following code do?  junker.show();", "A class Animal has a subclass Mammal. Which of the following is true:", "Does a subclass inherit both member variables and methods?", "Which of the following is NOT an advantage to using inheritance?", "Private members of a class are inherited to sub class. True or false?", "Does Java support Multiple Inheritance ?", "Can we reduce the visibility of the inherited or overridden method ?", "Which of the followinag is tightly bound ? Inheritance or Composition ?", "Does a class inherit the constructor of its super class?", "Which of the following Java feature promotes Code Re usability ?", "Can a class extend itself?", "Which of these keyword must be used to inherit a class?", "Which of these keywords is used to refer to member of base class from a sub class?", "A class member declared protected becomes member of subclass of which type?", "Which of these is correct way of inheriting class A by class B?", "Which of the following statements are incorrect?", "What type of inheritance does Java have?", "Say that there are three classes: Computer, AppleComputer, and IBMComputer. What are the likely relationships between these classes?", "Can an object be a subclass of another object?", "How many objects of a given class can there be in a program?", "What restriction is there on using the super reference in a constructor?", "Which of the following is correct syntax for defining a new class Jolt based on the superclass SoftDrink?", "A class Car and its subclass Yugo both have a method run() which was written by the programmer as part of the class definition. If junker refers to an object of type Yugo, what will the following code do?  junker.show();", "A class Animal has a subclass Mammal. Which of the following is true:", "Does a subclass inherit both member variables and methods?", "Which of the following is NOT an advantage to using inheritance?", "Private members of a class are inherited to sub class. True or false?", "Does Java support Multiple Inheritance ?", "Can we reduce the visibility of the inherited or overridden method ?", "Which of the followinag is tightly bound ? Inheritance or Composition ?", "Does a class inherit the constructor of its super class?", "Which of the following Java feature promotes Code Re usability ?", "Can a class extend itself?", "Which of these keyword must be used to inherit a class?", "Which of these keywords is used to refer to member of base class from a sub class?", "A class member declared protected becomes member of subclass of which type?", "Which of these is correct way of inheriting class A by class B?", "Which of the following statements are incorrect?", "What type of inheritance does Java have?", "Say that there are three classes: Computer, AppleComputer, and IBMComputer. What are the likely relationships between these classes?", "Can an object be a subclass of another object?", "How many objects of a given class can there be in a program?", "What restriction is there on using the super reference in a constructor?", "Which of the following is correct syntax for defining a new class Jolt based on the superclass SoftDrink?", "A class Car and its subclass Yugo both have a method run() which was written by the programmer as part of the class definition. If junker refers to an object of type Yugo, what will the following code do?  junker.show();", "A class Animal has a subclass Mammal. Which of the following is true:", "Does a subclass inherit both member variables and methods?", "Which of the following is NOT an advantage to using inheritance?", "Private members of a class are inherited to sub class. True or false?", "Does Java support Multiple Inheritance ?", "Can we reduce the visibility of the inherited or overridden method ?", "Which of the followinag is tightly bound ? Inheritance or Composition ?", "Does a class inherit the constructor of its super class?", "Which of the following Java feature promotes Code Re usability ?", "Can a class extend itself?", "Which of these keyword must be used to inherit a class?", "Which of these keywords is used to refer to member of base class from a sub class?", "A class member declared protected becomes member of subclass of which type?", "Which of these is correct way of inheriting class A by class B?", "Which of the following statements are incorrect?", "What type of inheritance does Java have?", "Say that there are three classes: Computer, AppleComputer, and IBMComputer. What are the likely relationships between these classes?", "Can an object be a subclass of another object?", "How many objects of a given class can there be in a program?", "What restriction is there on using the super reference in a constructor?", "Which of the following is correct syntax for defining a new class Jolt based on the superclass SoftDrink?", "A class Car and its subclass Yugo both have a method run() which was written by the programmer as part of the class definition. If junker refers to an object of type Yugo, what will the following code do?  junker.show();", "A class Animal has a subclass Mammal. Which of the following is true:", "Does a subclass inherit both member variables and methods?", "Which of the following is NOT an advantage to using inheritance?", "Private members of a class are inherited to sub class. True or false?", "Does Java support Multiple Inheritance ?", "Can we reduce the visibility of the inherited or overridden method ?", "Which of the followinag is tightly bound ? Inheritance or Composition ?", "Does a class inherit the constructor of its super class?", "Which of the following Java feature promotes Code Re usability ?", "Can a class extend itself?"},
	answersRB1[] = {"super", "upper", "public member", "class B + class A {}", "public members of class can be accessed by any code in the program.", "single inheritance", "Computer is the superclass, AppleComputer and IBMComputer are subclasses of Computer.", "Yes---as long as single inheritance is followed.", "One per defined class.", "It can only be used in the parent's constructor.", "class Jolt isa SoftDrink { //additional definitions go here }", "The show() method defined in Yugo will be called.", "Because of single inheritance, Mammal can have no subclasses.", "No--only member variables are inherited.", "Code that is shared between classes needs to be written only once."},
	answersRB2[] = {"this", "super", "private member", "class B inherits class A {}", "private members of class can only be accessed by other members of the class.", "double inheritance", "IBMComputer is the superclass, AppleComputer and Computer are subclasses of IBMComputer.", "No---inheritance is only between classes.", "One per constructor definition.", "Only one child class can use it.", "class Jolt implements SoftDrink { //additional definitions go here }", "The show() method defined in Car will be called.", "Because of single inheritance, Mammal can have no other parent than Animal.", "No--only methods are inherited.", "Similar classes can be made to behave consistently."},
	answersRB3[] = {"extent", "this", "protected member", "class B extends A {}", "private members of class can be inherited by a sub class, and become protected members in sub class.", "multiple inheritance", "Computer, AppleComputer and IBMComputer are sibling classes.", "Only when one has been defined in terms of the other.", "As many as the program needs.", "It must be used in the last statement of the constructor.", "class Jolt defines SoftDrink { //additional definitions go here }", "The compiler will complain that run() has been defined twice.", "Because of single inheritance, Animal can have only one subclass.", "Yes--both are inherited.", "Enhancements to a base class will automatically be applied to derived classes."},
	answersRB4[] = {"extends", "None of the mentioned", "static member", "class B extends class A {}", "protected members of a class can be inherited by a sub class, and become private members of the sub class.", "class inheritance", "Computer is a superclass, AppleComputer is a subclasses of Computer, and IBMComputer is a sublclas of AppleComputer", "Yes---when one object is used in the constructor of another.", "One per main() method.", "It must be used in the first statement of the constructor.", "class Jolt extends SoftDrink { //additional definitions go here }", "Overloading will be used to pick which run() is called.", "Because of single inheritance, Mammal can have no siblings.", "Yes--but only one or the other are inherited.", "One big superclass can be used instead of many little classes."},
	userAnswer[] = new String[questions.length],
	rightAnswer[] = {"d", "d", "d", "c", "c", "a", "a", "b", "c", "d", "d", "a", "b", "c", "d", "b", "b", "c", "a", "d", "c", "b", "c", "c", "a", "c", "b", "a", "c", "b", "d", "c", "d", "d", "a", "c", "d", "a", "d", "c", "a", "b", "e", "b", "d", "a", "c", "d", "c", "d", "c", "c", "b", "b", "c", "a", "b", "a", "b", "b", "a", "b", "b", "a", "a", "b", "b", "a", "a", "b", "b", "c", "c", "a", "a", "b", "b", "b", "b", "c", "b", "c", "c", "d", "d", "a", "c", "a", "a", "d", "a", "a", "d", "a", "a", "d", "d", "b", "d", "b", "b", "a", "c", "a", "c", "b", "c", "d", "a", "b", "b", "b", "d", "c", "a", "a", "a", "a", "b", "c", "d", "c", "d", "a", "a", "d", "d", "c", "c", "d", "b", "d", "a", "a", "c", "d", "a", "c", "a", "c", "b", "d", "b", "c", "c", "c", "a", "c", "a", "c"},
	questionNo[] = {"Question 1", "Question 2", "Question 3", "Question 4", "Question 5", "Question 6", "Question 7", "Question 8", "Question 9", "Question 10", "Question 11", "Question 12", "Question 13", "Question 14", "Question 15", "Question 16", "Question 17", "Question 18", "Question 19", "Question 20", "Question 21", "Question 22", "Question 23", "Question 24", "Question 25", "Question 26", "Question 27", "Question 28", "Question 29", "Question 30", "Question 31", "Question 32", "Question 33", "Question 34", "Question 35", "Question 36", "Question 37", "Question 38", "Question 39", "Question 40", "Question 41", "Question 42", "Question 43", "Question 44", "Question 45", "Question 46", "Question 47", "Question 48", "Question 49", "Question 50", "Question 51", "Question 52", "Question 53", "Question 54", "Question 55", "Question 56", "Question 57", "Question 58", "Question 59", "Question 60", "Question 61", "Question 62", "Question 63", "Question 64", "Question 65", "Question 66", "Question 67", "Question 68", "Question 69", "Question 70", "Question 71", "Question 72", "Question 73", "Question 74", "Question 75", "Question 76", "Question 77", "Question 78", "Question 79", "Question 80", "Question 81", "Question 82", "Question 83", "Question 84", "Question 85", "Question 86", "Question 87", "Question 88", "Question 89", "Question 90", "Question 91", "Question 92", "Question 93", "Question 94", "Question 95", "Question 96", "Question 97", "Question 98", "Question 99", "Question 100", "Question 101", "Question 102", "Question 103", "Question 104", "Question 105", "Question 106", "Question 107", "Question 108", "Question 109", "Question 110", "Question 111", "Question 112", "Question 113", "Question 114", "Question 115", "Question 116", "Question 117", "Question 118", "Question 119", "Question 120", "Question 121", "Question 122", "Question 123", "Question 124", "Question 125", "Question 126", "Question 127", "Question 128", "Question 129", "Question 130", "Question 131", "Question 132", "Question 133", "Question 134", "Question 135", "Question 136", "Question 137", "Question 138", "Question 139", "Question 140", "Question 141", "Question 142", "Question 143", "Question 144", "Question 145", "Question 146", "Question 147", "Question 148", "Question 149", "Question 150"};
	private UserInfo userInfo;
	
	public String[] getQuestions() {
		return questions;
	}
	public void setQuestions(String[] questions) {
		this.questions = questions;
	}
	public String[] getAnswersRB1() {
		return answersRB1;
	}
	public void setAnswersRB1(String[] answersRB1) {
		this.answersRB1 = answersRB1;
	}
	public String[] getAnswersRB2() {
		return answersRB2;
	}
	public void setAnswersRB2(String[] answersRB2) {
		this.answersRB2 = answersRB2;
	}
	public String[] getAnswersRB3() {
		return answersRB3;
	}
	public void setAnswersRB3(String[] answersRB3) {
		this.answersRB3 = answersRB3;
	}
	public String[] getAnswersRB4() {
		return answersRB4;
	}
	public void setAnswersRB4(String[] answersRB4) {
		this.answersRB4 = answersRB4;
	}
	public String[] getUserAnswer() {
		return userAnswer;
	}
	public void setUserAnswer(String userAnswer[]) {
		this.userAnswer = userAnswer;
	}
	public void setUserAnswer(String answer, int index) {
		this.userAnswer[index] = answer;
	}
	public String[] getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String[] rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public String[] getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(String[] questionNo) {
		this.questionNo = questionNo;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
}
