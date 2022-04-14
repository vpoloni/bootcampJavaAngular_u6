package ej1;

import javax.swing.JOptionPane;

/*) Crea una aplicaci�n que nos calcule el �rea de un circulo, cuadrado o triangulo. Pediremos
que figura queremos calcular su �rea y seg�n lo introducido pedir� los valores necesarios
para calcular el �rea. Crea un m�todo por cada figura para calcular cada �rea, este devolver�
un n�mero real. Muestra el resultado por pantalla.
Aqu� te mostramos que necesita cada figura:
�
�
�
Circulo: (radio^2)*PI
Triangulo: (base * altura) / 2
Cuadrado: lado * lado
*/

public class ej1App {

	public static void main(String[] args) {
		
		//inputs 
		String figura = JOptionPane.showInputDialog
				("Introduce la figura (c�rculo, tri�ngulo o cuadrado): ");
		
		//switch para cada valor del input
		switch (figura) {
		
		case "c�rculo":
			areaCirculo();
			break;
			
		case "cuadrado":
			areaCuadrado();
			break;
			
		case "tri�ngulo":
			areaTriangulo();
			break;
			
		default:
			System.out.println("Error: ha de ser c�rculo, tri�ngulo o cuadrado ");
			
			
		}
	}
	
	public static void areaCirculo() {
		
		//inputs
		String radio = JOptionPane.showInputDialog("Introduce el radio: ");
				
		//parseamos de str a num
		double radioParseado = Double.parseDouble(radio);
		
		//calculamos el �rea del c�rculo
		double area = Math.pow(radioParseado, 2)*Math.PI;
		
		//mostramos el resultado estableci�ndole el f�rmato		
		System.out.println("El area del c�rculo es: " + String.format("%.2f", area));			
					
		
	}
	
	public static void areaCuadrado() {
		
		//inputs
		String lado1 = JOptionPane.showInputDialog("Introduce el primer lado: ");
		String lado2 = JOptionPane.showInputDialog("Introduce el segundo lado: ");
		
		//parseamos de str a num
		double lado1Parseado = Integer.parseInt(lado1);
		double lado2Parseado = Integer.parseInt(lado2);
		
		//calculamos el �rea del cuadrado
		double area = lado1Parseado * lado2Parseado;
		
		//mostramos el resultado		
		System.out.println("El area del c�rculo es: " + area);		
		
	}
	
	public static void areaTriangulo() {
		
		//inputs
		String base = JOptionPane.showInputDialog("Introduce la base: ");
		String altura = JOptionPane.showInputDialog("Introduce la altura: ");
		
		//parseamos de str a num
		double baseParseada = Integer.parseInt(base);
		double alturaParseada = Integer.parseInt(altura);
		
		//calculamos el �rea del tri�ngulo
		double area = (baseParseada * alturaParseada)/2;
		
		//mostramos el resultado
		System.out.println("El area del c�rculo es: " + area);	
	}

}
