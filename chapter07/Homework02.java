public class Homework02 {
	public static void main(String[] args) {
		
		/*
			��д��A02 ���巽��find ʵ�ֲ���ĳ�ַ��������е�Ԫ�ز��ң�
			����������������Ҳ�������-1		
		 */
		
		A02 a02 = new A02();
		//String[] arr = {"a", "c", "cc", "k", "w"};
		String[] arr = null;

		String str = "cc";		
		// String str = "j";

		int res = a02.find(arr, str);

		if (res == -1) {
			System.out.println("��Ѱ��û���ҵ���Ҫ���ַ���");
		} else {
			System.out.println("��Ѱ���ҵ���Ҫ���ַ����������±���" + res);
		}
		
		
	}
}

class A02 {

	public int find(String[] arr, String str) {

		int index = -1;	
		if (arr != null && arr.length > 0) {//�ж��ַ��������Ƿ�Ϊnull			
					
			for (int i = 0; i < arr.length; i++) {//��������
				if (str.equals(arr[i])) {//����ҵ�����������
					index = i;
				}
			}
			return index;//û���ҵ�������-1
		} else {
			System.out.println("���������null");
			return index;//û���ҵ�������-1
		}
		
	}
}