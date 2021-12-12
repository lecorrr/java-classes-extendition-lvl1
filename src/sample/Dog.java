package sample;

public class Dog extends Animal {
	private String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public String getVoice() {
		String voice = "woof";
		return voice;
	}

	public void eat() {
		System.out.println(this.name + " has eaten some food");
	}

	public void sleep() {
		System.out.println(this.name + " goes to sleep");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

}
