/**
 * ������
 */
public class ArithmeticOperatorExercise01 {

	//��дһ��main����
	public static void main(String[] args) {
		
		// ������1
		int i = 1;
		i = i++;//����������ʱ��������1��temp=i;(2)i=i+1;(3)i=temp;
		System.out.println(i);//1 

		// ������2
		int j = 1;
		j = ++j;//����������ʱ��������1��j=j+1;(2)temp=j;(3)j=temp;
		System.out.println(j);//2

		//������ϰ��
		int i1 = 10;
		int i2 = 20;
		int k = i1++;//k=10;i1=11;

		//print �� printIn ǰ�߲����� ���߻���
		System.out.print("k=" + k + '\t');//10
		System.out.println("i2=" + i2);//20
		k = --i2;//i2=19;k=19
		System.out.print("k=" + k + '\t');//19
		System.out.println("i2=" + i2);//19


	}
}