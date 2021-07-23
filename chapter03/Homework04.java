public class Homework04{

	//编写一个main方法
	public static void main(String[] args) {

		//变成实现如下效果
		//姓名  年龄  成绩  性别  爱好
		//XX	XX	 XX    XX    XX
		//
		//要求：
		//1.用变量将姓名，年龄，成绩，性别，爱好存储
		//2.使用+
		//3.添加适当的注释
		//4.添加转义字符，使用一条语句输出
		
		String name = "Breezy";//姓名
		int age = 25;//年纪
		double score = 97.5;
		char gender = '男';
		String hobby = "篮球";


		//可以使用换行的方式输出
		//注意格式哦！！！
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好" + 
			"\n" + name + "\t" + age + "\t" + score + "\t" + 
			gender + "\t" + hobby + "\t");


	}
}
