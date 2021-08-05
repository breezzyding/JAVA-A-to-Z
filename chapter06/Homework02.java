public class Homework02 {
	public static void main(String[] args) {
		
		//下面代码块输出什么 
		
		String foo = "blue";
		boolean[] bar = new boolean[2];//默认全部放置 false
		if (bar[0]) {
			foo = "green";								
		}
		System.out.println(foo);//blue							
	}
}