package Biblioteca;
import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Livro>livros;
	private ArrayList<Emprestimo>emprestimos;
	
	public Biblioteca() {
		livros = new ArrayList<Livro>();
		emprestimos = new ArrayList<Emprestimo>();
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	public Livro getLivro(String codigoUnico) {
		for(Livro a :livros) {
			if(a.getCodigoUnico().equalsIgnoreCase(codigoUnico)) {
				return a ;
			}
		}return null;
	}
	public boolean verificarLivro(String codigoUnico) {
		for (Livro a : livros) {
			if (a.getCodigoUnico().equalsIgnoreCase(codigoUnico)) {
				return true;
			}
		}return false;
	}
	public boolean verificarEmprestimo(String codigoUnico) {
		for(Livro a : livros){
			if(a.getCodigoUnico().equalsIgnoreCase(codigoUnico)) {
				return a.emprestimo();
			}
		}return false;
	}
	public boolean adicionarLivro(Livro livro) {
		if (!verificarLivro(livro.getCodigoUnico())) {
			livros.add(livro);
			return true;
		}return false;
	}
	public boolean removerLivro(String codigoUnico) {
		for(Livro a : livros) {
			if(a.getCodigoUnico().equalsIgnoreCase(codigoUnico)) {
				livros.remove(a);
				return true;
			}
		}return false;
	}
	public void exibirInfo() {
		int b = 0;
		for(Livro a : livros) {
			System.out.println("Index: " + b);
			b++;
			a.exbirInfo();
		}
	}
	public void exibirLivros() {
		for(Livro a : livros) {
			a.exibirLivro();
		}
	}
	public boolean adicionarEmprestimo(Registro registro, String codigoUnicoPessoa, String codigoUnico, Emprestimo emprestimo) {
		if(registro.verificarpessoa(codigoUnicoPessoa) && verificarLivro(codigoUnico) && !verificarEmprestimo(codigoUnico) 
				&& registro.verificarArrayList(codigoUnicoPessoa)) {
			for(Livro a : livros) {
				if(a.getCodigoUnico().equalsIgnoreCase(codigoUnico)) {
					emprestimos.add(emprestimo);
					registro.adicionarLivroEmpPessoa(codigoUnicoPessoa, a);
					a.setEmprestimo(true);
				}
			}
			return true;
		}return false;
	}
	public boolean devolucao(String codigoUnico, Registro registro) {
		if(verificarEmprestimo(codigoUnico)) {
			for(Livro a : livros) {
				if(a.getCodigoUnico().equalsIgnoreCase(codigoUnico)) {
					a.setEmprestimo(false);
					for(Emprestimo b : emprestimos) {
						if(b.getLivros().getCodigoUnico().equalsIgnoreCase(codigoUnico)) {
							b.setEmprestimo(false);
							registro.devolucao(codigoUnico, a);
							LocalDate hoje = LocalDate.now();
							if(b.getDevolucao().isBefore(hoje)) {
								b.setAtraso(true);
							}return true;
						}
					}
				}
				
			}
		}return false;
	}
	public void listaEmprestimos() {
	    if (emprestimos.isEmpty()) {
	        System.out.println("Não há empréstimos registrados.");
	    }
	    for (Emprestimo a : emprestimos) {
	        a.vizualizarEmprestimo();
	    }
	}


}
