package sample;

public class Veterinarian {
	private String name;

	public Veterinarian(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void treatment(Animal animal) {
		System.out.println(animal + " has been treated");
	}

	@Override
	public String toString() {
		return "Veterinarian [name=" + name + "]";
	}

}
