package com.java.mate.academy.apprunner;

import java.util.ArrayList;

import com.java.mate.academy.group.Group;
import com.java.mate.academy.professor.Professor;
import com.java.mate.academy.student.Student;

public class AppRunner {

	public static void main(String[] args) {
		ArrayList<Student> allStudent = new ArrayList<Student>();
		ArrayList<Professor> professors = new ArrayList<Professor>();
		ArrayList<Student> paintingFaculty = new ArrayList<Student>();
		ArrayList<Student> someFaculty = new ArrayList<Student>();

		Group headQuare = new Group(null, allStudent);// created main group to generated other object and list
		headQuare.addProffesorToUniversityList(professors);// created professors list
		headQuare.createStudentList(allStudent);// created general student list
		/*
		 * for (Student st : allStudent) { System.out.println(st.getName() +
		 * st.getFaculty()); }
		 */ // unlock comment to look all student

		Group paint = new Group(null, paintingFaculty);// generate new group with paint direction
		paint.setFaculty("Paint");// that parameter generated randomly but in this test set him to Paint
		System.out.println("There are " + paint.getFaculty() + " group direction");
		paint.addProffesorToGroup(professors);// added professor to group with same faculty direction from general pofessors
												// list
		System.out.println(paint.getProffesor().getName());// just for look to curent added
		paint.addStudent(allStudent);// add student with "Paint" faculty parameters to paintingFaculty
		paint.showGroup(paintingFaculty);// Show all students in painting group
		paint.getProffesor().rollCall(paintingFaculty); // professor rollcaled students
		paint.appointAelder(paintingFaculty);// students appointed Elder with appropriate paramethers(its so hard but work i
												// tried and succes in 50+ tryes)
		paint.showElder(paintingFaculty);// and show Elder(if he is appointed)

		// test2 another group with random faculty
		Group someGroup = new Group(null, someFaculty);
		System.out.println("There are " + someGroup.getFaculty() + " group direction");
		someGroup.addProffesorToGroup(professors);
		someGroup.addStudent(allStudent);
		someGroup.showGroup(someFaculty);
		someGroup.getProffesor().rollCall(someFaculty);
		someGroup.appointAelder(someFaculty);
		someGroup.showElder(someFaculty);
	}

}
