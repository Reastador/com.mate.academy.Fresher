package com.java.mate.academy.student;

import java.util.Random;

public class Student {

	private String name;
	private int yearOfBirth;
	private boolean isExcellence;
	private boolean isPresent;
	private boolean isElder = false;
	private int votes;
	private String faculty;
	private String surname;

	// that constructor generated random parameters to new object Student
	public Student(String name, int yearOfBirth, boolean isExcellence, boolean isPresent, int votes, String faculty, String surname) {
		super();
		Random rand = new Random();
		String names[] = { "Kit", "Les", "John", "Cody", "Roman", "George", "Den", "Sten", "Ben" };
		int years[] = { 2000, 2001, 2002, 2003 };
		boolean yesNo[] = { true, false };
		this.name = names[rand.nextInt(names.length)];
		this.yearOfBirth = years[rand.nextInt(years.length)];
		this.isExcellence = yesNo[rand.nextInt(yesNo.length)];
		this.isPresent = yesNo[rand.nextInt(yesNo.length)];
		this.votes = rand.nextInt(4);
		String direction[] = { "Paint", "IT", "Enginer", "Design", "Music" };
		this.faculty = direction[rand.nextInt(direction.length)];
		String surnames[] = { "Winston", "Alen", "Dodge", "Ford", "Mizuke", "Tagawa", "Gnatuk", "Potter" };
		this.surname = surnames[rand.nextInt(surnames.length)];
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public boolean isExcellence() {
		return isExcellence;
	}

	public void setExcellence(boolean isExcellence) {
		this.isExcellence = isExcellence;
	}

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	public boolean isElder() {
		return isElder;
	}

	public void setElder(boolean isElder) {
		this.isElder = isElder;
	}

}
