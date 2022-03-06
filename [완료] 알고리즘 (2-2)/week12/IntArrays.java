package week12;

public class IntArrays {
	private static java.util.Random random = new java.util.Random();

	public static boolean isSorted(int[] a) { // check sort
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) { // �� �� ���Ҹ� ���ؼ� ũ�⸸ ���� ��. ���� i�� �ʱⰪ�� 0�� �ƴ� 1�̴�.
				return false; // ������ ���� ����
			}
		}
		return true;
	}

	public static void print(int[] a) { //�迭�� ����� ����ϴ� �޼ҵ�
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

	public static int[] randomInts(int n, int range) {
		int[] a = new int[n];
		if (n < 2) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < n; i++) {
			a[i] = random.nextInt(range);
		}
		return a;
	}

	public static void swap(int[] a, int i, int j) {
		if (a[i] == a[j]) {
            return;
        }
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
	}

}
