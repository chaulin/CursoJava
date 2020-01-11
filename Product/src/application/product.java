package application;

public class product {
	
	public String name;
	public double preco;
	public int quantidade;
	
	
public double TotalValueInStock() {
	return preco * quantidade;	
}
	

public void addProducts(int quantity) {
	this.quantidade += quantity;
	
}

public void RemoverProducts(int quantity) {
	this.quantidade -= quantity;
	
}


@Override
public String toString() {
	return  name 
            + ", $ " 
			+ String.format ("%.2f", preco)
			+ ", "
			+ quantidade
			+ "units, Total: $"
			+ String.format ("%.2f", TotalValueInStock());
}

}