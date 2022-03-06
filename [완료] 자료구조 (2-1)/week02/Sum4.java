import java.util.Date;


public class Sum4 {
	public static void main(String[] args) {
		try{
			//프로그램 시작시 시간 구하기
			long start=System.currentTimeMillis();
			System.out.println(new Date());
			//중첩 반복문(곱셈)을 생성하여 실행시간을 구함
			long prod=1; long x=1; long n=100;
			for(long i=1; i<=n; i++){
				for(long j=1; j<=n; j++){
					prod*=x;
				}
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
