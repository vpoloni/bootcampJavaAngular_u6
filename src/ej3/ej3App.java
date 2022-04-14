package ej3;

import javax.swing.JOptionPane;

/*Crea una aplicaci�n que nos pida un n�mero por teclado y con un m�todo se lo pasamos
por par�metro para que nos indique si es o no un n�mero primo, debe devolver true si es
primo sino false.
Un n�mero primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/


public class ej3App {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Introduce un n�mero: ");
	
		int inputParseado = Integer.parseInt(input);
		
		 if (esNumeroPrimo(inputParseado)) {
			 System.out.println("El n�mero indicado es primo");
		 } else {
			 System.out.println("El n�mero indicado no es primo");
		 }
		
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
