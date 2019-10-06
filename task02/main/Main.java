package by.oks.jb29.les12.task02.main;

import by.oks.jb29.les12.task02.bean.Calendar;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных днях.*/

public class Main {

	public static void main(String[] args) {
		Calendar calendar = new Calendar();

		calendar.addToCalendar(1, false, false);
		calendar.addToCalendar(2, true, true);
		calendar.addToCalendar(3, false, true);
		calendar.addToCalendar(4, true, false);
		calendar.addToCalendar(5, false, false);
		
		calendar.printCalendar();

	}

}
