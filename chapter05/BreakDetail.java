
public class BreakDetail {
	public static void main(String[] args) {		
		
		label1:
		for (int j = 0; j < 4; j++ ) {//���for
		label2:
			for (int i = 0; i < 10 ; i++) {//�ڲ�for
				if (i == 2) {
						break label2;//�ȼ� break label2
						//break label1;//������Ƕ����أ�
					}
					System.out.println("i = " + i);	
					/*
					i = 0
					i = 1
					i = 0
					i = 1
					i = 0
					i = 1
					i = 0
					i = 1
					 */
				}	
		}
		
		
	}
}

/*
	1.break������ָ���Ƴ��Ĳ�
	2.label 1�Ǳ�ǩ �����ɳ���Աָ��
	3.break��ָ�����ĸ�label���˳�������
	4.��ʵ�ʵĿ����У�������Ҫʹ�ñ�ǩ
	5.���û��ָ��break��Ĭ���˳������ѭ����
 */