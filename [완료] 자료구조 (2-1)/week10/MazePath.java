import java.util.*;
import java.util.Stack;

class MazeCell {
	int i;
	int j;
	int dir;

	public MazeCell(int _i, int _j, int _dir) {
		i = _i;
		j = _j;
		dir = _dir;
	}

	public String toString() {
		return "<" + i + "," + j + "," + dir + ">";
	}
}

public class MazePath {
	private int[][] maze = { { 1, 1, 1, 1, 1, 1, 1, 1, 1 },// 1
			{ 1, 0, 1, 1, 0, 1, 1, 1, 1 },// 2
			{ 1, 0, 0, 1, 0, 1, 1, 1, 1 },// 3
			{ 1, 1, 0, 0, 0, 1, 1, 1, 1 },// 4
			{ 1, 1, 1, 0, 0, 0, 1, 1, 1 },// 5
			{ 1, 0, 0, 0, 1, 1, 1, 1, 1 },// 6
			{ 1, 1, 0, 1, 0, 0, 0, 1, 1 },// 7
			{ 1, 0, 0, 0, 0, 1, 0, 0, 1 },// 8
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1 } // 9
	};
	private int[][] move = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };// 북 동 남
																		// 서
	private int m = maze.length - 2;
	private int n = maze[0].length - 2;
	int mark[][] = new int[maze.length][maze[0].length];
	Stack st = new Stack();

	Stack st1 = new Stack(); // 올바른 경로 삽입 할 스택

	public MazePath() {
		st.push(new MazeCell(1, 1, 1));// 초기 출발 위치 및 방향 설정
		while (st.isEmpty() != true) {
			MazeCell mc = (MazeCell) st.pop(); // 지나온 경로를 pop함
			while (mc.dir <= 3) {
				int nextI = mc.i + move[mc.dir][0];// 다음에 시도 할 행(i)를 설정
				int nextJ = mc.j + move[mc.dir][1];// 다음에 시도 할 열(j)를 설정
				if (nextI == m && nextJ == n) {// 미로 경로 발견
					System.out.println("The Path is as follows");
					st.push(new MazeCell(mc.i, mc.j, mc.dir));// 마지막 경로 지정
					st.push(new MazeCell(nextI, nextJ, 0));// 마지막 지점 지정
					while (st.isEmpty() != true) {
						st1.push((MazeCell) st.pop());
						mc = (MazeCell) st.pop();
						maze[mc.i][mc.j] = 9;
						System.out.println(mc);
					}
					while (st1.isEmpty() != true) {
						mc = (MazeCell) st1.pop();// 올바른 경로 출력
						maze[mc.i][mc.j] = 9;
						System.out.println(mc);
					}
					displayMaze();// 경로 확인 완료후 출력
					return;
				}
				if (maze[nextI][nextJ] == 0 && mark[nextI][nextJ] == 0) { // 이동가능
																			// &
																			// 시도해보지않은위치
					mark[nextI][nextJ] = 1;
					st.push(new MazeCell(mc.i, mc.j, mc.dir)); // 지나온 경로를 스택에
																// push
					st.push(new MazeCell(nextI, nextJ, 0)); // 새로운 위치와 방향 설정
					// 방향은 초기화
					mc.i = nextI;
					mc.j = nextJ;
					mc.dir = 0;
				} else {
					mc.dir++;
				}// Else
			}// while

		}
		System.out.println("there is no path");
	}

	public void displayMaze() {
		String[] str = { "x", "x", "9" };
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
			//	System.out.print(str[(maze[i][j])]);
				System.out.print((maze[i][j]));
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		new MazePath();
	}
}
