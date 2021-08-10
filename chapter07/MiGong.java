public class MiGong {
	public static void main(String[] args) {
		
		//思路
		//1.用二维数组创建迷宫，int[][] map = new int[8][7];
		//2.规定map数组的元素值：0 表示可以走 1 表示有障碍物
		
		int[][] map = new int[8][7];
		//3.将最上面的一行和最下面的一行，全部设置为1
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;//第一行
			map[7][i] = 1;//最后一行
		}
		//4.将最右面的一列和最左面的一列，全部设置为1
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


		//使用findWayg给老鼠找路
		T t1 = new T();

		t1.findWay(map, 1, 1);

		System.out.println("\n=====找路的情况如下=====");
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}


		// t1.findWay2(map, 1, 1);

		// System.out.println("\n=====找路的情况如下=====");
		
		// for (int i = 0; i < 7; i++) {
		// 	for (int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + " ");//输出一行
		// 	}
		// 	System.out.println();
		// }



	}
}



class T {

	//使用递归回溯的思想来解决老鼠出迷宫
	
	
	//解读
	//1.findWay方法就是专门来找出迷宫的路径
	//2.如果找到，就返回true，否则返回false
	//3.map就是二维数组，即表示迷宫
	//4.i,j 就是老鼠的位置，初始化的位置为（1，1）
	//5.因为我们是递归找路，所以规定map数组各个值的含义
	//	0表示可以走 1 表示障碍物 2 表示可以走通(走过) 3 表示走过，但是走不通 是死路
	//6.当map[6][5]=2 就说明通路了，就可以结束，否则就继续找
	//7.先确定老鼠找路策略 下->右->上->左
	public boolean findWay(int[][] map, int i, int j) {

		if (map[6][5] == 2) {//说明已经找到
			return true;			
		} else {
			if (map[i][j] == 0) {//当前这个位置0，表示可以走
				//我们假定可以走通
				map[i][j] = 2;
				//使用找路策略，来确定该位置是否真的可以走通
				//下->右->上->左
				if(findWay(map, i + 1, j)) {//先往下走
					return true;
				} else if (findWay(map, i, j + 1)) {//右
					return true;
				} else if (findWay(map, i - 1, j)) {//上
					return true;
				} else if (findWay(map, i, j - 1)) {//左
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

	//改变策略 上->右->下->左 
	public boolean findWay2(int[][] map, int i, int j) {

		if (map[6][5] == 2) {//说明已经找到
			return true;			
		} else {
			if (map[i][j] == 0) {//当前这个位置0，表示可以走
				//我们假定可以走通
				map[i][j] = 2;
				//使用找路策略，来确定该位置是否真的可以走通
				//下->右->上->左
				if(findWay2(map, i - 1 , j)) {//先往上走
					return true;
				} else if (findWay2(map, i, j + 1)) {//右
					return true;
				} else if (findWay2(map, i + 1, j)) {//下
					return true;
				} else if (findWay2(map, i, j - 1)) {//左
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


}

//如何求出最短路径
//思路
//(1)穷举
//(2)图->求出最短路径




