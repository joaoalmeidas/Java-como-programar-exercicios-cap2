package multiplos;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		int a, b, resto;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que verifica se um o primeiro número inserido é múltiplo do segundo.");
		
		System.out.print("Insira o primeiro número inteiro:");
		a = input.nextInt();
		
		System.out.print("Insira o segundo número inteiro:");
		b = input.nextInt();
		
		resto = a%b;
		
		if(resto == 0) {
			
			System.out.printf("%d é múltiplo de %d", a, b);
		}else {
			
			System.out.printf("%d não é múltiplo de %d", a, b);
		}
		
		

	}

}
