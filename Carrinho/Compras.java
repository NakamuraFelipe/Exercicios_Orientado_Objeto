package compras;
import java.util.Scanner;
public class Compras {

	public static void main(String[] args) {
		Carrinho carrinho = new Carrinho();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 - Adicionar Produto");
			System.out.println("2 - Vizualizar Produto");
			System.out.println("3 - Remover Produto");
			System.out.println("4 - Sair");
			
			int opcao = Integer.parseInt(scanner.nextLine());
			
			switch (opcao) {
				case 1: {
					System.out.println("Nome do Produto");
					String nomeProduto = scanner.nextLine();
					System.out.println("Preço do Produto");
					float precoProduto = Float.parseFloat(scanner.nextLine());
					
					Produto p = new Produto();
					p.nome = nomeProduto;
					p.preco = precoProduto;
					
					carrinho.adicionar(p);
					break;
				}
				case 2: {
					
					carrinho.vizualizar();
					break;
					
				}
				case 3:{
					System.out.println("Qual produto quer deletar ?");
					int i = Integer.parseInt(scanner.nextLine());
					carrinho.remover(i);
				}
				default:{
					
				}
			}
		}
		
		
		
	}

}
