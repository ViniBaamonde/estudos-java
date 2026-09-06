package application;

import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos quartos você deseja alugar: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		Aluguel [] reserva = new Aluguel[10];
		
		
		for(int i = 0; i< quantidade; i++) {
			
			System.out.println("Reserva #" + (i+1) + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int numQuarto = sc.nextInt();
			
			reserva [numQuarto] = new Aluguel(nome,email);
			System.out.println();
			sc.nextLine();
		}
		
		
		System.out.println("|------ Quartos reservados ------");
		System.out.println("|                                ");
		for(int i = 0; i < reserva.length; i++) {
			if(reserva[i] != null) {          
				System.out.println("|      " + i + " :" + reserva[i] + "             ");
				System.out.println("|---------------------------------");
			}
		}
		
		
		
		sc.close();
	}

}
