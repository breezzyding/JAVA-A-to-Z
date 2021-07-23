//自动类型转换
public class ForceConvertDetail{
	
	public static void main(String[] args) {
		
		//演示强制类型转换
		//强强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
		//int x = (int)10 * 3.5 + 6 * 1.5;//double --> int  编译错误
		int x =  (int)(10 * 3.5 + 6 * 1.5);// (int)44.0 --> 44
		System.out.println(x);
		
		//char类型可以保存int的常量值，但不能保存int的变量值，需要强转
		char c1 = 100;//ok
		int m = 100;//ok
		//char c2 = m;//错误
		char c3 = (char)m;//ok
		System.out.println(c3);//100对应的字符，d字符

		//byte short char类型在进行运算是会被当作int处理

	}
}



//基本数据类型转换--练习题
//
//判断是否能够通过编译
//1.short s = 12;//ok
//	s = s - 9;//错误  int --> short
//	
//2.byte b = 10;//ok
// 	b = b + 11;//错误 int --> byte
// 	b = (byte)(b+11);//ok 强转
// 	
//3.char c = 'a';//ok
//	int i = 16;//ok
//	float d = .314F;//ok
//	double result = c + i + d;//ok float --> double
//
//4.byte b = 16;//ok
//	short s = 14;//ok
//	short t = s + b; //错误	int --> short