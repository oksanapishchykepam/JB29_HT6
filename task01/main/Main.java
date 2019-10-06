package by.oks.jb29.les12.task01.main;

import by.oks.jb29.les12.task01.bean.Text;
import by.oks.jb29.les12.task01.bean.Sentence;
import by.oks.jb29.les12.task01.bean.Word;

/*Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста*/

public class Main {

	public static void main(String[] args) {
		Word word1 = new Word("Принципы");
		Word word2 = new Word("ООП");
		
		Sentence sent1 = new Sentence("Наследование");
		sent1.addToSent("- механизм, который позволяет описать новый класс на основе существующего (родительского), при этом свойства и функциональность родительского класса заимствуются новым классом");
		
		Sentence sent2 = new Sentence("Абстракция означает выделение главных, наиболее значимых характеристик предмета и наоборот — отбрасывание второстепенных, незначительных");
		Sentence sent3 = new Sentence("Инкапсуляция в Java означает ограничение доступа к данным и возможностям их изменения");
		Sentence sent4 = new Sentence("Полиморфизм — это возможность работать с несколькими типами так, будто это один и тот же тип, при этом поведение объектов будет разным в зависимости от типа, к которому они принадлежат");
		
		Text text = new Text();
		text.addToHeader(word1);
		text.addToHeader(word2);
		
		text.addToTextBody(sent1);
		text.addToTextBody(sent2);
		text.addToTextBody(sent3);
		text.addToTextBody(sent4);
		
		text.printHeader();
		text.printTextBody();
		

	}

}
