/*
�������ϰ
 */

public class ArrayExercise01 {
	public static void main(String[] args) {
		

		//����һ��char���͵�26��Ԫ�ص����飬�ֱ����'A'-'Z',ʹ��forѭ������
		//����Ԫ�ش�ӡ��������ʾ��char������������'A' + 1 -> 'B'
		
		char[] letters = new char[26];

		//����
		for (int i = 0;i < letters.length; i++) {
			//letters �� letters[]
			//letters[i] �� char
			letters[i] = (char)('A' + i);//'A' + i��int ��Ҫǿ��ת��
		}
		//���
		for (int i = 0;i < letters.length; i++) {
			System.out.print(letters[i] + " ");
		}
		
	}
}