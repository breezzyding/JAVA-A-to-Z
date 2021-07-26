/**
 * 课堂练习2
 */
public class ArithmeticOperatorExercise02 {

	//编写一个main方法
	public static void main(String[] args) {
		
		// 1.需求：
		// 假如还有59天放假，问：合XX个星期零XX天
		
		// 2.思路分析
		// (1)使用int变量 days 保存 天数
		// (2)一个星期是7天 星期数weeks：days / 7 零多少天leftdays： days % 7
		// (3)输出
		 
		// 3.走代码
		int days = 59;
		int weeks = days / 7;
		int leftDays = days % 7;

		System.out.println(days + "天 合" + weeks + "个星期零" +
			leftdays + "天");


		//这样写也可以喔
		System.out.println("59天合计为：" + 59/7 + "个星期零" + 59%7 + "天");//59天合计为：合8个星期零3天

		// 1.需求
		// 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为
		// 5/9*（华氏温度-100），请求出华氏温度对应的摄氏温度
		 
		// 2.思路分析
		// (1)先定义一个double huaShi 保存变量 华氏温度
		// (2)根据给出的公式，进行计算即可5/9*（华式温度-100）]
		// 	  考虑数学公式和java语言的特性
		// (3)将得到的结果保存到double sheShi
		 
		// 3.走代码
		double huaShi = 234.6;
		double sheShi = 5 / 9 * (huaShi - 100);
		System.out.println("华氏温度" + huaShi +
			"对应的摄氏温度=" + sheShi);

		

		


	}
}