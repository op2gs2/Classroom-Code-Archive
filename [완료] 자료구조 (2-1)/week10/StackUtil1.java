import java.util.Stack;

public class StackUtil1 {
	public static void main(String args[]) {
		//Stack Ÿ�� ��ü ������
		Stack s1 = new Stack();
		//�Է��ϱ� ���� Integer�� ��ü ����
		Integer iobj;
		//0~9���� ���ÿ� �Է�
		System.out.println("�����Է¼���: ");
		for (int j = 0; j < 10; j++) {
			iobj = new Integer(j);
			s1.push(iobj);
			iobj = (Integer) s1.peek();
			System.out.println(iobj.intValue() + " ");
		}
		
		//������ �����
		int size = s1.size();
		System.out.println("����ũ��: " + size);
		System.out.println("������¼���: ");
		while (!s1.empty()) {
			iobj = (Integer) s1.pop();
			System.out.println(iobj.intValue() + " ");
		}
	}
}