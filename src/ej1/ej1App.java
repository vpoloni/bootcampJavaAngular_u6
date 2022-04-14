package ej1;

import javax.swing.JOptionPane;

/*) Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. Pediremos
que figura queremos calcular su área y según lo introducido pedirá los valores necesarios
para calcular el área. Crea un método por cada figura para calcular cada área, este devolverá
un número real. Muestra el resultado por pantalla.
Aquí te mostramos que necesita cada figura:
•
•
•
Circulo: (radio^2)*PI
Triangulo: (base * altura) / 2
Cuadrado: lado * lado
*/

public class ej1App {

	public static void main(String[] args) {
		
		//inputs 
		String figura = JOptionPane.showInputDialog
				("Introduce la figura (círculo, triángulo o cuadrado): ");
		
		//switch para cada valor del input
		switch (figura) {
		
		case "círculo":
			areaCirculo();
			break;
			
		case "cuadrado":
			areaCuadrado();
			break;
			
		case "triángulo":
			areaTriangulo();
			break;
			
		default:
			System.out.println("Error: ha de ser círculo, triángulo o cuadrado ");
			
			
		}
	}
	
	public static void areaCirculo() {
		
		//inputs
		String radio = JOptionPane.showInputDialog("Introduce el radio: ");
				
		//parseamos de str a num
		double radioParseado = Double.parseDouble(radio);
		
		//calculamos el área del círculo
		double area = Math.pow(radioParseado, 2)*Math.PI;
		
		//mostramos el resultado estableciéndole el fórmato		
		System.out.println("El area del círculo es: " + String.format("%.2f", area));			
					
		
	}
	
	public static void areaCuadrado() {
		
		//inputs
		String lado1 = JOptionPane.showInputDialog("Introduce el primer lado: ");
		String lado2 = JOptionPane.showInputDialog("Introduce el segundo lado: ");
		
		//parseamos de str a num
		double lado1Parseado = Integer.parseInt(lado1);
		double lado2Parseado = Integer.parseInt(lado2);
		
		//calculamos el área del cuadrado
		double area = lado1Parseado * lado2Parseado;
		
		//mostramos el resultado		
		System.out.println("El area del círculo es: " + area);		
		
	}
	
	public static void areaTriangulo() {
		
		//inputs
		String base = JOptionPane.showInputDialog("Introduce la base: ");
		String altura = JOptionPane.showInputDialog("Introduce la altura: ");
		
		//parseamos de str a num
		double baseParseada = Integer.parseInt(base);
		double alturaParseada = Integer.parseInt(altura);
		
		//calculamos el área del triángulo
		double area = (baseParseada * alturaParseada)/2;
		
		//mostramos el resultado
		System.out.println("El area del círculo es: " + area);	
	}

}
