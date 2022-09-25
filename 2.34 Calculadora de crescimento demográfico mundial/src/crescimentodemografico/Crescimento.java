package crescimentodemografico;

public class Crescimento {

	public static void main(String[] args) {
		
		/*
		 * 2.34 (Calculadora de crescimento demográfico mundial) Utilize a internet para descobrir a população mundial atual e a taxa de crescimento demográfico mundial anual. Escreva um aplicativo que introduza esses valores e, então, que exiba a população mundial estimada
			depois de um, dois, três, quatro e cinco anos.
		 */
		
		long populacaoMundial = 7976668910L;
		double taxa = 1.1;
		
		System.out.println("Crescimento demográfico");
		System.out.println("Ano		População");
		System.out.printf("2022		%d%n", populacaoMundial);
		
		populacaoMundial = (long) (populacaoMundial * taxa / 100) + populacaoMundial;
		System.out.printf("2023		%d%n", populacaoMundial);
		
		populacaoMundial = (long) (populacaoMundial * taxa / 100) + populacaoMundial;
		System.out.printf("2024		%d%n", populacaoMundial);
		
		populacaoMundial = (long) (populacaoMundial * taxa / 100) + populacaoMundial;
		System.out.printf("2025		%d%n", populacaoMundial);
		
		populacaoMundial = (long) (populacaoMundial * taxa / 100) + populacaoMundial;
		System.out.printf("2026		%d%n", populacaoMundial);
		
		populacaoMundial = (long) (populacaoMundial * taxa / 100) + populacaoMundial;
		System.out.printf("2027		%d%n", populacaoMundial);
		
	}

}
