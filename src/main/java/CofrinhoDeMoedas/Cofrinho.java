package main.java.CofrinhoDeMoedas;

public class Cofrinho {

	Dolar dolar = new Dolar(); // instancia de dolar
	Euro euro = new Euro();    // instancia de euro
	Real real = new Real();    // instancia de real
	
	// Adicionar moedas 
	
	public void adicionarMoedas(int tipoMoeda, double moeda) {
		if(tipoMoeda == 1) { 
			dolar.adicionarDolar(moeda); // 1 = codigo p adicionar Dolar
			
		} else if (tipoMoeda == 2) { 
			euro.adicionarEuro(moeda);   // 2 = codigo p adicionar Euro
			
		} else if (tipoMoeda == 3) { 
			real.adicionarReal(moeda);   // 3 = codigo p adicionar Real
			
		} else {                         
			System.out.println("Valor inválido. Tente novamente"); // qualquer valor que não seja 1, 2 e 3
		}
	}
	
	// remover moedas do cofrinho
	
	public void removerMoedas(int tipoMoeda, double moeda) {
		if(tipoMoeda == 1) {                     
			dolar.removerDolar(moeda); // 1 = codigo p remover Dólar	
			
		} else if(tipoMoeda == 2) {             	
			euro.removerEuro(moeda);   // 2 = codigo p remover Euro
			
		} else if(tipoMoeda ==3) {              
			real.removerReal(moeda);   // 3 = codigo p remover Real
			
		} else {                       
			System.out.println("Valor inválido. Tente novamente"); // qualquer valor que não seja  1, 2 e 3
		}
	}
	
	// listar moedas no cofrinho
	
	public void listagemMoedas() {
		dolar.info();
		euro.info();
		real.info();
	}
	
	// calcular a soma de todas as moedas, convertidas para real
	
	public void totalConvertido() {
		double totalConvertido = dolar.converter() + euro.converter()
			+ real.converter();
		
		System.out.printf("Total convertido em reais: "
				+ "R$%.2f%n", totalConvertido);
	}
}