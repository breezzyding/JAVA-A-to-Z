public class VarParameterExercise {
	public static void main(String[] args) {
		
		/*
			有三个方法，分别实现返回姓名和两门课成绩(总分)
			返回姓名和三门课成绩（总分）返回姓名和五门课程（总分）
			封装成一个可变参数的方法
		 */
	
		DingMethod dingMethod = new DingMethod();

		dingMethod.showScore("Ding", 92.0, 91.0);
		dingMethod.showScore("Ding", 92.0, 91.0, 75.0);
		dingMethod.showScore("Ding", 92.0, 91.0, 75.0, 82.0, 81.0);

	}		
}


class DingMethod {

	public void showScore(String name, double... score) {
		
		double res = 0;
		for (int i = 0; i < score.length; i++) {
			res += score[i];
		}
		System.out.print(name + score.length +"门课的总分：");
		System.out.print(res);
		System.out.println();
	}
}


