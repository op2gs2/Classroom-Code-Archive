package er;
import java.util.*;
public class StudentTest {
	public static void main(String[] args) {
		//Scanner ��ü ����
		Scanner in =new Scanner(System.in);
		//stu ��ü�� �����ϰ� �ʿ��� �� �޾Ƴ���
		System.out.println("�й�, ����/����/���� ������ �Է����ּ���.");
		Student stu = new Student(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
		//��� ���
		stu.print();
		//Scanner ��ü ����
		in.close();
	}

}
