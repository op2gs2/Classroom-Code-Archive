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
			int middle = (first + last) / 2; // 두 배열의 극점 p와 r의 중간 지점을 계산한다.
			Mergesort(array, first, middle); // 전반부 정렬
			Mergesort(array, middle + 1, last); // 후반부 정렬
			merge(array, first, middle, last); // 병합
		}
	}

	void merge(int[] array, int first, int middle, int last) { 
		int[] temp = new int[array.length]; //값을 임시로 저장하기 위한 변수
		//양쪽에서 가르키기 위한 변수들 선언
		int left = first; 
		int right = middle +1;
		//양쪽 변수의 끝 점을 선언
		int leftEnd = right - 1;
		int rightEnd = last;
		
        int k = first;
        int num = last - first + 1; //temp 배열 복사 시 사용

        while(left <= leftEnd && right <= rightEnd) //양쪽이 끝점으로 가지 않고
            if(array[left]<(array[right])) //왼쪽의 값이 더 작으면
            	temp[k++] = array[left++]; //임시 배열에 왼쪽 값을 넣음
            else //아니면
            	temp[k++] = array[right++]; //임시 배열에 오른쪽 값을 넣음

        while(left <= leftEnd)    // 왼쪽 절반을 복사 해옴
        	temp[k++] = array[left++];

        while(right <= rightEnd)  // 오른쪽 절반을 복사 해옴
        	temp[k++] = array[right++];

        //임시 배열에 저장된 결과는 원래 배열에 저장
        for(int i = 0; i < num; i++, rightEnd--)
            array[rightEnd] = temp[rightEnd];
	}
	
}
