package java_oop_allTogether;

public class Iphone2 extends Iphone1{

	public char userOfIphone2; //A public variable is declared here.
	
	public void dropbox() {
		System.out.println("Dropbox feature is introduced in Iphone2. The price is increased to 800$.");
	}
			
	public Iphone2() { //default constructor of Iphone2 class.
		
		super(); //Here default constructor is called by super method
		
		//Down below the methods and variable are called by super keyword.
		super.getPrice();
		super.getInfo();
		super.getUser();
		super.isMadeInUSA();
		super.setPrice(750);
		super.setInfo("I Bought this phone in 2000.");
		super.setUser('F');
		super.setMadeInUSA(false);
		super.regularClassInfo();
		super.interfaceinfo();
		super.call();
		super.message();
		super.camera();
		super.appleWatchInfo();
		super.abstractClassInfo();
		super.appleWatchInfo();
		super.wireless();
		super.storage= 64; //Here I have called public variable (int storage) from Iphone1 class.
		System.out.println("Iphone1 storage is: " + storage + "GB");
		System.out.println("This is the deault constructor for Iphone2 Class.");
		
}
	
	public Iphone2 (char userOfIphone2) { //parameterized constructor
		
		super("I bought this phone in 2000.", 750, 'F', false); //Here the Parameterized constructor is called by super method
		
		//Down below the methods and variable are called by super keyword.
		super.getPrice();
		super.getInfo();
		super.getUser();
		super.isMadeInUSA();
		super.setPrice(750);
		super.setInfo("I Bought this phone in 2000.");
		super.setUser('F');
		super.setMadeInUSA(false);
		super.regularClassInfo();
		super.interfaceinfo();
		super.call();
		super.message();
		super.camera();
		super.appleWatchInfo();
		super.abstractClassInfo();
		super.appleWatchInfo();
		super.wireless();
		super.storage= 64; 
		System.out.println("Iphone1 storage is: " + storage + "GB");
		System.out.println("First user of Iphone2 is: " + userOfIphone2);

}
	
	public void iPhone2Info() { //void type method
		System.out.println("This is the void type method ");
		
		//In a void type method we cannot call any constructor with super method. 
		// Down below the methods and variable are called by super keyword.
		super.getPrice();
		super.getInfo();
		super.getUser();
		super.isMadeInUSA();
		super.setPrice(750);
		super.setInfo("I Bought this phone in 2000.");
		super.setUser('F');
		super.setMadeInUSA(false);
		super.regularClassInfo();
		super.interfaceinfo();
		super.call();
		super.message();
		super.camera();
		super.appleWatchInfo();
		super.abstractClassInfo();
		super.appleWatchInfo();
		super.wireless();
		super.storage = 64;
		System.out.println("Iphone1 storage is: " + storage + "GB");

	}
	
	public void iPhone2Info(char userOfIphone2) { //void type parameterized method
		System.out.println("Second user of Iphone2 is: " + userOfIphone2);
		
		//In a void type parameterized method we cannot call any constructor with super method. 
		// Down below the methods and variable are called by super keyword.
		super.getPrice();
		super.getInfo();
		super.getUser();
		super.isMadeInUSA();
		super.setPrice(750);
		super.setInfo("I Bought this phone in 2000.");
		super.setUser('F');
		super.setMadeInUSA(false);
		super.regularClassInfo();
		super.interfaceinfo();
		super.call();
		super.message();
		super.camera();
		super.appleWatchInfo();
		super.abstractClassInfo();
		super.appleWatchInfo();
		super.wireless();
		super.storage = 64;
		System.out.println("Iphone1 storage is: " + storage + "GB");
	}

	

	
}
