public class MethodDetail02 {
	public static void main(String[] args) {
		
		//访问修饰符（作用是控制 方法使用的范围）
		//如果不写默认访问（有四种 public protected 默认 private）具体后面在讲
				
		//返回修饰符	
		
		A a = new A();
		a.sayOk();
		a.m1();


	}
}

class A {

	//同一个类中的方法调用： 直接 调用即可
	//
	public void print(int n) {
		System.out.println("println()方法被调用 n=" + n);		
	}

	public void sayOk() {//sayOk调用print
		print(10);
		System.out.println("继续执行sayOk()");		
	}

	//跨类中的方法A类调用B类方法：需要通过对象名调用
	public void m1() {
		//创建B对象，然后在调用方法即可
		System.out.println("m1()方法被调用");
		B b = new B();
		b.hi();

		System.out.println("m1()方法继续执行");
	}
}

class B {

	public void hi() {
		System.out.println("B类中的hi()被执行");
	}

}


	
			
	


