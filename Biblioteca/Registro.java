package Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Registro {
	private ArrayList<Pessoa>pessoas;
	
	public Registro() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	public ArrayList<Pessoa> getpessoa() {
		return pessoas;
	}
	public Pessoa getPessoa(String CodigoUnico) {
		for(Pessoa a : pessoas) {
			if(a.getcodigounico().equalsIgnoreCase(CodigoUnico)) {
				return a;
			}
		}return null;
	}
	public void setpessoa(ArrayList<Pessoa> pessoa) {
		this.pessoas = pessoa;
	}
	public boolean verificarpessoa(String codigounico) {
		for(Pessoa a : pessoas) {
			if(a.getcodigounico().equalsIgnoreCase(codigounico)) {
				return true;
			}
		}
		return false;
	}
	public boolean adicionarpessoa(Pessoa pessoa) {
		if(!verificarpessoa(pessoa.getcodigounico())) {
			pessoas.add(pessoa);
			return true;
		} return false;
	}
	public boolean removerpessoa(String codigounico) {
		for(Pessoa a : pessoas) {
			if(a.getcodigounico().equalsIgnoreCase(codigounico)) {
				pessoas.remove(a);
				return true;
			} 
		}
		return false;
	}
	public void exibirpessoa() {
		for (Pessoa a: pessoas) {
			a.exibirpessoa();
		}
	}
	
	public boolean verificarArrayList(String codigoUnico) {
		for(Pessoa a : pessoas) {
			if(a.getcodigounico().equalsIgnoreCase(codigoUnico)) {
				return a.verificarArray();
			}
		}return false;
	}
	public boolean adicionarLivroEmpPessoa(String CodigoUnico, Livro livro) {
		for(Pessoa a : pessoas) {
			if (a.getcodigounico().equalsIgnoreCase(CodigoUnico)) {
				a.adicionarLivroEmp(livro);
				return true;
			}
		}return false;
	}
	public void devolucao(String codigoUnico, Livro livro) {
		for(Pessoa a : pessoas) {
			if(a.getcodigounico().equalsIgnoreCase(codigoUnico)) {
				pessoas.remove(a);
			}
		}
	}
}
