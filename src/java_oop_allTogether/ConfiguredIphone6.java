package java_oop_allTogether;

public class ConfiguredIphone6 extends Iphone6{
	
	@Override
	public void materials() { //void type method
		System.out.println("This is a void type method from Iphone6 class.");
	}
	
	@Override
	public void materials(int ramPrice) { //void type parameterized method
		int total1 = ramPrice/2;
		System.out.println("Total1 is:" + total1);
	}
	
	@Override
	public int materials(int ramPrice, int cameraPrice) { //Parameterized return type method
		int total2 = ramPrice +50 + cameraPrice;
		System.out.println("Total2 is: " + total2);
		return total2;
	}
	
	//Here I have commented out the Static Method because anything that is static in nature belongs to the class from which it is 	originated.
	
	//		public static int materials(int ramPrice, int cameraPrice, int bluetoothPrice) {
	//		int total3 = ramPrice + cameraPrice + bluetoothPrice;
	//		System.out.println("Total3 is: " + total3);
	//		return total3;
	//		}
	
	//We cannot override a Final Method because it is final and the int values within it cannot be altered/changed.
		
	//		public final int materials(int ramPrice, int cameraPrice, int bluetoothPrice, int networkPrice) {
	//		int total4 = ramPrice + cameraPrice + bluetoothPrice + networkPrice;
	//		System.out.println("Total4 is: " + total4);
	//		return total4;
	//		}
	
	

}
