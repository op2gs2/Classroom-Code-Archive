public class Fibiter {
    public static void main(String[] args) {
        //피보나치 수열 불러오기
        for (int i = 10; i <= 50; i += 10) {
        	//시간 재기 시작점
            long time1=System.currentTimeMillis();
            long temp = fibiter(i);
            System.out.println("피보나치 수열 " + i + "는 " + temp + "입니다.");
          //시간 재기 끝점
            long time2=System.currentTimeMillis();
          //시간 출력
            System.out.println((time2-time1)/1000.0);
        }
    }

    // 피보나치 수열을 반복문으로써 계산
    public static long fibiter(int temp) {
        long num = 1, num2 = 1, result = 0;
        for (int i = 1; i < temp; i++) {
            result = num + num2;
            num = num2;
            num2 = result;
        }
        return num;
    }
}

