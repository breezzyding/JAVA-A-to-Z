public class Homework01 {
	public static void main(String[] args) {
		
		//ĳ����100,000Ԫ��ÿ����һ��·�ڣ���Ҫ���ѣ��������£�
		//1)���ֽ�>50000ʱ��ÿ�ν�5%
		//2)���ֽ�<=50000ʱ��ÿ�ν�1000
		//��̼�����˿��Ծ������ٴ�·�ڣ�Ҫ��ʹ��while break��ʽ���
		
		//˼·����
		//1.���� double money ���� 100000
		//2.�������Ҫ�����Ƿ����������������
		//	money > 50000
		//	money >= 1000 money <= 50000 
		//	money < 1000
		//3.ʹ�ö��֧ if-elseif-else	
		//4.while + break[money < 1000],ͬʱʹ��count���������
		//	
		double money = 100000;
		
		int count = 0;//��¼��·�ڵĴ���
		while(true) {
			if (money > 50000) {//��·��
				money *= 0.95;//�������
				count++;//��¼����
			} else if (money >= 1000) {
				money -= 1000;//�������
				count++;//��¼����
			} else {//Ǯ����
				break;
			}
		System.out.println("���˿��Ծ���" + count + "��·��");
		System.out.println("���˻�ʣ" + money + "Ԫ");
	}
	
}