package View;

import Pattern.ProductState;

public class Faturamento implements ProductState{

	@Override
	public ProductState realizaPedido() {
		System.out.println("\n\tPedido realizado!");
		System.out.println("Enviando para o setor de separa��o.");
		return new Faturamento();
	}

	@Override
	public ProductState realizaSeparacao() {
		System.out.println("\n\tSepara��o realizada!");
		System.out.println("Enviando para o setor do faturamento.");
		return new Separacao();
	}

	@Override
	public ProductState realizaFaturamento() {
		System.out.println("\n\tFaturamento realizado!");
		System.out.println("Enviando pedido para o cliente");
		return new Faturamento();
	}

}
