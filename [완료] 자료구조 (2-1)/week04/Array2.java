import java.util.Random;

public class Array2{
	public static void main(String[] args) {
		//���� �κ�
		Random rand=new Random();
		int[] data; int sum=0;
		data=new int[100];
		//100���� 1000������ ���� ���Ƿ� �迭�� �ʱ�ȭ
		//�� �Ŀ� sum�� ����� �迭�� ���� �����ش�.
		for(int i=0; i<100; i++){
			data[i]=rand.nextInt(1000-99)+100;
			sum+=data[i];
		}
	
		//���� ����� ���ϴ� �κ�
		int ave=sum/data.length;
		System.out.println("����� "+ave+" �Դϴ�.");
	}
}