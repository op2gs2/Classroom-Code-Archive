import java.util.Scanner;

public class binsrch {
    public  static void main(String[] args){
        //탐색의 공간인 배열을 정의하고
        int[] array={1,2,3,4,5,6,7,8,9,10};
        Scanner in = new Scanner(System.in);
        //찾을 수를 입력받아
        System.out.println("어떤 수를 찾으시겠습니까?");
        int key=in.nextInt();
        //찾는 함수를 호출하여 인덱스를 구해
        int index=binsrch(array,key,array[0],array[array.length-1]);
        //구해진 인덱스의 값에따라 출력해준다.
        if(index<0){
            System.out.println("찾을 수 없음");
        }
        else{
            System.out.println((index+1)+"번째, 결과: "+array[index]);
        }

    }

    //탐색 메소드
    public static int binsrch(int[] temp, int key, int left, int right){
        //왼쪽 수보다 오른쪽이 더 커야 순서가 맞음
        if(left<=right){
            //중간 지점을 지정하는 변수
            //양 끝 값에서 2로 나눈 값이다.
            int mid=(left+right)/2;
            //입력받은 값이 mid의 값과 동일 할 경우 mid를 반환함
            if(key==temp[mid]){
                return mid;
            }

            //이하 2가지 과정을 입력받은 값이 mid의 값과 동일 할 경우까지 반복한다.
            //비교를 한 후에 입력값보다 크면 더 적은 쪽으로 mid값을 이동
            else if(key<temp[mid]) return (binsrch(temp, key, left, mid-1));
            //비교를 한 후에 입력값보다 작으면 더 큰쪽으로 mid 값을 이동
            else if(key>temp[mid]) return(binsrch(temp, key, mid+1, right));
        }
        //오른쪽이 더 큰경우는 숫자의 순서가 맞지 않으므로 제외한다.
        else {
            return -1;
        }
        //또한 아무것도 해당이 되지 않는 경우, 이 또한 찾지 못한 경우이므로 -1을 반환해 찾지 못했다는 메시지를 출력시켜준다.
        return -1;
    }
}
