public class ThisDetail {
	public static void main(String[] args) {
		
		/*
			1.this关键字可以用来访问本类的属性，方法，构造器
			2.this用于区分当前类的属性和局部变量
			3.访问成员方法的语法：this.方法名（参数列表）
			4.访问构造器语法： this（参数列表）注意只能在构造器中使用
			5.this不能在类定义的外部使用，只能在类定义的方法中使用
		 */
		

		// D d1 = new D();
		// d1.f2();

		D d2 = new D();
		d2.f3();
		
	}
}

class D {

	String name = "xiaoDing";
	int age = 25;

	/*
		访问构造器语法： this（参数列表）
		注意只能在构造器中使用（即只能在构造器中访问另外一个构造器）
	 	
	 	注意：访问构造器语法：如果有this(参数列表)
	 		必须放置第一条语句	
	 */
	
	public D() {
		//这里去访问 D(String name, int age)
		this("jack", 100);//数据类型要和形参列表对应
		System.out.println("D()构造器");			
	}

	public D(String name, int age) {
		System.out.println("D(String name, int age)构造器");
	}




	//细节：访问成员方法的语法：this.方法名（参数列表）
	public void f1() {
		System.out.println("f1()方法..");
	}

	public void f2() {
		System.out.println("f2()方法..");
		//调用本类的f1
		//第一种方式
		f1();
		//第二种方式
		this.f1();
	}

	public void f3() {
		String name = "laoDing";
		int age = 75;
		//传统方式	就近原则
		System.out.println("name=" + name + " age=" + age);
		//也可通过this访问属性	this准确指向属性
		System.out.println("name=" + this.name + " age=" + this.age);
	}
}