public class MethodExercise01 {

	public static void main(String[] args) {
		
		AA aa = new AA();

		if(aa.isOdds(2)) {
			System.out.println("是奇数");
		}else {
			System.out.println("是偶数");
		}

		aa.print(4, 4, '#');
	}
}

class AA {
	//1.编写AA,有一个方法：判断一个数是奇数odd还是偶数，返回boolean
		 
	public boolean isOdds(int num) {		
		// if (n % 2 != 0) {			
		// 	return true;			
		// } else {
		// 	return false;
		// }
		
		// return num % 2 != 0 ? true; false;
		// 妙啊
		return num % 2 != 0;
		}

	//2.根据行，列，字符打印对应行数的列数字符，比如：行：4 列：4 字符：#
	//	则打印相应的效果 
	/*
		####
		####
		####
		####
	 */		
	//思路
	//1.方法的返回类型 void
	//2.方法的名字 print
	//3.方法的形参（int row, int col, char c）
	//4.方法体，循环
	public void print(int row, int col, char c) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {//输出每一行
				System.out.print(c);
			}
			System.out.println();
		}
	}


}