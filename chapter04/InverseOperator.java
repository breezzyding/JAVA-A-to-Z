/**
 * ��ʾ�߼��������ʹ��
 */
public class InverseOperator {

	//��дһ��main����
	public static void main(String[] args) {
		
		// ȡ�� ! �� �߼���� ^ ������ʾ
		 
		// !�Ĺ���: T => F  ,  F => T		
		System.out.println(60 > 20);//T
		System.out.println(!(60 > 20));//F

		// a^b�Ĺ���:�� a �� b ��ͬʱ������Ϊture������Ϊfalse
		boolean b1 = (10 > 1) ^ (3 < 5);
		System.out.println("b1=" + b1);//F
		boolean b2 = (10 < 1) ^ (3 < 5);
		System.out.println("b2=" + b2);//T


	}
}

// ��ϰ��
// 
// ��Ŀ1
// int x = 5;
// int y = 5;
// if (x++ == 6 & ++y == 6){
// 		x = 11;
// }
// System.out.println("x=" + x + ",y=" + y);//�𰸣�x=6,y=6
// 
// ��Ŀ2
// int x = 5;
// int y = 5;
// if (x++ == 6 && ++y == 6){
// 		x = 11;
// }
// System.out.println("x=" + x + ",y=" + y);//�𰸣�x=6,y=5
// 
// ��Ŀ3
// int x = 5;
// int y = 5;
// if (x++ == 5 | ++y == 5){
// 		x = 11;
// }
// System.out.println("x=" + x + ",y=" + y);//�𰸣�x=11,y=6
// 
// ��Ŀ4
// int x = 5;
// int y = 5;
// if (x++ == 5 || ++y == 5){
// 		x = 11;
// }
// System.out.println("x=" + x + ",y=" + y);//�𰸣�x=11,y=5
// 
// ��Ŀ5
// boolean x = ture;
// boolean y = false;
// short z = 46;
// if (z++ == 46 && y = ture) {
// 		z++;
// }
// if (x = false || ++z == 49) {
// 		z++;
// }
// System.out.println("z=" + z);//50