import java.util.Date;


public class Sum2 {
	public static void main(String[] args) {
		try{
			//���α׷� ���۽� �ð� ���ϱ�
			long start=System.currentTimeMillis();
			System.out.println(new Date());
			long sum=0; long n=100;
			//��ø �ݺ���(����)�� �����Ͽ� ����ð��� ����
			for(long i=1; i<=n; i++){
				for(long j=1; j<=n; j++){
					sum+=0;
				}
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
