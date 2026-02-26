package EquipOficina;

public class Apoio extends Equipamentos{
	
	private String tipoVeiculo;
	private double carga;
	private String placa;
	
	public Apoio(String id, String nome, String marca, int dia, int mes, int ano, boolean estado, String tipoVeiculo, double carga, String placa) {
		super(id, nome, marca, dia, mes, ano, estado);
		this.tipoVeiculo = tipoVeiculo;
		this.carga = carga;
		this.placa = placa;
	}
	
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public void exibirDados() {
		System.out.println("----------Informações do equipamento----------");
		System.out.println("Codigo: " + getId());
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Data da aquisição: " + getAquisicao());
		System.out.println("Estado: " + verificaEstado());
		System.out.println("Veiculo: " + tipoVeiculo);
		System.out.println("Capacidade: " + carga +" Kg");
		System.out.println("Placa: " + placa);
		System.out.println("----------Informações do equipamento----------");

		
	}
	

}
