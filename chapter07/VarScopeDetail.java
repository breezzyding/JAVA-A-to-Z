public class VarScopeDetail {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		/*
			3.属性生命周期较长，伴随着对象的创建而创建，伴随着对象的消亡而消亡。
			  局部变量，生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而消亡
			  即在一次方法调用过程中
		 */
		
		p.say();//当执行say方法时，say方法的局部变量比如name，会创建，当say执行完毕后
		//name局部变量就消亡，但是属性（全局变量）仍然可以使用


		/*
			4.作用域的范围不同
		 */
		Test test = new Test();
		test.test();//第一种跨类访问对象属性的方法

		test.test2(p);//第二种跨类访问对象属性的方法

		/*
			5.修饰符不同
		 */	



	}
}

class Person {

	//细节：属性可以加修饰符（public protected private..）
	//     局部变量不能加修饰符
	public String name = "Ding";

	public void say() {
		//1.属性和局部变量可以重名，访问时遵循就近原则
		String name = "king";
		// public String name = "king";	
		// 局部变量不能加修饰符	
		System.out.println("say() name=" + name);
	}

	public void hi() {
		//2.在同一个作用域中，比如在同一个成员方法中，两个局部变量，不能重名。
		String address = "成都";	
		// String address = "杭州";	//错误 重复定义变量
		String name = "breezy";	//正确 不同作用域
		System.out.println("say() name=" + name);
	}

}

class Test {

	//全局变量/属性：可以被本类使用，或其他类使用（通过对象调用）
	public void test() {
		Person person = new Person();
		System.out.println(person.name);//Ding
	}

	public void test2(Person p) {		
		System.out.println(p.name);//Ding
	}
}

