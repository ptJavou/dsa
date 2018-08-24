package lista_duplamente_encadeada;

public class ListaDupla<E> {

	private No<E> primeiro;
	private No<E> ultimo;
	private int size = -1;
	
	public ListaDupla() {
		primeiro = new No<E>(null, null, null);
		ultimo = new No<E>(null, null, primeiro);
		primeiro.setProximo(ultimo);
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean vazio() {
		return (size == -1);
	}
	
	public void adicionarPrimeiro(E element) {
		adicionarEntre(element, primeiro, primeiro.getProximo());
	}
	
	public void adicionarUltimo(E element) {
		adicionarEntre(element, ultimo.getAnterior(), ultimo);
	}
	
	public void adicionarEntre(E elemento, No<E> noAnterior, No<E> proximoNo) {
		No<E> novoNo = new No<E>(elemento, proximoNo, noAnterior);
		noAnterior.setProximo(novoNo);
		proximoNo.setAnterior(novoNo);
		size++;
	}
	
	public E removerPrimeiro() {
		if(vazio()) return null;
		return remove(primeiro.getProximo());
	}
	
	public E removerUltimo() {
		if(vazio()) return null;
		return remove(ultimo.getAnterior());
	}
	
	public E remove(No<E> no) {
		No<E> anterior = no.getAnterior();
		No<E> proximo = no.getProximo();
		
		E elemento = no.getElemento();
		anterior.setProximo(proximo);
		proximo.setAnterior(anterior);
		size--;
		return elemento;
	}
	
	public static void main(String[] args) {
		Integer n1 = 1;
		Integer n2 = 2;
		Integer n3 = 3;
		Integer n4 = 4;
		
		ListaDupla<Integer> lista = new ListaDupla<>();
		lista.adicionarPrimeiro(n1);
		lista.adicionarPrimeiro(n2);
		lista.adicionarPrimeiro(n3);
		lista.adicionarPrimeiro(n4);
		
		while(!lista.vazio()) {
			System.out.println(lista.removerPrimeiro());
		}
	}
}
