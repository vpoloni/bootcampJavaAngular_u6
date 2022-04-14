package ej4;

import javax.swing.JOptionPane;

/* Crea una aplicaci�n que nos calcule el factorial de un n�mero pedido por teclado, lo
realizara mediante un m�todo al que le pasamos el n�mero como par�metro. Para calcular
el factorial, se multiplica los n�meros anteriores hasta llegar a uno. Por ejemplo, si
introducimos un 5, realizara esta operaci�n 5*4*3*2*1=120.*/


public class ej4App {

	public static void main(String[] args) {
		
		//Obtenemos el dato del usuario
		String input = JOptionPane.showInputDialog("Introduce un n�mero: ");
		
		//Convertimos el valor de input de String a int
		int inputParseado = Integer.parseInt(input);
		
		//Llamamos al m�todo que calcula el factorial pas�ndole por par�metro el valor del input
		calcularFactorial(inputParseado);
		

	}
	
	public static void calcularFactorial(int numero) {
		
		int numeroRecibido = numero;
		
		//Inicializamos el factorial 
		int factorial = 1;
		
		//El n�mero ha de ser mayor que 0, al contrario el factorial dejar� de calcularse
		while (numero != 0) { 
			
			//Calculamos el factorial
			factorial = factorial * numero;
			
			//En cada iteraci�n restamos 1 del n�mero recibido como par�metro
			numero--;	
		
		}
		
		System.out.println("El factorial de " + numeroRecibido + " es " + factorial);
	
	}

}
