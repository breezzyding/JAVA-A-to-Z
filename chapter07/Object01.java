import java.util.Scanner;

public class Object01 {
	public static void main(String[] args) {
		
		/*
		����̫������ֻèè��һֻ���ֽ�С�ף�����3�꣬��ɫ
		����һֻ��С��������10�꣬��ɫ�����дһ������
		���û�����Сè������ʱ����ʾ��è�����֣����䣬��ɫ��
		����û������Сè����������ʾ ����̫û����ֻèè��
		 */
		
		//������������� => ���������ݹ���һֻè����Ϣ������ˣ�
		//��һֻè����Ϣ
		/*
			String cat1Name = "С��";
			int cat1Age = 3;
			String cat1Color = "��ɫ";

			//�ڶ�ֻè����Ϣ
			String cat1Name = "С��";
			int cat1Age = 10;
			String cat1Color = "��ɫ";
		*/
		
		//���� ===> 	(1)�����������ֲ�����
		//			(2)ֻ��ͨ�� �±� ��ȡ��Ϣ��
		//				��ɱ����������ݵĶ�Ӧ��ϵ����ȷ
		//			(3)����������µ�����
		/*
		String[] cat1 = {"С��", "3��", "��ɫ"};
		String[] cat2 = {"С��", "10��", "��ɫ"};
		System.out.println("������èè�����֣�");
		Scanner myScanner = new Scanner(System.in);
		String name = myScanner.next();

		if (cat1[0].equals(name)) {
			System.out.println(cat1[0] + " " +cat1[1] + 
				" " + cat1[2]);
		}else if (cat2[0].equals(name)) {
			System.out.println(cat2[0] + " " +cat2[1] + 
				" " + cat2[2]);
		}else {
			System.out.println("����̫û����ֻèè��");
		}

		 */			
		
		//ʹ��OOP���������
		//ʵ����һֻè[����һֻè(����)]
		//���
		//1.new Cat() ����һֻè
		//2.Cat cat1 = new Cat(); �Ѵ�����è���� cat1
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";
		cat1.weight = 10;
		//�����ڶ�ֻè
		//cat2 Ҳ��һ������()
		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 10;
		cat2.color = "��ɫ";
		cat2.weight = 17;

		//��ô���ʶ��������
		System.out.println("��1ֻè��Ϣ��" + cat1.name + 
			" " + cat1.age + " " + cat1.color + " " + cat1.weight);

		System.out.println("��2ֻè��Ϣ��" + cat2.name + 
			" " + cat2.age + " " + cat2.color + " " + cat2.weight);

	}
}


//ʹ���������ķ�ʽ�������è����

//����һ��è�� Cat -> �Զ������������
class Cat {
	//����
	String name;
	int age;
	String color;
	double weight;

	//��Ϊ
}



//���м��������ȱ�����
		//1.���������ݵĹ���
		//2.Ч�ʵ���
		//==========> ����������� ---> ����µ�����



/*
	�������
	��[����,��Ϊ]

	è�ࣨCat�� 	Ҳ���������ͣ��Զ��壩	����Ӧ��è���󣨾����è��
	int    		Java�ṩ����������   		100�������int��
 */


//�������ڴ��д�����ʽ����Ҫ��