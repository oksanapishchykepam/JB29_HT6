package by.oks.jb29.les12.task03.bean;

public abstract class Packaging {
	private String name;
	private int price;
	private String color;

	public Packaging() {

	}

	public Packaging(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public abstract void decorateBouquet();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
