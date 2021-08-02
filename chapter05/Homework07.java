

public class Homework08 {
	public static void main(String[] args) {
		
		//输出小写的a-z以及大写的Z-A
			
		
		// int small = 97;//从小写a开始
		// int big = 90;//从大写Z开始
		// for (int i = small; i <= 122 ; i++ ) {
		// 		System.out.println((char)i); 
		// 	}
		// for (int i = big; i >= 65 ; i-- ) {
		// 		System.out.println((char)i); 
		// 	}

		//另一种写法
		for (char c1 = 'a'; c1 <= 'z' ; c1++ ) {
				System.out.println(c1 + " "); 
			}	
		for (char c1 = 'Z'; c1 >= 'A' ; c1-- ) {
				System.out.println(c1 + " "); 
			}
	}
}