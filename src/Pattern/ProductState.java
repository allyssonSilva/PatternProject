package Pattern;

public interface ProductState {

	ProductState realizaPedido();
	
	ProductState realizaSeparacao();
	
	ProductState realizaFaturamento();
}
