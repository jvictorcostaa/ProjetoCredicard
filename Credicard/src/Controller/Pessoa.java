package Controller;
import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private ArrayList<Produto> produtosDaPessoa;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Produto> getProdutosDaPessoa() {
		return produtosDaPessoa;
	}
	public void setProdutosDaPessoa(ArrayList<Produto> produtosDaPessoa) {
		this.produtosDaPessoa = produtosDaPessoa;
	}
	
}
