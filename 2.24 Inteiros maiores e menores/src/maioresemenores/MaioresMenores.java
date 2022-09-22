package maioresemenores;

import java.util.Scanner;

public class MaioresMenores {

	public static void main(String[] args) {
		
		int a, b, c, d, e, maior = 0, menor = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira 5 números inteiros");
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		e = input.nextInt();
		
		
		// descobre o maior usando apenas técnicas apresentadas no cap. 2.
		if(a > b) {
			
			if(a > c){
				
				if(a > d) {
					
					if(a > e) {
						
						maior = a;
					}
				}
			}
		}else{
			
			if(b > c) {
				
				if (b > d) {
					
					if(b > e) {
						
						maior = b;
					}
				}
			}else {
				
				if(c > d) {
					
					if(c > e) {
						
						maior = c;
					}
				}else {
					
					if(d > e) {
						
						maior = d;
					}else {
						
						maior = e;
					}
				}
			}
		}
		
		// descobre o menor usando técnicas apresentadas no cap 2.
		
		if(a < b) {
			
			if(a < c){
				
				if(a < d) {
					
					if(a < e) {
						
						menor = a;
					}
				}
			}
		}else{
			
			if(b < c) {
				
				if (b < d) {
					
					if(b < e) {
						
						menor = b;
					}
				}
			}else {
				
				if(c < d) {
					
					if(c < e) {
						
						menor = c;
					}
				}else {
					
					if(d < e) {
						
						menor = d;
					}else {
						
						menor = e;
					}
				}
			}
		}
		
		System.out.printf("Maior inteiro: %d%n", maior);
		System.out.printf("Menor inteiro: %d", menor);
		
	}

}
