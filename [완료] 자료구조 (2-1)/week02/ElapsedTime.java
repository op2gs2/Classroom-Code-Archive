import java.util.*;

public class ElapsedTime {

	public static void main(String[] args) {
		try{
			//���α׷� ���۽� �ð� ���ϱ�
			long start=System.currentTimeMillis();
			System.out.println(new Date());
			//5�ʵ��� ����
			Thread.sleep(5*1000);
			//���� ������ �� �ð� ���ϱ�
			System.out.println(new Date());
			long end=System.currentTimeMillis();
			//���̸� ���Ͽ� ��ü���� �ð� ���ϱ�
			long diff=end-start;
			//���� ���
			System.out.println("Difference : "+diff);
		} catch (Exception e){
			//��� ���� ������, ���
			System.out.println("An Exception occurs");
		}
	}

}
