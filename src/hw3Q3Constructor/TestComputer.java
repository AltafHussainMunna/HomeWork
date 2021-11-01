package hw3Q3Constructor;

import java.lang.management.OperatingSystemMXBean;

public class TestComputer {
	public static void main(String[] args) {

		Computer computer = new Computer(); // default constructor is initialized
		System.out.println("\n");

		Computer computer1 = new Computer("Apple", "Macbook Air", "Mac OS Moiave", 800, 'C', false);
		System.out.println(
				"\n----------------------------------------------------------------------------------------------------------------------------------\n");

		Computer computer2 = new Computer("Lenovo", "AMD Ryzen 3 3000 Series", "Windows 11", 370, 'B', false); // using
																												// my
																												// configuration

		System.out.println(
				"\n----------------------------------------------------------------------------------------------------------------------------------\n");

		Computer computer3 = new Computer("HP"); // using 1 variable
		System.out.println(
				"\n----------------------------------------------------------------------------------------------------------------------------------\n");

		Computer computer4 = new Computer(300, true, 'D'); // using 3 variables
		System.out.println(
				"\n---------------------------------------------------------------------------------------------------------------------------------\n");

		Computer computer5 = new Computer(false, 'B', 1000, "A500", "ASUS"); // using 5 variables

	}

}
