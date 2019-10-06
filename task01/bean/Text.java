package by.oks.jb29.les12.task01.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Text {

	private List<Word> header;
	private List<Sentence> textBody;

	public Text() {
		this.header = new ArrayList<Word>();
		this.textBody = new ArrayList<Sentence>();
	}

	public void printTextBody() {
		Iterator<Sentence> iter = textBody.iterator();

		while (iter.hasNext()) {
			iter.next().print();
		}
	}

	public void printHeader() {
		Iterator<Word> iter = header.iterator();

		while (iter.hasNext()) {
			System.out.print(iter.next().getValue() + " ");
		}

		System.out.println();
	}

	public void addToTextBody(Sentence sent) {
		textBody.add(sent);
	}

	public void addToHeader(Word word) {
		header.add(word);
	}

	public List<Sentence> getTextBody() {
		return textBody;
	}

	public void setTextBody(List<Sentence> textBody) {
		this.textBody = textBody;
	}

	public List<Word> getHeader() {
		return header;
	}

	public void setHeader(List<Word> header) {
		this.header = header;
	}

}