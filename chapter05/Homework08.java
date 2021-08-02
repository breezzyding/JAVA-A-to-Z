

public class Homework08 {
	public static void main(String[] args) {
		
		//求出1-1/2+1/3-1/4...1/100的和	

		//思路分析
		//1.每一项是 1.0 / i (注意这里一定是1.0)
		//2.符号问题 设置符号 symbol = -1 计算时乘上符号
		
		double sum = 0;
		
		for (int i = 1; i <= 100 ; i++ ) {
			//判断是奇数还是偶数，然后做不同的处理
			if( i % 2 != 0) {//分母都奇数
				sum += (1.0 / i);
			} else {
				sum -= (1.0 / i);
			}				
			
		}	
	System.out.println("1-1/2+1/3-1/4...1/100的和为" + sum); 
	}
}