package prova;

abstract class Equipamentos {
	protected String CodigoVerificador;
	protected String NomeEquipamento;
	protected String Marca;
	protected int DataAquisicao;
	protected String EstadoEquipamento;
	
	public Equipamentos(String CodigoVerificador, String NomeEquipamento, int DataAquisicao, String EstadoEquipamento, String Marca) {
		         this.CodigoVerificador = CodigoVerificador;
		         this.NomeEquipamento = NomeEquipamento;
		         this.DataAquisicao = DataAquisicao;
		         this.EstadoEquipamento = EstadoEquipamento;
		         this.Marca = Marca;
		}
	
	public String getCodigoVerificador() {
		return CodigoVerificador;
	}
	public void setCodigoVerificador(String CodigoVerificador) {
		this.CodigoVerificador = CodigoVerificador;
	}
	public String getNomeEquipamento() {
		return NomeEquipamento;
	}
	public int getDataAquisicao() {
		return DataAquisicao;
	}
	public void setDataAquisicao(int DataAquisicao) {
		this.DataAquisicao = DataAquisicao;
	}
	public String EstadoEquipamento() {
		return EstadoEquipamento;
	}
	public void setEstadoEquipamento(String EstadoEquipamento) {
		this.EstadoEquipamento = EstadoEquipamento;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	
	public abstract void exibirdetalhes();
	
}
