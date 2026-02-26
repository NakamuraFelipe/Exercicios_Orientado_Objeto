package Biblioteca;

public class Audio extends Livro{
	private double duracao;
	private String narrador;

	public Audio(String codigoUnico, String titulo, String autor, double duracao, String narrador) {
		super(codigoUnico, titulo, autor);
		this.duracao = duracao;
		this.narrador = narrador;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public String getNarrador() {
		return narrador;
	}

	public void setNarrador(String narrador) {
		this.narrador = narrador;
	}
	@Override
	public void exibirLivro() {
		System.out.println("/////////////////////////////////////////////////////////////////");
		super.exibirLivro();
		System.out.println("Duração: " + getDuracao());
		System.out.println("Narrador: " + getNarrador());
		System.out.println("/////////////////////////////////////////////////////////////////");
	}
}
