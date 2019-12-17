package View;

import Pattern.ProductState;

public class Faturamento implements ProductState{

	@Override
	public ProductState realizaPedido() {
		System.out.println("\n\tPedido realizado!");
		System.out.println("Enviando para o setor de separação.");
		return new Faturamento();
	}

	@Override
	public ProductState realizaSeparacao() {
		System.out.println("\n\tSeparação realizada!");
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
