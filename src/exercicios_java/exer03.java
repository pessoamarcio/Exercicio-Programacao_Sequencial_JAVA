package exercicios_java;

import java.util.Scanner;

public class exer03 {
	public static void main(String[] args) {
		int horas, minutos, segundos, informado;
		Scanner evento = new Scanner(System.in);
				
		System.out.println("Qual a duração do evento em segundos: ");
		informado = evento.nextInt();
		
		horas = (informado / 3600);
		minutos = (informado % 3600) / 60;
		segundos = ((informado % 3600) % 60);
		System.out.println("A duração foi " + horas + " , minutos " + minutos + " , segundos." + segundos);
	}
}
