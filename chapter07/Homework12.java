public class Homework12 {
	public static void main(String[] args) {
		
		/*
			创建一个Employee类，属性有(名字，性别，年龄，职位，薪水)
			提供三个构造器方法，可以初始化(1)(名字，性别，年龄，职位，薪水)
			(2)(名字，性别，年龄)(3)(职位，薪水)，要求充分复合用构造器
		 */
		
		Employee employee1 = new Employee("xiaoDing", "Male", 25, "Researcher", 14000.00);
		Employee employee2 = new Employee("xiaoDing", "Male", 25);
		Employee employee3 = new Employee("Researcher", 14000.00);

		
		
						
	}
}

class Employee {

	String name;
	String gender;
	int age;
	String position;
	double salary;


	public Employee(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;		
	}

	public Employee(String position, double salsary) {		
		this.position = position;
		this.salary = salary;
	}

	public Employee(String name, String gender, int age, String position, double salsary) {
		this(name, gender, age);//使用到 前面的 构造器
		this.position = position;
		this.salary = salary;
	}


		
}

