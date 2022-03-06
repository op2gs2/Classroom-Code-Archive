import java.util.*;

public class Assignment3 {
    public static void main(String[] args){
        //declare parts
        int[] arr=new int[6];
        int[] cp_arr=new int[6];
        int cnt=(cp_arr.length-1);
        Scanner in=new Scanner(System.in);

        //insert number to array
        System.out.println("insert "+arr.length+" numbers");
        for(int i=0; i<arr.length; i++){
            arr[i]=in.nextInt();
        }

        //print inserted array
        System.out.println("array before change.");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");

        //copy the element to other element each of them.
        //when coping it, index is switch opposite number.
        for(int i=0; i<arr.length; i++){
            cp_arr[cnt--]=arr[i];
        }

        //print changed array
        System.out.println("Array after change");
        for(int i=0; i<arr.length; i++){
            System.out.print(cp_arr[i]+"\t");
        }
    }
}
