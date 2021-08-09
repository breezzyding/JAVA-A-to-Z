public class MethodParameter02 {
	public static void main(String[] args) {
		
		/*
			成员方法传参机制
		 */
		
		//测试1
		B b = new B();
		int[] arr = {17, 35, 35, 30};
		b.test100(arr);

		System.out.println("====调用结束后原数组是否改变====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//与基本数据类型不同，main方法中的数组arr也被修改
		
		//测试2
		Person p = new Person();
		p.name = "kevin";
		p.age = 17;

		b.test200(p);
		System.out.println("\nmain的p.age的值为" + p.age);//25
														 //null 后 输出什么？
														 //17

	}
}

class Person {
	String name;
	int age;
	double salay;
}

class B {

	//编写一个方法test100，可以接收一个数组，在方法中修改数组，
	//看看原来的数组是否变化？
	public void test100(int[] arr) {

		System.out.println("====修改前的数组如下====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		arr[1] = 7;//修改数组

		System.out.println("====修改后的数组如下====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	//编写一个方法test200，可以接收一个Person(age,salay)对象，
	//在方法中修改对象属性，看看原来的对象是否变化？
	public void test200(Person p) {
		//p.age = 25;//修改对象属性
		//思考
		p = null;
	}
}