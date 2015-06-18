package Testa;

import ABP.Abp;

public class Testa {

	public static void main(String[] args) {
		Abp arvore = new Abp();
		if (arvore.ehVazia())
			System.out.println("ta vazia");
		
		arvore.inserir(2);
		arvore.imprimir();
	}

}
