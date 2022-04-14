package ej4;

import javax.swing.JOptionPane;

/* Crea una aplicación que nos calcule el factorial de un número pedido por teclado, lo
realizara mediante un método al que le pasamos el número como parámetro. Para calcular
el factorial, se multiplica los números anteriores hasta llegar a uno. Por ejemplo, si
introducimos un 5, realizara esta operación 5*4*3*2*1=120.*/


public class ej4App {

	public static void main(String[] args) {
		
		//Obtenemos el dato del usuario
		String input = JOptionPane.showInputDialog("Introduce un número: ");
		
		//Convertimos el valor de input de String a int
		int inputParseado = Integer.parseInt(input);
		
		//Llamamos al método que calcula el factorial pasándole por parámetro el valor del input
		calcularFactorial(inputParseado);
		

	}
	
	public static void calcularFactorial(int numero) {
		
		int numeroRecibido = numero;
		
		//Inicializamos el factorial 
		int factorial = 1;
		
		//El número ha de ser mayor que 0, al contrario el factorial dejará de calcularse
		while (numero != 0) { 
			
			//Calculamos el factorial
			factorial = factorial * numero;
			
			//En cada iteración restamos 1 del número recibido como parámetro
			numero--;	
		
		}
		
		System.out.println("El factorial de " + numeroRecibido + " es " + factorial);
	
	}

}
