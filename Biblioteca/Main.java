package Biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Registro registro = new Registro();
		Scanner scanner = new Scanner(System.in);
		Livro livroFisico1 = new Fisico("10","HarryPotter","JK",155,4);
		biblioteca.adicionarLivro(livroFisico1);
		Pessoa pessoa1 = new Professor("15", "Luiz", "Professor", "Matematica", "E-mail@gmail.com");
		registro.adicionarpessoa(pessoa1);
		while (true) {
			System.out.println("---------Biblioteca---------");
			System.out.println("1 - Adicionar livro");
			System.out.println("2 - Excluir livro");
			System.out.println("3 - Exibir index dos livros");
			System.out.println("4 - Exibir informações dos livros");
			System.out.println("5 - Cadastro");
			System.out.println("6 - Excluir ");
			System.out.println("7 - Listagem");
			System.out.println("8 - Emprestimo");
			System.out.println("9 - Devolução");
			System.out.println("10 - Vizualizar emprestados");
			System.out.println("---------Biblioteca---------");			
			int opcao = Integer.parseInt(scanner.nextLine());
			switch(opcao) {
			
			case 1:{
				System.out.println("Digite o numero referente ao tipo de livro que deseja adicionar.");
				System.out.println("( 1 ) Livro Fisico.");
				System.out.println("( 2 ) Ebook.");
				System.out.println("( 3) AudioBook.");
				int tipo = Integer.parseInt(scanner.nextLine());
				if(tipo == 1) {
					System.out.println("Voce escolheu o livro fisico.");
					System.out.println("Digite o nome do livro:");
					String nome = (scanner.nextLine());
					System.out.println("Digite o nome do autor:");
					String autor = (scanner.nextLine());
					System.out.println("Digite o codigo do livro");
					String codigoUnico = (scanner.nextLine());
					System.out.println("Digite o número de páginas");
					int numeroPaginas = Integer.parseInt(scanner.nextLine());
					System.out.println("Digite o número da estante");
					int numeroEstante = Integer.parseInt(scanner.nextLine());
					Livro livroFisico = new Fisico(codigoUnico,nome,autor,numeroPaginas,numeroEstante);
					biblioteca.adicionarLivro(livroFisico);
					break;
				}else if(tipo ==2) {
					System.out.println("Voce escolheu o EBook.");
					System.out.println("Digite o nome do livro:");
					String nome = (scanner.nextLine());
					System.out.println("Digite o nome do autor:");
					String autor = (scanner.nextLine());
					System.out.println("Digite o codigo do livro:");
					String codigoUnico = (scanner.nextLine());
					System.out.println("Digite o número de páginas:");
					int numeroPaginas = Integer.parseInt(scanner.nextLine());
					System.out.println("Digite o link do livro:");
					String link = (scanner.nextLine());
					Livro livroEBook = new Ebook ( codigoUnico, nome, autor, numeroPaginas, link);
					biblioteca.adicionarLivro(livroEBook);
					break;
				}else if (tipo == 3) {
					System.out.println("Voce escolheu o AudioBook.");
					System.out.println("Digite o nome do livro:");
					String nome = (scanner.nextLine());
					System.out.println("Digite o nome do autor:");
					String autor = (scanner.nextLine());
					System.out.println("Digite o codigo do livro:");
					String codigoUnico = (scanner.nextLine());
					System.out.println("Digite a duração do livro:");
					double duracao = Integer.parseInt(scanner.nextLine());
					System.out.println("Digite o nome do narrador:");
					String narrador = (scanner.nextLine());
					Livro audioBook = new Audio(codigoUnico,nome, autor, duracao, narrador);
					biblioteca.adicionarLivro(audioBook);
					break;
				}else {
					System.out.println("Numero não compativel.");
					break;
				}
			}case 2:{
				System.out.println("Digite o codigo do livro que deseja excluir:");
				String codigo = (scanner.nextLine());
				if(biblioteca.removerLivro(codigo)) {
					System.out.println("O livro foi removido com sucesso");
					break;
				}else {
					System.out.println("Não existe Livro com este codigo");
				}break;
			}case 3:{
				biblioteca.exibirInfo();
				break;
			}case 4:{
				biblioteca.exibirLivros();
				break;
			}case 5: {
				System.out.println("Qual seria o tipo do cadastro? ");
				System.out.println("1 - Aluno");
				System.out.println("2 - Professor");
			int escolha = Integer.parseInt(scanner.nextLine());
			if(escolha == 1) {
				System.out.println("Coloque o código exclusivo do aluno: ");
				String codigounico = (scanner.nextLine());
				System.out.println("Coloque o nome do aluno: ");
				String nome = (scanner.nextLine());
				System.out.println("Coloque a idade do aluno: ");
				String idade = (scanner.nextLine());
				System.out.println("Coloque o curso do aluno: ");
				String curso = (scanner.nextLine());
				System.out.println("Coloque o número matrícula do aluno: ");
				String matricula = (scanner.nextLine());
				
				Pessoa aluno = new Aluno(codigounico, nome, idade, curso, matricula);
				if (registro.adicionarpessoa(aluno)) {
                    System.out.println("Aluno registrado com sucesso.");
                } else {
                    System.out.println("Aluno com código " + codigounico + " já existe!");
                }
                
			break;
			
			}else if(escolha == 2) {
				System.out.println("Coloque o código exclusivo do professor: ");
				String codigounico = (scanner.nextLine());
				System.out.println("Coloque o nome do professor: ");
				String nome = (scanner.nextLine());
				System.out.println("Coloque a área de atuação do professor: ");
				String atuacao = (scanner.nextLine());
				System.out.println("Coloque o departamento do professor: ");
				String departamento = (scanner.nextLine());
				System.out.println("Coloque o email do professor: ");
				String email = (scanner.nextLine());
				
				Pessoa professor = new Professor(codigounico, nome, atuacao, departamento, email);
				if (registro.adicionarpessoa(professor)) {
                    System.out.println("Professor registrado com sucesso.\n");
                } else {
                    System.out.println("Professor com código " + codigounico + " já existe!");
                }
            } else {
                System.out.println("Opção inválida no cadastron");
            }
            break;
        }case 6: {
            System.out.print("Digite o código exclusivo do usuário a ser removido: ");
            String codigounico = scanner.nextLine();
            if (registro.removerpessoa(codigounico)) {
                System.out.println("Usuário removido com sucesso.");
            } else {
                System.out.println("Usuário com código " + codigounico + " não encontrado.");
            }
            break;
        }case 7: {
            System.out.println(" Listagem de Usuários");
            registro.exibirpessoa();
            break;
        }
			
			case 8:{
				System.out.println("Digite o codigo do livro que deseja emprestar: ");
				String codigoUnico = (scanner.nextLine());
				System.out.println("Digite o codigo da pessoa que deseja alugar: ");
				String codigoUnicoPessoa = (scanner.nextLine());
				Livro livro =biblioteca.getLivro(codigoUnico);
				Pessoa pessoa = registro.getPessoa(codigoUnicoPessoa);
				LocalDate data = LocalDate.now();
				LocalDate dev = LocalDate.now();
				if(pessoa instanceof Aluno) {
					dev = data.plusDays(7);
				}else if (pessoa instanceof Professor) {
					dev = data.plusDays(15);
				}
				Emprestimo emprestimo = new Emprestimo(livro, pessoa, data, dev);
				if (biblioteca.adicionarEmprestimo(registro, codigoUnicoPessoa, codigoUnico, emprestimo)) {
				    System.out.println("Empréstimo registrado com sucesso.");
				} else {
				    System.out.println("Falha ao registrar empréstimo.");
				}
				break;
				
				
				
			}case 9:{
				System.out.println("Digite o codigo do livro que deseja devolver:");
				String codigoUnico = (scanner.nextLine());
				biblioteca.devolucao(codigoUnico, registro);
				break;
			}case 10: {
					biblioteca.listaEmprestimos();
					break;
				}case 11:{
					System.out.println("Saindo");
				}
			}if(opcao == 11) {
				break;
			}
		}
	}

}
