package com.chapter6.binary_tree;

public class BinaryTree<E> {

	public Node<E> root;
	private int size;
	
	public void imprimeArvore(Node<E> node) {
		if(node.getLeft() != null)
			System.out.println("O nó da esquerda do valor " + node.getElement() + " é " + node.getLeft().getElement());
		
		if(node.getRight() != null)
			System.out.println("O nó da direita do valor " + node.getElement() + " é " + node.getRight().getElement());
		
		if(node.getLeft() != null)
			imprimeArvore(node.getLeft());
		if(node.getRight() != null)
			imprimeArvore(node.getRight());
	}
	
	
	
	public static void main(String[] args) {
		
		Node<Integer> node1 = new Node<Integer>(1, null, null);
		Node<Integer> node2 = new Node<Integer>(2, null, null);
		Node<Integer> node3 = new Node<Integer>(3, null, null);
		Node<Integer> node4 = new Node<Integer>(4, null, null);
		Node<Integer> node5 = new Node<Integer>(5, null, null);
		Node<Integer> node6 = new Node<Integer>(6, null, null);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		
		node3.setRight(node4);
		
		node4.setLeft(node5);
		node4.setRight(node6);
		
		BinaryTree<Integer> bt = new BinaryTree<>();
		bt.imprimeArvore(node1);
	}
}

