package Controller;

import Pattern.ProductState;
import View.Pedido;

public  class Product {
	
	public static Product instancia;
	
	protected ProductState estados;

	protected int codigo;
	protected String nome;
	protected String embalagem;
	public boolean status;
	protected double preco;
	protected int qtd;
	
	protected Product() {
		estados = new Pedido();
	}
	
	//SINGLETON - PONTO DE ACESSO
	public static Product getInstance() {
		if(instancia == null) {
			instancia = new Product();
		}
		return instancia;
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
