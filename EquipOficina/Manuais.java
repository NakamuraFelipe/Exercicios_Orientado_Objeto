package EquipOficina;

public class Manuais extends Equipamentos {
	private String tipo;
	private String material;
	
	public Manuais(String id, String nome, String marca, int dia, int mes, int ano, boolean estado, String tipo, String material) {
		super(id, nome, marca, dia, mes, ano, estado);
		this.tipo = tipo;
		this.material = material;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	

	@Override
	public void exibirDados() {
		System.out.println("----------Informações do equipamento----------");
		System.out.println("Codigo: " + getId());
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Data da aquisição: " + getAquisicao());
		System.out.println("Estado: " + verificaEstado());
		System.out.println("Tipo : " + tipo);
		System.out.println("Material: " + material);
		System.out.println("----------Informações do equipamento----------");

		
		
	}

}
