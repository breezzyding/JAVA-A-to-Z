public class FloatDetail {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//Java的浮点型常量（具体值）默认为double型，声明float型常量须后加‘f'或‘F’
		// float num1 = 1.1;//对不对？错误
		float num2 = 1.1F;//对的
		double num3 = 1.1;//对
		double num4 = 1.1f;//对

		//十进制数形式： 如5.12  512.0f    .512（必须有小数点）
		double num5 = .123;//等价0.123
		System.out.println(num5);

		//科学计数法形式： 5.12e2 [5.12*10^2]  5.12E-2
		System.out.println(5.12e2);//512.0  //5.12是double,计算完成后依然是double
		System.out.println(5.12E-2);//0.0512
		
		//通常情况下，应该使用double型，因为它比float型更精确。
		//[举例说明]double num9 = 2.1234567851;float num10 = 2.1234567851F;
		double num9 = 2.1234567851;
		float num10 = 2.1234567851F;
		System.out.println(num9);//精度高，小数点后面全部保留
		System.out.println(num10);
		//建议：如果不知道数据的精度，推荐使用double
		
		
		
		//浮点数使用陷阱：2.7 和 8.1 / 3 比较
		//看看一段代码
		double num11 = 2.7;
		double num12 = 2.7; //8.1 / 3 //2.7
		System.out.println(num11);//2.7
		System.out.println(num12);//接近2.7的一个小数，而不是2.7
		//得到一个重要的使用点：当我们对运算结果是小数，进行相等判断时，要小心
		//应该是以两个数的差值的绝对值，在某一个精度范围内判断
		if( num11 == num12) {
			System.out.println(" num11 == num12 相等");
		}
		//正确的写法
		if (Math.abs(num11 - num12) < 0.001) {
		 	System.out.println("差值非常小，到我的规定精度，认为相等...");
			
		}
		//可以通过java API
		System.out.println(Math.abs(num11 - num12));
	

		//细节：如果是直接查询得到的小数或者直接赋值，是可以判断相等
	}


}
