import java.util.Scanner;

public class Factiter {
    public static void main(String[] args){
        //선언 부분
        Scanner in = new Scanner(System.in);
        //입력 부분
        System.out.println("수를 입력해주세요.");
        long fact_num=in.nextInt();
        //출력 부분
        //반복문을 이용하여 팩토리얼 구현
        long result=1;
        for(long i=1; i<=fact_num; i++){
            result*=i;
        }
        //결과 출력
        System.out.println(result);
    }
}
