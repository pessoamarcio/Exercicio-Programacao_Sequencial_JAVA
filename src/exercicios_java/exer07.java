package exercicios_java;

import java.util.Scanner;

public class exer07 {

	public static void main(String[] args) {
		float a, b, c, d, f, g, x, y; 
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Qual o valor do primeiro número: ");
		a = valor.nextFloat();
		
		System.out.println("Qual o valor do segundo número: ");
		b = valor.nextFloat();
		
		System.out.println("Qual o valor do terceiro número: ");
		c = valor.nextFloat();
		
		System.out.println("Qual o valor do quarto número: ");
		d = valor.nextFloat();
		
		System.out.println("Qual o valor do quinto número: ");
		f = valor.nextFloat();
		
		System.out.println("Qual o valor do ultimo numero: ");
		g = valor.nextFloat();
		
		x = ((c*g)-(b*f))/((a*g)-(b*d));
		y = ((a*f)-(c*d))/((a*g)-(b*d));
		
		System.out.println("O valor de x é: " + x + " e o valor de y é: " + y);
		
	}

}
