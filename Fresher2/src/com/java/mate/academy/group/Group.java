package com.java.mate.academy.group;

import java.util.ArrayList;
import java.util.Random;

import com.java.mate.academy.professor.Professor;
import com.java.mate.academy.student.Student;

public class Group {
	ArrayList<Student> groupList = new ArrayList<Student>();
	Professor professor;
	private String faculty;

	// constructor generated random parameters to object Group
	public Group(String faculty, ArrayList<Student> groupList) {
		super();
		Random rand = new Random();
		String direction[] = { "Paint", "IT", "Enginer", "Design", "Music" };
		this.faculty = direction[rand.nextInt(direction.length)];
		this.groupList = groupList;
	}

	public Professor getProffesor() {
		return professor;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public void setProffesor(Professor proffesor) {
		this.professor = proffesor;
	}

	// method generated 50 random object Professor and added those to List
	public void addProffesorToUniversityList(ArrayList<Professor> list) {
		for (int i = 0; i <= 50; i++) {
			Professor professor = new Professor(null, null);
			list.add(professor);
		}
	}

	// and that method foreaching Professor list,looking professor with
	// equals faculty and added him to group with same faculty
	public void addProffesorToGroup(ArrayList<Professor> list) {
		for (Professor professors : list) {
			if (this.getFaculty().equals(professors.getFaculty())) {
				this.professor = professors;
			} else if (this.professor != null) {
				break;
			}
		}
	}

	// method created 100 random Student and added him to general student list
	public void createStudentList(ArrayList<Student> list) {
		for (int i = 0; i <= 100; i++) {
			Student student = new Student(null, 0, false, false, 0, null, null);
			list.add(student);
		}
	}

	// method added student from general list to group with same faculty parameters
	// and sort student to years
	public void addStudent(ArrayList<Student> group) {
		for (Student student : group) {
			if (student.getYearOfBirth() >= 2002 && student.getFaculty().equals(this.faculty)) {
				groupList.add(student);
			}
		}
	}

	// shows all student in group
	public void showGroup(ArrayList<Student> group) {
		for (Student student : group) {
			System.out.println(student.getName() + " " + student.getSurname());
		}
	}

	// method appointed student with all appropriate parameters to Elder
	public void appointAelder(ArrayList<Student> group) {
		for (Student student : group) {
			if (student.isExcellence() == true && student.isPresent() == true && student.getYearOfBirth() == 2002 && student.getVotes() >= 3) {
				student.setElder(true);
			} else
				student.setElder(false);
		}
	}

	// if elder is appointed that method show student name,else print that not
	// appointed
	public void showElder(ArrayList<Student> group) {
		for (Student student : group) {
			if (student.isElder() == true) {
				System.out.println(student.getName() + " is elder now");
			} else
				System.out.println("we not appoint elder now");
			break;
		}
	}

}
