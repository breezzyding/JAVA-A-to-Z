public class Homework07 {
	public static void main(String[] args) {
		
		/*
			设计一个Dog类，有名字，颜色和年龄属性，
			定义输出方法show()显示其信息
			并创建对象，进行测试（提示 this.属性）
		 */
		
		Dog dog1 = new Dog("狗花", "粉色", 24);
		dog1.showInfo();

		Dog dog2 = new Dog("小白", "黑色", 3);
		dog2.showInfo();
		
	}
}

class Dog {

	String name;
	String color;
	int age;

	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void showInfo() {
		System.out.println(name + "的信息如下：");
		System.out.println("颜色： " + color + "\t" +
							 "年龄： " + age);
	}
}