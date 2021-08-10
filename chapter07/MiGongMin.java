public class MiGongMin {
	public static void main(String[] args) {
		
		//初始化迷宫
		int[][] map = new int[8][7];

		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;//第一行
			map[7][i] = 1;//最后一行
		}

		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;//第一列
			map[i][6] = 1;//最后一列		
		}

		//单独设置下障碍物
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;//测试一个回溯

		//输出当前的地图
		System.out.println("=====当前地图的情况=====");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}
		

		//创建Maze类，并使用其方法
		Maze myMaze = new Maze();

		//使用策略1走迷宫 并统计步数
		myMaze.findWay1(map, 1, 1);

		//输出当前的地图
		System.out.println("=====当前地图的情况=====");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}

		//调用方法restartMaze重置迷宫
		myMaze.restarMaze(map);

		//使用策略2走迷宫 并统计步数
		myMaze.findWay2(map, 1, 1);

		//输出当前的地图
		System.out.println("=====当前地图的情况=====");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}

		//调用方法restartMaze重置迷宫
		myMaze.restarMaze(map);

		



	}
}

class Maze {

	//重置迷宫
	public void restarMaze(int[][] map) {
		//将除障碍物和围墙之外的点都置零
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < map[i].length; j++) {				
				if(i == 2 && j == 2 || i == 3 && j == 1 || i == 3 && j == 2) {
					//设置障碍物
					map[i][j] = 1;
				} else {
					map[i][j] = 0;
				}
			}			
		}

		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;//第一行
			map[7][i] = 1;//最后一行
		}

		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;//第一列
			map[i][6] = 1;//最后一列		
		}

		

		//打印地图，提示重置成功
		System.out.println("=====迷宫已重置=====");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}
	}


	//策略1 下->右->上->左         11步
	public boolean findWay1(int[][] map, int i, int j) {

		if (map[6][5] == 2) {//说明已经找到
			return true;			
		} else {
			if (map[i][j] == 0) {//当前这个位置0，表示可以走
				//我们假定可以走通
				map[i][j] = 2;
				//使用找路策略，来确定该位置是否真的可以走通
				//下->右->上->左
				if(findWay1(map, i + 1, j)) {//先往下走
					return true;
				} else if (findWay1(map, i, j + 1)) {//右
					return true;
				} else if (findWay1(map, i - 1, j)) {//上
					return true;
				} else if (findWay1(map, i, j - 1)) {//左
					return true;
				} else {
					map[i][j] = 3;//走过 走不通
					return false;
				}
			} else {//map[i][j] = 1/2/3
				return false;
			}
		}
	}

	//策略2 下->左->右->上
	public boolean findWay2(int[][] map, int i, int j) {

		if (map[6][5] == 2) {//说明已经找到
			return true;			
		} else {
			if (map[i][j] == 0) {//当前这个位置0，表示可以走
				//我们假定可以走通
				map[i][j] = 2;
				//使用找路策略，来确定该位置是否真的可以走通
				//下->右->上->左
				if(findWay2(map, i + 1, j)) {//先往下走
					return true;
				} else if (findWay2(map, i, j - 1)) {//左
					return true;
				} else if (findWay2(map, i, j + 1)) {//右
					return true;
				} else if (findWay2(map, i - 1, j)) {//上
					return true;
				} else {
					map[i][j] = 3;//走过 走不通
					return false;
				}
			} else {//map[i][j] = 1/2/3
				return false;
			}
		}
	}
	
	//策略3
	
	//策略4
	
	


}












