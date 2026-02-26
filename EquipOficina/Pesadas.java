package EquipOficina;

public class Pesadas extends Equipamentos {
	private double potencia;
	private double peso;
	
	public Pesadas(String id, String nome, String marca, int dia, int mes, int ano, boolean estado, double potencia, double peso) {
		super(id, nome, marca, dia, mes, ano, estado);
		this.potencia = potencia;
		this.peso = peso;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public void exibirDados() {
		System.out.println("----------Informações do equipamento----------");
		System.out.println("Codigo: " + getId());
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Data da aquisição: " + getAquisicao());
		System.out.println("Estado: " + verificaEstado());
		System.out.println("Potencia: " + potencia +"W");
		System.out.println("Peso: " + peso +" Kg");
		System.out.println("----------Informações do equipamento----------");

		
	}
	
}
