public class Fiborec {
    public static void main(String[] args){
        //시간 재기 시작점
        
        //fibiter함수를 반복실행(호출)하기 위한 반복문
        for(int i=10; i<=50; i+=10){
        	//시간 재기 시작점
        	long time1=System.currentTimeMillis();
            int temp=fibiter(i);
            System.out.println("피보나치 수열 "+i+"는 "+temp+"입니다.");
          //시간 재기 끝점
            long time2=System.currentTimeMillis();
          //시간 출력
            System.out.println((time2-time1)/1000.0);
        }
        
        
    }

    //피보나치 수열을 재귀 함수로써 구현(값을 구함)
    public static int fibiter(int temp){
        if (temp==0){
            return 0;
        }
        if(temp==1){
            return 1;
        }
        return fibiter(temp-1)+fibiter(temp-2);
    }
}
