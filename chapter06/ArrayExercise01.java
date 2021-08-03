/*
数组的练习
 */

public class ArrayExercise01 {
	public static void main(String[] args) {
		

		//创建一个char类型的26个元素的数组，分别放置'A'-'Z',使用for循环访问
		//所有元素打印出来。提示：char类型数据运算'A' + 1 -> 'B'
		
		char[] letters = new char[26];

		//输入
		for (int i = 0;i < letters.length; i++) {
			//letters 是 letters[]
			//letters[i] 是 char
			letters[i] = (char)('A' + i);//'A' + i是int 需要强制转换
		}
		//输出
		for (int i = 0;i < letters.length; i++) {
			System.out.print(letters[i] + " ");
		}
		
	}
}