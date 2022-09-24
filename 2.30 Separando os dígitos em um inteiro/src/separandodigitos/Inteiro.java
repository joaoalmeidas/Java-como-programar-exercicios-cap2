package separandodigitos;

import java.util.Scanner;

public class Inteiro {

	public static void main(String[] args) {
		
		/*
		 * 2.30 (Separando os dígitos em um inteiro) Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
			separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário
			digitar o número 42339, o programa deve imprimir
			4 2 3 3 9
		 */
		
		int num, primeiro, segundo, terceiro, quarto, quinto;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que separa os digitos de um número com 5 digitos.");
		
		System.out.print("Insira um inteiro de 5 digitos:");
		
		num = input.nextInt();
		
		quinto = num%10;
		num = num/10;
		
		quarto = num%10;
		num = num/10;
		
		terceiro = num%10;
		num = num/10;
		
		segundo = num%10;
		num = num/10;
		
		primeiro = num%10;
		num = num/10;
		
		System.out.printf("%d	%d	%d	%d	%d", primeiro, segundo, terceiro, quarto, quinto);

	}

}
