package Ex4;

public class Filme {
	private String nome;
	private int classificacao;
	private int vendas;
	
	public Filme (String nome, int classificacao) {
		this.nome = nome;
		this.classificacao = classificacao;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setClassificacao( int classificacao) {
		this.classificacao = classificacao;
	}
	public String getNomeFilme () {
		return nome;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setVendas(int venda) {
		this.vendas += venda;
	}
	public int getVendas() {
		return vendas;
	}

	
	
}
