public class Assignment7 {
    public static void main(String[] args){
        //선언 및 초기화 부분
        int cnt=10;
        int[][] arr=new int[5][4];

        //배열을 초기화 부분.
        for(int row=0; row != 5; row++){
            int index=3; //인덱스 3으로 이동을 시켜주기 위함.
            for(int col=0; col !=4; col++){
                arr[row][index]=cnt++;
                index--;
            }
        }

        // 출력하는 부분
        for(int row=0; row != 5; row++){
            for(int col=0; col !=4; col++){
                System.out.print(arr[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
