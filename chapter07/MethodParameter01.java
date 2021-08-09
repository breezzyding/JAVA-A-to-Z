public class MethodParameter02 {
	public static void main(String[] args) {
		
		/*
			成员方法传参机制
		 */
		
		int a = 10;
		int b = 20;
		//与swap方法中的int a int b 不冲突！
		AA aa = new AA();
		aa.swap(a,b);//调用swap

		//调用完swap方法以后，输出的a，b还是main方法里定义的
		System.out.println("\n调用完swap方法后a和b的值\na=" + a + "\tb=" + b);//a=10 b=20
		
	}
}

class AA {

	public void swap(int a, int b) {

		System.out.println("\na和b交换前的值\na=" + a + "\tb=" + b);
		//完成了a和b的互换
		int temp = a;
		a = b;
		b = temp;
		System.out.println("\na和b交换后的值\na=" + a + "\tb=" + b);
	}
}