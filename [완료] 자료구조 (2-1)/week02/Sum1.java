import java.util.*;

public class Sum1 {
	public static void main(String[] args) {
		try{
			//���α׷� ���۽� �ð� ���ϱ�
			long start=System.currentTimeMillis();
			System.out.println(new Date());
			//�ݺ���(����)�� �����Ͽ� ����ð��� ����
			long sum=0; long n=1000000;
			for(long i=1; i<=n; i++){
				sum+=0;
			}
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
