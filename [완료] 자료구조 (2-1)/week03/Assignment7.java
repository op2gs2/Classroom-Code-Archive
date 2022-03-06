import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args){
        //선언 부분
        Scanner in = new Scanner(System.in);

        //입력 부분
        System.out.println("n 까지의 합을 구합니다. n을 입력해주세요.");
        int n=in.nextInt();

        //결과 받은 뒤 출력
        int result=sumrec(n);
        System.out.println("결과: "+result);
    }

    //n까지의 합을 재귀적인 형태로 제시
    public static int sumrec(int n){
        //n이 1일 때 1을 반환
        if(n==1){
            return 1;
        }
        //나머지는 해당 값을 더해준뒤 거기서 1을 뺀 값을 인수로 넣어 자기자신을 호출함
        //이렇게 하여 나머지 값을 구함
        //이는 팩토리얼의 원리와 비슷함.
        return n+sumrec(n-1);
    }
}
