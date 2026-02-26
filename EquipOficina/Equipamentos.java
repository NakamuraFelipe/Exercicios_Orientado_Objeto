package EquipOficina;

public abstract class Equipamentos {
	private String id;
	private String nome;
	private String marca;
	private String aquisicao;
	private boolean estado;
	
	public Equipamentos(String id, String nome, String marca, int dia, int mes, int ano, boolean estado) {
		this.id= id;
		this.nome = nome;
		this.marca = marca;
		this.aquisicao = dia+"/"+mes+"/"+ano;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAquisicao() {
		return aquisicao;
	}

	public void setAquisicao(String aquisicao) {
		this.aquisicao = aquisicao;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String verificaEstado() {
		if (estado) {
			return "Novo";
		}else {
			return "Velho";
		}
	}
	public abstract void exibirDados();
}
