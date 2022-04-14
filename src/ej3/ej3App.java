package ej3;

import javax.swing.JOptionPane;

/*Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/


public class ej3App {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Introduce un número: ");
	
		int inputParseado = Integer.parseInt(input);
		
		 if (esNumeroPrimo(inputParseado)) {
			 System.out.println("El número indicado es primo");
		 } else {
			 System.out.println("El número indicado no es primo");
		 }
		
	} 
	
	public static boolean esNumeroPrimo(int numero) {
		
		boolean esNumeroPrimo = true;
		
		//Comprobamos si hay un numero entre 2 y número que se puede usar para dividir sin resto
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
