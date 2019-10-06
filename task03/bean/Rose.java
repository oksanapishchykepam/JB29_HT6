package by.oks.jb29.les12.task03.bean;

public class Rose extends Flower {
	private int height;

	public Rose(String name, String country, int petals, int price, int height) {
		super(name, country, petals, price);
		this.height = height;
	}

	@Override
	public void smell() {
		System.out.println("Издавать запах розы");
	}

	@Override
	public void losePetals() {
		setPetals(getPetals() - 3);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
