import java.util.Scanner;

public class Assignment1_1 {
    public static void main(String[] args){
        //declare parts
        Scanner in = new Scanner(System.in);
        int[] score = new int[10];
        int sum=0; //It will save sum of score

        //input parts
        for(int i=0; i<score.length; i++){
            System.out.print("Input scores");
            score[i]=in.nextInt();
            sum+=score[i];
        }

        //print result & calculate average.
        System.out.println("Sum of score is : "+sum);
        int ave=sum/score.length;
        System.out.println("Average of score is : "+ave);

        /*여기까지가 Assignment1의 소스코드 였음.*/

        //declare parts
        //가장 큰 값과 작은 값을 각각 가장 작거나 크게 초기화하여, 앞으로의 작업이 용이하게함.
        int max=-2133244235;
        int min=2138934235;

        //Compare to other value with max and min.
        for(int j=0; j<score.length; j++){
            if(max<score[j]){
                max=score[j];
            }

            if(min>score[j]) {
                min = score[j];
            }
        }

        //Print result
        System.out.println("Bigger one is : "+max);
        System.out.print("Smaller one is : "+min);
    }
}
