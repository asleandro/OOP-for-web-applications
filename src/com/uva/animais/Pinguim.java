package com.uva.animais;

import com.uva.Autor;

@Autor(nome = "Leandro", ano = 2023)
public class Pinguim extends Ave {

	@Override
	public void voar() {
		System.out.println("?????");
	}

}
