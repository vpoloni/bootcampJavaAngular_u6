package ej8;

import javax.swing.JOptionPane;

/*Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y
otro para mostrar*/

public class Ej8App {
	
	public static void main(String[] args) {
		
		//invocamos mostrarValoresArray que recibe por parámetro el array retornado de rellenarValoresArray
		mostrarValoresArray(rellenarValoresArray());

	}
	
	public static int [] rellenarValoresArray() {
		
		int numeros [] = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			
			String valorEntrada = JOptionPane.showInputDialog("Introduce los números: ");
			
			//asignamos el valor de entrada previamente convertido a int al array de números
			numeros [i] = Integer.parseInt(valorEntrada);
		
		}
		
		//retornamos el array
		return numeros;		
		
	}
	
	public static void mostrarValoresArray(int numeros []) {
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("El valor en la posición [" + i + "] es igual a " + numeros[i]);
		}
		
	}

}
