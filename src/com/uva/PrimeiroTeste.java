package com.uva;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.uva.animais.Aereo;
import com.uva.animais.Galinha;
import com.uva.animais.Gaviao;
import com.uva.animais.Pinguim;

public class PrimeiroTeste {
	
	public static void jogar20Andar(Object obj) {
		if(obj instanceof Aereo)
			((Aereo)obj).voar(); //typecast
		else
			System.out.println("Mais um CPF cancelado");
	}
	
	private static void imprimeAutor(Object obj) {
		if(obj.getClass().isAnnotationPresent(Autor.class)) {
			Autor a1 = obj.getClass().getAnnotation(Autor.class);
			System.out.println(obj.getClass().getName()+ " escrito por "+a1.nome()+" em "+a1.ano());
		} else
			System.out.println("Sem autoria definida");
	}

	public static void main(String[] args) throws Exception {
		
		imprimeAutor(new Pessoa());
		imprimeAutor(new Pinguim());
		
		System.out.println("---------");
		
		jogar20Andar(new Gaviao());
		jogar20Andar(new Galinha());
		jogar20Andar(new Pinguim());
		jogar20Andar(new Pessoa());
		
		System.out.println("---------");
		
		Pessoa[] pessoas = {
				new Pessoa("Ana",25),
				new Profissional("Carlos",33,"Engenheiro"),
				new Pessoa("Luis", 28)
		};
		
		//empilhando as instancias de pessoas
		Pilha<Pessoa> pilha = new Pilha<>();
		for(Pessoa p: pessoas)
			pilha.empilhar(p);
		Pessoa x;
		while((x=pilha.desempilhar()) != null)
			x.exibir();
		
		for(Pessoa p : pessoas)
			p.exibir();
		
		System.out.println("---------");
		
//		Reflexividade
		Class cls = Class.forName("com.uva.Pessoa");
		Constructor c1 = cls.getConstructor(new Class[] {String.class, int.class});
		Object obj = c1.newInstance("AnaX",26);
		Method m1 = cls.getMethod("exibir");
		m1.invoke(obj);
		Method m2 = cls.getMethod("setNome", String.class);
		m2.invoke(obj, "AnaY");
		m1.invoke(obj);
	
	}

}
