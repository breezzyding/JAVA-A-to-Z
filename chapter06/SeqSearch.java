
import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		
		//��һ�����У���üӥ�� ��ëʨ�� �������� ��������
		//�Ӽ�������������һ�����ƣ��ж��������Ƿ����������[˳�����]
		//Ҫ������ҵ��ˣ�����ʾ�ҵ��ˣ��������±�
		
		//˼·����
		//1.����һ���ַ�������
		//2.�����û����룬�������飬��һ�Ƚϣ������
		//	����ʾ��Ϣ�����˳�
				
		//����һ���ַ�������
		String[] names = {"��üӥ��", "��ëʨ��", "��������", "��������"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����뷨�������֣�");
		String findName = myScanner.next();
		boolean flag = true;

		//��������
		for (int i = 0;i < names.length; i++) {
			if (findName.equals(names[i])) {
				System.out.println("�ҵ��÷�����" + findName);
				System.out.println("�÷���������Ϊ" + i);												
				flag = false;
				break;
			}			
		}
		if (flag == true) {
			System.out.println("�����ϲ��޸÷�����");
		}
	}
}