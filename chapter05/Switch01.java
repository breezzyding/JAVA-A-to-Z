
import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		/*
		案例
		请编写一个程序，该程序可以接受一个字符，比如：a,b,c,d,e,f,g
		a表示星期一，b表示星期二 …
		根据用户的输入显示相应的信息，要求使用switch语句完成

		思路分析
		1.接受一个字符，创建Scanner对象
		2.使用switch来完成匹配，并输出对应信息

		代码实现

		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（a-g）：");
		char c1 = myScanner.next().charAt(0);//
		//在java中，只要是有值返回，就是一个表达式
		switch(c1) {
			case 'a' :
				System.out.println("今天星期一");
				break;
			case 'b' :
				System.out.println("今天星期二");
				break;
			case 'c' :
				System.out.println("今天星期三");
				break;
			case 'd' :
				System.out.println("今天星期四");
				break;
			case 'e' :
				System.out.println("今天星期五");
				break;
			case 'f' :
				System.out.println("今天星期六");
				break;
			case 'g' :
				System.out.println("今天星期天");
				break;
			default:
				System.out.println("你输入字符不正确，没有匹配的");					
		}

		System.out.println("退出了switch，程序继续执行。");
	}
}	



/*

解读switch
1.switch 关键字 表示 switch 分支
2.表达式 对应一个值
3.case常量1：当表达式的值等于常量1，就执行语句块1
4.break：表示推出switch
5.如果和case常量1匹配，就执行语句块1，如果没有匹配
  就继续匹配case 常量2
 6.如果一个都没有匹配上，执行default

 */

