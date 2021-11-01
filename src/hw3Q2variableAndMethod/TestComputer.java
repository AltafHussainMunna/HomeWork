package hw3Q2variableAndMethod;

public class TestComputer {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		computer1.Brand = "Apple";
		computer1.Model = "Macbook Air";
		computer1.OperatingSystem = "MacOS Moiave";
		computer1.price = 800;
		computer1.madeInUSA = false;
		computer1.grade = 'C';
		computer1.configuration();

		System.out.println("\n-------------------------------------------------\n");

		Computer computer2 = new Computer();
		computer2.Brand = "Lenovo";
		computer2.Model = "AMD Ryzen 3 3000 Series";
		computer2.OperatingSystem = "Windows 11";
		computer2.price = 370;
		computer2.madeInUSA = false;
		computer2.grade = 'B';
		computer2.configuration();

	}

}
