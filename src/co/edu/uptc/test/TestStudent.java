package co.edu.uptc.test;

import co.edu.uptc.model.Student;
import co.edu.uptc.structures.SimpleList;

public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student("Laura", 20);
		Student student2 = new Student("Vanessa", 10);
		Student student3 = new Student("Sofía", 19);
		SimpleList<Student> listStudent = new SimpleList<Student>();
		System.out.println("LISTA VACIA" + listStudent.isEmpty());
		listStudent.insert(student1);
		listStudent.insert(student2);
		listStudent.insert(student3);
		System.out.println(listStudent.show());
		System.out.println(listStudent.exist(student2));
		listStudent.remove(student1);
		System.out.println(listStudent.show());
		listStudent.remove(student3);
		System.out.println(listStudent.isEmpty());
		System.out.println(listStudent.show());
		//para poder ubicar un objeto por algún atributo es necesario hacer un casteo del objeto que se quiere buscar. Con un get. 
		

	}

}
