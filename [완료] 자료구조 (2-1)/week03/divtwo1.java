import java.util.*;
public class divtwo1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("아무정수나 입력");
		long input= in.nextLong(), result=0;
		result=divtwo1(input);
		
		System.out.println("result :"+result);
	}
	
	public static long divtwo1(long temp) {
		if(temp==1)
			return 1;
		else
			return 2*divtwo1(temp/2)+1;
	}

}
