// Jasmine Chin 111717723

import java.util.ArrayList;

public class SortArrayList {
	
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E currentMin;
		int currentMinIndex;
		for (int i = 0; i < list.size() - 1; i++) {
			currentMin = list.get(i);
			currentMinIndex = i;
			for (int j = i+1; j < list.size(); j++) {
				if (((Comparable<E>) currentMin).compareTo(list.get(j)) > 0) {
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i, (E) currentMin);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			arr.add((int)(Math.random()*100));
		}
		System.out.println("Unsorted: " + arr);
		sort(arr);
		System.out.println("Sorted: " + arr);
	}

}
