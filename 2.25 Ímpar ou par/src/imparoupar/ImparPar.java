package imparoupar;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
		int num, resto;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro:");
		num = input.nextInt();
		
		resto = num%2;
		
		if(resto == 0) {
			
			System.out.printf("%d é par", num);
		}else {
			
			System.out.printf("%d é impar", num);
		}
		
	}

}
