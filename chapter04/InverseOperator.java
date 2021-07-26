/**
 * 演示逻辑运算符的使用
 */
public class InverseOperator {

	//编写一个main方法
	public static void main(String[] args) {
		
		// 取反 ! 和 逻辑异或 ^ 案例演示
		 
		// !的规则: T => F  ,  F => T		
		System.out.println(60 > 20);//T
		System.out.println(!(60 > 20));//F

		// a^b的规则:当 a 和 b 不同时，则结果为ture，否则为false
		boolean b1 = (10 > 1) ^ (3 < 5);
		System.out.println("b1=" + b1);//F
		boolean b2 = (10 < 1) ^ (3 < 5);
		System.out.println("b2=" + b2);//T


	}
}

// 练习题
// 
// 题目1
// int x = 5;
// int y = 5;
// if (x++ == 6 & ++y == 6){
// 		x = 11;
// }
// System.out.println("x=" + x + ",y=" + y);//答案：x=6,y=6
// 
// 题目2
// int x = 5;
// int y = 5;
// if (x++ == 6 && ++y == 6){
// 		x = 11;
// }
// System.out.println("x=" + x + ",y=" + y);//答案：x=6,y=5
// 
// 题目3
// int x = 5;
// int y = 5;
// if (x++ == 5 | ++y == 5){
// 		x = 11;
// }
// System.out.println("x=" + x + ",y=" + y);//答案：x=11,y=6
// 
// 题目4
// int x = 5;
// int y = 5;
// if (x++ == 5 || ++y == 5){
// 		x = 11;
// }
// System.out.println("x=" + x + ",y=" + y);//答案：x=11,y=5
// 
// 题目5
// boolean x = ture;
// boolean y = false;
// short z = 46;
// if (z++ == 46 && y = ture) {
// 		z++;
// }
// if (x = false || ++z == 49) {
// 		z++;
// }
// System.out.println("z=" + z);//50