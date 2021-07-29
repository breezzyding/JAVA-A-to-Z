//switch分支结构 练习

import java.util.Scanner;

public class SwitchExercise {
	public static void main(String[] args) {

		//习题1
		//使用switch把小写类型的char型转为大写（键盘输入）
		//只转换a,b,c,d,e 其他的输出"other"
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入小写字母：");
		char c1 = myScanner.next().charAt(0);
		switch(c1) {
			case 'a' :
				System.out.println('A');
				break;
			case 'b' :
				System.out.println('B');
				break;
			case 'c' :
				System.out.println('C');
				break;
			case 'd' :
				System.out.println('D');
				break;
			case 'e' :
				System.out.println('E');
				break;
			default:
				System.out.println("other");
		}

		System.out.println("\n");
		

		//习题2
		//对学生成绩大于60分的，输出"合格"。低于60分的
		//输出"不合格"。(注：输入的成绩不能大于100)，提示 成绩/60
		//思路分析
		//1.这道题可以使用分支来完成。但是要求使用switch
		//2.这里我们需要一个转换,编程思路：
		//		如果成绩在[60,100] (int)(score / 60) = 1
		//		如果成绩在[0,60] (int)(score / 60) = 0
		//		
		//		
		//代码实现		

		System.out.println("请输入学生成绩：");
		double score = myScanner.nextDouble();
		if (score >= 0.0 && score <= 100.0) {
			int tag = (int)(score / 60);
		switch (tag) {
			case 0 :
				System.out.println("不合格");
				break;
			case 1 :
				System.out.println("合格");
				break;
			} 
		}else {
			System.out.println("你输入的成绩有误，请重新输入。");
		}

		System.out.println("\n");


		//习题3
		//根据用于指定月份，打印该月份所属的季节，3,4,5春季 6,7,8夏季
		//9,10,11秋季  12,1,2 冬季
		//
		////思路分析
		//1.创建Scanner对象，接受用户输入
		//2.int month 接受输入
		//3.使用switch来匹配，使用穿透来完成，比较简洁
		
		System.out.println("请输入月份：");
		int month = myScanner.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("这是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("这是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("这是秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("这是冬季");
				break;
			default :
				System.out.println("你输入的月份不对(1-12)");
		}
	}
}

//switch 和 if 的比较
//
//1.如果判断的具体数值不多，而且符合byte short int char enum
//	String这6种类型，虽然两个语句都可以使用，建议使用switch语句	
//2.其他情况：对区间判断，对结果为boolean类型判断，使用if，
//	if的范围更广