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
	private int[][] move = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };// �� �� ��
																		// ��
	private int m = maze.length - 2;
	private int n = maze[0].length - 2;
	int mark[][] = new int[maze.length][maze[0].length];
	Stack st = new Stack();

	Stack st1 = new Stack(); // �ùٸ� ��� ���� �� ����

	public MazePath() {
		st.push(new MazeCell(1, 1, 1));// �ʱ� ��� ��ġ �� ���� ����
		while (st.isEmpty() != true) {
			MazeCell mc = (MazeCell) st.pop(); // ������ ��θ� pop��
			while (mc.dir <= 3) {
				int nextI = mc.i + move[mc.dir][0];// ������ �õ� �� ��(i)�� ����
				int nextJ = mc.j + move[mc.dir][1];// ������ �õ� �� ��(j)�� ����
				if (nextI == m && nextJ == n) {// �̷� ��� �߰�
					System.out.println("The Path is as follows");
					st.push(new MazeCell(mc.i, mc.j, mc.dir));// ������ ��� ����
					st.push(new MazeCell(nextI, nextJ, 0));// ������ ���� ����
					while (st.isEmpty() != true) {
						st1.push((MazeCell) st.pop());
						mc = (MazeCell) st.pop();
						maze[mc.i][mc.j] = 9;
						System.out.println(mc);
					}
					while (st1.isEmpty() != true) {
						mc = (MazeCell) st1.pop();// �ùٸ� ��� ���
						maze[mc.i][mc.j] = 9;
						System.out.println(mc);
					}
					displayMaze();// ��� Ȯ�� �Ϸ��� ���
					return;
				}
				if (maze[nextI][nextJ] == 0 && mark[nextI][nextJ] == 0) { // �̵�����
																			// &
																			// �õ��غ���������ġ
					mark[nextI][nextJ] = 1;
					st.push(new MazeCell(mc.i, mc.j, mc.dir)); // ������ ��θ� ���ÿ�
																// push
					st.push(new MazeCell(nextI, nextJ, 0)); // ���ο� ��ġ�� ���� ����
					// ������ �ʱ�ȭ
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
