package exercicios_java;

import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {
		double cFabrica, cDistribuidor, carroZero, imposto;
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Qual o custo de fabrica do veiculo: ");
		cFabrica = valor.nextFloat();

		cDistribuidor = (cFabrica * 0.28);
		imposto = (cFabrica * 0.45);
		carroZero = (cDistribuidor + imposto + cFabrica);
		
		System.out.println("O valor do carro novo com as taxas é de R$"+ carroZero);
	}

}
