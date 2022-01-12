package java_oop_allTogether;

//Below we can see that Iphone1 class is inheriting an abstract class as well as an interface.
public class Iphone1 extends AppleWatch implements Phone {

	public int storage; // This is a public variable

	// Down below we have four private variables:
	private int price;
	private String Info;
	private char user;
	private boolean madeInUSA;

	public Iphone1() {
		System.out.println("This is the default constructor from Iphone1 Class.");
	}

	public Iphone1(String info, int price, char user, boolean madeInUSA) {
		System.out.println("I bought this phone in 2000, the price is: " + price + "User is: ," + user
		+ ", made in the USA: " + madeInUSA);
	}

	// Here the private variables are accessed by using the getter setter method.
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return Info;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public void regularClassInfo() {
		System.out.println("\tClass is a blueprint from which individual objects are created. It contains Only non-abstract methods which are implemented. Just like an abstract class a Regular Class can inherit either One Regular class or One Abstract class by using (extends) keyword. It can also inherit more than one interface by using (implements) keyword.");

	}

	@Override
	public void interfaceinfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {

	}

	@Override
	public void message() {

	}

	@Override
	public void camera() {

	}

	@Override
	public void appleWatchInfo() {

	}

}
