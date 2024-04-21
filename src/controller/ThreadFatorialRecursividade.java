package controller;

public class ThreadFatorialRecursividade extends Thread {

	private int numero;

	public ThreadFatorialRecursividade(int numero) {
		this.numero = numero;
	}

	@Override
	public void run() {
		double tempoInicial = System.nanoTime();
		long fatorial = calcularFatorialRecursiva(numero);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		System.out.println("O fatorial de " + numero + " é " + fatorial + " e, usando recursividade, levou "
				+ tempoTotal + " nanosegundos para executar.");
	}

	private static long calcularFatorialRecursiva(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * calcularFatorialRecursiva(n - 1);
		}
	}

}
