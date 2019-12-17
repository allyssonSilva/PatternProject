package Main;

import Controller.Product;
import Controller.Volume;
import View.Documento;

public class Main {
	
	
	public static void main(String[] args) {
		Product produto = new Product();
		Product myVol = new Volume();
		Documento doc = new Documento();
		
		doc.aprovarNota("Nota Gerada");
		
		
		if(myVol.status) {
			System.out.println("Verificando status do produto");
			System.out.println("Produto Ativo = " + myVol.getStatus());
			
			System.out.println("\nAdicionando produto...");
			System.out.println("\n\t== "+myVol.getNome()+" ==");
			System.out.println("\nQuantidade: " + myVol.getQtd());
			System.out.println("Embalagem: " + myVol.getEmbalagem());
			System.out.println("Valor unitário: R$ " + myVol.getPreco());
			System.out.println("Valor pedido: R$ " + myVol.getPreco()*myVol.getQtd());
			
			System.out.println("------------------------------------------------------");
			
			doc.gerarGuia("Guia Gerada");
			produto.pedidoCompleto();
			
			doc.gerarNota();
			
		}else {
			System.out.println("O Produto está inativo, o pedido não pode prosseguir");
			System.out.println("Produto Ativo = " + myVol.getStatus());
		}
		
	}

}
