public class Method02 {
	public static void main(String[] args) {
		
		//Ϊʲô��Ҫ��Ա����
		
		//�����һ�����飬�������ĸ���Ԫ��ֵ
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};

		//����map����
		//��ͳ�Ľ����ʽ����ֱ�ӱ���
		// for (int i = 0; i < map.length; i++) {
		// 	for (int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + " ");				
		// 	}
		// 	System.out.println();
		// }


		//ȱ�㣺ÿһ�������Ҫ����ʹ���������� ���´��������
		
		//ʹ�÷���������
		MyTools myTools = new MyTools();

		//ʹ�÷���
		myTools.printArr(map);		

		//�ٴδ�ӡ
		myTools.printArr(map);
		
		//�ŵ㣺	1.��ߴ���ĸ�����
		//		2.���Խ�ʵ�ֵ�ϸ�ڷ�װ������Ȼ�������û�������
		

	}
}

//������Ĺ��ܣ�д��һ����ķ����У�Ȼ����ø÷�������
class MyTools {
	//����������һ����ά����
	
	public void printArr(int[][] map) {
		System.out.println("========");
		//�Դ����map�������
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");				
			}
			System.out.println();
		}
	}
} 


//��Ա�����Ķ���ע���
//
//1.�β��б���ʾ��Ա��������cal(int n),getSum(int num1 int num2)
//2.�����������ͣ���ʾ��Ա������� void��ʾû�з���ֵ
//3.�������壺��ʾΪ��ʵ��ĳһ�й��ܴ����
//4.return��䲻�Ǳ����
