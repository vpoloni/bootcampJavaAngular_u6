package ej5;

import javax.swing.JOptionPane;

/*Crea una aplicación que nos convierta un número en base decimal a binario. Esto lo
realizara un método al que le pasaremos el numero como parámetro, devolverá un String
con el numero convertido a binario. Para convertir un numero decimal a binario, debemos
dividir entre 2 el numero y el resultado de esa división se divide entre 2 de nuevo hasta que
no se pueda dividir mas, el resto que obtengamos de cada división formara el numero
binario, de abajo a arriba.*/


public class Ej5App {

	public static void main(String[] args) {
		

		//Obtenemos el dato del usuario
		String input = JOptionPane.showInputDialog("Introduce un número natural: ");
		
		//Convertimos el valor del input de String a int
		int inputParseado = Integer.parseInt(input);
		
		//Invocamos el método que convierte num a binario
		System.out.println("El número " + inputParseado + " convertido a binario es: " + 
						obtenerBinario(inputParseado));
		
	}
	
	public static String obtenerBinario(int decimal) {
		
		//Instancializamos StringBuilder para insertar los dígitos al inicio de la cadena
		StringBuilder binario = new StringBuilder();
		
		//Evaluamos los números enteros positivos
		while (decimal > 0) {
			
			int residuo = decimal % 2; 
			decimal = decimal / 2;
			
			//Insertamos el valor del residuo al inicio de la cadena
			binario.insert(0, String.valueOf(residuo));
			
		}
		//Retornamos el valor convertido a String
		return binario.toString();
		
	}

}
