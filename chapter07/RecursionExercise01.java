public class RecursionExercise01 {
	public static void main(String[] args) {
		
		
		Exercise exercise = new Exercise();

		//斐波拉契
		int n = 9;
		int res = exercise.fibonacci(n);
		if (res != -1) {
			System.out.println("当n = " + n + "对应的斐波拉契=" + res);
		} 
		
		
		//猴子吃桃问题
		int days = 1;
		int peachesNum= exercise.peaches(days);
		if (peachesNum != -1) {
				System.out.println("第"+ days + "天时共有" + peachesNum + "个桃子。");	
		}	
		

	}
}

class Exercise {
	//请使用递归的方式求出斐波拉契数1,1,2,3,5,8,13...给你一个整数，求出它的值是多少？
	//思路分析
	//1.当n=1 fibonacci 1
	//2.当n=2 fibonacci 1
	//3.当n >=3 fibonacci 为前两个数之和
	//
	public int fibonacci(int n) {
		if(n >= 1) {
			if (n == 1 || n ==2) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else{
			System.out.println("要求输入的n>=1的整数");
			return -1; 
		}
	}
		


	//猴子吃桃问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
	//以后每天猴子都吃其中的一半，然后再多吃了一个。当到第十天时，再想吃时（即还没吃呢），
	//发现只有1个桃子了。问最初共多少个桃子？
	public int peaches(int days) {
		if (days == 10) {
			return 1;			
		} else if (days >= 1 && days <= 9) {
			return (peaches(days + 1) + 1) * 2;
		} else {
			System.out.println("days应在在1-10内");
			return -1;
		}
	}
}

