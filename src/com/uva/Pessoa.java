package com.uva;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa() {
		this("",0);
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void exibir() {
		System.out.println(nome + " tem " + idade + " anos");
	}
	

}
