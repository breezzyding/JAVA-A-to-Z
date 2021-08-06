public class PropertiesDetail {
	public static void main(String[] args) {

	//创建 Person对象
	//p1 是对象名（对象引用）
	//new Person() 创建的对象空间（数据）才是真正的对象
	Person p1 = new Person();

	//对象的属性默认值，遵守数组规则;
	
	System.out.println("\n当前这个人的信息");
	System.out.println("age=" + p1.age + " name=" + p1.name +
		" salay=" + p1.salay + " isPass=" + p1.isPass);
	}//int-0 String-null sdouble-0.0 boolean-false
}

class Person {//
	//四个属性
	int age;
	String name;
	double salay;
	boolean isPass;
}


//Java内存结构分析
//1.栈：一般存放基本数据类型（局部变量）
//2.堆：存放对象 (Cat cat，数组等)
//3.方法区:常量池(常量，比如字符串) 类加载信息
//4.示意图:[Cat (name,age,price)]
//
//Java创建对象的流程简单分析
// Person p = new Person;
// p.name = "jack";
// p.age = 10;
//1.先加载Person类信息（属性和方法信息，只会加载一次）
//2.在 堆 中分配空间，进行默认初始化（看规则）
//3.把地址赋给p，p就指向对象
//4.进行制定初始化，比如p.name = "jack" p.age = 10
//
//
//练习题
//
// Person a = new Person(); 	创建对象
// a.age = 10;					属性age 赋值
// a.name = "小萌";				属性name 赋值
// Person b;					没有给空间
// b = a;						但将a的地址给了b 都指向a了
// System.out.println(b.name);	输出：小萌
// b.age = 200;					a.b 的age 都变 200
// b = null;					无了
// System.out.println(a.age);	200
// System.out.println(b.age);	异常（制空了）
// 
// 
// 