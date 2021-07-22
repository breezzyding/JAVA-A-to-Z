//自动类型转换：精度小的类型自动转换为精度大的数据类型
//
//char --> int --> long --> float --> double
//
//byte --> short --> int --> long --> float --> double
//
//注意：long 8个字节 
//	   float 4个字节
//	   而float的精度却比long高!!!
//	   	why?
//     	why?
//	   	why?
//	 原因：它们底层的存储结构不同
//	   
//	 float占4个字节，32个二进制位， 
//	 一位表示符号位，8bit表示指数，23bit表示底数，
//	 8位最小是00000000，最大是11111111，范围也就是0 ~ 255。
//	 
//	 而long是8个字节，也就是64位，除去符号位，指数范围是0 ~ 63，
//	 都是直接都用来存数。
//	 
//	 另外，long类型的变量值可以赋值给float类型的变量，
//	 而float类型的变量值不可以直接赋值给long类型的变量，需要进行强制类型转换。
//	 
//	 结论：long的取值范围远远小于float。


//	 	
//	 		
//	 				


public class AutoConvert{
	public static void main(String[] args) {
		//演示自动转换
		int num = 'a';//ok char --> int
		double d1 = 80;//ok  int --> double
		System.out.println(num);//97
		System.out.println(d1);//80.0
	}
}