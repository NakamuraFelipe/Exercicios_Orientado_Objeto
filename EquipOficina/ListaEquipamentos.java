package EquipOficina;

import java.util.ArrayList;

public class ListaEquipamentos {
	private ArrayList<Equipamentos> equips;
	
	public ListaEquipamentos() {
		this.equips = new ArrayList<Equipamentos>();
	}

	public ArrayList<Equipamentos> getEquips() {
		return equips;
	}

	public void setEquips(ArrayList<Equipamentos> equips) {
		this.equips = equips;
	}
	public boolean verificarIgualdadeCodigo(String codigo) {
		for(Equipamentos a : equips) {
			if(a.getId().equals(codigo)) {
				return true;
			}
		}return false;
	}
	public Equipamentos acharEquip(String codigo) {
		for(Equipamentos a : equips) {
			if(a.getId().equals(codigo)) {
				return a;
			}
		}
		return null;
	}
	public void adicionar(Equipamentos equip, int dia , int mes, int ano, double peso) throws duplicadoException, DataException, PesoException {
		if(verificarIgualdadeCodigo(equip.getId())) {
			throw new duplicadoException("O Codigo já existe na lista");
		}if(dia > 31 || dia < 1 || mes >12 || mes < 0 || ano >2026 || ano < 1900) {
			throw new DataException("Você escreveu alguma data errada");
		}if (peso <=0) {
			throw new PesoException("Você escreveu o peso nulo ou negativo");
		}
		equips.add(equip);
	}
	public void exibirTodos() {
		for(Equipamentos e : equips) {
			e.exibirDados();
		}
	}
	public void remover(String codigo) throws EncontroException {
		if(verificarIgualdadeCodigo(codigo)) {
			equips.remove(acharEquip(codigo));
		}else {
			throw new EncontroException("O equipamento com codigo " + codigo + " Não foi encontrado");
		}
	}
}
