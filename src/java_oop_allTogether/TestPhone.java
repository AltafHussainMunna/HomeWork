package java_oop_allTogether;

public class TestPhone {

	public static void main(String[] args) {

		System.out.println("\n---------------------Instantiating Iphone1 Class-----------------------------\n");
		Iphone1 iphone1 = new Iphone1(); // Regular Class Iphone1 class in instantiated here.
		iphone1.regularClassInfo();
		iphone1.abstractClassInfo();
		iphone1.appleWatchInfo();
		iphone1.interfaceinfo();
		iphone1.call();
		iphone1.message();
		iphone1.camera();
		Phone.battery(); // Here the static method is called by the class Phone.
		iphone1.wireless(); // Here we have called the void method.

		System.out.println(
				"\n------------------------Instantiating AppleWatch Abstract Class------------------------------\n");

		AppleWatch appleWatch = new Iphone1();
		appleWatch.abstractClassInfo();
		appleWatch.appleWatchInfo();
		iphone1.regularClassInfo();
		iphone1.interfaceinfo();
		iphone1.call();
		iphone1.message();
		iphone1.camera();
		iphone1.wireless(); // Here we have called the void method.
		Phone.battery(); // Here the static method is called by the class Phone.

		System.out.println("\n-------------------------Instantiating Phone Interface-------------------------------\n");

		Phone phone = new Iphone1();
		phone.interfaceinfo();
		phone.call();
		phone.message();
		phone.camera();
		phone.wireless(); // Here we have called the void method.
		Phone.battery(); //// Here the static method is called by the class in which it is present namely
							//// Phone Class.

		System.out.println(
				"\n--------------------Private Variables are called here from Iphone1 Class-----------------------\n");

		iphone1.setInfo("I bought this phone in 2000, the price was: $");
		iphone1.setPrice(750);
		iphone1.setUser('F');
		iphone1.setMadeInUSA(false);
		System.out.println(iphone1.getInfo() + iphone1.getPrice() + ", user's sex is: " + iphone1.getUser()
		+ ", made in USA: " + iphone1.isMadeInUSA());

		System.out.println("\n----------------------------Instantiating Iphone6 Class----------------------------\n");
		Iphone6 iphone6 = new Iphone6();
		iphone6.email();
		iphone6.photos();
		iphone6.youtube();
		iphone6.dropbox();
		iphone6.getPrice();
		iphone6.getInfo();
		iphone6.getUser();
		iphone6.isMadeInUSA();
		iphone6.setPrice(750);
		iphone6.setInfo("I bought this phone in 2000, ");
		iphone6.setUser('F');
		iphone6.setMadeInUSA(false);
		iphone6.interfaceinfo();
		iphone6.call();
		iphone6.message();
		iphone6.camera();
		iphone6.appleWatchInfo();
		iphone6.abstractClassInfo();
		iphone6.appleWatchInfo();
		Phone.battery();
		iphone1.wireless();

		System.out.println("\n----------------------------Instantiating Iphone2 Class----------------------------\n");
		Iphone2 iphone2 = new Iphone2();
		iphone2.userOfIphone2 = 'F';
		iphone2.iPhone2Info();
		iphone2.iPhone2Info('M');
		iphone2.dropbox();
		iphone2.getPrice();
		iphone2.getInfo();
		iphone2.getUser();
		iphone2.isMadeInUSA();
		iphone2.setPrice(750);
		iphone2.setInfo("I Bought this phone in 2000.");
		iphone2.setUser('F');
		iphone2.setMadeInUSA(false);
		iphone2.regularClassInfo();
		iphone2.interfaceinfo();
		iphone2.call();
		iphone2.message();
		iphone2.camera();
		iphone2.appleWatchInfo();
		iphone2.abstractClassInfo();
		iphone2.appleWatchInfo();
		iphone2.wireless();
		iphone2.storage = 64;

		System.out.println("\n-----------------------Executing method overloading--------------------------\n");
		Iphone6 iphone6overloadingIphone6 = new Iphone6();
		iphone6overloadingIphone6.materials(); // void method
		iphone6overloadingIphone6.materials(100); // void parameterized method
		iphone6overloadingIphone6.materials(100, 200); // return type parameterized method
		Iphone6.materials(100, 200, 300); // return type static method
		iphone6overloadingIphone6.materials(100, 200, 300, 400); // return type final method

		System.out.println("\n------------------------Executing method overriding:---------------------------\n");
		ConfiguredIphone6 configuredIphone6 = new ConfiguredIphone6();
		configuredIphone6.materials();
		configuredIphone6.materials(500);
		configuredIphone6.materials(200, 300);

		/*
		 * Comment out at the end of TestPhone to inform me which is hierarchical
		 * inheritance, multilevel inheritance, and single inheritance. As Iphone 2 and
		 * Iphone 3 are both subclasses which are inherited by one common parent class
		 * so they show a Hierarchical inheritance. Iphone 4, Iphone 5 and Iphone 6 show
		 * single inheritance.
		 */

	}
}
