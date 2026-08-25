package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		
		String[] nomes = new String [10];
		String[] emails = new String[10];
		int[] idades = new int[10];
		int contador = 0;
		
		while(continuar) {
			System.out.println("===== SISTEMA DE ALUNOS =====\r\n"
					+ "1 - Cadastrar aluno\r\n"
					+ "2 - Listar alunos\r\n"
					+ "3 - Sair\r\n"
					+ "==============================\r\n"
					+ "Escolha uma opção:");
			
			int opcao = sc.nextInt();
			sc.nextLine();
			
			
				switch(opcao) {
			
				case 1: 
					System.out.print("nome do aluno: ");
					nomes[contador] = sc.nextLine();
					System.out.print("idade: ");
					idades[contador] = sc.nextInt();
					sc.nextLine();
					System.out.print("Email: ");
					emails[contador] = sc.nextLine();
					System.out.println();
					System.out.println("Cadastro concluido");
					System.out.println();
					contador += 1;
					break;
					
				case 2: 
					for(int i = 0; i<contador; i++) {
						System.out.println(" ========= Aluno: " + (i+ 1) + "=========");
						System.out.println("Nome:" + nomes[i]);
						System.out.println("Idade: " + idades[i]);
						System.out.println("Email: " + emails[i]);
						System.out.println("=================================");
						System.out.println();

					}					
					break;
					
				case 3:
					continuar = false;
					break;
					
				}
			}
		
		sc.close();
	}

}
