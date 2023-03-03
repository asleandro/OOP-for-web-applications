package com.uva;

public class Profissional extends Pessoa {
	
	private String profissao;

	public Profissional() {
		this("",0,"");
	}

	public Profissional(String nome, int idade, String profissao) {
		super(nome, idade);
		this.profissao = profissao;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	@Override
	public void exibir() {
		super.exibir();
		System.out.println("\t Trabalha como " + profissao);
	}
	

}
