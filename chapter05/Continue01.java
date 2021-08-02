/*
演示continue的使用
 */

public class Continue01 {
	public static void main(String[] args) {

		// int i = 1;
		// while (i <= 4) {
		// 	i++;
		// 	if (i == 2) {
		// 		continue;
		// 	}
		// 	System.out.println("i=" + i);//i=3 i=4 i=5
		// }
		


		label1:
		for (int j = 0; j < 4;j++) {
			label2:
			for (int i = 0; i < 10; i++) {
					if(i==2) {
						//看看分别输出什么值，并分析
						//continue;//i=0 i=1 i=3 i=4 ... i=9 X4(四次)
						//continue label2;//和上面一样
						continue label1;//i=0 i=1 i=0 i=1 i=0 i=1 i=0 i=1
					}
					System.out.println("i= " + i);
				}	
		}
	}
}



