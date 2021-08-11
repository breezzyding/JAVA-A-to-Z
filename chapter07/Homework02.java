public class Homework02 {
	public static void main(String[] args) {
		
		/*
			编写类A02 定义方法find 实现查找某字符串数组中的元素查找，
			并返回索引，如果找不到返回-1		
		 */
		
		A02 a02 = new A02();
		//String[] arr = {"a", "c", "cc", "k", "w"};
		String[] arr = null;

		String str = "cc";		
		// String str = "j";

		int res = a02.find(arr, str);

		if (res == -1) {
			System.out.println("搜寻后，没有找到你要的字符串");
		} else {
			System.out.println("搜寻后，找到你要的字符串。它的下标是" + res);
		}
		
		
	}
}

class A02 {

	public int find(String[] arr, String str) {

		int index = -1;	
		if (arr != null && arr.length > 0) {//判断字符串数组是否为null			
					
			for (int i = 0; i < arr.length; i++) {//遍历数组
				if (str.equals(arr[i])) {//如果找到，返回索引
					index = i;
				}
			}
			return index;//没有找到，返回-1
		} else {
			System.out.println("你的数组是null");
			return index;//没有找到，返回-1
		}
		
	}
}