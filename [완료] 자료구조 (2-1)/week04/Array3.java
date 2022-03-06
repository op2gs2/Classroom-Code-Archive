import java.util.*;
public class Array3 {
	public static void main(String[] args) {
		//선언 부분
		Random rand=new Random();
		int[] data; int sum=0;
		data=new int[100];
		//100에서 1000까지의 수를 임의로 배열에 초기화
		//그 후에 sum에 저장된 배열의 값을 더해준다.
		for(int i=0; i<100; i++){
			data[i]=rand.nextInt(1000-99)+100;
			sum+=data[i];
		}
	
		//이제 평균을 구하는 부분
		int ave=sum/data.length;
		System.out.println("평균은 "+ave+" 입니다.");
		
		//평균값보다 큰 수의 개수를 구하기
		int count=0;
		for(int i=0; i<100; i++){
			//평균보다 큰 수를 거르는 조건식
			if(ave<data[i]){
				count++;
				System.out.println("평균보다 큰 수: "+data[i]);
			}
		}
		System.out.println("이하 평균보다 큰 수의 개수: "+count);
	}
}
