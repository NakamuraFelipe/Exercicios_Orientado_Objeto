package Biblioteca;

public class Professor extends Pessoa {
	private String atuaçao;
	private String departamento;
	private String email;

	public Professor(String codigounico, String nome, String atuacao, String departamento, String email) {
		super(codigounico, nome);
		this.atuaçao = atuacao;
		this.departamento = departamento;
		this.email = email;
	}

	public String getAtuaçao() {
		return atuaçao;
	}

	public void setAtuaçao(String atuaçao) {
		this.atuaçao = atuaçao;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void exibirpessoa() {
		super.exibirpessoa();
		System.out.println("Atuação do professor: " + getAtuaçao());
		System.out.println("Departamento do professor: " + getDepartamento());
		System.out.println("Email do professor: " + getEmail());
	}

}
