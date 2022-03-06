public class maze {
	static int reached = 0;
	static int[][] check = new int[7][7];
	static int maze[][] = { { 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1, 0, 1 },
			{ 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 0, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1, 1 } };

	static void back(int x, int y) {
		if (reached == 1)
			return; // 목적지에도착했으면처리없이return
		System.out.printf("(%d,%d)\n", x, y); // stack의이동상황을출력해주는출력문
		if (x == 5 && y == 5) {
			reached = 1;
			return;
		}
		check[x][y] = 1; // 현재위치방문했기때문에, check
		if (maze[x + 1][y] == 0 && check[x + 1][y] == 0)
			back(x + 1, y); // 아래로
		if (maze[x - 1][y] == 0 && check[x - 1][y] == 0)
			back(x - 1, y); // 위로
		if (maze[x][y + 1] == 0 && check[x][y + 1] == 0)
			back(x, y + 1); // 오른쪽으로
		if (maze[x][y - 1] == 0 && check[x][y - 1] == 0)
			back(x, y - 1); // 왼쪽으로
		check[x][y] = 0;
	}

	public static void main(String[] args) {
		back(1, 1);
	}
}