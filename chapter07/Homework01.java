public class Homework01 {
	public static void main(String[] args) {
		
		//��д��A01,���巽��max��ʵ����ĳ��double��������ֵ
		//������
		
		A01 a01 = new A01();
		double[] arr = {7.35, 30.13, 17.24};
		//double[] arr = null;
		double res = a01.max(arr);

		if (res != null) {
			System.out.println("��������е����ֵ��" + res);
		} else {
			System.out.println("�������������������鲻��Ϊnull������{}");
		}
		
		
	}
}

class A01 {

	public double max(double[] arr) {
		//���ж�arr�Ƿ�Ϊ��
		if (arr != null && arr.length > 0) {//��֤arr������һ��Ԫ��			
		
			double max = arr[0];//�����һ��Ԫ�ؾ������ֵ
			for (int i = 0; i < arr.length; i++) {//��������
				if (max < arr[i]) {
					max = arr[i];
				}
			}

			return max;
		} else {
			return null;
		}
	}
}