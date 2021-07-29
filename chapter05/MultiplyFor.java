/*
多重for的嵌套使用演示
 */


public class MultiplyFor {
	public static void main(String[] args) {
		
		for ( int i = 0; i < 2 ; i++ ) {
			for (int j = 0; j < 3 ; j++ ) {
				System.out.println("i=" + i + "j=" + j);
			}
		}
	}
}