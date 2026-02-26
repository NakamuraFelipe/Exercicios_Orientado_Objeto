package Biblioteca;
import java.time.LocalDate;

public class Emprestimo {
	private Livro livros;
	private Pessoa pessoas;
	private LocalDate data;
	private LocalDate devolucao;
	private boolean emprestimo;
	private boolean atraso;
	
	public Emprestimo(Livro livros, Pessoa pessoas, LocalDate data, LocalDate devolucao){
		this.livros = livros;
		this.pessoas = pessoas;
		this.data = data;
		this.devolucao = devolucao;
		this.emprestimo = true;
		this.atraso = false;
	}
	public Livro getLivros() {
		return livros;
	}
	public void setLivros(Livro livros) {
		this.livros = livros;
	}
	public Pessoa getPessoas() {
		return pessoas;
	}
	public void setPessoas(Pessoa pessoas) {
		this.pessoas = pessoas;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalDate getDevolucao() {
		return devolucao;
	}
	public void setDevolucao(LocalDate devolucao) {
		this.devolucao = devolucao;
	}
	public boolean isEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}
	public boolean isAtraso() {
		return atraso;
	}
	public void setAtraso(boolean atraso) {
		this.atraso = atraso;
	}
	public void vizualizarEmprestimo() {
		System.out.println("---------Informaçoes do Livro---------");
		System.out.println("/////////////////////////////////////////////////////////////////");
		System.out.println("Titulo: " + getLivros().getTitulo());
		System.out.println("Autor: " + getLivros().getAutor());
		System.out.println("Codigo Unico : " + getLivros().getCodigoUnico());
		System.out.println("Data do emprestimo: " + getData());
		System.out.println("Data de devoção: " + getDevolucao());
		System.out.println("Situação do livro: " + (emprestimo ? "Não Disponivel" : "Disponivel"));
		System.out.println("O livro teve atraso: " + (atraso ? "Sim" : "Não"));
		System.out.println("/////////////////////////////////////////////////////////////////");
	}
	
	
}
