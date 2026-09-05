package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos carros deseja cadastrar: ");
		int quantidade = sc.nextInt();
		sc.nextLine();		
		int[] n = new int[quantidade];
		
		Carro[] carros = new Carro[quantidade];
		
		for(int i =0; i < quantidade; i++) {
		System.out.print("Digite o modelo do carro " + (i+1) + ": ");
		String modelo = sc.nextLine();
		System.out.print("Digite a cor do carro " + (i+1) + ": ");
		String cor = sc.nextLine();
		System.out.print("Digite o ano do carro " + (i+1) + ": ");
		int ano = sc.nextInt(); 
		carros[i] = new Carro(modelo, cor, ano);
		System.out.println("------------------------------------");
		sc.nextLine();		}
		for(int i = 0; i< quantidade; i++) {
		System.out.println(carros[i]);
		
		}
		
		sc.close();
	}

}
