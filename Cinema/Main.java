package Ex4;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Cinema ingresso = new Cinema();
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("1 - Adicionar filme");
			System.out.println("2 - Adicionar sala");
			System.out.println("3 - Adicionar cliente");
			System.out.println("4 - Lista de filmes");
			System.out.println("5 - Lista de clientes");
			System.out.println("6 - Lista de salas");
			System.out.println("7 - Escolher filme para sala");
			System.out.println("8 - Comprar ingresso");
			System.out.println("9 - Relatorio");
			System.out.println("10 - Sair");
			int opcao = Integer.parseInt(scanner.nextLine());
			switch(opcao) {
		
			case 1:{
				System.out.println("Digite o nome do filme que deseja adicionar :");
				String filme = scanner.nextLine();
				System.out.println("Digite a classificação do filme: ");
				int id = Integer.parseInt(scanner.nextLine());
				Filme filme1 = new Filme (filme, id);
				if(ingresso.adicionarFilme(filme1, filme)) {
					System.out.println("Filme foi adicionado com sucesso.");
				}else {
					System.out.println("Filme já existe");
				}
				break;
			}
			case 2:{
				System.out.println("Digite quantas linhas tera a sala: ");
				int linha = Integer.parseInt(scanner.nextLine());
				System.out.println("Digite quantas colunas tera a sala: ");
				int coluna = Integer.parseInt(scanner.nextLine());
				ingresso.adicionarSala(coluna, linha);
				break;
			}
			case 3:{
				System.out.println("Digite o nome do cliente: ");
				String nome = scanner.nextLine();
				System.out.println("Digite a data no formato yyyy-MM-dd: ");
				String dataString = scanner.nextLine();
				LocalDate data = LocalDate.parse(dataString);
				Cliente cliente = new Cliente(nome, data);
				if (ingresso.adicionarCliente(cliente)) {
					System.out.println("Cliente foi adicionado com sucesso.");
				}
				break;
			}
			case 4:{
				ingresso.verFilmes();
				break;
			}
			case 5:{
				ingresso.verClientes();
				break;
			}
			case 6:{
				ingresso.verSalas();
				break;
			}
			case 7:{
				System.out.println("Digite o numero da sala: ");
				int nun = Integer.parseInt( scanner.nextLine());	
				if(ingresso.verificaSala(nun)) {
					System.out.println("Digite o nome do filme: ");
					String filme1 = scanner.nextLine();
					if(ingresso.buscarFilmeporNome(filme1) != null) {
						ingresso.cartaz(nun,filme1);
						System.out.println("O filme foi colocado em cartaz com sucesso");
					}else {
						System.out.println("Não existe filme com esse nome");
					}
				}else {
					System.out.println("Sala não existe");
				}
				
				
				break;
			}
			
			case 8:{
				System.out.println("Digite o numero da sala: ");
				int nun = Integer.parseInt(scanner.nextLine());
				if(ingresso.verificaSala(nun)) {
					System.out.println("Digite o nome do cliente: ");
					String nomeCliente = scanner.nextLine();
					if(ingresso.verificaCliente(nomeCliente)) {
						ingresso.verSalaind(nun);
						System.out.println("Digite a linha da poltrona desejada: ");
						int linha = Integer.parseInt(scanner.nextLine());
						System.out.println("Didite a coluna da poltrona desejada: ");
						int coluna = Integer.parseInt(scanner.nextLine());
						ingresso.venda(nun, nomeCliente, coluna, linha);;
					}else {
						System.out.println("O cliente não existe");
					}
				}else {
					System.out.println("A sala não existe");
				}
				
				
				break;
			}
			case 9:{
				ingresso.relatorio();
				break;
			}
			case 10:{
				break;
			}
			
			default:{
				System.out.println("Opção inválida. Tente novamente");
			}

	}
			if(opcao == 10) {
				break;
			}
	
		
}
}
}