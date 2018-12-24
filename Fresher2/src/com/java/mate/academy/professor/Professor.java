package com.java.mate.academy.professor;

import java.util.ArrayList;
import java.util.Random;

import com.java.mate.academy.student.Student;

public class Professor {

	private String name;
	private String faculty;

	// that constructor generated random parameters to new object Professor
	public Professor(String name, String facultete) {
		super();
		Random rand = new Random();
		String names[] = { "Gilbody", "Snape", "Dambldore", "Harry", "Jhonson", "Grayson" };
		this.name = names[rand.nextInt(names.length)];
		String direction[] = { "Paint", "IT", "Enginer", "Design", "Music" };
		this.faculty = direction[rand.nextInt(direction.length)];

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String facultete) {
		this.faculty = facultete;
	}

	// method rollcall iterate Student list and look to
	// object Student.Call parameter isPresent
	// if isPresent == true Student is in Classroom and count iterate +1
	// in ending method say to consol names all presents student and those counts
	public void rollCall(ArrayList<Student> group) {
		System.out.println("Professor " + this.name + " ask :All student is here?");
		int count = 0;
		for (Student present : group) {
			if (present.isPresent() == true) {
				System.out.println(present.getName() + " " + present.getSurname() + " is in classroom");
				count++;
			}

		}
		System.out.println("There are " + count + " student(s) in class room");
	}

}
