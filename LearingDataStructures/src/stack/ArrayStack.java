package stack;

public class ArrayStack {

	private int[] data;
	private int size = -1;
	
	public ArrayStack(int capacidade) {
		data = new int[capacidade];
	}
	
	public boolean vazio() {
		return (size == -1);
	}
	
	public void push(int n) throws IllegalStateException{
		if(size == data.length) throw new IllegalStateException("a pilha está cheia");
		data[++size] = n;
	}
	
	public int pop() {
		if(vazio()) return -1;
		int n = data[size--];
		return n;
	}
	

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.vazio()) {
			System.out.println(stack.pop());
		}
		
	}
}
