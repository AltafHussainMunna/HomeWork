package hw6Q2Inheritance;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n");

		Birds birds = new Birds(); // This is a single Inheritance and Birds extends only the Animal class.
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n");

		BullDog bullDog = new BullDog(); // This is Hierarchical Inheritance and BullDog extends Dog, Dog extends Mammal and Mammal extends Animal.
		bullDog.bullDogIfo();
		bullDog.dogIfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("\n");

		Cobra cobra = new Cobra(); // This is Hierarchical Inheritance and Cobra extends Snake, Snake extends Reptile and Reptile extends Animal.
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptile();
		cobra.animalInfo();
		
		System.out.println("\n");
		

		Dog dog = new Dog(); //This is multiple level Inheritance and Dog extends to Mammal and Mammal extends to Animal.
		dog.dogIfo();
		dog.mammalInfo();
		dog.animalInfo();
		
		System.out.println("\n");
		

		Mammal mammal = new Mammal(); //This is a single Inheritance and Mammal only extends to the Animal class.
		mammal.mammalInfo();
		mammal.animalInfo();
		
		System.out.println("\n");

		Reptile reptile = new Reptile(); //This is a single Inheritance and Reptile only extends to the Animal class.
		reptile.reptile();
		reptile.animalInfo();
		
		System.out.println("\n");

		Robin robin = new Robin(); //This is multiple Inheritance and  Robin extends to Birds and Birds extends Animal s
		robin.robinIfo();
		robin.birdsInfo();
		robin.animalInfo();
		
		System.out.println("\n");
		
		Snake snake = new Snake(); //This is multiple Inheritance and Snake extends to Reptile and Reptile extends to Animal
		snake.snakeInfo();
		snake.reptile();
		snake.animalInfo();
		
		System.out.println("\n");

	}

}
