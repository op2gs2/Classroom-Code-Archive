import java.util.*;
public class Array1 {
	public static void main(String[] args) {
		//���� �κ�
		Random rand=new Random();
		int[] data; int max;
		data=new int[100];
		
		//100���� 1000������ ���� ���Ƿ� �迭�� �ʱ�ȭ
		for(int i=0; i<100; i++){
			data[i]=rand.nextInt(1000-99)+100;
		}
		
		//���� ū �� ã�� �κ�
		//�켱 ó�� �ʱ�ȭ �� ���� ���� ū ������ �ִ´�.
		max=data[0];
		//�� ���� ������ ū ���� ������ ���� ���غ��� ũ�� max�� �����ϵ��� �Ѵ�.
		for(int i=1; i<100; i++){
			if(data[i]>max){
				max=data[i];
			}
		}
		//���� ū���� ����Ѵ�.
		System.out.println("���� ū ���� :"+max+" �Դϴ�.");
	}

}
