package entities;

public class Carro {

	private String modelo;
	private String cor;
	private int ano;
	
	
	public Carro() {

	}


	public Carro(String modelo, String cor, int ano) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "Modelo: " + modelo + "\nCor: " + cor + "\nAno: " + ano + "\n";
	}
	
	
}
