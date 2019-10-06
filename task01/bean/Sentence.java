package by.oks.jb29.les12.task01.bean;

public class Sentence extends Word {

	public Sentence() {
		super();
	}

	public Sentence(String sentence) {
		super(sentence);
	}

	@Override
	public void print() {
		System.out.println(getValue() + ".");
	}

	public void addToSent(String word) {
		setValue(getValue() + " " + word);
	}
}
