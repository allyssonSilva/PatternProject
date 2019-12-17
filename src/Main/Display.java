package Main;

import Pattern.ProductDecorator;

public class Display extends ProductDecorator {

	public Display(Product xproduto) {
		super(xproduto);
		nome = "Display";
		preco = 2.5;
	}

}
