package co.edu.uptc.test;

import co.edu.uptc.model.SimpleList;
import co.edu.uptc.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student("Laura", 20);
		SimpleList<Student> listStudent = new SimpleList<Student>();
		listStudent.insert(student1);
		System.out.println(listStudent.show());

	}

}
