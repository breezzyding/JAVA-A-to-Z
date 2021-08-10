public class HanoiTower {

	public static void main(String[] args) {
		
 	Tower tower = new Tower();

 	tower.move(5, 'A', 'B', 'C');

	}
}

class Tower {

	//方法
	//num表示要移动的个数 a,b,c分别表示A塔 B塔 C塔
	public void move(int num, char a, char b, char c) {//第一个位置是起始位置，第二个位置是借助位置，第三个位置是目标位置
		//如果只有一个盘 num = 1
		if (num == 1) {
			System.out.println(a + "->" + c);
		} else {
			//如果有多个盘，可以看成最下面的和其上面的所有盘(num - 1)两部分
			//(1)先移动上面所有的盘到B(借助C)
			move(num - 1, a, c, b);
			//(2)把最下面个的这个盘 移动到C
			System.out.println(a + "->" + c);
			//(3)再把B塔的所有盘，移动到C，借助A
			move(num - 1, b, a, c);
		}
	}
}

