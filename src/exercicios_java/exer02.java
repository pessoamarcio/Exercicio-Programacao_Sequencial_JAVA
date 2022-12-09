package exercicios_java;

import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
		int anos, dias, mes, resultado;
		String nome;
		Scanner d_informado = new Scanner(System.in);
		
		System.out.println("Informe dias de vida: ");
		resultado = d_informado.nextInt();
		
		anos = (resultado / 365);
		mes = (resultado % 365)/ 31;
		dias = (resultado % 365)% 31;
		System.out.println("Anos: "+ anos+ " , mes "+ mes+ " , dias "+ dias);
	}

}
