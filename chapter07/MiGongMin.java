public class MiGongMin {
	public static void main(String[] args) {
		
		//��ʼ���Թ�
		int[][] map = new int[8][7];

		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;//��һ��
			map[7][i] = 1;//���һ��
		}

		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;//��һ��
			map[i][6] = 1;//���һ��		
		}

		//�����������ϰ���
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;//����һ������

		//�����ǰ�ĵ�ͼ
		System.out.println("=====��ǰ��ͼ�����=====");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//���һ��
			}
			System.out.println();
		}
		

		//����Maze�࣬��ʹ���䷽��
		Maze myMaze = new Maze();

		//ʹ�ò���1���Թ� ��ͳ�Ʋ���
		myMaze.findWay1(map, 1, 1);

		//�����ǰ�ĵ�ͼ
		System.out.println("=====��ǰ��ͼ�����=====");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//���һ��
			}
			System.out.println();
		}

		//���÷���restartMaze�����Թ�
		myMaze.restarMaze(map);

		//ʹ�ò���2���Թ� ��ͳ�Ʋ���
		myMaze.findWay2(map, 1, 1);

		//�����ǰ�ĵ�ͼ
		System.out.println("=====��ǰ��ͼ�����=====");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//���һ��
			}
			System.out.println();
		}

		//���÷���restartMaze�����Թ�
		myMaze.restarMaze(map);

		



	}
}

class Maze {

	//�����Թ�
	public void restarMaze(int[][] map) {
		//�����ϰ����Χǽ֮��ĵ㶼����
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < map[i].length; j++) {				
				if(i == 2 && j == 2 || i == 3 && j == 1 || i == 3 && j == 2) {
					//�����ϰ���
					map[i][j] = 1;
				} else {
					map[i][j] = 0;
				}
			}			
		}

		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;//��һ��
			map[7][i] = 1;//���һ��
		}

		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;//��һ��
			map[i][6] = 1;//���һ��		
		}

		

		//��ӡ��ͼ����ʾ���óɹ�
		System.out.println("=====�Թ�������=====");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//���һ��
			}
			System.out.println();
		}
	}


	//����1 ��->��->��->��         11��
	public boolean findWay1(int[][] map, int i, int j) {

		if (map[6][5] == 2) {//˵���Ѿ��ҵ�
			return true;			
		} else {
			if (map[i][j] == 0) {//��ǰ���λ��0����ʾ������
				//���Ǽٶ�������ͨ
				map[i][j] = 2;
				//ʹ����·���ԣ���ȷ����λ���Ƿ���Ŀ�����ͨ
				//��->��->��->��
				if(findWay1(map, i + 1, j)) {//��������
					return true;
				} else if (findWay1(map, i, j + 1)) {//��
					return true;
				} else if (findWay1(map, i - 1, j)) {//��
					return true;
				} else if (findWay1(map, i, j - 1)) {//��
					return true;
				} else {
					map[i][j] = 3;//�߹� �߲�ͨ
					return false;
				}
			} else {//map[i][j] = 1/2/3
				return false;
			}
		}
	}

	//����2 ��->��->��->��
	public boolean findWay2(int[][] map, int i, int j) {

		if (map[6][5] == 2) {//˵���Ѿ��ҵ�
			return true;			
		} else {
			if (map[i][j] == 0) {//��ǰ���λ��0����ʾ������
				//���Ǽٶ�������ͨ
				map[i][j] = 2;
				//ʹ����·���ԣ���ȷ����λ���Ƿ���Ŀ�����ͨ
				//��->��->��->��
				if(findWay2(map, i + 1, j)) {//��������
					return true;
				} else if (findWay2(map, i, j - 1)) {//��
					return true;
				} else if (findWay2(map, i, j + 1)) {//��
					return true;
				} else if (findWay2(map, i - 1, j)) {//��
					return true;
				} else {
					map[i][j] = 3;//�߹� �߲�ͨ
					return false;
				}
			} else {//map[i][j] = 1/2/3
				return false;
			}
		}
	}
	
	//����3
	
	//����4
	
	


}












