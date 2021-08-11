public class Constructor01 {
	public static void main(String[] args) {
		

		/*
			说明
			1.构造器的修饰符可以默认，也可以是public protected private
			2.构造器没有返回值
			3.方法名和类名字必须一样
			4.参数列表和成员方法一样的规则
			5.构造器的调用 由系统完成
		 */
		
		//当new一个对象时，直接通过构造器指定名字和年龄
		Person p1 = new Person("smith", 80);
		System.out.println("p1的信息如下:");
		System.out.println("p1对象name=" + p1.name);
		System.out.println("p1对象age=" + p1.age);

	}
}

//在创建Person类的对象时，就直接指定这个对象的年龄和姓名
//
class Person {
	String name;
	int age;

	//构造器
	//1.没有返回类型 也不能写void
	//2.构造器的名字和类民要相同
	//3.String pName, int pAge 是构造器的形参列表 规则和成员方法一样
	public Person (String pName, int pAge) {
		System.out.println("构造器已被调用~~完成对象属性的初始化");
		name = pName;
		age = pAge;
	}
}





/*
	总结
	
	构造器 constructor 
	是类的一种特殊方法
	是完成对新对象的初始化
	特点：
	1)方法名和类名相同
	2)没有返回值
	3)在创建对象时，系统会自动的调用该类的构造器完成对	对象的初始化
 */