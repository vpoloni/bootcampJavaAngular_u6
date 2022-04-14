package ej2;

import javax.swing.JOptionPane;

/*2) Crea una aplicación que nos genere una cantidad de números enteros aleatorios que
nosotros le pasaremos por teclado. Crea un método donde pasamos como parámetros entre
que números queremos que los genere, podemos pedirlas por teclado antes de generar los
números. Este método devolverá un número entero aleatorio. Muestra estos números por
pantalla.*/

public class ej2App {

	public static void main(String[] args) {
		
		//obtenemos inputs del usuario
		String cantidadNumeros = JOptionPane.showInputDialog("Introduce la cantidad de números a generar: ");
		String inicioRango = JOptionPane.showInputDialog("Introduce el número mínimo del rango: ");
		String finalRango = JOptionPane.showInputDialog("Introduce el número máximo del rango: ");
				
		//los convertimos de str a num
		int inicioRangoParseado = Integer.parseInt(inicioRango);
		int finalRangoParseado = Integer.parseInt(finalRango);
		int cantidadNumerosParseada = Integer.parseInt(cantidadNumeros);
		
		//creamos arr con el rango del input
		int numerosAleatorios[] = new int [cantidadNumerosParseada];
		
		System.out.println("Los números generados aleatoriamente son los siguientes: ");
		
		//recorremos arr 
		for (int i = 0; i < numerosAleatorios.length; i++) {
			
			//asignamos el valor retornado por el método al index "i" de arr
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
