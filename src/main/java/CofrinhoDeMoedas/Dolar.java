package main.java.CofrinhoDeMoedas;

public class Dolar extends Moeda {

	private double valor = 0;
	
	double valor() {
		return valor;
	}
	
	void adicionarDolar(double moeda) {
		valor = valor() + moeda;
	}
	
	void removerDolar(double moeda) {
		valor = valor() - moeda;	
	}
	
	void info() {
		System.out.printf("Dolares = $%.2f%n", valor);
	}

	//converter dolar em reais
	
	double converter() {
		double converterDolaresParaReais = valor() * 5.76; // cotação atual = $1 => R$5,76
		return converterDolaresParaReais;
	}
}