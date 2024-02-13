package co.edu.uptc.test;

import co.edu.uptc.model.SimpleList;
import co.edu.uptc.view.View;

public class Test {
	private final String MENU = "1. Insertar dato" + "\n" + "2. Verificar existencia" + "\n" + "3. Remover dato" + "\n"
			+ "4. Verifar lista vacia" +"\n"+ "5. Mostrar lista" + "\n" + "0. salir";

	private SimpleList list;
	private View view;

	public Test() {
		this.list = new SimpleList();
		this.view = new View();
	}

	public SimpleList getList() {
		return list;
	}

	public int mostrarMenu() {
		int option = 0;
		try {
			option = Integer.parseInt(view.readData(MENU));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return option;
	}

	public void principal() {
		int option = mostrarMenu();
		switch (option) {
		case 1:
			insert();
			break;
		case 2:
			exist();
			break;
		case 3:
			remove();
			break;
		case 4:
			empty();
			break;
		case 5:
			show();
			break;
		case 0:
			view.showMessage("Fin del programa");
			System.exit(0);
			break;
		default:
			view.showMessage("Ingrese otra opcion");
			break;
		}
		do {
			principal();
		} while (option != 6);
	}

	private void empty() {
		if (getList().isEmpty()) {
			view.showMessage("Lista vacia");
		} else {
			view.showMessage("No est� vacia: " + getList().show());
		}

	}

	private void insert() {
		try {
			getList().insert(Integer.parseInt(view.readData("Ingrese un numero por favor")));
		} catch (NumberFormatException e) {
			view.showMessage("Ingrese un numero");
		}

	}

	private void exist() {
		try {
			if (!getList().exist(Integer.parseInt(view.readData("Ingrese un numero por favor")))) {
				view.showMessage("El dato no se encuentra");
			} else {
				view.showMessage("El dato se encuentra");
			}

		} catch (NumberFormatException e) {
			view.showMessage("Ingrese un numero");
		}

	}

	private void remove() {
		try {

			int data = Integer.parseInt(view.readData("Ingrese un numero por favor"));
			if (!getList().exist(data)) {
				view.showMessage("El dato no se encuentra");
				show();

			} else {
				getList().remove(data);
				view.showMessage("Dato eliminado");
				show();
			}

		} catch (NumberFormatException e) {
			view.showMessage("Ingrese un numero");
		}

	}

	private void show() {
		try {
			view.showMessage(getList().show());
		} catch (NullPointerException e) {
			view.showMessage("Lista Vacia");
		}

	}

	public static void main(String[] args) {
		Test test = new Test();
		test.principal();
	}

}
