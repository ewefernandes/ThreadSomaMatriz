package view;
import java.util.Random;

import controller.ThreadMatriz;

public class Main {

	public static void main(String[] args) {
		int matriz[][] = new int [3][5];
		Random aleatorio = new Random();
		int vetor[] = new int [5];
		
		for (int x = 0; x < 3; x ++) {
			for (int y = 0; y < 5; y ++) {
				matriz [x][y] = aleatorio.nextInt(10);
			}
		}
		
		for (int x=0; x< 3; x ++) {
			for (int i = 0; i < 5; i ++) {
				vetor[i] = matriz[x][i];
			}
			Thread tMatriz = new ThreadMatriz(x, vetor);
			tMatriz.start();
		}

	}

}
