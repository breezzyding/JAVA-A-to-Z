

public class Homework09 {
	public static void main(String[] args) {
		
		//求出1+(1+2)+(1+2+3)+.....(1+2+3+4+..+100)的和	

		//思路1分析
		//1.每一项是 int former = former + i
		//2.int i 从1-100
		//2.int sum 求和
		
		// int former = 0;
		// int sum = 0;

		// for (int i = 1; i <= 100 ; i++ ) {
			
		// 	former += i;	
		// 	sum += former;
		// }	
		// System.out.println("1+(1+2)+(1+2+3)+...+(1+2+3+4+...+100)的和为" + sum); 
	
		//思路2分析
		//1.一共有100项相加
		//2.每一项的数字在逐渐增加
		//3.很像一个双层循环
		//	i可以表示第几项，同时也是当前项的最后一个数
		//4.使用sum 进行累和
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1;j <= i; j++) {//内层对1-i进行循环
				sum += j;
			}		
		// 
		}
	System.out.println("1+(1+2)+(1+2+3)+...+(1+2+3+4+...+100)的和为" + sum); 
	}
}