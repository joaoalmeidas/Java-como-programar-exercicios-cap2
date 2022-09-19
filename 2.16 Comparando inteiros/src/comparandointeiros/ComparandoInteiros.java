package comparandointeiros;

import java.util.Scanner;

public class ComparandoInteiros {

	public static void main(String[] args) {
		
		// 2.16 (Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número
		//maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem “These numbers are equal". Utilize
		//as técnicas mostradas na Figura 2.15.
		
		int a, b;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que identifica qual é o maior inteiro inserido");
		
		System.out.print("Insira o primeiro número inteiro:");
		a = input.nextInt();
		System.out.print("Insira o segundo número inteiro:");
		b = input.nextInt();
		
		if(a > b) {
			System.out.printf("%d é maior%n", a);
		}else if(b > a) {
			System.out.printf("%d é maior%n", b);
		}else {
			System.out.println("Os números são iguais");
		}
		
	}

}
