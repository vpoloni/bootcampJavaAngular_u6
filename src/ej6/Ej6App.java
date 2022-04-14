package ej6;

import javax.swing.JOptionPane;

/* Crea una aplicaci�n que nos cuente el n�mero de cifras de un n�mero entero positivo
(hay que controlarlo) pedido por teclado. Crea un m�todo que realice esta acci�n, pasando
el n�mero por par�metro, devolver� el n�mero de cifras.*/


public class Ej6App {

	public static void main(String[] args) {
		
		
			String input = JOptionPane.showInputDialog("Introduce un n�mero entero positivo");
			int inputParseado = Integer.parseInt(input);
			
			obtenerNumeroCifras(inputParseado);	
	}
	
	
	public static void obtenerNumeroCifras(int numero) {
		
		int numeroEntrada = numero;
		int contadorCifras = 0;
		
		if (0 > numero || numero == 0) {
			
		System.out.println("Valor inv�lido: has de introducir el n�mero entero positivo");
		
		} else {
			
			while (numero > 0) {
				
				numero = numero / 10;
				
				contadorCifras++;
				
			}
			
			System.out.println("El n�mero de cifras de " + numeroEntrada + " es " + contadorCifras);
			
		}
		
		
	}
}
		
