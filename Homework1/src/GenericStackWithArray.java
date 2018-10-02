// Jasmine Chin 111717723

import java.util.Arrays;

public class GenericStackWithArray {

	public static class GenericStack<E> {
		private static int maxsize = 10;
		private static int counter = 0;
		private E[] arr = (E[]) new Object[maxsize];
		
		public int getSize() {
			return maxsize;
		}
		
		public E peek() {
			if (arr.length == 0)
				return null;
			else
				return arr[arr.length-1];
		}
		
		public void push(E o) {
			if (counter == maxsize) {
				maxsize = maxsize * 2;
				E[] newarr = (E[]) new Object[maxsize];
				System.arraycopy(arr, 0, newarr, 0, arr.length);
				arr = newarr;
			}
			arr[counter++] = o;
			
		}
		
		public E pop() {
			if (counter == 0)
				return null;
			else {
				E o = arr[--counter];
				return o;
			}
		}
		
		public boolean isEmpty() {
			if (counter == 0)
				return true;
			else
				return false; 
		}
		
		@Override
		public String toString() {
			return "stack: " + Arrays.toString(arr);
		}
	}
	
	public static void main(String[] args) {
		GenericStack<String> arr = new GenericStack<>();
		System.out.println("Empty? " + arr.isEmpty());
		arr.push("1");
		arr.push("2");
		arr.push("3");
		arr.push("4");
		arr.push("Hello");
		arr.push("World");
		System.out.println(arr);
		arr.push("Helloooooo");
		System.out.println(arr);
		System.out.println(arr.pop());
		System.out.println("Array capacity: " + arr.getSize());
		arr.push("7");
		arr.push("8");
		arr.push("9");
		arr.push("10");
		System.out.println(arr);
		arr.push("11");
		System.out.println(arr);
	}

}
