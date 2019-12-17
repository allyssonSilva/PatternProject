package Main;

import Pattern.ProductState;
import View.Pedido;

public  class Product {
	
	protected ProductState estados;

	protected int codigo;
	protected String nome;
	protected String embalagem;
	protected boolean status;
	protected double preco;
	protected int qtd;
	
	public Product() {
		estados = new Pedido();
	}
		

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getEmbalagem() {
		return embalagem;
	}


	public boolean getStatus() {
		return status;
	}
		
	
	public double getPreco() {
		return preco;
	}

	
	
	public int getQtd() {
		return qtd;
	}


	public void fazerPedido() {
        estados = estados.realizaPedido();
    }
	public void fazerSeparacao() {
        estados = estados.realizaSeparacao();
    }
	public void fazerFaturamento() {
        estados = estados.realizaFaturamento();
    }
	
	public void pedidoCompleto() {
		fazerPedido();
		fazerSeparacao();
		fazerFaturamento();
	}
}







/*
 * @author jobia.damone
 * 
 * */
