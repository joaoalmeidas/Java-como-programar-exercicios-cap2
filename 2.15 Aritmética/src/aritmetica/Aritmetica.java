package aritmetica;

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		
		//(Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto,
		//diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.
		
		int a, b;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Soma, subtração, produto e divisão de dois inteiros.");
		
		System.out.print("Insira o primeiro número inteiro:");
		a = input.nextInt();
		System.out.print("Insira o segundo número inteiro:");
		b = input.nextInt();
		
		System.out.printf("Soma: %d %nSubtração: %d %nProduto: %d %nDivisão: %d %n", (a+b), (a-b), (a*b), (a/b));
	}

}
