package hw3Q4Constructor;

public class Student {

	String stName;
	int stID;
	char sex;
	boolean isHePorgramer;
	float grade;

	public Student() {

	}

	public Student(String stName, int stID, char sex, boolean isHeProgramer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isHePorgramer = isHeProgramer;
		this.grade = grade;

		System.out.println();

	}

	public void student(String stName, int stID, char sex, boolean isHeProgramer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isHePorgramer = isHeProgramer;
		this.grade = grade;

	}

}
