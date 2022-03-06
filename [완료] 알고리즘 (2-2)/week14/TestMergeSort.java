public class TestMergeSort {
	public TestMergeSort() {
		int[] a = IntArrays.randomInts(20, 100);
		IntArrays.print(a);
		System.out.println("Sorted: " + IntArrays.isSorted(a));
		Mergesort(a, 0, a.length - 1);
		IntArrays.print(a);
		System.out.println("Sorted: " + IntArrays.isSorted(a));
	}

	void Mergesort(int[] array, int first, int last) {
		if (first < last) {
			int middle = (first + last) / 2; // �� �迭�� ���� p�� r�� �߰� ������ ����Ѵ�.
			Mergesort(array, first, middle); // ���ݺ� ����
			Mergesort(array, middle + 1, last); // �Ĺݺ� ����
			merge(array, first, middle, last); // ����
		}
	}

	void merge(int[] array, int first, int middle, int last) { 
		int[] temp = new int[array.length]; //���� �ӽ÷� �����ϱ� ���� ����
		//���ʿ��� ����Ű�� ���� ������ ����
		int left = first; 
		int right = middle +1;
		//���� ������ �� ���� ����
		int leftEnd = right - 1;
		int rightEnd = last;
		
        int k = first;
        int num = last - first + 1; //temp �迭 ���� �� ���

        while(left <= leftEnd && right <= rightEnd) //������ �������� ���� �ʰ�
            if(array[left]<(array[right])) //������ ���� �� ������
            	temp[k++] = array[left++]; //�ӽ� �迭�� ���� ���� ����
            else //�ƴϸ�
            	temp[k++] = array[right++]; //�ӽ� �迭�� ������ ���� ����

        while(left <= leftEnd)    // ���� ������ ���� �ؿ�
        	temp[k++] = array[left++];

        while(right <= rightEnd)  // ������ ������ ���� �ؿ�
        	temp[k++] = array[right++];

        //�ӽ� �迭�� ����� ����� ���� �迭�� ����
        for(int i = 0; i < num; i++, rightEnd--)
            array[rightEnd] = temp[rightEnd];
	}
	
}
