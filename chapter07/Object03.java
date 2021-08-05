public class Object03 {
	public static void main(String[] args) {

		Person p1 = new Person();//这时候里面存放默认值！！！
		p1.age = 10;
		p1.name = "小明";
		Person p2 = p1;//p1 赋给了 p2
		System.out.println(p2.age);
		//请问p2.age究竟是多少？并画出内存图
		//10

	}
}

class Person {
	String name;
	int age;
}


//如何创建对象
//
//1.先声明再创建
//
//Cat cat;
//cat = new Cat();
//
//2.直接创建
//
//Cat cat = new Cat();
//
//
//如何访问属性
//
//对象名.属性