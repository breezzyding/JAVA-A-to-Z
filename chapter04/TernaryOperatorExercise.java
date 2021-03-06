//三元运算符课堂练习

public class TernaryOperatorExercise {

	//编写一个main方法
	public static void main(String[] args) {
		
		//案例：实现三个数里最大值
		
		int n1 = 55;
		int n2 = 33;		
		int n3 = 123;
		//思路
		//1.先得到 n1 和 n2 中的较大数，保存到 max1
		//2.然后再求出 max1 和 n3中的较大数，即最大数，保存到max2

		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大数=" + max2);

		//使用一条语句实现也可，但从效率和代码清晰度，上者更优
		//tips：后面我们可以使用更好的方法，比如排序
		
		// int max = (n1 > n2 ? n1 : n2) > n3 ? 
		// 				(n1 > n2 ? n1 : n2) : n3;
		// System.out.println("最大数=" + max);


	}
}


//运算符的优先级

//1.运算符有不同的优先级
//2.只有单目运算符，赋值运算符是从右往左运算的
//
//梳理小结：优先级从上至下 大致顺序 细节可以查表
//1. () {} ,  等
//2.单目运算 ++ --
//3.算术运算符
//4.位移运算符
//5.比较运算符
//6.逻辑运算符
//7.三元运算符
//8.赋值运算符



//标识符的命名规范和规则

//标识符概念
//1.java对各种变量 方法和类等命名时使用的字符序列称为标识符
//2.凡是自己可以起名字的地方都叫标识符 int num1 = 90；

//标识符的命名规则（必须遵守）

//1.由26个英文字母大小写，0-9，_ 或 $ 组成
//2.数字不可以开头 int 3ab = 1;//错误
//3.不可以使用关键字和保留字，但能包含关键字和保留字
//4.Java中严格区分大小写，长度无限制 int totalNum = 10；
//5.标识符不能包含空格 int a b = 90;//错误



//判断下面变量名是否正确
//hsp  		 	√
//hsp12			√
//1hsp			×  	不能以数字开头
//h-s			×	不能使用-
//x h 			×	不能使用空格
//h$4 			√
//class 		×	关键字
//int 			×	关键字
//double 		×	关键字
//public 		×	关键字
//static 		×	关键字
//goto  		×	保留字
//stu_name 		√



//标识符命名的规范 （更加专业）
//1.包名：多单词组成所有字母都小写 aaa.bbb.ccc
//	举例：com.hsp.crm
//2.类名，接口名：多单词组成，所有单词的首字母大写 XxxYyyZzz（大驼峰）
//	举例：InverseOperator
//3.变量名，方法名：多单词组成时，第一个单词首字母小写，
//  第二个单词开始每个单词首字母大写 xxxYyyZzz（小驼峰 简称驼峰法）
//  举例：leftDays
//4.常量名：所有字母都大写，多单词时每个单词用下划线连接：XXX_YYY_ZZZ
//	举例：定义一个所得税率 TAX_RATE
//5.后面我们学习到类,包,接口,等时，我们的命名规范要这样遵守，更加详细的看文档



//关键字
//定义：被Java语言赋予了特殊含义，用作专门用途的字符串（单词）
//特点：关键字中所有字母都为小写



//保留字
//定义：现在Java版本尚未使用，但以后版本可能会作为关键字


