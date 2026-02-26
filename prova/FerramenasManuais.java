package prova;

public class FerramenasManuais extends Equipamentos {
	private String Material;
	private String TipoFerramenta;
	
	public FerramenasManuais(String CodigoVerificador, String NomeEquipamento, int DataAquisicao, String EstadoEquipamento, String Marca, String Material, String TipoFerramenta) {
		super(CodigoVerificador, NomeEquipamento, DataAquisicao, EstadoEquipamento, Marca);
		this.Material = Material;
		this.TipoFerramenta = TipoFerramenta;
	}
	
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String Material) {
		this.Material = Material;
	}
	public String getTipoFerramenta() {
		return TipoFerramenta;
	}
	public void getTipoFerramenta(String TipoFerramenta) {
		this.TipoFerramenta = TipoFerramenta;
	}
	
	public void exibirdetalhes() {
		System.out.println("[Ferramenta manual] Código: " + CodigoVerificador + ", Nome" + NomeEquipamento + ", Marca: " + Marca + ", Data de Aquisição: " + DataAquisicao + ", Estado do equipamento: " + EstadoEquipamento+ ", Tipo da Ferramenta: " +TipoFerramenta+ "Material: " + Material + "");
	}
}
