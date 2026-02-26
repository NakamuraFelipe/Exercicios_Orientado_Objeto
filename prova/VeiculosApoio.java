package prova;

public class VeiculosApoio extends Equipamentos {
	private String TipoVeiculo;
	private int CapacidadeCarga;
	private String Placa;

	public VeiculosApoio(String CodigoVerificador, String NomeEquipamento, int DataAquisicao, String EstadoEquipamento, String TipoVeiculo, int CapacidadeCarga, String Placa, String Marca) {
		super(CodigoVerificador, NomeEquipamento, DataAquisicao, EstadoEquipamento, Marca);
		this.TipoVeiculo = TipoVeiculo;
		this.CapacidadeCarga = CapacidadeCarga;
		this.Placa = Placa;
		
	}
	
	public String getTipoVeiculo() {
		return TipoVeiculo;
	}
	public void setTipoVeiculo(String TipoVeiculo) {
		this.TipoVeiculo = TipoVeiculo;
	}
	public int getCapacidadeCarga() {
		return CapacidadeCarga;
	}
	public void setCapacidadeCarga(int CapacidadeCarga) {
		this.CapacidadeCarga = CapacidadeCarga;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String Placa) {
		this.Placa = Placa;
	}

	@Override
	public void exibirdetalhes() {
		System.out.println("[Veículo de Apoio] Código " + CodigoVerificador + ", Nome " + NomeEquipamento + ", Marca " + Marca + ", Data de Aquisição " + DataAquisicao + ", Estado do Equipamento  " + EstadoEquipamento + ", Tipo de veículo " + TipoVeiculo + ", Capacidade total" + CapacidadeCarga + "Placa do veículo " + Placa + "");
	}

}
