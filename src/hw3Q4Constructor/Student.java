package hw3Q4Constructor;

public class Student {
	public String StName;
	public int stID;
	public char sex;
	public boolean programmer;
	public float grade;

	// This is the default constructor
	public Student() {
		System.out.println("This is from default constructor of Student class: \n");

	}

	// This is the parameterized constructor
	public Student(String stName, int stID, char sex, boolean programmer, float grade) {
		this.StName = stName;
		this.stID = stID;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;

		System.out.println("Student Name: " + StName + ", Student ID: " + stID + ", Sex: " + sex
				+ ", Is the student a programmer: " + programmer + ", Grade: " + grade);

	}

	// This is the parameterized method
	public void student(String stName, int stID, char sex, boolean programmer, float grade) {
		this.StName = stName;
		this.stID = stID;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;

		System.out.println("Student Name: " + StName + ", Student ID: " + stID + ", Sex: " + sex
				+ ", Is the student a programmer: " + programmer + ", Grade: " + grade);

	}

}
