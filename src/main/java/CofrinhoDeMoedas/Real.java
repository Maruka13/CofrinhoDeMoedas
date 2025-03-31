package main.java.CofrinhoDeMoedas;

public class Real extends Moeda {

	private double valor = 0;
	
	double valor() {
		return valor;
	}
	
	void adicionarReal(double moeda) {
		valor = valor() + moeda;
	}

	void removerReal(double moeda) {
		valor = valor() - moeda;	
	}
	
	void info() {
		System.out.printf("Reais = R$%.2f%n", valor);
	}

	double converter() {
		
		return valor();
		
	}

}
