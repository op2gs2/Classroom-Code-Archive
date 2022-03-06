import java.util.*;

public class Sum1 {
	public static void main(String[] args) {
		try{
			//프로그램 시작시 시간 구하기
			long start=System.currentTimeMillis();
			System.out.println(new Date());
			//반복문(덧셈)을 생성하여 실행시간을 구함
			long sum=0; long n=1000000;
			for(long i=1; i<=n; i++){
				sum+=0;
			}
			//이후 끝났을 때 시간 구하기
			System.out.println(new Date());
			long end=System.currentTimeMillis();
			//차이를 구하여 전체적인 시간 구하기
			long diff=end-start;
			//차이 출력
			System.out.println("Difference : "+diff);
		} catch (Exception e){
			//모든 예외 생성시, 출력
			System.out.println("An Exception occurs");
		}
	}
}
