package br.ucsal.ed.ted;

public class Arvore {

	 No raiz;
	int tamanho;

	public Arvore() {
		this.raiz = null;
		this.tamanho = 0;
	}

	void buscaPreOrdem(No posicao, int info) {
		if (info == posicao.info) {
			System.out.println("O valor " + info +" está na árvore.");
		}
		if (posicao.esquerda != null) {
			buscaPreOrdem(posicao.esquerda, info);
		}
		if (posicao.direita != null) {
			buscaPreOrdem(posicao.direita, info);
		}
	}
	void buscaEmOrdem(No posicao, int info) {
		if (posicao.esquerda != null) {
			buscaEmOrdem(posicao.esquerda, info);
		}
		if (info == posicao.info) {
			System.out.println("O valor " + info +" está na árvore.");
		}
		if (posicao.direita != null) {
			buscaEmOrdem(posicao.direita, info);
		}
		
	}
	void buscaPosOrdem(No posicao, int info) {
		if (posicao.esquerda != null) {
			buscaPosOrdem(posicao.esquerda, info);
		}
		if (posicao.direita != null) {
			buscaPosOrdem(posicao.direita, info);
		}
		if (info == posicao.info) {
			System.out.println("O valor " + info +" está na árvore.");
		}
		
	}
	void retornaEsquerda(No posicao) {
		System.out.println(posicao.info);
		if (posicao.esquerda != null) {
			retornaEsquerda(posicao.esquerda);
		} else {
			System.out.println("Nada a esquerda");
		}
	}	
	void retornaDireita (No posicao) {
		System.out.println(posicao.info);
		if (posicao.direita != null) {
			retornaDireita(posicao.direita);
		} else {
			System.out.println("Nada a direita");
		}
	}
}


