package EquipOficina;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws DataException, PesoException {
		Scanner scanner = new Scanner(System.in);
		ListaEquipamentos lista = new ListaEquipamentos();
		
		while(true) {
			System.out.println("---------- Escolha uma opção ----------");
			System.out.println("1 - Adicionar um Equipamento.");
			System.out.println("2 - Exibir Equipamentos.");
			System.out.println("3 - Remover Equipamento");
			System.out.println("---------- Escolha uma opção ----------");
			System.out.println();
			
			int opcao = Integer.parseInt(scanner.nextLine());
			
			switch(opcao) {
			case 1:{
					System.out.println("Voce Deseja Adicionar qual tipo de equipamento");
					System.out.println("------------- Escolha uma opção -------------");
					System.out.println("1 - Equipamento Manual");
					System.out.println("2 - Equipamento Pesado");
					System.out.println("3 - Equipamento de Apoio");
					System.out.println("4 - Equipamento de Diagnóstico");
					System.out.println("------------- Escolha uma opção -------------");
					
					int opcao2 = Integer.parseInt(scanner.nextLine());
					switch (opcao2) {
					case 1:{
						System.out.println("Digito o codigo unico: ");
						String id = scanner.nextLine();
						System.out.println("Digito a nome: ");
						String nome = scanner.nextLine();
						System.out.println("Digito a marca: ");
						String marca = scanner.nextLine();
						System.out.println("Digite o dia que foi adiquirido: ");
						int dia = Integer.parseInt(scanner.nextLine());
						
						System.out.println("Digito o mes que foi adiquirido: ");
						int mes = Integer.parseInt(scanner.nextLine());
						System.out.println("Digito o ano que foi adiquirido de 1900 a 2026: ");
						
						int ano = Integer.parseInt(scanner.nextLine());
						System.out.println("Digite o estado Novo ou Danificado: ");
						String estado1 = scanner.nextLine();
						int peso = 1;
						boolean estado = true;
						if (estado1.equalsIgnoreCase("Novo")) {
							estado = true;
						}else if ( estado1.equalsIgnoreCase("Velho")) {
							estado = false; 
						}else {
							System.out.println("Estado do equipamento não é valido");
							break;
						}
							
						System.out.println("Digite o tipo de ferramenta: ");
						String tipo = scanner.nextLine();
						System.out.println("Digito o material: ");
						String material = scanner.nextLine();
						try {
							Manuais manual = new Manuais(id, nome, marca, dia, mes, ano, estado, tipo, material);
							lista.adicionar(manual, dia, mes, ano,peso);
						} catch (duplicadoException e) {
							e.printStackTrace();
						}catch (DataException e) {
							e.printStackTrace();
						}catch (PesoException e) {
							e.printStackTrace();
						}
						break;
					}
					case 2:{
						System.out.println("Digito o codigo unico: ");
						String id = scanner.nextLine();
						System.out.println("Digito a nome: ");
						String nome = scanner.nextLine();
						System.out.println("Digito a marca: ");
						String marca = scanner.nextLine();
						System.out.println("Digite o dia que foi adiquirido: ");
						int dia = Integer.parseInt(scanner.nextLine());
						
						System.out.println("Digito o mes que foi adiquirido: ");
						int mes = Integer.parseInt(scanner.nextLine());
						System.out.println("Digito o ano que foi adiquirido de 1900 a 2026: ");
						
						int ano = Integer.parseInt(scanner.nextLine());
						System.out.println("Digite o estado Novo ou Danificado: ");
						String estado1 = scanner.nextLine();
						boolean estado = true;
						if (estado1.equalsIgnoreCase("Novo")) {
							estado = true;
						}else if ( estado1.equalsIgnoreCase("Velho")) {
							estado = false; 
						}else {
							System.out.println("Estado do equipamento não é valido");
							break;
						}
							
						System.out.println("Digite a Potencia : ");
						double potencia = scanner.nextDouble();
						System.out.println("Digito o Peso: ");
						double peso = scanner.nextDouble();
						try {
							Pesadas pesado = new Pesadas(id, nome, marca, dia, mes, ano, estado, potencia, peso);
							lista.adicionar(pesado, dia, mes, ano,peso);
						} catch (duplicadoException e) {
							e.printStackTrace();
						}catch (DataException e) {
							e.printStackTrace();
						}catch (PesoException e) {
							e.printStackTrace();
						}
						break;
					}case 3:{
						System.out.println("Digito o codigo unico: ");
						String id = scanner.nextLine();
						System.out.println("Digito a nome: ");
						String nome = scanner.nextLine();
						System.out.println("Digito a marca: ");
						String marca = scanner.nextLine();
						System.out.println("Digite o dia que foi adiquirido: ");
						int dia = Integer.parseInt(scanner.nextLine());
						
						System.out.println("Digito o mes que foi adiquirido: ");
						int mes = Integer.parseInt(scanner.nextLine());
						System.out.println("Digito o ano que foi adiquirido de 1900 a 2026: ");
						
						int ano = Integer.parseInt(scanner.nextLine());
						System.out.println("Digite o estado Novo ou Danificado: ");
						String estado1 = scanner.nextLine();
						int peso = 1;
						boolean estado = true;
						if (estado1.equalsIgnoreCase("Novo")) {
							estado = true;
						}else if ( estado1.equalsIgnoreCase("Velho")) {
							estado = false; 
						}else {
							System.out.println("Estado do equipamento não é valido");
							break;
						}
						System.out.println("Digite o tipo de veiculo: ");
						String tipoVeiculo = scanner.nextLine();							
						System.out.println("Digite o tamanho da carga: ");
						Double carga = scanner.nextDouble();
						System.out.println("Digite a placa: ");
						String material = scanner.nextLine();
						try {
							Apoio manual = new Apoio(id, nome, marca, dia, mes, ano, estado, tipoVeiculo, carga, material);
							lista.adicionar(manual, dia, mes, ano,peso);
						} catch (duplicadoException e) {
							e.printStackTrace();
						}catch (DataException e) {
							e.printStackTrace();
						}catch (PesoException e) {
							e.printStackTrace();
						}
						break;
					}case 4:{
						System.out.println("Digito o codigo unico: ");
						String id = scanner.nextLine();
						System.out.println("Digito a nome: ");
						String nome = scanner.nextLine();
						System.out.println("Digito a marca: ");
						String marca = scanner.nextLine();
						System.out.println("Digite o dia que foi adiquirido: ");
						int dia = Integer.parseInt(scanner.nextLine());
						
						System.out.println("Digito o mes que foi adiquirido: ");
						int mes = Integer.parseInt(scanner.nextLine());
						System.out.println("Digito o ano que foi adiquirido de 1900 a 2026: ");
						
						int ano = Integer.parseInt(scanner.nextLine());
						System.out.println("Digite o estado Novo ou Danificado: ");
						String estado1 = scanner.nextLine();
						int peso = 1;
						boolean estado = true;
						if (estado1.equalsIgnoreCase("Novo")) {
							estado = true;
						}else if ( estado1.equalsIgnoreCase("Velho")) {
							estado = false; 
						}else {
							System.out.println("Estado do equipamento não é valido");
						}
							
						System.out.println("Digite o tipo de Sensor: ");
						String sensor = scanner.nextLine();
						System.out.println("A precisão e Verdadeira ou Falsa: ");
						String precisao2 = scanner.nextLine();
						boolean precisao = true;
						if (precisao2.equalsIgnoreCase("Verdadeira")) {
							precisao = true;
						}else if ( precisao2.equalsIgnoreCase("Falsa")) {
							precisao = false; 
						}else {
							System.out.println("Estado do equipamento não é valido");
							break;
						}
						System.out.println("Digite o tipo de diagnostico: ");
						String diagnostico = scanner.nextLine();
						try {
							Diagnostico manual = new Diagnostico(id, nome, marca, dia, mes, ano, estado, diagnostico, precisao, sensor);
							lista.adicionar(manual, dia, mes, ano,peso);
						} catch (duplicadoException e) {
							e.printStackTrace();
						}catch (DataException e) {
							e.printStackTrace();
						}catch (PesoException e) {
							e.printStackTrace();
						}
						break;
					}
					}break;
				}case 2:{
					lista.exibirTodos();
					break;
				}case 3:{
					try {
						System.out.println("Digite o codigo do Equipamento de deseja remover");
						String codigo = scanner.nextLine();
						lista.remover(codigo);
					} catch (EncontroException e) {
						e.printStackTrace();
						break;
					}
				}
			}
		}

	}

}
