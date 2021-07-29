/*
switch注意事项和细节讨论
 */


public class SwitchDetail {
	public static void main(String[] args) {

		//细节1：
		//表达式数据类型，应和case后的常量类型一致，或者是可以自动转成
  		//可以相互比较的类型，比如输入的是字符，而常量是int
  		

  		//细节2：
  		//switch(表达式)中表达的返回值必须是：
  		//(byte short int char enum(枚举) String)
  		
  		
  		//细节3：
  		//case子句中的值必须是常量(1,'a'),而不能是变量

  		
		//细节4：
		//default子句是可选的，当没有匹配的case时，执行default
		//如果没有default子句，有没有匹配任何常量，则没有输出


		//细节5：
		//break语句用来执行完一个case分支后使程序跳出switch语句块
		//如果没有写break，程序会顺序执行到switch结尾


  		char c = 'a';
  		//String c = "a";
  		//double d = 1.1    //编译不通过，不允许使用
  		switch(c) {
  			case 'a' :
  				System.out.println("ok1");
  				break;
  			case 'b' :
  			//case "hello" :
  			//编译不通过，类型不一致，且无法转换
  			
  			//case 20 ：
  			//可以编译，类型不一致，但是可以转换成int
  			//case "20" ：
  			//
  			//				
  				System.out.println("ok2");
  				break;
  			case 'c' :
  				System.out.println("ok3");
  				break;
  		}
  		System.out.println("退出了switch，程序继续执行。");	
  	}
}	