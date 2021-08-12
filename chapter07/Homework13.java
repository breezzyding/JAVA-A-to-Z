public class Homework13 {
	public static void main(String[] args) {
		
		/*
			题目要求：
			1.定义一个Circle类，包含一个double型的radius属性代表园的半径
			  findArea()方法返回园的面积
			2.定义一个类PassObject，在类中定义一个方法printAreas(),该方法的
			  定义如下：public void printAreas(Circle c, int times)//方法签名
			3.在printAreas方法中打印输出1到times之间的每个证书半径值，以及对应的面积
			  例如 times为5，则输出半径1，2，3，4，5以及对应的圆面积
			4.在main方法中调用printAreas()方法，调用完毕后输出当前半径值
			  程序运行结果，如图所示
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

// 1.定义一个Circle类，包含一个double型的radius属性代表园的半径
// 	 findArea()方法返回园的面积
class Circle {	

	double radius;

	public Circle() {
		
	}


	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double findArea() {//返回面积
		return Math.PI * radius * radius;
	}

	//添加方法setRadius,修改对象的半径值
	public void setRadius(double radius) {
		this.radius = radius;
	}
		
}

// 2.定义一个类PassObject，在类中定义一个方法printAreas(),该方法的
// 	 定义如下：public void printAreas(Circle c, int times)//方法签名
class PassObject {

	public void printAreas(Circle c, int times) {

		System.out.println("Radius\tAreas");

		for (int i = 1; i <= times; i++) {
			c.setRadius(i);//修改c对象的半径值
			c.findArea();
			System.out.println((double)i + "\t" + c.findArea());
		}
	}

}

