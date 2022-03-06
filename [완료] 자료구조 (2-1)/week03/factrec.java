import java.util.Scanner;

public class factrec {
    public static void main(String[] args){
        //선언 부분
        Scanner in = new Scanner(System.in);
        //입력 부분
        System.out.println("수를 입력해주세요.");
        long fact_num=in.nextInt();
        //출력 부분
        long result=factrec(fact_num);
        System.out.println(result);

    }

    //팩토리얼을 재귀적으로 수행하는 함수
    public static long factrec(long temp){
        if(temp==0){
            return 1;
        }

        return temp*factrec(temp-1);
    }
}
