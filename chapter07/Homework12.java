public class Homework12 {
	public static void main(String[] args) {
		
		/*
			����һ��Employee�࣬������(���֣��Ա����䣬ְλ��нˮ)
			�ṩ�������������������Գ�ʼ��(1)(���֣��Ա����䣬ְλ��нˮ)
			(2)(���֣��Ա�����)(3)(ְλ��нˮ)��Ҫ���ָ����ù�����
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
		this(name, gender, age);//ʹ�õ� ǰ��� ������
		this.position = position;
		this.salary = salary;
	}


		
}

