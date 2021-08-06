//成员方法

public class Method01 {
	public static void main(String[] args) {
		//方法使用
		//1.方法写好后，如果不去调用，不会输出
		//2.先创建对象，然后调用方法即可
		Person p1 = new Person();
		p1.speak();//调用方法
		p1.cal01();//调用cal01方法
		p1.cal02(1000);//调用cal02方法 同时 n = 1000

		int returnRes = p1.getSum(10,20);//调用getSum方法 同时num1 = 10 num2 = 20
		System.out.println("getSum方法返回的值=" + returnRes);
	}
}


class Person {

	String name;
	int age;
	//方法（成员方法）
	//添加speak成员方法，输出“我是一个好人”
	//解读
	//1.public表示方法是公开的
	//2.void表示方法没有返回值
	//3.speak() speak是方法名，()形参列表
	//4.{}方法体 可以写我们要执行的代码
	//5.System.out.println("我是一个好人");表示我们的方法就是输出一句话
	public void speak() {
		System.out.println("我是一个好人");
	}

	//添加cal01成员方法，可以计算从 1+...+100的结果
	public void cal01() {
		//循环完成 1+...+100 的计算
		int res = 0;
		for (int i = 1; i <= 1000; i++) {
			res += i;
		}
		System.out.println("cal01方法 计算结果=" + res);
	}

	//添加cal02成员方法，该方法可以接收一个数n,计算 1+...+n 的结果
	//解读
	//1.（int n）形参列表，表示当前有一个形参n,可以接收用户的输入
	public void cal02(int n) {
		//循环完成 1+...+n 的计算
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("cal02方法 计算结果=" + res);
	}

	//添加getSum成员方法，可以计算两个数的和
	//解读
	//1.public表示方法是公开的
	//2.int表示方法执行后，返回一个 int 值
	//3.getSum方法名
	//4.（int num1， int num2）形参列表 2个形参，
	// 	可以接收用户传入的两个数
	//5.return res;表示把 res的值 返回
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}

}


//方法的调用机制原理
//
//1.当程序执行到方法时，就会开辟一个独立的空间（栈空间）
//2.当方法执行完毕，或者执行到return语句时，就会返回
//3.返回到调用方法的地方
//4.返回后，继续执行方法后面的代码
//5.当main方法（栈）执行完毕，整个程序退出