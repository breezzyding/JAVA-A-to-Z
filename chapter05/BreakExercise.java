import java.util.Scanner;


public class BreakExercise {
	public static void main(String[] args) {		
		
		//练习1
		//1.1-100以内的数求和，求出 当和 第一次大于20的当前数（for + break）
		
		//思路分析
		//1.循环1-100，求和 sum
		//2.当 sum > 20时，记录下当前数，然后break 

		int sum = 0;
		for (int i = 1; i <= 100 ; i++ ) {
			sum = sum + i;
			if (sum > 20) {
				System.out.println("和>20时 当前数i=" + i);
				break;				
			}
			//如果在循环外部输出，该怎么做
			//1.int i外放
			//2.int n 循环内 n = i;跳出循环前将i存入n中
			//System.out.println("和>20时 当前数i=" + i);
		}
		
				
		
		//2.实现登录验证，有三次机会，如果用户名为“丁震”，密码为“666”
		//	提示登陆成功，否则提示还有几次机会，请使用for+break完成
			
		
		
		//思路分析
		//1.创建Scanner对象接受用户输入
		//2.定义 String name 和 key 保存用户名和密码
		//3.最多循环3次，如果满足条件 提前退出 break
		//4.定义一般变量 int chance 记录还有几次登陆机会
		Scanner myScanner = new Scanner(System.in);

		String name = "";
		String key = "";
		int chance = 3;//登录一次，就减少一次
		for (int i = 1; i <= 3; i++ ) {
			System.out.println("请输入用户名：");
			name = myScanner.next();
			System.out.println("请输入您的密码：");
			key = myScanner.next();
			chance--;
			//比较输入的名字和密码是否正确
			//补充说明字符串 的内容比较 使用的 方法 equals
			//"丁震".equals(name)(两种办法都可以，推荐使用此法，可避免空指针)
			//name.equals("丁震")
			if ("丁震".equals(name) && "666".equals(key)) {
				System.out.println("登陆成功！");
				break;
			}else {
				System.out.println("用户名或密码错误，您还有" + chance +
					"次机会。");
			}

			
		}
		


		
		
		
	}
}
