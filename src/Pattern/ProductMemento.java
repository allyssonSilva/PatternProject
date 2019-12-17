package Pattern;

public class ProductMemento {
	
	protected String guiaPedido;
	protected String nfe;
	 
    public ProductMemento(String guia, String notafiscal) {
        guiaPedido = guia;
        nfe = notafiscal;
    }
 
    public String getGuiaPedido() {
        return guiaPedido;
    }
    
    public String getNfe() {
        return nfe;
    }

}
