/*
数组的引出
 */

public class Array01 {
	public static void main(String[] args) {
		/*
		它们的体重分别是3kg 5kg 1kg 3.4kg 2kg 50kg
		请问这六只鸡的总体重是多少？平均体重是多少？

		思路分析
		1.定义六个变量 double 求和 得到总体重
		2.平均体重 = 总体重 / 6
		3.分析传统实现的方式问题  6 -> 600 -> 566
		4.可以利用数组解决
		 */
		

		// double hen1 = 3;
		// double hen2 = 5;
		// double hen3 = 1;
		// double hen4 = 3.4;
		// double hen5 = 2;
		// double hen6 = 50;

		// double totalWeight = hen1 + hen2 + hen3 + 
		// 	hen4 + hen5 + hen6;

		// double avgWeight = totalWeight / 6;
		// System.out.println("总体重=" + totalWeight + 
		// 	"平均体重=" + avgWeight);



		//数组
		//可以存放多个 同一类型 的数据	。
		//数组也是一种数据类型，是引用类型。
		//数（数据）组（一组）就是一组数据。
		
		//比如，我们可以用数组来解决上述问题
		//
		//定义一个数组
		//解读：
		//1.double[] 表示是double类型的数组 数组名 hens
		//2.{3, 5, 1, 3.4, 2, 50}表示数组的值/元素，
		//	依次表示数组的第几个元素
		double[] hens = {3, 5, 1, 3.4, 2, 50};

		//遍历数组得到数组的所有元素的和 使用for
		//解读
		//1.我们可以通过 hens[下标] 来访问数组的元素
		//	下表是从0开始编号的 比如第一个元素就是hens[0]
		//2.通过for就可以循环的访问数组的元素/值
		//3.使用一个变量 totalWeight将各个元素累积	
		System.out.println("数组的长度= " + hens.length);

		//先死后活 循环次数
		double totalWeight = 0;	
		for (int i = 0; i < hens.length; i++) {
			//System.out.println("第" + (i + 1) + "元素的值=" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("总体重=" + totalWeight + 
			"平均体重=" + (totalWeight / hens.length));
	}
}