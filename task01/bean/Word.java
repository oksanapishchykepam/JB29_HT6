package by.oks.jb29.les12.task01.bean;

public class Word {
	private String value;

	public Word() {
		this.value = "";
	}

	public Word(String word) {
		this.value = word;
	}

	public void print() {
		System.out.println(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String word) {
		this.value = word;
	}

}
