public class MethodDetail01 {
	public static void main(String[] args) {
		
		//访问修饰符（作用是控制 方法使用的范围）
		//如果不写默认访问（有四种 public protected 默认 private）具体后面在讲
				
		//返回修饰符	
		
		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);


	}
}

class AA {

	//1.一个方法最多有一个返回值   (可以通过返回数组的方式来实现返回多个值)
	public int[] getSumAndSub(int n1, int n2) {

		int[] resArr = new int[2];//创建一个数组
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}


	//2.返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)
	
	//3.如果方法要求有返回数据类型，则方法体中最后的执行语句必须为return值，
	//	而且要求返回值类型必须和return的值类型一致或兼容
	public double f1() {
		double d1 = 1.1 * 3;
		int n = 100;
		return d1;
		//return n;   -----> 兼容
		//return 1.1; -----> 一致
	}
	
			
	//4.如果方法是void，则方法体中可以没有return语句，或者只写return；
	////方法名要有一定含义
	public void f2() {
		System.out.println("hellO");
		return;
		//return n;    	----> 错误 
		//return 10;	----> 错误
	}

}

//形参列表
//
//1.一个方法可以有0个参数，也可以有多个参数，
//	中间用逗号隔开，比如 getSum(int n1,int n2)
//2.参数类型可以为任意类型，包含基本类型或引用类型 
//	比如printArr(int[][] map)
//3.调用带参数的方法时，一定对应着参数列表传入相同类型
//	或兼容类型的参数 getSum	
//4.方法定义时的参数称为形式参数，简称形参：方法调用时的参数成为实际参数，简称实参
//	
//	细节：实参	和形参的类型要一致或兼容 个数 顺序必须一致



//方法体
//里面写完成能的具体的语句，可以为输入，输出，变量，运算，分支，循环
//方法调用 但里面不能再定义方法 即 方法不能嵌套定义	