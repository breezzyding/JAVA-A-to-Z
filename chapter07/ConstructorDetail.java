public class ConstructorDetail {
	public static void main(String[] args) {
		
		/*
			细节
			1.一个类可以定义多个不同的构造器，即构造器重载
			  比如：可以再给Person类定义一个构造器，用来创建
			  对象的时候，只指定人名，不需要指定年龄
			2.构造器名和类名要相同
			3.构造器没有返回值
			4.构造器是完成对象的初始化，并不是创建对象
			5.在创建对象时，系统自动的调用该类的构造方法
		 	6.如果程序员没有定义构造方法，系统会自动给类生成一个默认无参构造器
		 	 （默认构造方法）比如Dog(){} 使用java指令反编译看看
		 	7.一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的
		 	 无参构造器，除非显式的定义一下，即Dog(){}

		 */
		
		Person p1 = new Person("ding", 25);//第一个构造器
		
		Person p2 = new Person("breezy");//第二个构造器
	
		Dog d1 = new Dog();//使用的是默认的无参构造器

	}
}


class Person {

	String name;
	int age;

	//第一个构造器
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}

	//第二个构造器（只指定人名，不需要指定年龄）
	public Person(String pName) {
		name = pName;		
	}
}

class Dog {
	//如果程序员没有定义构造方法，系统会自动给类生成一个默认无参构造器
	//使用java指令反编译看看
	/*
		默认构造器
		Dog() {
	
		}
		//形参列表空
		//构造体也空
	 */
	
	//一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的
	//无参构造器，除非显式的定义一下，即Dog(){}
	public Dog(String name) {

	}

	Dog() {//显示的定义一下 无参构造器

	}
}