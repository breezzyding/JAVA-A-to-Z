public class Homework13 {
	public static void main(String[] args) {
		
		/*
			��ĿҪ��
			1.����һ��Circle�࣬����һ��double�͵�radius���Դ���԰�İ뾶
			  findArea()��������԰�����
			2.����һ����PassObject�������ж���һ������printAreas(),�÷�����
			  �������£�public void printAreas(Circle c, int times)//����ǩ��
			3.��printAreas�����д�ӡ���1��times֮���ÿ��֤��뾶ֵ���Լ���Ӧ�����
			  ���� timesΪ5��������뾶1��2��3��4��5�Լ���Ӧ��Բ���
			4.��main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ
			  �������н������ͼ��ʾ
			  	Radius  Areas
			  	1.0     3.141592653589793
				2.0     12.566370614359172
				3.0     28.274333882308138
				4.0     50.26548245743669
				5.0     78.53981633974483
		 */
		
		Circle c = new Circle();
		PassObject po = new PassObject();

		po.printAreas(c, 5);
		
		
						
	}
}

// 1.����һ��Circle�࣬����һ��double�͵�radius���Դ���԰�İ뾶
// 	 findArea()��������԰�����
class Circle {	

	double radius;

	public Circle() {
		
	}


	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double findArea() {//�������
		return Math.PI * radius * radius;
	}

	//��ӷ���setRadius,�޸Ķ���İ뾶ֵ
	public void setRadius(double radius) {
		this.radius = radius;
	}
		
}

// 2.����һ����PassObject�������ж���һ������printAreas(),�÷�����
// 	 �������£�public void printAreas(Circle c, int times)//����ǩ��
class PassObject {

	public void printAreas(Circle c, int times) {

		System.out.println("Radius\tAreas");

		for (int i = 1; i <= times; i++) {
			c.setRadius(i);//�޸�c����İ뾶ֵ
			c.findArea();
			System.out.println((double)i + "\t" + c.findArea());
		}
	}

}

