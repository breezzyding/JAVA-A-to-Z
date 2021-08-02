/*
经典的打印金字塔
使用for循环完成下面的案例
请编写一个程序，可以接受一个整数，表示层数(totalLevel)
打印出金字塔
 */

public class Stars {
	public static void main(String[] args) {
		
		// //实心金字塔
		
		// /*
		// 分析如下
		
		// 实心金字塔 totalLevel = 5 最后一层*的个数 2*totalLevel - 1						

		//     *		第一层 输出空格数 = totalLevel-层数；输出*数 = 2*层数 - 1
		//    ***		第二层 ...
		//   *****		...
		//  *******
		// ********* 
 	// 	*/
 	
		
		// int totalLevel = 7;//表示层数
		// int n = 1;//当前层数

		// while (n <= totalLevel) {
		// 	for (int i = 1; i <= totalLevel - n; i++) {//输出空格
		// 		System.out.print(" ");
		// 	}
		// 	int star = 2 * n - 1;
		// 	for (int j = 1;j <= star;j++) {//输出星星
		// 		System.out.print("*");
		// 	}
		// 	System.out.print("\n");
		// 	n++;
		// }
		// System.out.print("\n");
		
		
		//笨蛋小丁
		//吐了都
		//
		//
		//
		// //空心金字塔
		// /*
		// 分析如下
		
		// 空心金字塔 totalLevel = 5；层数int n；最后一层*的个数 2*totalLevel - 1						

		//     *		第一层 输出空格数 = totalLevel-n；输出一个*
		//    * *		第二层 (非最后一层)输出 totalLevel-n 个空格；输出一个*;输出2*(n-1)-1;再输出一个*
		//   *   *		第三层 到最后一层了吗？最后一层是与前面层不同的输出结构。
		//  *     *		...
		// ********* 	第五层 最后一层 直接输出 2 * n - 1 个*
 	// 	*/
 	
 	// 	// int totalLevel = 5;//表示层数
		// // int n = 1;//当前层数
		// n = 1;//初始化层数

		// //输出第一层
		// for (int i = 1; i <= totalLevel - n; i++) {//输出空格
		// 		System.out.print(" ");
		// 	}			
		// System.out.print("*");//输出星星
		// System.out.print("\n");


		// //中间层(除首尾两层)的输出
		// n = n + 1 ;//到第二层了！！！
		// while (n < totalLevel) {
		// 	//输出金字塔外空格
		// 	for (int i = 1; i <= totalLevel - n; i++) {//i可以重复使用哦(在循环内)
		// 		System.out.print(" ");
		// 	}			
		// 	System.out.print("*");//输出金字塔轮廓左侧星星

		// 	//输出金字塔内空格
		// 	//中间变量 middle？
		// 	for (int i = 1;i <= (2 * (n - 1) - 1);i++) {
		// 		System.out.print(" ");
		// 	}

		// 	System.out.print("*");//输出金字塔轮廓左侧星星
		// 	System.out.print("\n");//该层输出完毕，换至下一行
		// 	n++;//循环变量迭代
		// }

		// //最后一层的输出
		// for (int i = 1; i <= 2 * totalLevel - 1 ; i++) {
		// 		System.out.print("*");				
		// 	}
		// System.out.print("\n");
		// System.out.print("\n");

		


		//     *		第1层 有 1个* 当前行的第一个位置是*，最后一个位置也是*
		//    * *		第2层 有 2个* 当前行的第一个位置是*，最后一个位置也是*
		//   *   *		第3层 有 2个* ...
		//  *     *		第4层 有 2个*
		// *       * 	第5层 有 2个* 全部输出
		//  *     *		第6层
		//   *   *		第7层
		//    * *		第8层
		//     *		第9层

		int middleLevel = 5;//表示顶部到中间对称层的层数		

		//打印空心菱形的上半部分
		for (int i = 1; i <= middleLevel ; i++) {//i表示层数

			//在输出*之前，还要输出 对应空格 = 总层数-当前层
			for (int k = 1; k <= middleLevel - i ; k++ ) {
				System.out.print(" ");				
			}

			//控制打印每层*的个数
			for (int j = 1;j <= 2 * i - 1 ;j++ ) {
				//当前行的第一个位置是*，最后一个位置也是*，最后一层全部输出
				if(j == 1 || j == 2 * i - 1 ) {//妙呀
					System.out.print("*");
				}else {
					System.out.print(" ");
				}				
			}			
			System.out.print("\n");
		}

		//打印空心菱形的下半部分
		for (int i = 1; i <= middleLevel - 1 ; i++) {//i表示层数  

			//在输出*之前，还要输出 对应空格 = 当前层(i=1)
			for (int k = 1; k <= i ; k++ ) {//输出i个空格
				System.out.print(" ");				
			}

			//控制打印每层*的个数  （不看空格）2 * (middleLevel - i) - 1			
			for (int j = 1;j <= 2 * (middleLevel - i) - 1  ;j++ ) {
				//当前行的第一个位置是*，最后一个位置也是*，最后一层全部输出
				if(j == 1 || j == 2 * (middleLevel - i) - 1 ) {//妙呀
					System.out.print("*");
				}else {
					System.out.print(" ");
				}				
			}			
			System.out.print("\n");
		}		
	}
}	


