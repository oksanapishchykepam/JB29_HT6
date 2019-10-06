package by.oks.jb29.les12.task03.bean;

public class Tape extends Packaging {

	public Tape() {
		super();
	}

	public Tape(int price, String color) {
		super("Лента", price, color);
	}

	@Override
	public void decorateBouquet() {
		System.out.println("Перевязать букет лентой.");
	}

	@Override
	public String toString() {
		return getName() + " " + getColor();
	}
}
