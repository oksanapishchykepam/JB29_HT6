package by.oks.jb29.les12.task03.bean;

public class Wrapper extends Packaging {
	private String type;

	public Wrapper() {
		super();
	}

	public Wrapper(String type, int price, String color) {
		super("Обёртка", price, color);
		this.type = type;
	}

	@Override
	public void decorateBouquet() {
		System.out.println("Завернуть букет в " + type);
	}

	@Override
	public String toString() {
		return type + " " + getColor();
	}

}
