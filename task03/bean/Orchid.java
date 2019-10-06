package by.oks.jb29.les12.task03.bean;

public class Orchid extends Flower {

	public Orchid(String name, String country, int petals, int price) {
		super(name, country, petals, price);
	}

	@Override
	public void smell() {
		System.out.println("Издавать запах орхидеи");
	}

	@Override
	public void losePetals() {
		setPetals(getPetals() - 5);
	}

}
