public class Assignment2 {
    public static void main(String[] args) {
        //선언 부분
        int[] column = new int[5];
        int[] row = new int[4];
        int[][] number = new int[4][5];
        int cnt=1;

        // 초기화 부분
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = 0; j < column.length - 1; j++) {
                number[i][j] = cnt++;
            }
        }
        // 각 행의 총합
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = 0; j < column.length - 1; j++) {
                number[i][4] += number[i][j];
            }
        }

        // 각 열의 총합
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = 0; j < column.length - 1; j++) {
                number[3][j] += number[i][j];
            }
        }

        // 마지막 총합
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = 0; j < column.length - 1; j++) {
                number[3][4] += number[i][j];
            }
        }

        // 최종 출력
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                System.out.print(number[i][j] + "\t");
            }
            System.out.println();
        }
    }
}