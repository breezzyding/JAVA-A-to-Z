/**
 * 演示逻辑运算符的使用
 */
public class LogicOperator02 {

	//编写一个main方法
	public static void main(String[] args) {
		
		// 短路或（||） 和 逻辑或（|） 案例演示 
		// 规则相同：一真则真，同假才假
		
		// ||    
		int age = 50;
		if(age > 20 || age < 30) {
			System.out.println("ok 1");
		}
		

		// |		
		if(age > 20 && age < 30) {
			System.out.println("ok 2");
		}

		//区别
		//(1) ||短路或：如果第一个条件为true
		//则第二个条件不会判断，最终结果为ture，效率高
		//
		int a = 4;
		int b = 9;
		if(a > 1 || ++b > 4) {
			System.out.println("ok 3");
		}
		System.out.println("a=" + a + " " + "b=" + b);//a=4 b=9

		// 对于&逻辑与而言，如果第一个条件false，后面的条件仍然会判断
		if(a > 1 | ++b < 4) {
			System.out.println("ok 3");
		}
		System.out.println("a=" + a + " " + "b=" + b);//a=4 b=10

		//总结：在开发中我们一般使用&&，效率更高
	}
}