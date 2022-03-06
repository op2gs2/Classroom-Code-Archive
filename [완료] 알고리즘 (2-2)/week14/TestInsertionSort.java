
public class TestInsertionSort {
	public TestInsertionSort() {
		int[] a = IntArrays.randomInts(20, 100);
		IntArrays.print(a);
		System.out.println("sorted: " + IntArrays.isSorted(a));
		Insertionsort(a);
		IntArrays.print(a);
		System.out.println("sorted: " + IntArrays.isSorted(a));
	}

	void Insertionsort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i]; //�ӽ� ����ҿ� �迭 a�� i��° ���� ����
			for(int j = i; j > 0; j--) {
				if(temp < a[j-1]) {
					int temp1 = a[j];
					a[j] = a[j-1];
					a[j-1] = temp1;
				}
			}
		}
	}
}
