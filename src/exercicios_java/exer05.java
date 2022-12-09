package exercicios_java;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, media;
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Qual foi a primeira nota: ");
		nota1 = valor.nextFloat();
		
		System.out.println("Qual a segunda nota: ");
		nota2 = valor.nextFloat();
		
		System.out.println("Qual a terceira nota: ");
		nota3 = valor.nextFloat();
		
		media = ((nota1 *2) + (nota2*3) + (nota3*5))/10;
		System.out.println("A média ponderada é: " + media);
	}
}
