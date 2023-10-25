package br.edu.ifpe.apoo.apresentacao;

import java.util.Scanner;

import br.edu.ifpe.apoo.dao.AlunoDAOMySQL;
import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;
import br.edu.ifpe.apoo.negocio.ControladorAluno;

public class AlunoApresentacao {
	Scanner iput = new Scanner(System.in);
	int verifica; 
	
	 while (true) {
		System.out.println("Digite a opção desejada");
		System.out.println("1 para inserir um aluno;");
		System.out.println("2 para consultar um aluno;");
		System.out.println("3 para remover um aluno;");
		System.out.println("4 para alterar um aluno;");
		int escolha = scanner.nextInt();
		
		switch (escolha) {
		if (opcao == 1) {
			this.inserir();
		}
		if (opcao == 4) {
			this.alterar();
		}
	}
}
}
	case 1:
		private void inserir() 
		
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
		
		
		ControladorAluno controlador = new ControladorAluno();
		controlador.inserir(aluno);
		break;
	}
	case 2:
		private void consultar() {
	  break;	
	}
case 3:
	private void remover(){
}
	  case 4:
	
	private void alterar() {
		
		System.out.println("Qual aluno voce deseja alterar???");
		String recebeNome = iput.nextLine();
		
	break;	
		  case 5:
			  scanner.close();
		  System.exit(0);
		  default:
			  syso("opçao invalida");
			  break;
		
		
		
			
		String nomeAlterar = iput.nextLine();
		Aluno aluno = new Aluno();
		aluno.setNome(nomeAlterar);
		
		ControladorAluno controlador = new ControladorAluno();
		
		controlador.atualizar(aluno);
	}}

