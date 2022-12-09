package exercicios_java;

import java.util.Scanner;

public class exer04 {
	public static void main(String[]args) {
		int A, B, C, R, S, D;
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		A = valor.nextInt();
		
		System.out.println("Digite outro valor: ");
		B = valor.nextInt();
		
		System.out.println("Digite o próximo valor: ");
		C = valor.nextInt();
		
		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		D = (R + S) / 2;
		
		System.out.println("O resultado de D: " + D);
	}
}
