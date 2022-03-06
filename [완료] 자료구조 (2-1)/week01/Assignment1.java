import java.util.*;

public class Assignment1 {
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

        //output parts
        System.out.println("Sum of score is : "+sum);
        int ave=sum/score.length;
        System.out.println("Average of score is : "+ave);


    }
}
