package ej6;

import javax.swing.JOptionPane;

/* Crea una aplicación que nos cuente el número de cifras de un número entero positivo
(hay que controlarlo) pedido por teclado. Crea un método que realice esta acción, pasando
el número por parámetro, devolverá el número de cifras.*/


public class Ej6App {

	public static void main(String[] args) {
		
		
			String input = JOptionPane.showInputDialog("Introduce un número entero positivo");
			int inputParseado = Integer.parseInt(input);
			
			obtenerNumeroCifras(inputParseado);	
	}
	
	
	public static void obtenerNumeroCifras(int numero) {
		
		int numeroEntrada = numero;
		int contadorCifras = 0;
		
		if (0 > numero || numero == 0) {
			
		System.out.println("Valor inválido: has de introducir el número entero positivo");
		
		} else {
			
			while (numero > 0) {
				
				numero = numero / 10;
				
				contadorCifras++;
				
			}
			
			System.out.println("El número de cifras de " + numeroEntrada + " es " + contadorCifras);
			
		}
		
		
	}
}
		
