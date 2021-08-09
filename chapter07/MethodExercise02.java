public class MethodExercise02 {
	public static void main(String[] args) {
		
		//1.编写类MyTools类，编写一个方法可以打印二维数组的数据。
		//2.编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象
		//  克隆对象，注意要求得到的新对象和原来的对象是两个独立的对对象，
		//  只是他们的属性相同
		 
		MyTools myTools = new MyTools();
		int[][] arr = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
		myTools.printArr(arr);

		Person p1 = new Person();
		p1.name = "Ding";
		p1.age = 25;		
		Person p2 = myTools.copyPerson(p1);

		//到此p1 和 p2是Person对象，但是是两个独立的对象，属性相同
		System.out.println("p1的属性 name=" + p1.name + " age=" + p1.age);
		System.out.println("p2的属性 name=" + p2.name + " age=" + p2.age);
		
		//提示：
		//可以通过输出对象比较 看看对象是否是一个
		System.out.println(p1 == p2);//false 

	}
}

class Person {
	String name;
	int age;
	double salay;
}

class MyTools {
		
	public void printArr(int[][] arr) {
		//打印二位数组
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();	
		}
	}


	public Person copyPerson(Person p1) {
		//复制一个Person对象
		Person p2 = new Person();//创建新的对象，用于复制
		p2.name = p1.name;
		p2.age = p1.age;
		return p2;
	}
}

