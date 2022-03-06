public class TestQuickSort {
	public TestQuickSort() {
		int[] a = IntArrays.randomInts(20, 100);
		IntArrays.print(a);
		System.out.println("sorted: " + IntArrays.isSorted(a));
		QuickSort(a, 0, a.length - 1);
		IntArrays.print(a);
		System.out.println("sorted: " + IntArrays.isSorted(a));

	}

	void QuickSort(int[] array, int first, int last) {
		int pivot; // ���ġ�� �������� ��� ��
		if (first > last)
			return; // ���� ������ ���� �� ũ�ٸ� �׳� ��ȯ�Ѵ�.
		pivot = partition(array, first, last); // ���ġ ������ ���� ����
		QuickSort(array, first, pivot - 1); // ���� ����
		QuickSort(array, pivot + 1, last); // ������ ����
	}

	private static int partition(int[] array, int first, int last) {
		int left = first; // ���� �κ��� ����Ű�� ����
		int right = last; // ������ �κ��� ����Ű�� ����
		int temp = 0; // ���ʰ� ������ ���� ��ȯ�ϱ� ���� �ӽú���
		
		int middle = (left + right) / 2; //�߰� ���� ����
		int pivot = array[middle]; //�߰� ������ �ε����� �ش��ϴ� ���� ���� ��
		array[middle] = array[left]; //���� �����ִ� ���� �߰� ���� ��ȯ
		array[left] = pivot;  //���� ���� ���� ���� ��ȯ
		int External_pivot = left; //QuickSort�޼ҵ忡 ������ pivot��
		for (int k = left + 1; k <= right; k++) { //���ʿ��� �����ʱ���
			if (array[k] < pivot) {  //� ���� ���ذ� ���� ������
				//�������� ��ġ�Ѵ�.
				//�̶�, ���� ������ �����ϸ�, ���ذ��� �־�� �� ��ġ�� �����ؾ� �ϹǷ� +1 ���ش�.
				External_pivot = External_pivot + 1;  
				temp = array[External_pivot]; 
				array[External_pivot] = array[k];
				array[k] = temp;
			}
		}
		//�ƴϸ� ���������� ��ġ�Ѵ�.
		temp = array[left]; 
		array[left] = array[External_pivot];
		array[External_pivot] = temp;

		return External_pivot; //�׸��� ����� ���� ���� ��ȯ�Ѵ�.
	}

}
