package view;

import java.util.Scanner;

import controller.ThreadFatorialRecursividade;
import controller.ThreadFatorialSemRecursividade;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Insira um número inteiro para calcular seu fatorial e comparar o tempo de execução entre usar e não usar recursividade:");
		int numero = scanner.nextInt();
		Thread fatRecursiva = new ThreadFatorialRecursividade(numero);
		Thread fatNaoRecursiva = new ThreadFatorialSemRecursividade(numero);
		fatRecursiva.start();
		fatNaoRecursiva.start();
		scanner.close();
	}
}
