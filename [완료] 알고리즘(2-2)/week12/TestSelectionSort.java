package week12;

public class TestSelectionSort {
	public TestSelectionSort() {
		int[] a = IntArrays.randomInts(20, 100);
		IntArrays.print(a);
		System.out.println("Sorted: " + IntArrays.isSorted(a));
		Selectionsort(a);
		IntArrays.print(a);
		System.out.println("Sorted: " + IntArrays.isSorted(a));
	}

	void Selectionsort(int[] a) {
		int i, j, min;
		for (i = 0; i < a.length - 1; i++) {
			min = i;
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) 
					min = j;
				
			}
			IntArrays.swap(a, min, i);
		}
	}
}
