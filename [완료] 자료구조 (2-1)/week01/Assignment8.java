import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args){
        //선언부분
        Scanner in =new Scanner(System.in);
        int[][] score=new int[10][3];

        //배열을 시험성적으로 초기화
        for(int i=0; i<3; i++){
            System.out.println(i+"번째 시험 성적 입력");
            for(int h=0; h<score.length; h++){
                System.out.print(h+"번째 학생의 성적입력.");
                score[h][i]=in.nextInt();
            }
            System.out.println();
        }

        //(1) 각 시험의 평균점수
        System.out.println("각 시험의 평균점수 출력.");
        int[] ave=new int[3]; // 평균을 저장하는 배열
        for(int i=0; i<3; i++){
            for(int h=0; h<score.length; h++){
                ave[i]+=score[h][i];
            }
            ave[i]/=score.length;
            System.out.println(i+"번째 시험의 평균점수: "+ave[i]);
        }

        //(2) 각 학생의 최종성적
        System.out.println("각 학생의 최종성적 출력.");
        int[] stu_ave=new int[score.length];
        for(int i=0; i<score.length; i++){
            for(int j=0; j<score[i].length; j++){
                stu_ave[i]+=score[i][j];
            }
            stu_ave[i]/=score[i].length;
        }

        //(3) 낙제(최종성적 60점 미만)한 학생의 이름과 점수출력
        System.out.println("낙제(최종성적 60점 미만)한 학생의 이름과 점수출력");
        for(int i=0; i<score.length; i++){
            if(stu_ave[i]<60){
                System.out.println("낙제한 학생: "+i+"번째 학생 / 점수: "+stu_ave[i]);
            }
        }
    }
}
