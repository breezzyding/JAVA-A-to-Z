public class VarScope {
	public static void main(String[] args) {
		
		/*
			1.在java编程中，主要的变量就是属性（成员变量）和局部变量
			2.局部变量一般是指在成员方法中定义的变量
			3.java中作用域的分类
				全局变量：也就是属性，作用于为整个类体Cat类：cry eat等
				方法是使用属性
				局部变量：也就是除了属性之外的其他变量，作用域为定义它的代码块中
			4.全局变量可以不复制，直接使用，因为有默认值，局部变量必须赋值后，
			  才能使用，因为没有默认值
		 */
		



	}
}


class Cat {

	//全局变量：也就是属性，作用于为整个类体Cat类：cry eat等方法是使用属性
	//属性在定义时，可以直接赋值
	int age = 10;//制定的值是10

	double weight;//默认值 0.0


	public void cry() {
		//1.局部变量一般是指在成员方法中定义的变量
		//2.n 和 name 就是局部变量
		//3.n 和 name 的作用域就在cry方法中
		int n = 10;

		//局部变量必须赋值才可以使用
		String name = "ding";
		System.out.println("在cry中使用属性 age=" + age);
	}

	public void eat() {		
		System.out.println("在eat中使用属性 age=" + age);

		// System.out.println("在eat中使用cry的变量 name=" + name);
		// 不允许使用

	}
}
