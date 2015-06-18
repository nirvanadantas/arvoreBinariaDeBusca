package Testa;

import java.util.Scanner;

import ABP.Abp;

public class Testa {

	public static void main(String[] args) {
		Abp arvore = null;
		
		int num, para = 0;
		/*arvore.inserir(2);
		arvore.imprimir();
	*/
		Scanner ler = new Scanner(System.in);
		System.out.println("Implementação de AVL.");
		
		while(para == 0){	
			System.out.println("Por favor digite uma operacao");
			
			String op = ler.nextLine();
			
			
			switch(op){
				case "new":
						arvore = new Abp();
						System.out.println("Árvore criada.");
					
					break;
					
				case "inserir":
					Scanner ler2 = new Scanner(System.in);
					num = ler2.nextInt();
					arvore.inserir(num);
					break;
					
				case "imprimir":
					arvore.imprimir();
					break;
					
				case "sair":
					para = 1;
					break;
				default:
						System.out.println("por favor insira uma opção valida");
						
		
			}
		}
}
}
