package aritmeticamenoremaior;

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		
		//2.17 (Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
		//números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar
		//em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]
		
		int a, b, c, maior, menor;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os\r\n"
				+ "		números menores e maiores.");
		
		System.out.print("Insira o primeiro número inteiro:");
		a = input.nextInt();
		System.out.print("Insira o segundo número inteiro:");
		b = input.nextInt();
		System.out.print("Insira o terceiro número inteiro:");
		c = input.nextInt();
		
		System.out.printf("Soma: %d$n Média: %d%n Produto: %d%n", (a+b+c), ((a+b+c)/3), (a*b*c));
		
		maior = a;
		
		if(b > maior) {
			maior = b;
		}
		
		if(c > maior) {
			maior = c;
		}
		
		System.out.printf("%d é o maior inteiro inserido %n", maior);
		
		menor = a;
		
		if(b < menor) {
			menor = b;
		}
		
		if(c < menor) {
			menor = c;
		}
		
		System.out.printf("%d é o menor inteiro inserido %d", menor);
		
	}

}
