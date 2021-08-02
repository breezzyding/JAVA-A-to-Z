/*
演示return的使用
 */

public class Return01 {
	public static void main(String[] args) {

		for (int i = 1;i <=5;i++) {

			if (i == 3) {
				System.out.println("勒斯雾都！ " + i);
				return;//continue;//break;////比较三个输出结果
				
			}
			System.out.println("Hello World!");
		}
		System.out.println("go on...");		
	}
}



