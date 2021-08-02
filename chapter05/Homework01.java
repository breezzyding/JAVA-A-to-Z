public class Homework01 {
	public static void main(String[] args) {
		
		//某人有100,000元，每经过一次路口，需要交费，规则如下：
		//1)当现金>50000时，每次交5%
		//2)当现金<=50000时，每次交1000
		//编程计算该人可以经过多少次路口，要求：使用while break方式完成
		
		//思路分析
		//1.定义 double money 保存 100000
		//2.根据题的要求，我们分析出来有三种情况
		//	money > 50000
		//	money >= 1000 money <= 50000 
		//	money < 1000
		//3.使用多分支 if-elseif-else	
		//4.while + break[money < 1000],同时使用count来保存次数
		//	
		double money = 100000;
		
		int count = 0;//记录过路口的次数
		while(true) {
			if (money > 50000) {//过路口
				money *= 0.95;//计算余额
				count++;//记录次数
			} else if (money >= 1000) {
				money -= 1000;//计算余额
				count++;//记录次数
			} else {//钱不够
				break;
			}
		System.out.println("该人可以经过" + count + "次路口");
		System.out.println("该人还剩" + money + "元");
	}
	
}