package Exerc�cios;

public class Start {

	public static void main(String[] args) {
		Desafio chamaExercicios = new Desafio();

		// ========================EXERCICIO 1===============================

		/*
		 * 1. Criar um m�todo para calcular e retornar a �rea de um triangulo, esse
		 * m�todo deve receber dois valores inteiros referente a base e altura do
		 * triangulo. Dica: Area = Base X Altura / 2
		 */
		System.out.println("Exerc�cio 1 - �rea do Tri�ngulo: " + chamaExercicios.exercicio1_Area(2, 2));

		// ========================EXERCICIO 2===============================
		/*
		 * 2. Criar um m�todo que receber� 3 valores inteiros e dever� retornar o maior
		 * deles. Dica: Ser� necess�rio utilizar If com duas condi��es combinadas.
		 */

		System.out
				.println("Exerc�cio 2 - Maior Valor Entre 3 Valores: " + chamaExercicios.exercicio2_MaiorValor(111, 7, 555));

		// ========================EXERCICIO 3===============================
		/*
		 * 3. Criar um m�todo que dever� retornar a soma dos n�meros inteiros positivos
		 * do intervalo de um a cem.
		 * 
		 * Dica:
		 * 
		 * Estrutura do For:
		 * 
		 * for(contador; condi��o; incremento){
		 * 
		 * }
		 */
		System.out.println("Exerc�cio 3 - Soma de 1 a 100: " + chamaExercicios.exercicio3_SomaNumeros());

	}

}
