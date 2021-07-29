//嵌套分支

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		
		/*
		需求
		参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则提示淘汰，
		并且根据性别提示进入男子组或女子组。
		输入成绩和性别，进行判断和输出信息。
		
		提示：double score；char gender；
		接受字符：char gender = Scanner.next().chatAt(0);
		 
		思路分析
		1.创建Scanner对象，接受用户输入
		2.接受 成绩 保存到 double score
		3.使用if-else 判断
		  如果初赛成绩大于8.0进入决赛，否则提示淘汰
		4.如果进入到 决赛，在接收char gender，使用if-else输出信息

		 */
		
		
		//代码实现
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请选手输入成绩：");	
		double score = myScanner.nextDouble();
		if (score > 8.0) {			
			System.out.println("请选手输入性别：");
			//charAt()将字符串转换为char类型，检索从0开始
			char gender = myScanner.next().charAt(0);
			if (gender == '男' || gender =='女') {
				if (gender == '男') {
					System.out.println("恭喜！您已进入决赛男子组。");
				}else {
					System.out.println("恭喜！您已进入决赛女子组。");
				}
			}else {
				System.out.println("您好，请重新输入性别信息。");
			}
			
		}else {
			System.out.println("很遗憾，您被淘汰了。");
		}
	}
}	