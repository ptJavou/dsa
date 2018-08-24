package lista_simples;

public class ListaSimples<E> {

	private Node<E> primeiro;
	private Node<E> ultimo;
	private int size = -1;
	
	public int getSize() {
		return size;
	}
	
	public boolean vazia() {
		return (size == -1);
	}
	
	public void addPrimeiro(E elemento) {
		primeiro = new Node<E>(elemento, primeiro);
		if(vazia())
			ultimo = primeiro;
		size++;
	}
	
	public void addUltimo(E elemento) {
		Node<E> novoNo = new Node<E>(elemento, null);
		if(vazia()) {
			primeiro = novoNo;
		}else {
			ultimo.setProximo(novoNo);
		}
			
		ultimo = novoNo;
	}
	
	public E removerPrimeiro() {
		if(vazia()) return null;
		E elemento = primeiro.getElemento();
		primeiro = primeiro.getProximo();
		
		size--;
		if(vazia())
			ultimo = primeiro;
		
		return elemento;
	}
	
}
