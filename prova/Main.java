package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static ArrayList<Equipamentos> equipamentos = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;
			System.out.println("MENU:");
			System.out.println("1 - ADICIONAR");
			System.out.println("2 - EXIBIR EQUIPAMENTOS");
			System.out.println("3 - REMOVER EQUIPAMENTOS");
			System.out.println("4 - SAIR");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1: {
				adicionarEquipamentos();
			}
			case 2: {
				exibirEquipamentos();
			}
			case 3: {
				removerEquipamentos();
			}
			case 4: {
				System.out.println("Encerrando o código.");
				break;
			}
			default: {
				System.out.println("Selecione uma opção válida acima");
			}
			}
			

	}

	private static void adicionarEquipamentos() {
		try {
			System.out.print("Código (EQP001):" );
			String CodigoVerificador = scanner.nextLine();
			for (Equipamentos eq: equipamentos) {
				if (eq.getCodigoVerificador().equals(CodigoVerificador)) {
					throw new Exception("Código Duplicado");
				}
				
				System.out.println("Nome: ");
				String NomeEquipamento = scanner.nextLine();
				System.out.println("Marca: ");
				String Marca = scanner.nextLine();
				System.out.println("Data de aquisição do equipamento (dd/mm/yyyy) : ");
				String data = scanner.nextLine();
				System.out.println("Estado atual do equipamento (novo, manutenção, danificado) : ");
				String EstadoEquipamento = scanner.nextLine();
				
				System.out.println("Tipo de Equipamento:  1 - ferramenta / 2 - maquina pesada /  3 - veículo de apoio / 4 - diagnóstico");
				int tipo = scanner.nextInt();
				scanner.nextLine();	
				
				switch (tipo) {
				case 1: {
					System.out.println("Tipode ferramenta ");
					String TipoFerramenta = scanner.nextLine();
					System.out.println("Material: ");
					String Material = scanner.nextLine();
					equipamentos.add(new FerramenasManuais(CodigoVerificador, NomeEquipamento, Marca, DataAquisicao, EstadoEquipamento, TipoFerramenta, Material));
				}
				case 2: {
					System.out.println("Potência (W): ");
					int Potencia = scanner.nextInt();
					System.out.println("Peso (KG): ");
					double Peso = scanner.nextInt();
					scanner.nextLine();
					equipamentos.add(new MaquinasPesadas(CodigoVerificador, NomeEquipamento, DataAquisicao, Marca, EstadoEquipamento, Potencia, Peso));
				}
				case 3: {
					System.out.println("Tipo de veículo: ");
					String TipoVeiculo = scanner.nextLine();
					System.out.println("Capacidade: ");
					int CapacidadeCarga = scanner.nextInt();
					System.out.println("Placa: ");
					String Placa = scanner.nextLine();
					equipamentos.add(new VeiculosApoio(CodigoVerificador, NomeEquipamento, DataAquisicao, Marca, EstadoEquipamento, CapacidadeCarga, TipoVeiculo, Placa));
				}
				case 4: {
					System.out.println("Tipo de diagnóstico: ");
					String TipoDiagnostico = scanner.nextLine();
					System.out.println("Precisao: ");
					String Precisao = scanner.nextLine();
					System.out.println("Tipo de Sensor: ");
					String TipoSensor = scanner.nextLine();
					equipamentos.add(new EquipamentoDiagnostico(CodigoVerificador, NomeEquipamento, DataAquisicao, Marca, EstadoEquipamento, TipoDiagnostico, Precisao, TipoSensor));
				}
				}
 		   }
		} 
	}

	private static void exibirEquipamentos() {
		
		
	}

	private static void removerEquipamentos() {
	
		
	}

}