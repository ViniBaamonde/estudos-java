package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de funcionarios: ");
		int quantidade = sc.nextInt();
		
		for(int i = 0; i<quantidade; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(temId (list, id)) {
				System.out.println("Id já cadastrado, tente novamente: ");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Funcionario func = new Funcionario(id, nome, salario);
			
			list.add(func);
			
		}
		
		System.out.println();
		System.out.print("Digite o id do funcionario que tera o salario aumentado: ");
		int idSalario = sc.nextInt();
		
		Integer pos = posicao(list, idSalario);
		if(pos == null) {
			System.out.println("Id digitado não existe");
		}
		else {
			System.out.print("Digite a porcentagem: ");
			double porcento = sc.nextDouble();
			list.get(pos).incrementoSalario(porcento);
		}
		
		System.out.println("Lista de funcionarios: ");
		for(Funcionario func : list) {
			System.out.println(func);
		}
		
		sc.close();
	
	}
	
	public static Integer posicao(List<Funcionario> list, int id) {
		for(int i = 0; i < list.size(); i++ ) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean temId(List<Funcionario>list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return true;
			}
		}
		return false;
	}
}
