package irclasses;

import ir.IR;

public class Date extends IR {
	private int day;
	private int month;
	private int year;
	
	public Date(int year, int month, int day) {

		this.day = day;
		this.month = month;
		this.year = year; 

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
