package EquipOficina;

public class Diagnostico extends Equipamentos {
	private String tipoDiagnostico;
	private boolean precisao;
	private String sensor;

	public Diagnostico(String id, String nome, String marca, int dia, int mes, int ano, boolean estado, String tipoDiagnostico, boolean precisao, String sensor) {
		super(id, nome, marca, dia, mes, ano, estado);
		this.tipoDiagnostico = tipoDiagnostico;
		this.precisao = precisao;
		this.sensor = sensor;
	}

	public String getTipoDiagnostico() {
		return tipoDiagnostico;
	}

	public void setTipoDiagnostico(String tipoDiagnostico) {
		this.tipoDiagnostico = tipoDiagnostico;
	}

	public boolean isPrecisao() {
		return precisao;
	}

	public void setPrecisao(boolean precisao) {
		this.precisao = precisao;
	}

	public String getSensor() {
		return sensor;
	}

	public void setSensor(String sensor) {
		this.sensor = sensor;
	}

	@Override
	public void exibirDados() {
		System.out.println("----------Informações do equipamento----------");
		System.out.println("Codigo: " + getId());
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Data da aquisição: " + getAquisicao());
		System.out.println("Estado: " + verificaEstado());
		System.out.println("Tipo de diagnostico:" + tipoDiagnostico);
		System.out.println("Precisão: " + precisao +"% de erro");
		System.out.println("Tipo de sensor: " + sensor);
		System.out.println("----------Informações do equipamento----------");

		
	}

}
