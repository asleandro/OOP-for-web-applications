package com.uva;

public class Pilha<K>{
	
	private class NoPilha<K>{
		public K dado;
		public NoPilha<K> proximo;
	}
	
	private NoPilha<K> topo = null;
	
	public void empilhar(K dado) {
		NoPilha<K> novo = new NoPilha<>();
		novo.dado = dado;
		novo.proximo = topo;
		topo = novo;
	}
	
	public K desempilhar() {
		if(topo == null) {
			return null;
		}
		K dado = topo.dado;
		topo = topo.proximo;
		return dado;
	}

}
