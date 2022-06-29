package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		List<Aula> aulasImutavel = javaColecoes.getAulas();
		List<Aula> aulas = new ArrayList<>(aulasImutavel);

		System.out.println(javaColecoes.getAulas());

	}

}
