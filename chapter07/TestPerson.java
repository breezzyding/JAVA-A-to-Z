public class TestPerson {
	public static void main(String[] args) {
		
		/*
			this的课堂案例
			定义Person类，里面有name,age属性，并提供compareTo比较方法，用于判断
			是否和另一个人相等，提供测试类,名字和年龄完全一样
			就返回true，否则返回false
		 */
		
		Person p1 = new Person("xiaoDing", 17);
		Person p2 = new Person("xiaoDing", 17);
		
		System.out.println("p1和p2比较的结果=" + p1.compareTo(p2));
	}
}

class Person {

	String name;
	int age;

	//构造器
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person p) {
		// 用于比较名字和年纪
		// if(this.name.equals(p.name) && this.age == p.age) {
		// 	retun true；
		// } else {
		// 	return false;
		// }
		return this.name.equals(p.name) && this.age == p.age;
	
	}

}