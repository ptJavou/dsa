package lista_duplamente_encadeada;

public class No<E> {

	private E elemento;
	private No<E> proximo;
	private No<E> anterior;
	
	public No(E elemento, No<E> proximo, No<E> anterior) {
		this.elemento = elemento;
		this.proximo = proximo;
		this.anterior = anterior;
	}
	
	public E getElemento() {
		return elemento;
	}
	public No<E> getProximo() {
		return proximo;
	}
	public No<E> getAnterior() {
		return anterior;
	}
	
	public void setProximo(No<E> proximo) {
		this.proximo = proximo;
	}
	public void setAnterior(No<E> anterior) {
		this.anterior = anterior;
	}
}
