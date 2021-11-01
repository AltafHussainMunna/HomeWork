package hw3Q2variableAndMethod;

import javax.security.auth.login.Configuration;

public class Computer {

	String brand;
	String model;
	String operatingSystem;
	int price;
	boolean madeInUSA;
	char grade;
    
	public Computer() {
		
	}
	public void Configuration() {

		System.out.println("Brand Name is: " + brand + "\nModel: " + model + "\nOerating system: " + operatingSystem
				+ "\nPrice" + price + "\nMadeInUSA: " + madeInUSA + "\nGrade: " + grade);

	}

}
