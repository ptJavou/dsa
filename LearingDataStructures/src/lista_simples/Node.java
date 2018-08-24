package lista_simples;

public class Node<E> {

	private E elemento;
	private Node<E> proximo;
	
	public Node(E elemento, Node<E> proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public E getElemento() {
		return elemento;
	}
	public Node<E> getProximo() {
		return proximo;
	}
	public void setProximo(Node<E> proximo) {
		this.proximo = proximo;
	}
}
