//ð������


public class BubbleSort {
	public static void main(String[] args) {
		
		//���������24 69 80 57 13
		//ʹ��ð�����򷨽����ų�һ����С�������������
		
		/*
			Round 1		 	
			1st 24 69 80 57 13    	//4�αȽ�
			2rd 24 69 80 57 13
			3nd 24 69 57 80 13
			4th 24 69 57 13 80
			Round 2
			1st 24 69 57 13 80		//3�αȽϣ������ѱ�ȷ����
			2rd 24 57 69 13 80
			3nd 24 57 13 69 80
			Round 3
			1st 24 57 13 69 80		//���ֹ���				
			2rd 24 13 57 69 80
			Round 4
			1st 13 24 57 69 80
		 */
		


		//���ڲ���flag�Ƿ�ɹ���
		//int[] sequence = {24, 69, 80, 99};
		
		
		
		int[] sequence = {24, 69, -80, 57, 13, -1, 35, 17, 30, 99};
		int temp = 0;//���ڸ�������
		boolean flag = true;

		for (int i = 0; i < sequence.length - 1; i++) {		
			
			for (int j =  0; j < sequence.length - 1- i; j++) {//(sequence.length - 1 - i)�αȽ�
				if (sequence[j] > sequence[j + 1]) {
					temp = sequence[j];
					sequence[j] = sequence[j + 1];
					sequence[j + 1] = temp;
					flag = false;//����н������ͼ�������
				}
			}

			//���ÿһ�ֵ��������
			System.out.print("\n====��" + (i + 1) + "��====   ");
			for (int j =  0; j < sequence.length; j++) {
				System.out.print(sequence[j] + "\t");
			}

			if (flag == true) {//û�н�����˵�������Ѿ���˳�����У�����ѭ��
				break;
			}

		}		
		
	}
}