package produtodetresinteiros;

import java.util.Scanner;

public class ProdutoDeTresInteiros {

	public static void main(String[] args) {
		
		int x, y, z, resultado;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Esse programa recebe três números inteiros, e calcula o produto entre eles.");
		
		System.out.print("Insira o primeiro número inteiro");
		x = input.nextInt();
		System.out.print("Insira o segundo número inteiro");
		y = input.nextInt();
		System.out.print("Insira o terceiro número inteiro");
		z = input.nextInt();
		
		resultado = x * y * z;
		
		System.out.printf("O resultado é: %d", resultado);

	}

}
