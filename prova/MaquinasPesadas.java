package prova;

public class MaquinasPesadas extends Equipamentos{
	private int Potencia;
	private  double Peso;
	
	public MaquinasPesadas(String CodigoVerificador, String NomeEquipamento, int DataAquisicao, String EstadoEquipamento,String Marca, double Peso, int Potencia) {
		super(CodigoVerificador, NomeEquipamento, DataAquisicao, EstadoEquipamento, Marca);
		if (Peso < 0) throw new IllegalArgumentException("Peso não pode ser negativo");
		this.Potencia = Potencia;
		this.Peso = Peso;
	}
	
	public int getPotencia() {
		return Potencia;
	}
	public void setPotencia(int Potencia) {
		this.Potencia = Potencia;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double Peso) {
		this.Peso = Peso;
	}

	@Override
	public void exibirdetalhes() {
		System.out.println("[Maquinas Pesadas] Código: " + CodigoVerificador + ", Nome" + NomeEquipamento + ", Marca: " + Marca + ", Data de Aquisição: " + DataAquisicao + ", Estado do equipamento: " + EstadoEquipamento+ ", Peso: " +Peso+ "Potencia: " + Potencia + "");
		
	}
	

}
