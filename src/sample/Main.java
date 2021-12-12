package sample;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal(null, null, 0);

		Cat cat1 = new Cat(null, null, 0, null);

		cat1.setColor("white");
		cat1.setName("Barsik");
		cat1.setRation("Cat's food");
		cat1.setWeight(4);

		Dog dog1 = new Dog(null, null, 0, null);

		dog1.setColor("Black");
		dog1.setName("Jack");
		dog1.setRation("Dog's food");
		dog1.setWeight(9);

		Veterinarian vet = new Veterinarian(null);

		vet.setName("Daniel");
//		vet.treatment(dog1);
//		vet.treatment(cat1);
//
//		System.out.println(cat1.getVoice());
//		cat1.eat();
//		cat1.sleep();
//
//		System.out.println(dog1.getVoice());
//		dog1.eat();
//		dog1.sleep();
		System.out.println(animal.toString());
		System.out.println(cat1.toString());
		System.out.println(dog1.toString());
	}

}
