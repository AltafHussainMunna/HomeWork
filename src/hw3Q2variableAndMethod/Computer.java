package hw3Q2variableAndMethod;

import javax.security.auth.login.Configuration;

public class Computer {
	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;

	public void configuration() {
		System.out.println("My Brand: " + Brand + "\nModel: " + Model + "\nOperating System: " + OperatingSystem
				+ "\nPrice: " + price + "\nMade in the USA? Ans: " + madeInUSA + "\nGrade: " + grade);

	}

}
