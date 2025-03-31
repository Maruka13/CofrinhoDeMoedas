package main.java.CofrinhoDeMoedas;

public class Euro extends Moeda {

	private double valor = 0;
	
	double valor() {
		return valor;
	}
	
	void adicionarEuro(double moeda) {
		valor = valor() + moeda;
	}

	void removerEuro(double moeda) {
		valor = valor() - moeda;	
	}
	
	void info() {
		System.out.printf("Euros = €%.2f%n", valor);
	}

	//converter os euros em reais
	
	double converter() {
		
		double converterEurosParaReais = valor() * 6.17;  // cotação atual: €1= R$6,17
		
		return converterEurosParaReais;
		
	}

}