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
		int pivot; // 재배치의 기준으로 삼는 값
		if (first > last)
			return; // 만약 왼쪽의 값이 더 크다면 그냥 반환한다.
		pivot = partition(array, first, last); // 재배치 기준의 값을 구함
		QuickSort(array, first, pivot - 1); // 왼쪽 정렬
		QuickSort(array, pivot + 1, last); // 오른쪽 정렬
	}

	private static int partition(int[] array, int first, int last) {
		int left = first; // 왼쪽 부분을 가르키는 변수
		int right = last; // 오른쪽 부분을 가르키는 변수
		int temp = 0; // 왼쪽과 오른쪽 값을 교환하기 위한 임시변수
		
		int middle = (left + right) / 2; //중간 값을 설정
		int pivot = array[middle]; //중간 지점에 인덱스에 해당하는 값이 기준 값
		array[middle] = array[left]; //왼쪽 끝에있는 값과 중간 값을 교환
		array[left] = pivot;  //기준 값과 왼쪽 값을 교환
		int External_pivot = left; //QuickSort메소드에 전달할 pivot값
		for (int k = left + 1; k <= right; k++) { //왼쪽에서 오른쪽까지
			if (array[k] < pivot) {  //어떤 값이 기준값 보다 작으면
				//왼쪽으로 배치한다.
				//이때, 왼쪽 공간이 증가하면, 기준값이 있어야 할 위치도 증가해야 하므로 +1 해준다.
				External_pivot = External_pivot + 1;  
				temp = array[External_pivot]; 
				array[External_pivot] = array[k];
				array[k] = temp;
			}
		}
		//아니면 오른쪽으로 배치한다.
		temp = array[left]; 
		array[left] = array[External_pivot];
		array[External_pivot] = temp;

		return External_pivot; //그리고 계산한 기준 값을 반환한다.
	}

}
