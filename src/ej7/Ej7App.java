package ej7;

import javax.swing.JOptionPane;

/*Crea un aplicaci�n que nos convierta una cantidad de euros introducida por teclado a otra
moneda, estas pueden ser a dolares, yenes o libras. El m�todo tendr� como par�metros, la
cantidad de euros y la moneda a pasar que sera una cadena, este no devolver� ning�n valor,
mostrara un mensaje indicando el cambio (void).
El cambio de divisas son:
#0.86 libras es un 1 �
#1.28611 $ es un 1 �
#129.852 yenes es un 1 �*/


public class Ej7App {

	public static void main(String[] args) {
	
		String cantidadEntrada = JOptionPane.showInputDialog
				("Introduce la cantidad de euros a convertir: ");
		double cantidadEntradaParseada = Double.parseDouble(cantidadEntrada);
		
		String monedaEntrada = JOptionPane.showInputDialog
				("Elige la moneda a convertir: dolares/yenes/libras ").toLowerCase();
		
		//invocamos el m�todo pas�ndole como par�metros valores de entrada
		System.out.println("El importe convertido: " + String.format("%.2f",
				convertirADolares(cantidadEntradaParseada, monedaEntrada )));

	}
	
	public static double convertirADolares(double cantidadEuros, String moneda) {
		
		double cantidadSalida = 0;
	
		double dolar = 1.28611;
		double yen = 129.852;
		double libra = 0.86;
		
		//switch para cada caso
		switch (moneda) {
		
			case "dolares":
				cantidadSalida = cantidadEuros * dolar;
				break;
				
			case "yenes":
				cantidadSalida = cantidadEuros * yen;
				break;
				
			case "libras":
				cantidadSalida = cantidadEuros * libra;
				break;
				
			default:
				System.out.println("Error al introducir el tipo de moneda");
		
		}
		
		return cantidadSalida;
		
	}

}
