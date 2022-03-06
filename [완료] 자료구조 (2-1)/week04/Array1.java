import java.util.*;
public class Array1 {
	public static void main(String[] args) {
		//선언 부분
		Random rand=new Random();
		int[] data; int max;
		data=new int[100];
		
		//100에서 1000까지의 수를 임의로 배열에 초기화
		for(int i=0; i<100; i++){
			data[i]=rand.nextInt(1000-99)+100;
		}
		
		//가장 큰 값 찾는 부분
		//우선 처음 초기화 한 수를 가장 큰 값으로 넣는다.
		max=data[0];
		//그 다음 이전의 큰 값고 현재의 값을 비교해보고 크면 max에 저장하도록 한다.
		for(int i=1; i<100; i++){
			if(data[i]>max){
				max=data[i];
			}
		}
		//가장 큰수를 출력한다.
		System.out.println("가장 큰 수는 :"+max+" 입니다.");
	}

}
