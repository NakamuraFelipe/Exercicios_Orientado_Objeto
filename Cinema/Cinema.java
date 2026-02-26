package Ex4;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Cinema {
	private ArrayList<Filme>filmes;
	private	ArrayList<Sala>salas;
	private ArrayList<Cliente>clientes;
	
	public Cinema() {
		filmes = new ArrayList<Filme>();
		salas = new ArrayList<Sala>();
		clientes = new ArrayList <Cliente>();
	}
	
	
	Scanner scanner = new Scanner(System.in);
	
	public boolean adicionarFilme(Filme filme1, String filme){
		if(!verificaFilme(filme)) {
			filmes.add(filme1);
			return true;
		}
		return false;
	}
	public void adicionarSala(int coluna, int linha) {
		Sala sala1 = new Sala (coluna, linha);
		salas.add(sala1);
	}
	public boolean adicionarCliente (Cliente cliente) {
			clientes.add(cliente);
			return true;
	}	
	public boolean verificaFilme(String filme) {
		for(Filme a : filmes) {
			if(a.getNomeFilme().equals(filme)) {
				return true;
			}
		}
		return false;
	}
	public void verFilmes(){
		for(Filme a : filmes) {
			System.out.println(a.getNomeFilme());
			System.out.println(a.getClassificacao());
		}
	}
	public void verClientes() {
		for(Cliente a : clientes) {
			System.out.println(a.getNomeCliente());
			System.out.println(a.calcIdade());
		}
	}
	public void verSalas() {
		for(int i = 0; i < salas.size(); i++) {
			Sala a = salas.get(i);
			System.out.println("numero da sala: "+ i);
			a.exibirFilme();
			a.exibirSala();
		}
	}
	public void verSalaind (int nun) {
		if (nun>=0 &&  nun < salas.size()) {
			Sala a = salas.get(nun);
			a.exibirSala();
		}else {
			System.out.println("Não existe sala com esse numero ");
			return;
		}
		
	}
	public boolean verificaSala(int nun) {
		if(nun >= 0 && nun < salas.size()) {
			return true;
		}
		return false;
	}
	public boolean verificaCliente(String nomeCliente) {
		Cliente cliente = buscarClientePorNome(nomeCliente);
		if(cliente != null) {
			return true;
		}
		return false;
	}
	public void cartaz(int nun, String filme1) {
		if (verificaSala(nun)) {
			Sala sala = salas.get(nun);
			if(buscarFilmeporNome(filme1) != null) {
				Filme filme = buscarFilmeporNome(filme1);
				sala.setFilme(filme);
			}
		}
		
		
	}
	public Cliente buscarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNomeCliente().equalsIgnoreCase(nome)) { 
                return cliente;
            }
        }
        return null; 
    }
	public Filme buscarFilmeporNome (String filme2) {
		for( Filme filme : filmes) {
			if (filme.getNomeFilme().equalsIgnoreCase(filme2))
				return filme;
		}
		return null;
	}
	public void venda(int nun, String nomeCliente, int coluna, int linha) {
		if (verificaSala(nun)) {
			Sala sala = salas.get(nun);
			Cliente cliente = buscarClientePorNome(nomeCliente);
			if(verificaCliente(nomeCliente)) {
				Filme filme = sala.getFilme();
				int idade = cliente.calcIdade();
				int classfi = filme.getClassificacao();
				if (idade >= classfi) {
					sala.setLugar(coluna, linha);
					filme.setVendas(1);
			}else {
				System.out.println("O cliente" + cliente.getNomeCliente() + "não tem idade suficiente para assistir o filme");
				return;
			}
			}
		}
		
	}
	public void relatorio(){
		for(Filme a : filmes) {
			System.out.println(a.getNomeFilme());
			System.out.println(a.getClassificacao());
			System.out.println("O filme tem " + a.getVendas() + " De vendas ");
		}
	}
	
	
}

