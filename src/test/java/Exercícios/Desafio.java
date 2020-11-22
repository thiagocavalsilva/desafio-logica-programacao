package Exercícios;

public class Desafio {

	public int exercicio1_Area(int base, int altura) {
		int area = 0;
		area = (base * altura) / 2;
		return area;
	}

	public String exercicio2_MaiorValor(int valor1, int valor2, int valor3) {
		String maiorValor;

		if (valor1 > valor2 && valor1 > valor3) {
			maiorValor = "Valor 1 = " + valor1;
		} else if (valor2 > valor1 && valor2 > valor3) {
			maiorValor = "Valor 2 = " + valor2;
		} else {
			maiorValor = "Valor 3 = " + valor3;
		}

		return maiorValor;
	}

	public int exercicio3_SomaNumeros() {
		int somaValores = 0;
		for (int i = 1; i <= 100; i++) {
			somaValores += i;
		}
		return somaValores;
	}
}
