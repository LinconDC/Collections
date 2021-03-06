package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Renan Oliveira");
		alunos.add("Mauricio Aniche");
		
		alunos.add("Alberto Souza");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Renan Oliveira");
		System.out.println(pauloEstaMatriculado);

		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);

		}
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();

		alunos.forEach(aluno -> {
			System.out.println(alunos);
		});
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
	}

}




















