package ABP;

public class Abp {
	private No raiz = null;
	
	public Abp() {
		super();
		
		
	}
	
	public No busca(No no, int num){
		if(this.ehVazia()){
			return raiz;
		}
			
		if(no.getValor() >= num)
			return busca(no.getFilhoDir(), num);
		else if(no.getValor() < num)
			return busca(no.getFilhoEsq(), num);
		else //(no.getValor() == num)
			return no;
		
	}
	
	public boolean ehVazia(){
		return this.raiz==null;
	}
	
	public No inserir(int num){
		No novo = new No(num);
		if(this.ehVazia()){
			//é raiz	
			this.raiz = novo;
			System.out.println("Inserindo no "+num+" na raiz");
			return this.raiz;
			
		}
		
		No lugar = busca(this.raiz, num);		
		if (lugar.getValor() >= num){
			novo.setPai(lugar);
			lugar.setFilhoDir(novo);
			System.out.println("Inserindo no "+num+" à esquerda direita de "+lugar.getValor());
			return novo;
		}else{ //if(lugar.getValor() < num)
			novo.setPai(lugar);
			lugar.setFilhoEsq(novo);
			System.out.println("Inserindo no "+num+" à esquerda esq de "+lugar.getValor());
			return lugar;
		}
		
	}

	public void imprimir() {
		if (this.ehVazia())
			System.out.println("Árvore vazia");
		else
			imprimirArvore(this.raiz);
		
	}

	private void imprimirArvore(No no) {
		if(no.getFilhoDir() != null)
			imprimirArvore(no.getFilhoDir());
		if(no.getFilhoEsq() != null)
			imprimirArvore(no.getFilhoEsq());
		System.out.println(no.getValor());
	}
}
		
	






