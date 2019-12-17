package View;

import Controller.DocumentTaker;
import Pattern.ProductMemento;

public class Documento {
	String docNF;
	String docG;
	DocumentTaker docTaker;
	
	public Documento() {
		docNF = new String();
		docG = new String();
		docTaker = new DocumentTaker();
	}
	
	public void aprovarNota(String notaFiscal) {
		docTaker.geracaoDocumento(new ProductMemento(docG, docNF));
		docNF += notaFiscal;
	}
	
	public void cancelarNota() {
		docNF = docTaker.getUltimoEstadoSalvo().getNfe();
		docG = docTaker.getUltimoEstadoSalvo().getGuiaPedido();
	}
	
	public void gerarGuia(String guia) {
		docTaker.geracaoDocumento(new ProductMemento(docG, docNF));
		docG += guia;
		System.out.println(docG);
	}
	

	
	public void gerarNota() {
		System.out.println("\n"+ docNF);
	}

}
