package br.edu.ifpe.apoo.apresentacao;

import java.util.Scanner;

import br.edu.ifpe.apoo.dao.AlunoDAOMySQL;
import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;
import br.edu.ifpe.apoo.negocio.ControladorAluno;

public class AlunoApresentacao {
	Scanner iput = new Scanner(System.in);
	int verifica; 
	
	public void exibirMenu() throws ExcecaoAlunoInvalido {
		System.out.println("Digite a opção desejada");
		System.out.println("1 para inserir um aluno;");
		System.out.println("2 para consultar um aluno;");
		System.out.println("3 para remover um aluno;");
		System.out.println("4 para alterar um aluno;");
		
		Scanner scanner = new Scanner(System.in);
		int opcao = Integer.parseInt(scanner.nextLine());
		if (opcao == 1) {
			this.inserir();
		}
		if (opcao == 4) {
			this.alterar();
		}
	}
	
	private void inserir() throws ExcecaoAlunoInvalido {
		
		Aluno aluno= new Aluno();
		
		System.out.println("Digite seu CPF. Apenas números");
		String cpf = iput.nextLine();
		aluno.setCpf(cpf); // scanner.next...
		
		System.out.println("Digite seu Nome.");
		String nome = iput.nextLine();
		aluno.setNome(nome);
		
		System.out.println("Digite seu Email.");
		String email = iput.nextLine();
		aluno.setEmail(email);
		
		aluno.setId(verifica);
		verifica++;
		
		Aluno aluno1 = new Aluno();
		aluno1.setCpf("78933357777"); // scanner.next... 789.333.577-77
		aluno1.setNome("Victor");
		aluno1.setEmail("vl@cin.upfe.br");
		aluno1.setId(1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setCpf("78933357777"); // scanner.next... 789.333.577-77
		aluno2.setNome("Sergio");
		aluno2.setEmail("vl@cin.upfe.br");
		aluno2.setId(2);
		
		ControladorAluno controlador = new ControladorAluno();
		controlador.inserir(aluno);
		controlador.inserir(aluno1);
		controlador.inserir(aluno2);
	}
	
	private void consultar() {
		
	}
	
	
	
	
	private void alterar() {
		
		System.out.println("Qual aluno voce deseja alterar???");
		String recebeNome = iput.nextLine();
		
		
		
		
		
		
		
			
		String nomeAlterar = iput.nextLine();
		Aluno aluno = new Aluno();
		aluno.setNome(nomeAlterar);
		
		ControladorAluno controlador = new ControladorAluno();
		
		controlador.atualizar(aluno);
	}}

