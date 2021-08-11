public class ConstructorExercise {
	public static void main(String[] args) {
		
		Person p1 = new Person();

		//name = null age = 18
		System.out.println("p1的信息 name=" + p1.name + " age=" + p1.age);
		
		Person p2 = new Person("Ding", 25);
		//name = Ding age = 25
		System.out.println("p2的信息 name=" + p2.name + " age=" + p2.age);
	}
}

class Person {
	String name;
	int age;

	//第一个无参构造器：利用构造器设置所有的age属性初始值都是18
	public Person() {
		age = 18;
	}

	//第二个带pName 和 pAge两个参数的构造器
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}


//对象创建的流程分析
/*
	案例
	class Person {//类
	int age = 90;
	String name;

	Person(String n, int a) {//构造器
		name = n;
		age = a;
		}
	}

	Person p = new Person("小倩"， 20);

	流程分析（面试题）
	1.加载Person类信息（Person.class）只会加载一次
	2.在堆中分配空间（地址）
	3.完成对象初始化
		1)默认初始化 age=0 name=null
		2)显示初始化 age=90 name=null
		3)构造器的初始化 age=20 name=小倩
	4.对象在堆中的地址返回给p（对象名，对象的应用）
*/

