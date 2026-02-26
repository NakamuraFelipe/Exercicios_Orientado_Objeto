package Biblioteca;

public class Livro {
	protected String codigoUnico;
	protected String titulo;
	protected String autor;
	
	public Livro(String codigoUnico, String titulo, String autor) {
		this.codigoUnico = codigoUnico;
		this.titulo = titulo;
		this.autor = autor;
	}
	public String getCodigoUnico() {
		return codigoUnico;
	}
	public void setCodigoUnico(String codigoUnico) {
		this.codigoUnico = codigoUnico;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void exbirInfo() {
		System.out.println("/////////////////////////////////////////////////////////////////");
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Codigo: " + getCodigoUnico());
		System.out.println("/////////////////////////////////////////////////////////////////");
		
	}
	public void exibirLivro() {
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Codigo: " + getCodigoUnico());
	}
	public boolean emprestimo() {
		return false;
	}
	public void setEmprestimo(boolean emprestimo) {
		
	}

}
