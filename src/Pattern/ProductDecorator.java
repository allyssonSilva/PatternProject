package Pattern;

import Main.Product;

public abstract class ProductDecorator extends Product {
	
	Product produto;

	public ProductDecorator(Product xproduto) {
		produto = xproduto;
	}
	
	@Override
    public String getNome() {
        return produto.getNome()  + " Manteiga";
    }
	
	@Override
    public double getPreco() {
        return produto.getPreco()  + 3.9;
    }
 
	
}
