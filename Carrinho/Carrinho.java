package compras;
import java.util.ArrayList;


public class Carrinho {
	ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	public void adicionar (Produto p) {
		listaProduto.add(p);
		System.out.println("O produto "+ p.nome + " foi adicionada a lista");
		
	}
	
	public void remover (int i) {
		listaProduto.remove(i);
		
	}
	
	public void vizualizar () {
		for (Produto p : listaProduto) {
			System.out.println(p.nome + "   " + p.preco);
			
		}
		
	}
}

