package Biblioteca;

public class Ebook extends Livro {
	private int numeroPaginas;
	private String link;

	public Ebook(String codigoUnico, String titulo, String autor, int numeroPagina, String link) {
		super(codigoUnico, titulo, autor);
		this.numeroPaginas = numeroPagina;
		this.link = link;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	@Override
	public void exibirLivro() {
		System.out.println("/////////////////////////////////////////////////////////////////");
		super.exibirLivro();
		System.out.println("Número de Paginas: " + getNumeroPaginas());
		System.out.println("Link: " + getLink());
		System.out.println("/////////////////////////////////////////////////////////////////");
	}

}
