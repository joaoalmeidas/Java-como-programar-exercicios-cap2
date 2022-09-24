package valorespositivosnegativos;

import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {
		
		/*
		 * 2.32 (Valores negativos, positivos e zero) Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos,
			quantos positivos e quantos zeros foram inseridos.
		 */
		
		int num, negativos = 0, positivos = 0, zeros = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que determina quantos números positivos, negativos e zeros foram inseridos.");
		
		System.out.print("Insira um número inteiro:");
		
		num = input.nextInt();
		
		if(num < 0) {
			
			negativos = negativos + 1;
		}else if(num > 0) {
			
			positivos = positivos + 1;
		}else{
			
			zeros = zeros + 1;
		}
		
		System.out.print("Insira um número inteiro:");
		
		num = input.nextInt();
		
		if(num < 0) {
			
			negativos = negativos + 1;
		}else if(num > 0) {
			
			positivos = positivos + 1;
		}else{
			
			zeros = zeros + 1;
		}
		System.out.print("Insira um número inteiro:");
		
		num = input.nextInt();
		
		if(num < 0) {
			
			negativos = negativos + 1;
		}else if(num > 0) {
			
			positivos = positivos + 1;
		}else{
			
			zeros = zeros + 1;
		}
		System.out.print("Insira um número inteiro:");
		
		num = input.nextInt();
		
		if(num < 0) {
			
			negativos = negativos + 1;
		}else if(num > 0) {
			
			positivos = positivos + 1;
		}else{
			
			zeros = zeros + 1;
		}
		System.out.print("Insira um número inteiro:");
		
		num = input.nextInt();
		
		if(num < 0) {
			
			negativos = negativos + 1;
		}else if(num > 0) {
			
			positivos = positivos + 1;
		}else{
			
			zeros = zeros + 1;
		}
		
		System.out.printf("Positivos: %d\t Negativos: %d\t\t Zeros:%d", positivos, negativos, zeros);
		
		
	}

}
