public class Homework03 {
	public static void main(String[] args) {
		
		/*
			��д��Book,���巽��updatePrice,ʵ�ָ���ĳ����ļ۸�
			���壺����۸�>150,�����Ϊ150������۸�>100,����Ϊ100
			���򲻱�	
		 */
		
		Book book = new Book();
		// int bookPrice = 88;//��ļ۸�
		// int bookPrice = 177;
		int bookPrice = 135;

		int res = book.updatePrice(bookPrice);
		
		System.out.println("�޸�֮���Ȿ��ļ۸���" + res);
		
	}
}

class Book {

	public int updatePrice(int bookPrice) {
		if (bookPrice > 150) {
			bookPrice = 150;
		} else if (bookPrice > 100) {
			bookPrice = 100;
		} 
		return bookPrice;

	}
}