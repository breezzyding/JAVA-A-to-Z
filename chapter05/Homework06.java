

public class Homework06 {
	public static void main(String[] args) {
		
		//���1-100֮��Ĳ��ܱ�5����������ÿ5��һ��	
			
		
		int count = 0;//����˶��ٸ�����
		for (int i = 1; i <= 100 ; i++ ) {
			if (i % 5 != 0) {
				System.out.print(i + " ");
				count++;			
			} if (count % 5 == 0){					
				System.out.println();
			}
		}
	}
}