public class Homework05 {
	public static void main(String[] args) {
		
		/*
			定义一个圈类Circle，定义属性：半径，提供显示圆周长功能的方法
			提示显示圆面积的方法
		 */
		
		Circle circle = new Circle(3.0);			

		System.out.println("此圆的周长=" + circle.circumference());
		System.out.println("此圆的面积=" + circle.circularArea());
		
		
	}
}

class Circle {

	double radius;//定义属性

	public Circle(double radius) {
		this.radius = radius;
	}

	public double circumference() {//计算周长
		
		return radius * 2 * Math.PI;
	}

	public double circularArea() {//计算圆面积

		return radius * radius * Math.PI;
	}
}