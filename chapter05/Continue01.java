/*
��ʾcontinue��ʹ��
 */

public class Continue01 {
	public static void main(String[] args) {

		// int i = 1;
		// while (i <= 4) {
		// 	i++;
		// 	if (i == 2) {
		// 		continue;
		// 	}
		// 	System.out.println("i=" + i);//i=3 i=4 i=5
		// }
		


		label1:
		for (int j = 0; j < 4;j++) {
			label2:
			for (int i = 0; i < 10; i++) {
					if(i==2) {
						//�����ֱ����ʲôֵ��������
						//continue;//i=0 i=1 i=3 i=4 ... i=9 X4(�Ĵ�)
						//continue label2;//������һ��
						continue label1;//i=0 i=1 i=0 i=1 i=0 i=1 i=0 i=1
					}
					System.out.println("i= " + i);
				}	
		}
	}
}



