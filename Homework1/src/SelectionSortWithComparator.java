import java.util.Comparator;

class StringComparator implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}

public class SelectionSortWithComparator {
	public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
		for (int i = 0; i < list.length; i++) {
			E currentMin = list[i];
			int currentMinIndex = i;
			for (int j = i; j < list.length; j++) {
				if (comparator.compare(currentMin, list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	public static void main(String[] args) {
		String[] a = {"a", "z", "d"};
		selectionSort(a, new StringComparator());
		for (String s: a) {
			System.out.print(s);
		}
	}

}
