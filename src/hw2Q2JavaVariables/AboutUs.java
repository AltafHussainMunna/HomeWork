package hw2Q2JavaVariables;

public class AboutUs {
	// Here all the variables declared
	public String MyName;
	public byte myAge;
	public short myHouseRent;
	public int myYearlySalary;
	public long myBankBalance;
	public char mySex;
	public float myHeight;
	public double myGrade;
	public boolean usCitizen;

	// Here the constructor declared
	AboutUs() {
		System.out.println("This is all about me");

	}

	public void aboutUs() { // Here is the method implemented 
		System.out.println("My Name is: " + MyName + "\nMy Age: " + myAge + "\nMy HouseRent: " + myHouseRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Blance" + myBankBalance + "\nSex: " + mySex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}

}
