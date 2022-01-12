package java_oop_allTogether;

//Down below we can see that Phone interface is inheriting the interfaces Pager and Wakitaki by using extends keyword.
public interface Phone extends Pager, Wakitaki {

//The Four methods listed below are declared making them abstract in nature.
	
	public void interfaceinfo();

	public void call();

	public void message();

	public void camera();

//The Two methods listed below are implemented which makes them non-abstract methods. 
	
	public static void battery() {
		System.out.println("Battery is the static method of Interface Phone. \n");
	}

	public default void wireless() {
		System.out.println("Wireless is the deafult method of Interface Phone.");
	}

	/*
	 * What are the features of Interface you know? 
	 * Ans: An Interface is a Blueprint of class. An Interface cannot be instantiated 
	 * which means it cannot create objects. In an Interface methods can be Both 
	 * (declared and implemented). The only way methods are implemented in Interface 
	 * is by using default and static methods. In addition to that any abstract method in the Interface does not
	 * require the use of (abstract) keyword. Interface cannot inherit a regular
	 * class or an abstract class. However, it can inherit more than one Interface
	 * by using the (extends) keyword. 
	 * 
	 * Can we create a constructor inside an interface? 
	 * Ans: No, we cannot create a constructor inside an Interface.
	 * 
	 * Can we write variables inside Interface?
	 * Ans: No, we cannot write variables inside an Interface.
	 * 
	 * Do you think we can extends or implements Interface? Single or multiple?
	 * Ans: Interface can only use the (extends) keyword. The (extends) keyword 
	 * allows the interface to inherit multiple other Interfaces.
	 * 
	 * Create two interface Pager and Wakitaki (Phone interface inherit
	 * them) and One regular class name LandPhone and one abstract class
	 * SatelitePhone. make a relation of this 4, with Phone if possible. 
	 * Ans: We can only make a relation of interface phone with the other two newly created
	 * interfaces namely: Pager and Wakitki. The reason why we cannot make a
	 * relation of phone with LandPhone and SatelitePhone is because an Interface
	 * cannot inherit a regular class or abstract class.
	 */

}
