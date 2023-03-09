package controller;

public class ThreadMatriz extends Thread {
	
	int x;
	int vetor[] = new int[5];
	
	public ThreadMatriz(int x, int vetor[]) {
		this.x = x;
		this.vetor = vetor;
	}

	public void run() {
		int soma = 0;
		for (int i = 0; i <5; i ++) {
			soma = soma + vetor[i];
		}
		System.out.println("Soma da linha " +x+ " = " +soma);
	}
		
}
