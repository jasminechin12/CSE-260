import java.util.ArrayList;

public class GenericStackExtendsArrayList {
	public static class GenericStack<E> extends ArrayList<E> {
		
		public int getSize() {
			return (int) get(size());
		}
		
		public E peek() {
			return get(size()-1);
		}
		
		public void push(E o) {
			add(o);
		}
		
		public E pop() {
			return remove(size()-1);
		}
		
		public boolean isEmpty() {
			return super.isEmpty();
		}
		
		@Override
		public String toString() {
			return "stack: " + super.toString();
		}
		
	}

	public static void main(String[] args) {
		GenericStack<String> test1 = new GenericStack<>();
		test1.push("Hello");
		test1.push("World");
		System.out.println(test1);
		System.out.println(test1.pop());
		System.out.println(test1);
		System.out.println(test1.isEmpty());
		test1.push("Helloooooo");
		System.out.println(test1.peek());
	}

}
