package java_oop_allTogether;

//Below we can see that abstract class AppleWatch is inheriting one regular class and two interfaces. 
public abstract class AppleWatch implements Watch, DigitalWatch {

	// Below we have a non-abstract method.

	public void abstractClassInfo() {
		System.out.println("\tAn abstract class cannot be instantiated which means that just like interface it Cannot create objects. Also just like interface an Abstract class can contain Both abstract (declared) and non-abstract methods (implemeted). In an Abstract class when writing an abstract method it is mandatory to wirte the (abstract) keyword. In addition to that an Abstract class can inherit either One Abstract class or One Regular class by using (extends) keyword. It can also inherit more than one interface by using (implements) keyword.");

	}

	// Below we have an abstract method which is the second type of method that can
	// be used in an abstract class.

	public abstract void appleWatchInfo();
}
