package Biblioteca;

public class Fisico extends Livro{
	private int numeroPaginas;
	private int numeroEstante;
	private boolean emprestimo;
	public Fisico(String codigoUnico, String titulo, String autor, int numeroPaginas, int numeroEstante) {
		super(codigoUnico, titulo, autor);
		this.numeroPaginas = numeroPaginas;
		this.numeroEstante = numeroEstante;
		this.emprestimo = false;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public int getNumeroEstante() {
		return numeroEstante;
	}
	public void setNumeroEstante(int numeroEstante) {
		this.numeroEstante = numeroEstante;
	}
	
	public boolean isEmprestimo() {
		return emprestimo;
	}
	@Override
	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}
	@Override
	public void exibirLivro() {
		System.out.println("/////////////////////////////////////////////////////////////////");
		super.exibirLivro();
		System.out.println("Número de páginas: " + getNumeroPaginas());
		System.out.println("Número da estantes: " + getNumeroEstante());
		System.out.println("O livro esta disponivel : " + (emprestimo ? "Não Disponivel" : "Diponivel"));
		System.out.println("/////////////////////////////////////////////////////////////////");
	}
	@Override
	public boolean emprestimo() {
		return emprestimo;
	}

}
