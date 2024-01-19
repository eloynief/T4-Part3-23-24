package ej5;

public class Main {

	public static void main(String[] args) {

		//
		int[] tabla = { 2, 3, 4, 5, 6, 7, 8, 2, 3 };
		int[] tablaDevuelta;

		//
		int num;
		
		

	}

	int[] buscarTodos(int t[], int valor) {
		// numero que guarda la posicion de la tabla en donde
		int posicion=0, aumento = 0;
		//
		int[] tablaAumento;

		// recorre la tabla para crear el tamaño de la tabla
		for (int i = 0; i < t.length; i++) {

			// si encuentra un valor igual al de la tabla
			if (valor == t[i]) {

				aumento++;

			}

		}

		tablaAumento = new int[aumento];

		// recorre la tabla para introducir los valores en la tabla creada
		for (int i = 0; i < t.length; i++) {

			// si encuentra un valor igual al de la tabla
			if (valor == t[i]) {

				tablaAumento[posicion]=i;
				posicion++;
			}

		}

		return t;
	}

}
