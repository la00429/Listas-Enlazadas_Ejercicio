package co.edu.uptc.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import co.edu.uptc.structures.DoubleList;

public class TestDouble {
	public static void main(String[] args) {
		DoubleList<Integer> listNumber = new DoubleList<Integer>();

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(19);
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		

		listNumber.insert(5);
		listNumber.insert(3);
		listNumber.insert(8);
		listNumber.insert(2);
		
		Iterator<Integer> iterador = listNumber.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}

		System.out.println(listNumber.exist(8));

		listNumber.insert(10);
		listNumber.insert(6);
		System.out.println("Normal " + listNumber.show());
		System.out.println("Inverse  " + listNumber.showInverse());

		System.out.println(listNumber.exist(8));

		try {
			System.out.println("Antes de remover" + listNumber.prueba(6).getData());
		} catch (NullPointerException e) {
			System.out.println("null");
		}

		listNumber.remove(10);
		System.out.println(listNumber.exist(5));
		System.out.println("Luego de remover " + listNumber.prueba(6).getData());
	}
}
