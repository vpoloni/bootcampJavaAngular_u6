package ej12;

import java.util.Random;

/* Crea un array de n�meros de un tama�o pasado por teclado, el array contendr�
n�meros aleatorios entre 1 y 300 y mostrar� aquellos n�meros que acaben en un d�gito que
nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto),
estos deben guardarse en un nuevo array.
Por ejemplo, en un array de 10 posiciones le indiquemos mostrar los n�meros acabados en 5,
podr�a salir 155, 25, etc.*/

import javax.swing.JOptionPane;

	public class Ej12App {
	
		public static void main(String[] args) {
			
			String longitudArray = JOptionPane.showInputDialog
					("Introduce cu�ntas posiciones ha de tener los array: ");
			int longitudArrayParseada = Integer.parseInt(longitudArray);
			
			String acabaEnDigito;
			int acabaEnDigitoParseado;
			
			do {
				
				acabaEnDigito = JOptionPane.showInputDialog
						("Introduce el digito con que han de acabar los n�meros ");
				acabaEnDigitoParseado = Integer.parseInt(acabaEnDigito);
			
			} while (acabaEnDigitoParseado > 300);
			
	
			Random rnd = new Random();
			
			int arrayAleatorios [] = new int [longitudArrayParseada];
			
			for (int i = 0; i < arrayAleatorios.length; i++) {
				
				do {
				
				int numeroAleatorio = (int) (rnd.nextDouble() * 300 + 1);
				
				String numeroAleatorioString = Integer.toString(numeroAleatorio);
				
				if (numeroAleatorioString.endsWith(acabaEnDigito)) {
					
					arrayAleatorios [i] = numeroAleatorio;
					
				}
				
				
			} while (arrayAleatorios [i] == 0);
				
		}
			
			for(int numeros : arrayAleatorios) {
				
				System.out.print(numeros + " ");
			}
			
		}
		
}   
		
			
			

	


