package Biblioteca;

public class Aluno extends Pessoa {
	private String idade;
	private String curso;
	private String matricula;
	

	public Aluno(String codigounico, String nome, String idade, String curso, String matricula) {
		super(codigounico, nome);
		this.idade = idade;
		this.curso = curso;
		this.matricula = matricula;
	}
	
	public String getIdade() {
		return idade;
	}


	public void setIdade(String idade) {
		this.idade = idade;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public void exibirpessoa() {
		super.exibirpessoa();
		System.out.println("Idade do aluno: " + getIdade());
		System.out.println("Curso do aluno: " + getCurso());
		System.out.println("Matrícula do aluno: " + getMatricula());
	}

}
