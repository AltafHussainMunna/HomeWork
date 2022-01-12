package java_oop_allTogether;

public class Iphone6 extends Iphone5{
	
	public void email() {
		System.out.println("Email feature is introduced in Iphone6. The price was increased to $870.");
	}
	
//Down below I will be showing Method overloading with five different methods with same method name but different parameter/signature.
	
	public void materials() { //void type method
		System.out.println("This is a void type method from Iphone6 class.");
	}
	
	
	public void materials(int ramPrice) { //void type parameterized method
		int total1 = ramPrice;
		System.out.println("Total1 is:" + total1);
	}
	
	
	public int materials(int ramPrice, int cameraPrice) { //Parameterized return type method
		int total2 = ramPrice + cameraPrice;
		System.out.println("Total2 is: " + total2);
		return total2;
	}
	
	public static int materials(int ramPrice, int cameraPrice, int bluetoothPrice) { //Static return type method
		int total3 = ramPrice + cameraPrice + bluetoothPrice;
		System.out.println("Total3 is: " + total3);
		return total3;
	}
	
	public final int materials(int ramPrice, int cameraPrice, int bluetoothPrice, int networkPrice) { //Final Return type method
		int total4 = ramPrice + cameraPrice + bluetoothPrice + networkPrice;
		System.out.println("Total4 is: " + total4);
		return total4;
	}
	
	

	
}
