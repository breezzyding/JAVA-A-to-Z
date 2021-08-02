
public class BreakDetail {
	public static void main(String[] args) {		
		
		label1:
		for (int j = 0; j < 4; j++ ) {//外层for
		label2:
			for (int i = 0; i < 10 ; i++) {//内层for
				if (i == 2) {
						break label2;//等价 break label2
						//break label1;//结果又是多少呢？
					}
					System.out.println("i = " + i);	
					/*
					i = 0
					i = 1
					i = 0
					i = 1
					i = 0
					i = 1
					i = 0
					i = 1
					 */
				}	
		}
		
		
	}
}

/*
	1.break语句可以指定推出哪层
	2.label 1是标签 名字由程序员指定
	3.break后指定到哪个label就退出到哪里
	4.在实际的开发中，尽量不要使用标签
	5.如果没有指定break，默认退出最近的循环体
 */