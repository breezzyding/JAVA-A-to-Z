public class MiGong {
	public static void main(String[] args) {
		
		//˼·
		//1.�ö�ά���鴴���Թ���int[][] map = new int[8][7];
		//2.�涨map�����Ԫ��ֵ��0 ��ʾ������ 1 ��ʾ���ϰ���
		
		int[][] map = new int[8][7];
		//3.���������һ�к��������һ�У�ȫ������Ϊ1
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;//��һ��
			map[7][i] = 1;//���һ��
		}
		//4.���������һ�к��������һ�У�ȫ������Ϊ1
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


		//ʹ��findWayg��������·
		T t1 = new T();

		t1.findWay(map, 1, 1);

		System.out.println("\n=====��·���������=====");
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//���һ��
			}
			System.out.println();
		}


		// t1.findWay2(map, 1, 1);

		// System.out.println("\n=====��·���������=====");
		
		// for (int i = 0; i < 7; i++) {
		// 	for (int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + " ");//���һ��
		// 	}
		// 	System.out.println();
		// }



	}
}



class T {

	//ʹ�õݹ���ݵ�˼�������������Թ�
	
	
	//���
	//1.findWay��������ר�����ҳ��Թ���·��
	//2.����ҵ����ͷ���true�����򷵻�false
	//3.map���Ƕ�ά���飬����ʾ�Թ�
	//4.i,j ���������λ�ã���ʼ����λ��Ϊ��1��1��
	//5.��Ϊ�����ǵݹ���·�����Թ涨map�������ֵ�ĺ���
	//	0��ʾ������ 1 ��ʾ�ϰ��� 2 ��ʾ������ͨ(�߹�) 3 ��ʾ�߹��������߲�ͨ ����·
	//6.��map[6][5]=2 ��˵��ͨ·�ˣ��Ϳ��Խ���������ͼ�����
	//7.��ȷ��������·���� ��->��->��->��
	public boolean findWay(int[][] map, int i, int j) {

		if (map[6][5] == 2) {//˵���Ѿ��ҵ�
			return true;			
		} else {
			if (map[i][j] == 0) {//��ǰ���λ��0����ʾ������
				//���Ǽٶ�������ͨ
				map[i][j] = 2;
				//ʹ����·���ԣ���ȷ����λ���Ƿ���Ŀ�����ͨ
				//��->��->��->��
				if(findWay(map, i + 1, j)) {//��������
					return true;
				} else if (findWay(map, i, j + 1)) {//��
					return true;
				} else if (findWay(map, i - 1, j)) {//��
					return true;
				} else if (findWay(map, i, j - 1)) {//��
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

	//�ı���� ��->��->��->�� 
	public boolean findWay2(int[][] map, int i, int j) {

		if (map[6][5] == 2) {//˵���Ѿ��ҵ�
			return true;			
		} else {
			if (map[i][j] == 0) {//��ǰ���λ��0����ʾ������
				//���Ǽٶ�������ͨ
				map[i][j] = 2;
				//ʹ����·���ԣ���ȷ����λ���Ƿ���Ŀ�����ͨ
				//��->��->��->��
				if(findWay2(map, i - 1 , j)) {//��������
					return true;
				} else if (findWay2(map, i, j + 1)) {//��
					return true;
				} else if (findWay2(map, i + 1, j)) {//��
					return true;
				} else if (findWay2(map, i, j - 1)) {//��
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


}

//���������·��
//˼·
//(1)���
//(2)ͼ->������·��




