package Ex4;
import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	private String nome;
	private LocalDate data;
	
	public Cliente(String nome, LocalDate data){
		this.nome = nome;
		this.data = data;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeCliente() {
		return nome;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalDate getData() {
		return data;
	}
	public int calcIdade() {
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(data, hoje);
		return periodo.getYears();
	}

}
