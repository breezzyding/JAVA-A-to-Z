public class Homework10 {
	public static void main(String[] args) {
		
		/*
			´úÂëÔÄ¶ÁÌâ
		 */
			
				
	}
}

class Demo {

	int i = 100;

	public void m() {
		int j = i++;
		System.out.println("i=" + i);
		System.out.println("j=" + j);		
	}	
}

class Test {
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		Demo d2 = d1;
		d2.m();//i=101 j=100
		System.out.println(d1.i);//101
		System.out.println(d2.i);//101
	}
}