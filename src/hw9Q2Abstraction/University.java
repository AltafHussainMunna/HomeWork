package hw9Q2Abstraction;

public interface University extends College, Hospital {

	public void classSize();
    public void playGround();
    public void teacher();

	public default void gymnasim() {//This is  default method, which is implemented here because of using default keyword.


	}

	public static void library() {//This is  static method, which is implemented here because of using static keyword.



	}
	
	/**
	 * 
	 * i.) Total how many keywords are used for the inheritance in Interface, answer
	 * by Java comments? 
	 * Answer- Only ONE keyword is used for the inheritance in
	 * Interface which is "extends" keyword.
	 * 
	 * Can an interface inherit other Interfaces, or a regular class or abstract
	 * class by extends or implements keyword? 
	 * Answer- Yes, an Interface can inherit
	 * other Interfaces by 'extends' keyword. However, an interface CANNOT inherit a
	 * regular class or abstract class.
	 * 
	 * How many inheritance is possible? Use the Interface -- "University" to answer
	 * my questions (University extends College, Hospital) (by multiple line
	 * comments). 
	 * Answer- An interface can inherit more than one interface. For
	 * example: public interface University extends College, Hospital{
	 * 
	 * ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and
	 * NursingSchool. how many keywords are used for the inheritance in Java for
	 * Abstract Class? 
	 * Answer- In Java while using inheritance for an Abstract class
	 * we can use Two keywords specifically: "extends (or) implements".
	 * 
	 * Can an Abstract Class inherit other Abstract Class or a regular class or
	 * interface by extends or implements keyword? 
	 * Answer- Yes, an Abstract class
	 * Can inherit other Abstract Class or a Regular class by 'extends' keyword or
	 * can also inherit an Interface by 'implements' keyword.
	 * 
	 * How many inheritances is possible by an Abstract Class? Use one of above
	 * Abstract Class (MedicalSchool extends NursingSchool implements LawSchool) and
	 * use the keywords to answer my questions. 
	 * Answer- An Abstract class Can
	 * inherit either Only ONE abstract class or Only ONE regular class by using the
	 * 'extends' keyword. In addition to that, an abstract class can also inherit
	 * One or More interface(s) by using the keyword 'implements'.
	 * 
	 * iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity,
	 * RockefellerUniversity. how many keywords are used for the inheritance in Java
	 * for a regular Class? 
	 * Answer- In Java while using inheritance for a Regular
	 * class we can use Two keywords specifically: "extends (or) implements".
	 * 
	 * Can a regular Class inherit other Abstract Class or a regular class or
	 * interface by extends or implements keyword? 
	 * Answer- Yes, an Abstract class
	 * Can inherit other Abstract Class or a Regular class or Interface.
	 * 
	 * How many inheritances is possible by a regular Class? Use one of above
	 * regular Classes (ColumbiaUniversity extends MedicalSchool implements
	 * University, VocationalSchool) and use the keywords to answer my questions.
	 * Answer- A Regular class Can inherit either Only ONE abstract class or Only
	 * ONE regular class by using the 'extends' keyword. In addition to that, an
	 * abstract class can also inherit One or More interface(s) by using the keyword
	 * 'implements'.
	 * 
	 */

}
