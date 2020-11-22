package Exercícios;

public class Start {

	public static void main(String[] args) {
		Desafio chamaExercicios = new Desafio();

		// ========================EXERCICIO 1===============================

		/*
		 * 1. Criar um método para calcular e retornar a área de um triangulo, esse
		 * método deve receber dois valores inteiros referente a base e altura do
		 * triangulo. Dica: Area = Base X Altura / 2
		 */
		System.out.println("Exercício 1 - Área do Triângulo: " + chamaExercicios.exercicio1_Area(2, 2));

		// ========================EXERCICIO 2===============================
		/*
		 * 2. Criar um método que receberá 3 valores inteiros e deverá retornar o maior
		 * deles. Dica: Será necessário utilizar If com duas condições combinadas.
		 */

		System.out
				.println("Exercício 2 - Maior Valor Entre 3 Valores: " + chamaExercicios.exercicio2_MaiorValor(111, 7, 555));

		// ========================EXERCICIO 3===============================
		/*
		 * 3. Criar um método que deverá retornar a soma dos números inteiros positivos
		 * do intervalo de um a cem.
		 * 
		 * Dica:
		 * 
		 * Estrutura do For:
		 * 
		 * for(contador; condição; incremento){
		 * 
		 * }
		 */
		System.out.println("Exercício 3 - Soma de 1 a 100: " + chamaExercicios.exercicio3_SomaNumeros());

	}

}
