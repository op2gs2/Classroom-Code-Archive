
public class UNION_FIND {
	private char[] VALUE;	// ������ ��
	private int[] PARENT;	// ������ �θ��� ��
	private int[] HEIGHT;	// ������ ���̰� (�ؿ��� ���� 1��)

	// ������ �ʱ�ȭ��Ű�� ���� ������(�ʱ�ȭ)
	public UNION_FIND(char[] v) {
		VALUE = new char[v.length];
		PARENT = new int[VALUE.length];
		HEIGHT = new int[VALUE.length];
		for (int i = 0 ; i < VALUE.length ; i++) {
			VALUE[i] = v[i];
			PARENT[i] = -1;
			HEIGHT[i] = 1;
		}
	}
	
	/*�ʱ�ȭ �� �Ŀ�, �� �׷����� �ڽ��� ���� �θ��� ���� ���� ������ ����� */
	/*root ���� ������ ���ο� ����, ���� �׷쿡 �ִ��� �Ǻ��� �� �ִ�.*/
	// ������ Union ���� �޼ҵ� (v�� u�߿��� ū�ʿ� ���� ���� Ʈ���� ��ģ��.)
	//���̰� ���� �׷����� ���� �׷����� ���� ������.
	public void union(int vNum, int uNum) {

		// �� Ʈ���� ���̰� �Ȱ��ٸ�
		if ( HEIGHT[vNum] == HEIGHT[uNum] )
			// ��ĭ�� ä��ÿ�: �� Ʈ���� ���̰� �Ȱ��ٸ� vNum�� HEIGHT�� 1����
			HEIGHT[vNum] = HEIGHT[vNum] +1;
		// �� Ʈ���� ���̰� �ٸ��ٸ� ū�ʿ� �������� ���δ�.
		if ( HEIGHT[uNum] > HEIGHT[vNum] ) {
			int temp = uNum;
			uNum = vNum;// ��ĭ�� ä��ÿ�: uNum ���� vNum ���� �ٲ�
			vNum = temp;// ��ĭ�� ä��ÿ�: uNum ���� vNum ���� �ٲ�
		}
		PARENT[uNum] = vNum;// ��ĭ�� ä��ÿ�: PARENT�� uNum��° ���� vNum���� ����
	}

	// ������ Find ���� �޼ҵ� (v �� ���� ���հ� u �� ���� ������ �ٸ����� �˻�, ������ false �ٸ��� true)
	// ���� ���տ� ������ �ʴ´ٸ� Union ������ �ϵ��� �Ѵ�. ��, true ���ǿ����� Union()�� �ϰ� �ȴ�.
	public boolean find(char v, char u) {
		int vNum = -1, uNum = -1;

		// v�� u�� index���� vNum �� uNum �� ã�´�.
		for (int i = 0; i < VALUE.length; i++) {
			if ( VALUE[i] == v ) vNum = i;
			else if ( VALUE[i] == u ) uNum = i;

			if ( vNum != -1 && uNum != -1 ) {
				break;
			}
		}

		// v�� root �� ã�´�. //���� �θ��� ���� �ִٸ�...
		while(PARENT[vNum] > -1) {
			vNum = HEIGHT[vNum];// ��ĭ�� ä��ÿ�: v�� root�� ã�´�.
		}

		// u�� root �� ã�´�. //���� �θ��� ���� �ִٸ�...
		while(PARENT[uNum] > -1) {
			uNum = HEIGHT[uNum];// ��ĭ�� ä��ÿ�: u�� root�� ã�´�.
		}

		// �ΰ��� ���� ������ �ƴϸ� �� ����Ŭ�� �ƴ϶�� union �� ���ش�.
		//vNum = uNum�̸� ������ ���տ� ���� �����Ƿ� ����Ŭ�� ������
		if ( vNum != uNum ) {
			union(vNum, uNum);
			return true;
		}
		return false;
	}

	//toString�� ��ü�� ���� ������ִ� ����. ���⼭ ����� ���¸� ����
	public String toString() {
		String str = "";
		for (int i = 0 ; i < VALUE.length ;i++) {

			String k = "Root";
			if ( PARENT[i] != -1 )
				k = String.valueOf(VALUE[PARENT[i]]);

			str += VALUE[i] + " " + k + " " + HEIGHT[i] +"\n";
		}
		return str;
	}
}