public class Homework03 {
	public static void main(String[] args) {
		
		/*
			编写类Book,定义方法updatePrice,实现更改某本书的价格
			具体：如果价格>150,则更改为150，如果价格>100,更改为100
			否则不变	
		 */
		
		Book book = new Book();
		// int bookPrice = 88;//书的价格
		// int bookPrice = 177;
		int bookPrice = 135;

		int res = book.updatePrice(bookPrice);
		
		System.out.println("修改之后，这本书的价格是" + res);
		
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