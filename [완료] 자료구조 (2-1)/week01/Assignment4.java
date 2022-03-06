import java.util.*;

public class Assignment4 {
    public static void main(String[] args){
        //declare parts
        int[] arr={6,3,1,9,7,2,4};
        int[] cp_arr=new int[arr.length];
        Scanner in=new Scanner(System.in);

        //입력부분
        System.out.println("바꿀 위치와 수를 입력해주세요.");
        System.out.println("단 위치는 "+(arr.length-1)+"까지 가능합니다.");
        int change_index=in.nextInt();
        int change_num=in.nextInt();

        //밀리는 수들을 밀리는 인덱스로 다른 배열에 복사 해둠.
        for(int i=change_index; i<arr.length; i++){
            if(i==(arr.length-1)){
                break;
            }
            cp_arr[i+1]=arr[i];
        }

        //해당하는 자리와 수를 배열에 입력
        arr[change_index]=change_num;

        //그리고 복사해둔 배열의 내용을 복사하여 대입함.
        for(int i=change_index+1; i<arr.length; i++){
            arr[i]=cp_arr[i];
        }

        //최종적으로 배열의 내용을 출력함.
        System.out.println("바뀐 배열의 내용 출력");
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+"\t");
        }
    }
}
