package calculadorimc;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		/*
		 * 2.33 (Calculadora de índice de massa corporal) Introduzimos a calculadora de índice de massa corporal (IMC) no Exercício 1.10. As fórmulas para calcular o IMC são
			IMC =
			pesoEmLibras × 703
			alturaEmPolegadas2
			ou
			IMC =
			pesoEmQuilogramas
			alturaEmMetros2
			Crie um aplicativo de calculadora IMC que leia o peso do usuário em libras e a altura em polegadas (ou, se preferir, o peso em quilogramas e a altura em metros) e, então, calcule e exiba o índice de massa corporal dele. Além disso, que exiba as seguintes informações do Department of Health and Human Services/National Institutes of Health, assim o usuário pode avaliar o seu IMC:
			BMI VALUES
			Underweight: less than 18.5
			Normal: between 18.5 and 24.9
			Overweight: between 25 and 29.9
			Obese: 30 or greater
			[Nota: neste capítulo, você aprendeu a utilizar o tipo int para representar números inteiros. Os cálculos de IMC, quando feitos com
			valores int, produzirão resultados com números inteiros. No Capítulo 3, você aprenderá a utilizar o tipo double para representar números
			com pontos decimais. Quando os cálculos de IMC são realizados com doubles, eles produzirão números com pontos decimais — esses são
			chamados de números de “ponto flutuante”.]
		 */
		
		int peso, altura;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculadora de IMC");
		
		System.out.print("Insira o seu peso:");
		peso = input.nextInt();
		
		System.out.print("Insira a sua altura:");
		altura = input.nextInt();
			
		System.out.printf("Seu IMC é: %f%n%n", (double) (peso / ( (double) altura/100 * (double) altura/100)));
		
		System.out.printf("Desnutrido:	menos que 18.5%n"
						+ "Normal:		entre 18.5 e 24.9%n"
						+ "Sobrepeso:	entre 25 e 29.9%n"
						+ "Obeso:		mais de 30%n");
	}

}
