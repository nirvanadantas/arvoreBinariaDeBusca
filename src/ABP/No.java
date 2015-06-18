package ABP;

public class No {
	private int valor;
	private No pai;
	private No filhoDir;
	private No filhoEsq;
		
	public No(int valor) {
		super();
		this.valor = valor;
		this.filhoDir = null;
		this.filhoDir = null;
	}
	
	
	public No() {
		super();
	}
	
	public boolean ehExterno(){
		return this.getFilhoEsq() == null && this.getFilhoDir() == null;
	}

	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public No getPai() {
		return pai;
	}
	public void setPai(No pai) {
		this.pai = pai;
	}
	public No getFilhoDir() {
		return filhoDir;
	}
	public void setFilhoDir(No filhoDir) {
		this.filhoDir = filhoDir;
	}
	public No getFilhoEsq() {
		return filhoEsq;
	}
	public void setFilhoEsq(No filhoEsq) {
		this.filhoEsq = filhoEsq;
	}
	
	
}
