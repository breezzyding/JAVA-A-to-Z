
public class Test {
	public static void main(String[] args) {		
		
		//随机生成1-100的一个数，直到生成了35这个数，看看你一共用了几次？
		
		for (int i = 1; i <= 10; i++ ) {				
				System.out.println((int)(Math.random() * 100));		
			}
		
	}
}