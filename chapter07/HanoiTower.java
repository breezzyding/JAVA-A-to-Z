public class HanoiTower {

	public static void main(String[] args) {
		
 	Tower tower = new Tower();

 	tower.move(5, 'A', 'B', 'C');

	}
}

class Tower {

	//����
	//num��ʾҪ�ƶ��ĸ��� a,b,c�ֱ��ʾA�� B�� C��
	public void move(int num, char a, char b, char c) {//��һ��λ������ʼλ�ã��ڶ���λ���ǽ���λ�ã�������λ����Ŀ��λ��
		//���ֻ��һ���� num = 1
		if (num == 1) {
			System.out.println(a + "->" + c);
		} else {
			//����ж���̣����Կ���������ĺ��������������(num - 1)������
			//(1)���ƶ��������е��̵�B(����C)
			move(num - 1, a, c, b);
			//(2)���������������� �ƶ���C
			System.out.println(a + "->" + c);
			//(3)�ٰ�B���������̣��ƶ���C������A
			move(num - 1, b, a, c);
		}
	}
}

