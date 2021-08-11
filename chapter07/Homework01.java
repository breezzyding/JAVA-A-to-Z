public class Homework01 {
	public static void main(String[] args) {
		
		//编写类A01,定义方法max，实现求某个double数组的最大值
		//并返回
		
		A01 a01 = new A01();
		double[] arr = {7.35, 30.13, 17.24};
		//double[] arr = null;
		double res = a01.max(arr);

		if (res != null) {
			System.out.println("这个数组中的最大值是" + res);
		} else {
			System.out.println("这个数组的输入有误，数组不能为null，或者{}");
		}
		
		
	}
}

class A01 {

	public double max(double[] arr) {
		//先判断arr是否为空
		if (arr != null && arr.length > 0) {//保证arr至少有一个元素			
		
			double max = arr[0];//假设第一个元素就是最大值
			for (int i = 0; i < arr.length; i++) {//遍历数组
				if (max < arr[i]) {
					max = arr[i];
				}
			}

			return max;
		} else {
			return null;
		}
	}
}