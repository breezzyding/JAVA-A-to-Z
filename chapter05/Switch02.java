/*
switchע�������ϸ������
 */


public class SwitchDetail {
	public static void main(String[] args) {

		//ϸ��1��
		//���ʽ�������ͣ�Ӧ��case��ĳ�������һ�£������ǿ����Զ�ת��
  		//�����໥�Ƚϵ����ͣ�������������ַ�����������int
  		

  		//ϸ��2��
  		//switch(���ʽ)�б��ķ���ֵ�����ǣ�
  		//(byte short int char enum(ö��) String)
  		
  		
  		//ϸ��3��
  		//case�Ӿ��е�ֵ�����ǳ���(1,'a'),�������Ǳ���

  		
		//ϸ��4��
		//default�Ӿ��ǿ�ѡ�ģ���û��ƥ���caseʱ��ִ��default
		//���û��default�Ӿ䣬��û��ƥ���κγ�������û�����


		//ϸ��5��
		//break�������ִ����һ��case��֧��ʹ��������switch����
		//���û��дbreak�������˳��ִ�е�switch��β


  		char c = 'a';
  		//String c = "a";
  		//double d = 1.1    //���벻ͨ����������ʹ��
  		switch(c) {
  			case 'a' :
  				System.out.println("ok1");
  				break;
  			case 'b' :
  			//case "hello" :
  			//���벻ͨ�������Ͳ�һ�£����޷�ת��
  			
  			//case 20 ��
  			//���Ա��룬���Ͳ�һ�£����ǿ���ת����int
  			//case "20" ��
  			//
  			//				
  				System.out.println("ok2");
  				break;
  			case 'c' :
  				System.out.println("ok3");
  				break;
  		}
  		System.out.println("�˳���switch���������ִ�С�");	
  	}
}	