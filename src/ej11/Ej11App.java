package ej11;

import java.util.Random;

import javax.swing.JOptionPane;

/*Crea dos arrays de números con la dimensión pasada por teclado.
Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior,
reasigna los valores del segundo array con valores aleatorios.
Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo
con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente.
Por último, muestra el contenido de cada array.*/


public class Ej11App {

	public static void main(String[] args) {
		
		String longitudArray = JOptionPane.showInputDialog
				("Introduce cuántas posiciones han de tener los arrays: ");
		int longitudArrayParseada = Integer.parseInt(longitudArray);
		
		Random rnd = new Random();
		
		int arrayAleatorios [] = new int [longitudArrayParseada];
		
		for (int i = 0; i < arrayAleatorios.length; i++) {
			
			int numeroAleatorio = (int) (rnd.nextDouble() * 10 + 1);
			
			arrayAleatorios[i] = numeroAleatorio;
		}
		
		int arrayAleatoriosClonado [] = arrayAleatorios.clone();
		
		for (int i = 0; i < arrayAleatoriosClonado.length; i++) {
			
			int numeroAleatorio = (int) (rnd.nextDouble() * 10 + 1);
			
			arrayAleatoriosClonado[i] = numeroAleatorio;
		}
		
		arrayFinal(arrayAleatorios, arrayAleatoriosClonado);
	}
	
	
	
	
	public static void arrayFinal(int arrayAleatorios[], int arrayAleatoriosClonado[]) {
		
		int arrayAleatoriosFinal [] = new int [arrayAleatorios.length];
		
		for (int i = 0; i <arrayAleatoriosFinal.length; i ++) {
			
			arrayAleatoriosFinal [i] = arrayAleatorios[i] * arrayAleatoriosClonado[i];
		}
		
		System.out.println("Contenido de arrayAleatorios: " );
		
		for (int i = 0; i < arrayAleatorios.length; i++) {
			
			System.out.println(arrayAleatorios[i]);
		}
		
		System.out.println("Contenido de arrayAleatoriosClonado: " );
		
		for (int i = 0; i < arrayAleatoriosClonado.length; i++) {
			
			System.out.println(arrayAleatoriosClonado[i]);
		}
		
		System.out.println("Contenido de arrayAleatoriosFinal: " );
		
		for (int i = 0; i < arrayAleatoriosFinal.length; i++) {
			
			System.out.println(arrayAleatoriosFinal[i]);
		}
		
	}
	
}
