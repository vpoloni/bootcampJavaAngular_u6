package ej2;

import javax.swing.JOptionPane;

/*2) Crea una aplicaci�n que nos genere una cantidad de n�meros enteros aleatorios que
nosotros le pasaremos por teclado. Crea un m�todo donde pasamos como par�metros entre
que n�meros queremos que los genere, podemos pedirlas por teclado antes de generar los
n�meros. Este m�todo devolver� un n�mero entero aleatorio. Muestra estos n�meros por
pantalla.*/

public class ej2App {

	public static void main(String[] args) {
		
		//obtenemos inputs del usuario
		String cantidadNumeros = JOptionPane.showInputDialog("Introduce la cantidad de n�meros a generar: ");
		String inicioRango = JOptionPane.showInputDialog("Introduce el n�mero m�nimo del rango: ");
		String finalRango = JOptionPane.showInputDialog("Introduce el n�mero m�ximo del rango: ");
				
		//los convertimos de str a num
		int inicioRangoParseado = Integer.parseInt(inicioRango);
		int finalRangoParseado = Integer.parseInt(finalRango);
		int cantidadNumerosParseada = Integer.parseInt(cantidadNumeros);
		
		//creamos arr con el rango del input
		int numerosAleatorios[] = new int [cantidadNumerosParseada];
		
		System.out.println("Los n�meros generados aleatoriamente son los siguientes: ");
		
		//recorremos arr 
		for (int i = 0; i < numerosAleatorios.length; i++) {
			
			//asignamos el valor retornado por el m�todo al index "i" de arr
			numerosAleatorios[i] = generarNumeroAleatorio(inicioRangoParseado, finalRangoParseado);
			
			//mostramos por consola arr de num aleatorios
			System.out.println(numerosAleatorios[i]);
			
		}
			
}		
	
	public static int generarNumeroAleatorio(int minNum, int maxNum) {
		
		//generamos num aleatorio cada vez que el flujo entra en el bucle
		int numeroAleatorio = (int) (Math.random() * (maxNum-minNum) + 1) + minNum;
		
		return numeroAleatorio ;
		
	}

}
