package hw7Q3Abstraction;

public interface University {

	public void classSize();
    public void playGround();
    public void teacher();

	public default void gymnasim() {//This is  default method, which is implemented here because of using default keyword.


	}

	public static void library() {//This is  static method, which is implemented here because of using static keyword.



	}

}
