package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de colunas: ");
		int colunas = sc.nextInt();
		
		System.out.print("Digite o numero de linhas: ");
		int linhas = sc.nextInt();
		
		int[][] mat = new int[linhas][colunas];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i] [j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um numero que pertence a matriz: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == n) {
					System.out.println();
					System.out.println("Posição: "  +  i + "," + j);
					
				if(j > 0) {
					System.out.println("Esquerda: " + mat[i][j - 1]);
				}
				if(j + 1 < mat.length) {
					System.out.println("Direita: " + mat[i][j + 1]);
				}
				if(i > 0) {
					System.out.println("Cima: " + mat[i - 1][j]);
				}
				if(i + 1 < mat[i].length) {
					System.out.println("Baixo: " + mat[i + 1][j]);
				}
			}
			}
		}
		
		
	sc.close();	
	}

}
