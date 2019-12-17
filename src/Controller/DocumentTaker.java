package Controller;

import java.util.ArrayList;

import Pattern.ProductMemento;

public class DocumentTaker {
	protected ArrayList<ProductMemento> geracao;
	
	public DocumentTaker() {
		geracao = new ArrayList<ProductMemento>();
	}
	
	public void geracaoDocumento(ProductMemento memento) {
		geracao.add(memento);
	}
	
	public ProductMemento getUltimoEstadoSalvo() {
		if(geracao.size() <= 0 ) {
			return new ProductMemento("", "");
		}
		ProductMemento estadoSalvo = geracao.get(geracao.size() - 1);
		geracao.remove(geracao.size() - 1);
		return estadoSalvo;
	}

}
