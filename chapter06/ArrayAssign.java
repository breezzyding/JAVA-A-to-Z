//���鸳ֵ����


public class ArrayAssign {
	public static void main(String[] args) {
		
		//�����������͸�ֵ,��ֵ��ʽ��Ϊֵ������ֵ���ݣ�
		//n2�ı仯������Ӱ�쵽n1��ֵ
		int n1 = 10;
		int n2 = n1;

		n2 = 80;
		System.out.println("n1=" + n1);
		System.out.println("n2=" + n2);

		//������Ĭ������������ô���,����ֵ�ǵ�ַ,��ֵ��ʽΪ���ø�ֵ����ַ������
		//��һ����ַ��arr2�仯��Ӱ�쵽arr1
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;//��arr1��ֵ arr2
		arr2[0] = 10;//�ı�arr2�ĵ�һ��Ԫ��

		//����arr1��ֵ
		System.out.println("====arr1��Ԫ��====");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);//10��2��3
		}

		//����arr2��ֵ
		System.out.println("====arr2��Ԫ��====");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);//10��2��3
		}
	}
}