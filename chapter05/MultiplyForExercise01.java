/*
多重for的嵌套使用演示
 */

import java.util.Scanner;

public class MultiplyForExercise01 {
	public static void main(String[] args) {
		
		//需求：
		//1.统计3个班成绩情况，每个班有5名同学，求出各个班的平均分
		//	和所有班级的平均分（学生的额成绩从键盘输入）
		//2.统计出3个班及格人数，每个班有5名同学。
		
		//思路分析
		//1.引入Scanner 键入同学成绩
		//2.整型int i 和 j 分别表示班级 和 同学  
		//3.double score 接收同学们键入的成绩
		//4.double averageScore 计算第i班的平均分
		//4.double totalAverageScore 计算总的平均分
		
		//代码实现
		
		Scanner myScanner = new Scanner(System.in);

		int classNum = 3;//班级数
		int studentNum = 5;//学生数
		int count = 0;//用于统计及格人数
		double score;//用于接受学生成绩
		double averageScore = 0.0;//用于统计某班的平均分
		double totalAverageScore = 0.0;//用于统计总的平均分
		for ( int i = 0; i < classNum ; i++ ) {//共3个班级
			for (int j = 0; j < studentNum ; j++ ) {//每个班5个同学
				//输入提示
				System.out.println("第" + (i + 1) + "个班级的" + 
					"第" + (j + 1) + "个同学你好，请输入你的成绩：");

				//键入同学分数
				score = myScanner.nextDouble();
				
				//记录及格人数
				if (score >= 60) {
					count++;
				}

				//计算某个班的平均分
				averageScore = averageScore + score;				
			}
			//输出该班级的平均分			
			System.out.println("第" + (i + 1) + "个班级的平均分为" + 
				(averageScore / 5.0));

			//将每个班级的平均分保存至总平均分中
			totalAverageScore = totalAverageScore + (averageScore / 5.0);

			//班级平均分清零！！！
			averageScore = 0;
		}

		//输出结果		
		System.out.println("所有班级的平均分为" + (totalAverageScore / 3.0));
		System.out.println("3个班级及格的人数为" + count);
	}
}