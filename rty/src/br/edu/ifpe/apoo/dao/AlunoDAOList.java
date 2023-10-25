package br.edu.ifpe.apoo.dao;

import java.util.ArrayList;

import br.edu.ifpe.apoo.entidades.Aluno;

public class AlunoDAOList implements AlunoDAO{
	
	ArrayList<Aluno> alunos = new ArrayList<Aluno>(); 
	
	private static AlunoDAOList instancia;
	
	protected static AlunoDAOList getInstancia() {
		if (instancia == null) {
			instancia = new AlunoDAOList();
		}
		
		return instancia;
	}

	@Override
	public void inserir(Aluno aluno) {
		alunos.add(aluno);
		System.out.println("Aluno " + aluno.getNome() + " Inserido com sucesso");
	}

	@Override
	public void atualizar(Aluno aluno) {
	
		if (aluno instanceof Aluno) {
		
			long posi = aluno.getId();
			
			alunos.get((int) posi);
			
		}System.out.println("Inválido");
	}

	
	@Override
	public boolean remover(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Aluno get(long id) {
		for (Aluno alunoConsuta : alunos) {
			if (alunoConsuta.getId() == id) {
				System.out.println("Aluno encontrado!");
				return alunoConsuta;
			}
			
		}
		throw new UnsupportedOperationException("not implemented");
	}
	}


