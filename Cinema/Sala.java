package Ex4;


public class Sala {
	
	private boolean [][] poltronas;
	private Filme filme;
	
	public Sala (int linha, int coluna) {
		poltronas = new boolean [coluna][ linha];
	}
	
	
	public void criar (int linha, int coluna) {
		poltronas = new boolean [coluna][linha];
	}
	public void setFilme( Filme filme) {
		this.filme = filme;
		
	}
	public Filme getFilme() {
		return filme;
	}

	public void exibirSala() {
		for (int i=0; i < poltronas.length; i++) {
			for(int j = 0; j< poltronas[i].length; j++) {
				System.out.print(poltronas[i][j] ? "X" : "0");
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	public void exibirFilme() {
		if (filme != null) {
			System.out.println("Filme: " + filme.getNomeFilme());
			System.err.println("Classificação: " + filme.getClassificacao());
			}
		else {
			System.out.println("Nenhum filme associado a sala");
		}
	}
	public void setLugar(int linha, int coluna) {
		poltronas [coluna] [linha] = true;
	}

}
