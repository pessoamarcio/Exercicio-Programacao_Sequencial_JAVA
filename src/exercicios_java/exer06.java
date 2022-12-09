package exercicios_java;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		double x1, x2, y1, y2, distancia;
		Scanner coordenada = new Scanner(System.in);
		
		System.out.println("Qual a coordenada de x1: ");
		x1 = coordenada.nextFloat();
		
		System.out.println("Qual a coordenada x2: ");
		x2 = coordenada.nextFloat();
		
		System.out.println("Qual a coordenada y1: ");
		y1 = coordenada.nextFloat();
		
		System.out.println("Qual a coordenada do y2: ");
		y2 = coordenada.nextFloat();
		
		distancia = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		System.out.println("A distancia entre dois pontos eh: " + distancia);
	}
	
}
