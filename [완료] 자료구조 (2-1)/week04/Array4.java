
public class Array4 {
	public static void main(String[] args) {
		//선언부분
		int cnt=10;
		int[][] arr=new int[4][3];
		
		for(int row=0; row!=arr.length; row++){
			for(int col=0; col!=arr[0].length; col++){
				arr[row][col]=cnt++;
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println();
		}
	}

}
