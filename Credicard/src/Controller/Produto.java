package Controller;

public class Produto {
	private String name;
	private double preco;
	private int parcelaMes,parcelaTodo;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getParcelaMes() {
		return parcelaMes;
	}
	public void setParcelaMes(int parcelaMes) {
		this.parcelaMes = parcelaMes;
	}
	public int getParcelaTodo() {
		return parcelaTodo;
	}
	public void setParcelaTodo(int parcelaTodo) {
		this.parcelaTodo = parcelaTodo;
	}
	
}
