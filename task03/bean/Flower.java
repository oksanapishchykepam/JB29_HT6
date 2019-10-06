package by.oks.jb29.les12.task03.bean;

public abstract class Flower {
	private String name;
	private String country;
	private int petals;
	private int price;

	public Flower() {

	}

	public Flower(String name, String country, int petals, int price) {
		super();
		this.name = name;
		this.country = country;
		this.petals = petals;
		this.price = price;
	}

	public abstract void smell();

	public abstract void losePetals();

	public void blossom() {
		System.out.println("Цветок распустился!");
	};

	public void wilt() {
		System.out.println("Цветок завял.");
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPetals() {
		return petals;
	}

	public void setPetals(int petals) {
		this.petals = petals;
	}

	public int getPrice() {
		return price;
	}

	public void setLifespan(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name;
	}

}
