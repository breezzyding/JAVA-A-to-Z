public class Homework08 {
	public static void main(String[] args) {
		
		/*
			下面编译运行后，输出结果是多少？
		 */
		
				
	}
}

public class Test {//共有类

	int count = 9;//属性

	public void count1() {//Test类成员方法
		count = 10;
		System.out.println("count1=" + count);//10
	}

	public void count2() {//Test类成员方法
		System.out.println("count1=" + count++);
	}

	//这是Test类的main方法，任何一个类，都可有main
	public static void main(String[] args) {

		//解读
		//1.new Test() 是匿名对象，匿名对象使用后，就不能使用
		//2.new Test().count1() 创建好匿名对象后，就调用count1()
		new Test().count1();//10
		Test t1 = new Test();
		t1.count2();//9   //t1在调用！
		t1.count2();//10
	}
	
	
}