package prova;

public class EquipamentoDiagnostico extends Equipamentos{
	private String TipoDiagnostico;
	private String Precisao;
	private String TipoSensor;

	public EquipamentoDiagnostico(String CodigoVerificador, String NomeEquipamento, int DataAquisicao, String EstadoEquipamento, String Marca, String TipoDiagnostico, String Precisao, String TipoSensor) {
		super(CodigoVerificador, NomeEquipamento, DataAquisicao, EstadoEquipamento, Marca);
		this.TipoDiagnostico = TipoDiagnostico;
		this.Precisao = Precisao;
		this.TipoSensor = TipoSensor;
	}
	
	public String getTipoDiagnostico() {
		return TipoDiagnostico;
	}
	public void setTipoDiagnostico(String TipoDiagnostico) {
		this.TipoDiagnostico = TipoDiagnostico;
	}
	public String getPrecisao() {
		return Precisao;
	}
	public void setPrecisao(String Precisao) {
		this.Precisao = Precisao;
	}
	public String getTipoSensor() {
		return TipoSensor;
	}
	public void setTipoSensor(String TipoSensor) {
		this.TipoSensor = TipoSensor;
	}

	@Override
	public void exibirdetalhes() {
		System.out.println("[Equipamento de Diagnóstico] Código" + CodigoVerificador + ", Nome do Equipamento " + NomeEquipamento + ", Data de Aquisição " + DataAquisicao + ", Estado do Equipamento " + EstadoEquipamento + ", Marca " + Marca + ", Tipo de Diagnóstico " + TipoDiagnostico + ", Precisao " + Precisao + ", Tipo do Sensor" + TipoSensor + "");
	}

}
