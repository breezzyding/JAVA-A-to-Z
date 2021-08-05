public class PropertiesDetail {
	public static void main(String[] args) {

	//创建 Person对象
	//p1 是对象名（对象引用）
	//new Person() 创建的对象空间（数据）才是真正的对象
	Person p1 = new Person();

	//对象的属性默认值，遵守数组规则;
	
	System.out.println("\n当前这个人的信息");
	System.out.println("age=" + p1.age + " name=" + p1.name +
		" salay=" + p1.salay + " isPass=" + p1.isPass);
	}//int-0 String-null sdouble-0.0 boolean-false
}

class Person {//
	//四个属性
	int age;
	String name;
	double salay;
	boolean isPass;
}