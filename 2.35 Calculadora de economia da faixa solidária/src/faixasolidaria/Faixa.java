package faixasolidaria;

import java.util.Scanner;

public class Faixa {

	public static void main(String[] args) {
		
		int km, consumo;
		double totalGasto, gasolina, estacionamento, pedagio;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculadora faixa solidária\n");
		
		System.out.println("Quantos quilometros você dirige por dia?");
		km = input.nextInt();
		
		System.out.println("Quanto você paga no litro de gasolina?");
		gasolina = input.nextDouble();
		
		System.out.println("Quantos quilometros por litro o seu carro percorre?");
		consumo = input.nextInt();
		
		System.out.println("Quanto você gasta com estacionamento diariamente?");
		estacionamento = input.nextDouble();
		
		System.out.println("Quanto paga com pedágio por dia?");
		pedagio = input.nextDouble();
		
		totalGasto = ((double)km / consumo * gasolina) + estacionamento + pedagio;
		
		System.out.printf("O seu gasto com deslocamento com carro prório é: %f", totalGasto);

	}

}
