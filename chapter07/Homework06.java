public class Homework06 {
	public static void main(String[] args) {
		
		/*
			编程创建一个Cale计算类，在其中定义两个变量表示两个操作数
			定义四个方法实现求和，差，乘，商（要求除数为0的话，要提示）
			并创建两个对象，分别测试
		 */
		
		Cale myCale1 = new Cale(2.4, 0.6);		

		System.out.println("两数之和=" + myCale1.add());
		System.out.println("两数之差=" + myCale1.minus());
		System.out.println("两数之积=" + myCale1.times());		
		System.out.println("两数之商=" + myCale1.dividedBy());
		
		Cale myCale2 = new Cale(2.4, 0.0);

		System.out.println("两数之和=" + myCale2.add());
		System.out.println("两数之差=" + myCale2.minus());
		System.out.println("两数之积=" + myCale2.times());
		Double dividedRes = myCale2.dividedBy();
		if (dividedRes != null) {
			System.out.println("两数之商=" + dividedRes);
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
			System.out.println("除数不能为0!");	
			//返回什么值呢
			//null 不能直接返回给 double
			//使用Double
			return null;
		} else {
			return n1 / n2;
		}		
	}
}