public class Homework04 {
	public static void main(String[] args) {
		
		/*
			编写类A03 实现数组的复制功能copyArr，输入旧数组
			返回一个新数组，元素和旧数组一样
		 */
		
		A03 a03 = new A03();
		
		int[] oldArr = {7, 17, 35};

		System.out.println("====oldArr数组====");
		for (int i = 0; i < oldArr.length; i++) {
			System.out.print(oldArr[i] + "\t");
		}

		System.out.println();

		int[] newArr = a03.copyArr(oldArr);	

		System.out.println("====newArr数组====");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}
		
		
	}
}

class A03 {

	public int[] copyArr(int[] oldArr) {
		
		int[] newArr = new int[oldArr.length];//开辟空间

		for (int i = 0; i < oldArr.length; i++) {//遍历数组
			newArr[i] = oldArr[i];
		}		

		return newArr;

	}
}