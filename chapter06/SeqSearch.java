
import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		
		//有一个数列：白眉鹰王 金毛狮王 紫衫龙王 青翼蝠王
		//从键盘中任意数出一个名称，判断数列中是否包含此名称[顺序查找]
		//要求：如果找到了，就提示找到了，并给出下标
		
		//思路分析
		//1.定义一个字符串数组
		//2.接受用户输入，遍历数组，逐一比较，如果有
		//	则提示信息，并退出
				
		//定义一个字符串数组
		String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请键入法王的名字：");
		String findName = myScanner.next();
		boolean flag = true;

		//遍历数组
		for (int i = 0;i < names.length; i++) {
			if (findName.equals(names[i])) {
				System.out.println("找到该法王！" + findName);
				System.out.println("该法王的索引为" + i);												
				flag = false;
				break;
			}			
		}
		if (flag == true) {
			System.out.println("名册上并无该法王！");
		}
	}
}