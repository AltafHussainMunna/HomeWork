package hw6Q2Inheritance;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n");

		Birds birds = new Birds(); // This is a single Inheritance.
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n");

		BullDog bullDog = new BullDog(); // This is Hierarchical Inheritance.
		bullDog.bullDogIfo();
		bullDog.dogIfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("\n");

		Cobra cobra = new Cobra(); // This is Hierarchical Inheritance.
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptile();
		cobra.animalInfo();
		
		System.out.println("\n");
		

		Dog dog = new Dog(); //This is multiple Inheritance.
		dog.dogIfo();
		dog.mammalInfo();
		dog.animalInfo();
		
		System.out.println("\n");
		

		Mammal mammal = new Mammal(); //This is a single Inheritance.
		mammal.mammalInfo();
		mammal.animalInfo();
		
		System.out.println("\n");

		Reptile reptile = new Reptile(); //This is a single Inheritance.
		reptile.reptile();
		reptile.animalInfo();
		
		System.out.println("\n");

		Robin robin = new Robin(); //This is multiple Inheritance.
		robin.robinIfo();
		robin.birdsInfo();
		robin.animalInfo();
		
		System.out.println("\n");
		
		Snake snake = new Snake(); //This is multiple Inheritance.
		snake.snakeInfo();
		snake.reptile();
		snake.animalInfo();
		
		System.out.println("\n");

	}

}
