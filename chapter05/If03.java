//分支控制if—else

import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {

		//案例演示
		//请从键盘输入保国同志的芝麻信用分：
		//如果：
		//1.信用分为100分时，输出 信用极好；
		//2.信用分为(80,90]分时，输出 信用优秀；
		//3.信用分为(60,80]分时，输出 信用一般；
		//4.其他情况，输出 信用不及格；
		
		Scanner myScanner = new Scanner(System.in);
		//接受用户数据
		System.out.println("保国，请输入你的芝麻信用分(1-100)：");
		//请思考：如果输入的不是整数，而是hello...
		//==> 这里我们后面可以使用异常处理机制
		int score = myScanner.nextInt();
		//先对输入的信用分，进行以一个范围的有效判断 1-100，否则提示输入错误
				
		
		if (score >= 1 && score <= 100) {
			//多种情况故采用多分支
			if (score == 100) {
				System.out.println("信用极好");
			}else if (score > 80 && score <= 90) {
				System.out.println("信用优秀");
			}else if (score > 60 && score <= 80) {
				System.out.println("信用一般");
			}else {
				System.out.println("信用不及格");
			}

		}else {
			System.out.println("信用分需要在1-100，请重新输入 :) ");
		}
		
	}
}	



//阅读下面代码，S1：看看输出什么

// boolean b = ture;
// if(b == false) //【S2：如果写成if(b=false)能编译通过吗？如果能，结果是多少？】
// 	System.out.println("a");
// else if (b) 	--------------------> S1：判断为真
// 	System.out.println("b");--------> S1：执行 
// else if (!b) --------------------> S2：判断为真
// 	System.out.println("c");--------> S2：执行 
// else
// 	System.out.println("d");
// 	
// 	S1：输出 b
// 	S2：输出 c
// 	
// 	
