import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args){
        //declare parts
        int[] arr={2,7,9,5,1,3,6};
        int[] cp_arr=new int[arr.length];
        Scanner in=new Scanner(System.in);

        //입력부분
        System.out.println("삭제할 위치를 입력해주세요.");
        System.out.println("단 위치는 0에서"+(arr.length-1)+"까지 가능합니다.");
        int delete_index=in.nextInt();

        //앞으로 가야하는 원소들을 앞으로 가는 인덱스로써 다른 배열에 복사를 해둠
        for(int i=delete_index+1; i<arr.length; i++){
            cp_arr[i-1]=arr[i];
        }

        //그리고 복사해둔 배열의 내용을 복사하여 대입함.
        for(int i=delete_index; i<arr.length; i++){
            arr[i]=cp_arr[i];
        }

        //최종적으로 배열의 내용을 출력함.
        System.out.println("바뀐 배열의 내용 출력");
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+"\t");
        }
    }
}
