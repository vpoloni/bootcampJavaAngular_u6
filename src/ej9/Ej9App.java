package ej9;

import javax.swing.JOptionPane;

/*Crea un array de números donde le indicamos por teclado el tamaño del array,
rellenaremos el array con números aleatorios entre 0 y 9. Al final muestra por pantalla el
valor de cada posición y la suma de todos los valores.
Tareas a realizar: Haz un método para rellenar el array(que tenga como parámetros los
números entre los que tenga que generar) y otro para mostrar el contenido y la suma del
array.
*/

public class Ej9App {

	public static void main(String[] args) {
		
		
		String inicioRango = JOptionPane.showInputDialog
				("Introduce el número mínimo del rango: ");
		int inicioRangoParseado = Integer.parseInt(inicioRango);
		
		String finRango = JOptionPane.showInputDialog
				("Introduce el número máximo del rango: ");
		int finRangoParseado = Integer.parseInt(finRango);
		
		mostrarArray(rellenarArray(inicioRangoParseado, finRangoParseado));
		
	}
	
	public static int [] rellenarArray(int inicioArray, int finArray) {
		
		String longitudArray = JOptionPane.showInputDialog
				("Introduce cuántas posiciones ha de tener un array: ");
		int longitudArrayParseada = Integer.parseInt(longitudArray);
		
		//Asignamos la longitud del array con el valor obtenido del usuario
		int numeros [] = new int [longitudArrayParseada];
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros [i] = (int) (Math.random() * (finArray - inicioArray) + 1) + inicioArray;
		
		}
		
		return numeros; 
		
	}
	
	public static void mostrarArray(int numeros []) {
		
		int sumaArray = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("El valor en la posición [" + i + "] es " + numeros[i]);
			
			sumaArray += numeros[i];
			
		}
		
		System.out.println("La suma de valores del array: " + sumaArray);
	}

}
