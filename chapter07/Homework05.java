public class Homework05 {
	public static void main(String[] args) {
		
		/*
			����һ��Ȧ��Circle���������ԣ��뾶���ṩ��ʾԲ�ܳ����ܵķ���
			��ʾ��ʾԲ����ķ���
		 */
		
		Circle circle = new Circle(3.0);			

		System.out.println("��Բ���ܳ�=" + circle.circumference());
		System.out.println("��Բ�����=" + circle.circularArea());
		
		
	}
}

class Circle {

	double radius;//��������

	public Circle(double radius) {
		this.radius = radius;
	}

	public double circumference() {//�����ܳ�
		
		return radius * 2 * Math.PI;
	}

	public double circularArea() {//����Բ���

		return radius * radius * Math.PI;
	}
}