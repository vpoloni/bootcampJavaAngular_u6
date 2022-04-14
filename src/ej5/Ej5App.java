package ej5;

import javax.swing.JOptionPane;

/*Crea una aplicaci�n que nos convierta un n�mero en base decimal a binario. Esto lo
realizara un m�todo al que le pasaremos el numero como par�metro, devolver� un String
con el numero convertido a binario. Para convertir un numero decimal a binario, debemos
dividir entre 2 el numero y el resultado de esa divisi�n se divide entre 2 de nuevo hasta que
no se pueda dividir mas, el resto que obtengamos de cada divisi�n formara el numero
binario, de abajo a arriba.*/


public class Ej5App {

	public static void main(String[] args) {
		

		//Obtenemos el dato del usuario
		String input = JOptionPane.showInputDialog("Introduce un n�mero natural: ");
		
		//Convertimos el valor del input de String a int
		int inputParseado = Integer.parseInt(input);
		
		//Invocamos el m�todo que convierte num a binario
		System.out.println("El n�mero " + inputParseado + " convertido a binario es: " + 
						obtenerBinario(inputParseado));
		
	}
	
	public static String obtenerBinario(int decimal) {
		
		//Instancializamos StringBuilder para insertar los d�gitos al inicio de la cadena
		StringBuilder binario = new StringBuilder();
		
		//Evaluamos los n�meros enteros positivos
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
