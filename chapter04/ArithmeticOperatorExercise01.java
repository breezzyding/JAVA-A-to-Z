/**
 * 面试题
 */
public class ArithmeticOperatorExercise01 {

	//编写一个main方法
	public static void main(String[] args) {
		
		// 面试题1
		int i = 1;
		i = i++;//规则适用临时变量：（1）temp=i;(2)i=i+1;(3)i=temp;
		System.out.println(i);//1 

		// 面试题2
		int j = 1;
		j = ++j;//规则适用临时变量：（1）j=j+1;(2)temp=j;(3)j=temp;
		System.out.println(j);//2

		//课堂练习题
		int i1 = 10;
		int i2 = 20;
		int k = i1++;//k=10;i1=11;

		//print 和 printIn 前者不换行 后者换行
		System.out.print("k=" + k + '\t');//10
		System.out.println("i2=" + i2);//20
		k = --i2;//i2=19;k=19
		System.out.print("k=" + k + '\t');//19
		System.out.println("i2=" + i2);//19


	}
}