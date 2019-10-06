package by.oks.jb29.les12.task02.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Calendar {

	List<Day> days;

	public Calendar() {
		days = new ArrayList<Day>();
	}

	public void addToCalendar(int day, boolean isWeekend, boolean isHoliday) {
		days.add(new Day(day, isWeekend, isHoliday));
	}
	
	public void printCalendar() {
		Iterator<Day> it = days.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public List<Day> getDays() {
		return days;
	}

	class Day {
		int day;

		boolean isWeekend;
		boolean isHoliday;

		Day(int day, boolean isWeekend, boolean isHoliday) {
			this.day = day;

			this.isWeekend = isWeekend;
			this.isHoliday = isHoliday;
		}

		public String isWeekday() {
			if(isWeekend == false && isHoliday == false) {
				return "рабочий день";
			} else {
				return "выходной или праздничный день";
			}
			
		}

		public boolean isWeekend() {
			return isWeekend;
		}
		
		

		@Override
		public String toString() {
			return "День " + day + ", " + isWeekday();
		}

		public void setWeekend(boolean isWeekend) {
			this.isWeekend = isWeekend;
		}

		public boolean isHoliday() {
			return isHoliday;
		}

		public void setHoliday(boolean isHoliday) {
			this.isHoliday = isHoliday;
		}

	}

}
