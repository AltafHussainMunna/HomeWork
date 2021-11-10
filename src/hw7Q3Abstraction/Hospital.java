package hw7Q3Abstraction;

public interface Hospital {

	public void emergencyRoom();
    public void SurgeryRoom();
    public void cafeteria();
    
    public default void morgue() {// This is  default method, which is implemented here because of using default keyword.

	}

	public static void pharmacy() {// This is static method, which is implemented here because of using static keyword .


	}


}
