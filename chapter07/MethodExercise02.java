public class MethodExercise02 {
	public static void main(String[] args) {
		
		//1.��д��MyTools�࣬��дһ���������Դ�ӡ��ά��������ݡ�
		//2.��дһ������copyPerson�����Ը���һ��Person���󣬷��ظ��ƵĶ���
		//  ��¡����ע��Ҫ��õ����¶����ԭ���Ķ��������������ĶԶ���
		//  ֻ�����ǵ�������ͬ
		 
		MyTools myTools = new MyTools();
		int[][] arr = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
		myTools.printArr(arr);

		Person p1 = new Person();
		p1.name = "Ding";
		p1.age = 25;		
		Person p2 = myTools.copyPerson(p1);

		//����p1 �� p2��Person���󣬵��������������Ķ���������ͬ
		System.out.println("p1������ name=" + p1.name + " age=" + p1.age);
		System.out.println("p2������ name=" + p2.name + " age=" + p2.age);
		
		//��ʾ��
		//����ͨ���������Ƚ� ���������Ƿ���һ��
		System.out.println(p1 == p2);//false 

	}
}

class Person {
	String name;
	int age;
	double salay;
}

class MyTools {
		
	public void printArr(int[][] arr) {
		//��ӡ��λ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();	
		}
	}


	public Person copyPerson(Person p1) {
		//����һ��Person����
		Person p2 = new Person();//�����µĶ������ڸ���
		p2.name = p1.name;
		p2.age = p1.age;
		return p2;
	}
}

