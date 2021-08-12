import java.util.Random;
import java.util.Scanner;

public class MoraGame {

	//测试
	public static void main(String[] args) {
		
		/*
			题目要求：
			有个人Tom设计他的成员变量，成员方法，可以电脑猜拳，电脑每次
			都会随机生成0，1，2
			0 表示  石头 1表示 剪刀 2表示 布
			并要可以显示Tom的输赢次数（清单）假设玩3次
	

		 */
		
		//创建一个玩家对象
		Tom t = new Tom();
		//用来记录最后输赢的次数
		int isWinCount = 0;
		//游戏的局数
		int gameCount = 3;

		//创建一个二维数组，用来接收局数，Tom出拳情况以及电脑出拳情况
		int[][] arr1 = new int [gameCount][gameCount];
		int j = 0;

		//创建一个一维数组，用来接收输赢情况
		String[] arr2 = new String[gameCount];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < gameCount; i++) {//i-表示第几局

			//获取玩家的出拳结果
			System.out.println("请输入你想要出的拳 (0-拳头, 1-剪刀, 2-布):");
			int num = scanner.nextInt();//保存玩家输入的拳
			t.setTomGuessNum(num);//设置TomGuessNum
			int tomGuess = t.getTomGuessNum();//玩家对象t在调用，保存TomGuessNum
			arr1[i][j + 1] = tomGuess;// j + 1 表示第二列 用于存放玩家的出拳结果

			//获取电脑的出拳结果
			int comGuess = t.computerNum();
			arr1[i][j + 2] = comGuess;// j + 1 表示第三列 用于存放电脑的出拳结果
		
			//对比玩家和电脑的出拳结果，保存在isWin中
			String isWin = t.vsComputer();

			//用一维数组arr2存放结果
			arr2[i] = isWin;
			//用二维数组的第一列存放局数
			arr1[i][j] = t.count;

			//对每一局的情况进行输出
			System.out.println("================================================");
			System.out.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");
			System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" + isWin);			;
			System.out.println("================================================");
			System.out.println("\n\n");
			isWinCount = t.winCountNum(isWin);
		}


		//对游戏的最终结果进行输出	
		System.out.println("局数\t玩家的出拳\t电脑的出拳\t\t输赢情况");
		for (int a = 0; a < arr1.length; a++) {
			for (int b = 0; b < arr1[a].length; b++) {
					System.out.print(arr1[a][b] + "\t\t");//局数 玩家的出拳 电脑的出拳	
			}

			System.out.println(arr2[a]);//输赢情况
			System.out.println();			
		}
		System.out.println("你赢了" + isWinCount + "次");			
	}
}

//Tom类
class Tom {	

	//玩家出拳的类型
	int tomGuessNum;//0,1,2
	//电脑出拳的类型
	int comGuessNum;//0,1,2
	//玩家赢的次数
	int winCountNum;
	//比赛的次数
	int count = 1;	//一共比赛三次

	public void showInfo() {
		//...
	}

	//电脑随机生成猜拳的数字的方法
	public int computerNum() {
		Random r = new Random();//创建一个Random对象
		comGuessNum = r.nextInt(3);// 方法 返回0-2的随机数
		// System.out.println(comGuessNum);
		return comGuessNum;
	}

	public void setTomGuessNum(int tomGuessNum) {
		if (tomGuessNum > 2 || tomGuessNum < 0) {//超出0,1,2
			//抛出异常
			throw new IllegalArgumentException("数字输入有误");			
		}
		this.tomGuessNum = tomGuessNum;
	}

	public int getTomGuessNum() {
		return tomGuessNum;
	}
	
	//比较猜拳结果 0-石头 1-剪刀 2-布
	public String vsComputer() {

		if (tomGuessNum == 0 && comGuessNum == 1) {//人-石头 机-剪刀
			return "你赢了！";
		} else if (tomGuessNum == 1 && comGuessNum == 2) {//人-剪刀 机-布
			return "你赢了！";
		} else if (tomGuessNum == 2 && comGuessNum == 0) {//人-布 机-石头
			return "你赢了！";
		} else if (tomGuessNum == comGuessNum) {//平局
			return "平局。";
		} else {
			return "你输了！";
		}
	}

	public int winCountNum(String s) {
		count++;	//控制玩的次数
		if (s.equals("你赢了！")) {	//统计赢的次数
			winCountNum++;
		}
		return winCountNum;
	}	
	 
		
}




