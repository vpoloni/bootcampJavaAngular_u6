package ej10;

import javax.swing.JOptionPane;

/*Crea un array de n�meros de un tama�o pasado por teclado, el array contendr�
n�meros aleatorios primos entre los n�meros deseados, por �ltimo nos indicar cual es el
mayor de todos.
Haz un m�todo para comprobar que el n�mero aleatorio es primo, puedes hacer todos lo
m�todos que necesites.*/

public class Ej10App {
	
	public static void main(String[] args) {
		
		String inicioRango = JOptionPane.showInputDialog
				("Introduce el n�mero m�nimo del rango: ");
		int inicioRangoParseado = Integer.parseInt(inicioRango);
		
		String finRango = JOptionPane.showInputDialog
				("Introduce el n�mero m�ximo del rango: ");
		int finRangoParseado = Integer.parseInt(finRango);
		
		String longitudArray = JOptionPane.showInputDialog
				("Introduce cu�ntas posiciones ha de tener un array: ");
		int longitudArrayParseada = Integer.parseInt(longitudArray);
		
		construirArray(inicioRangoParseado, finRangoParseado, longitudArrayParseada);
		
	}
	
	
	public static void construirArray(int inicioArray, int finArray, int longitudArray) {
		
		//Asignamos la longitud del array con el valor obtenido del usuario
		int numeros [] = new int [longitudArray];
		
		for (int i = 0; i < longitudArray; i++) {
			
			numeros[i] = generarAleatoriosPrimos(inicioArray, finArray);
			
			System.out.println(numeros [i]);
		}
		
		int valorMaximo = 0;
		
		for (int i = 0; i < longitudArray; i++) {
			
			if (numeros [i] > valorMaximo) {
				
				valorMaximo = numeros [i];
			}
		}
		
		System.out.println("El valor m�ximo del array generado aleatoriamente es: " + valorMaximo);
	}
	
	
	public static int generarAleatoriosPrimos(int inicioArray, int finArray) {
		
		int numeroAleatorioPrimo = 0;
		boolean numeroPrimoEncontrado = false;
		
		while (numeroPrimoEncontrado != true) {
			
			 int numeroAleatorio = (int) ((Math.random() * (finArray - inicioArray) + 1) + inicioArray);
			 
			 if (esNumeroPrimo(numeroAleatorio)) {
				
				 numeroPrimoEncontrado = true;
				 numeroAleatorioPrimo = numeroAleatorio;
			
			 } 
			
		}
		
		return numeroAleatorioPrimo;
	}
	
	
	public static boolean esNumeroPrimo(int numero) {
		
		boolean esNumeroPrimo = true;
		
		//Comprobamos si hay un numero entre 2 y n�mero que se puede usar para dividir sin resto
		if (numero == 1 || numero == 0 || numero < 0) {
			
			esNumeroPrimo = false;
			
		} else {
			
			for (int i = 2; i < numero; i++) {
				
				if (numero% i == 0) {
					
					esNumeroPrimo = false;
				} 
			}
		}
		
		return esNumeroPrimo;
	}

}
