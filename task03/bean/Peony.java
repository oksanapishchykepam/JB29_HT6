package by.oks.jb29.les12.task03.bean;

public class Peony extends Flower {
	private String color;

	public Peony(String name, String country, int petals, int price, String color) {
		super(name, country, petals, price);
		this.color = color;
	}

	@Override
	public void smell() {
		System.out.println("Издавать запах пиона");
	}

	@Override
	public void losePetals() {
		setPetals(getPetals() - 1);
	}

	public String getColor() {
		return this.color;
	}

	public void setHeight(String color) {
		this.color = color;
	}
}
