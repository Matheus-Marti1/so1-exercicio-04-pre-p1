package controller;

public class ThreadFatorialSemRecursividade extends Thread {

	private int numero;

	public ThreadFatorialSemRecursividade(int numero) {
		this.numero = numero;
	}

	@Override
	public void run() {
		double tempoInicial = System.nanoTime();
		long fatorial = calcularFatorial(numero);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		System.out.println("O fatorial de " + numero + " é " + fatorial + " e, sem usar recursividade, levou "
				+ tempoTotal + " nanosegundos para executar.");
	}

	private static long calcularFatorial(int n) {
		long fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		return fatorial;
	}

}
