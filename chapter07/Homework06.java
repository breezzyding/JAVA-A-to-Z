public class Homework06 {
	public static void main(String[] args) {
		
		/*
			��̴���һ��Cale�����࣬�����ж�������������ʾ����������
			�����ĸ�����ʵ����ͣ���ˣ��̣�Ҫ�����Ϊ0�Ļ���Ҫ��ʾ��
			�������������󣬷ֱ����
		 */
		
		Cale myCale1 = new Cale(2.4, 0.6);		

		System.out.println("����֮��=" + myCale1.add());
		System.out.println("����֮��=" + myCale1.minus());
		System.out.println("����֮��=" + myCale1.times());		
		System.out.println("����֮��=" + myCale1.dividedBy());
		
		Cale myCale2 = new Cale(2.4, 0.0);

		System.out.println("����֮��=" + myCale2.add());
		System.out.println("����֮��=" + myCale2.minus());
		System.out.println("����֮��=" + myCale2.times());
		Double dividedRes = myCale2.dividedBy();
		if (dividedRes != null) {
			System.out.println("����֮��=" + dividedRes);
		}
		
	}
}

class Cale {

	double n1;
	double n2;

	public Cale(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public double add() {
		return n1 + n2;
	}

	public double minus() {
		return n1 - n2;
	}

	public double times() {
		return n1 * n2;
	}

	public Double dividedBy() {
		
		if (n2 == 0) {
			System.out.println("��������Ϊ0!");	
			//����ʲôֵ��
			//null ����ֱ�ӷ��ظ� double
			//ʹ��Double
			return null;
		} else {
			return n1 / n2;
		}		
	}
}