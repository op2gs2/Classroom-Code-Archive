import java.util.Scanner;

public class divtwo {
    public static void main(String[] args){
        //선언부분
        Scanner in=new Scanner(System.in);

        //숫자 입력부분
        System.out.println("숫자 입력 단 1보다 크고 2의 제곱의 수이여만 한다.");
        long temp=in.nextLong(), result=0;

        //조건분기 부분
        //먼저 1이하인 것을 거른 뒤
        Outter:
        if(temp>1){
            long two=1;
            while(true){
                //2의 제곱이 되는 수를 지속적으로 만들어
                two*=2;
                //이 수가 입력한 수와 맞으면 해당함수를 실행한다.
                if(two==temp){
                   result=divtwo(temp);
                   break;
                }
                //다만 2의 제곱이 되는 수가 입력한 수보다 커지면 의미 없으므로
                //커질 경우 멈추고 다시 입력하라는 출력문을 띄워준다.
                else if(two>temp){
                    System.out.println("2의 제곱의 수를 입력해주세요.");
                    break Outter;
                }
            }
            // 그리고 결과를 출력해준다.
            System.out.println(result);
        }
        //1이하 인 수는 이렇게 메세지를 출력시켜준다.
        else{
            System.out.println("1보다 큰 수를 입력해주세요.");
        }
    }

    //주어진 식을 재귀의 형태로써 구현함.
    static long divtwo(long temp){
        //basic part
        if(temp==1){
            return 1;
        }

        //recursion part
            return 2*divtwo(temp/2)+1;


    }
}
