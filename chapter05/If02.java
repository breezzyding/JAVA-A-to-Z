//if�Ŀ�������
import java.util.Scanner;//����

public class If02 {
	public static void main(String[] args) {
		
		//����
		//��дһ�����򣬿��������˵����䣬�����ͬ־���������18�꣬
		//����������������18��Ҫ���Լ�����Ϊ���������������
		//���������������䲻����ηŹ����ˡ���
		//
		//˼·����
		//1.������������䣬Ӧ�ö���һ��Scanner����
		//2.�����䱣�浽һ������ int age
		//3.ʹ�� if �жϣ������Ӧ��Ϣ
		//4.ʹ��else �����Ӧ��Ϣ
		
		//Ӧ�ö���һ��Scanner����
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������䣺");
		//�����䱣�浽һ������ int age
		int age = myScanner.nextInt();
		//ʹ�� if �жϣ������Ӧ��Ϣ
		//if {}�����ֻ��һ����䣬{}����ʡ��
		//��Ϊ�˱�֤�ṹ���������鲻ʡ��
		if (age > 18) {
			System.out.println("���������18��Ҫ���Լ�����Ϊ�������������");			
		}else {//˫��֧
			System.out.println("������䲻��,��ηŹ����ˡ�");
		}
		
		System.out.println("�������...");
	}
}


//��֧����if-else��ϰ��
//
// 1.�����д��룬���������ָ����������
// int x = 7;
// int y = 4;
// if (x > 5) {
// 	if (y > 5) {
// 		System.out.println(x + y);
// 	}
// 		System.out.println("Do you Mind��");//���������׸裬����Chris Brown
// }else {
// 	System.out.println("x is " + x);
// }
// 
// ����������ǣ�
// Do you Mind��


