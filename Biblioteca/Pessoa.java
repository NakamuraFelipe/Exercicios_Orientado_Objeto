package Biblioteca;

import java.util.ArrayList;

public class Pessoa {
	protected String codigounico;
	protected String nome;
	protected ArrayList<Livro> livroEmp;

	
	public Pessoa (String codigounico, String nome) {
		this.codigounico = codigounico;
		this.nome = nome;
		livroEmp = new ArrayList<Livro>();
	}
	
	public String getcodigounico() {
		return codigounico;
	}
	public void setcodigounico(String codigounico) {
		this.codigounico = codigounico;
	}
	public String getnome() {
		return nome;
	}
	public void setaluno(String nome) {
		this.nome = nome;
	}
	

	public ArrayList<Livro> getLivroEmp() {
		return livroEmp;
	}

	public void setLivroEmp(ArrayList<Livro> livroEmp) {
		this.livroEmp = livroEmp;
	}


	public void exibirpessoa() {
		System.out.println("Nome da pessoa: " + getnome());
		System.out.println("Código exclusivo da pessoa: " + getcodigounico());
		System.out.println("Livros emprestados: ");
		for(Livro a: livroEmp) {
			a.exibirLivro();
			System.out.println("///////////////////////////////////");
		}
		
	}
	public boolean verificarArray() {
		if (livroEmp.size() < 2) {
			return true;
		}return false;
	}
	public void adicionarLivroEmp(Livro livro) {
		livroEmp.add(livro);
		
	}
	public void removerLivro(String CodigoUnico) {
		for(Livro a: livroEmp) {
			if(a.getCodigoUnico().equalsIgnoreCase(CodigoUnico)) {
				livroEmp.remove(a);
			}
		}
	}

}
