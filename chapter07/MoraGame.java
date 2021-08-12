import java.util.Random;
import java.util.Scanner;

public class MoraGame {

	//����
	public static void main(String[] args) {
		
		/*
			��ĿҪ��
			�и���Tom������ĳ�Ա��������Ա���������Ե��Բ�ȭ������ÿ��
			�����������0��1��2
			0 ��ʾ  ʯͷ 1��ʾ ���� 2��ʾ ��
			��Ҫ������ʾTom����Ӯ�������嵥��������3��
	

		 */
		
		//����һ����Ҷ���
		Tom t = new Tom();
		//������¼�����Ӯ�Ĵ���
		int isWinCount = 0;
		//��Ϸ�ľ���
		int gameCount = 3;

		//����һ����ά���飬�������վ�����Tom��ȭ����Լ����Գ�ȭ���
		int[][] arr1 = new int [gameCount][gameCount];
		int j = 0;

		//����һ��һά���飬����������Ӯ���
		String[] arr2 = new String[gameCount];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < gameCount; i++) {//i-��ʾ�ڼ���

			//��ȡ��ҵĳ�ȭ���
			System.out.println("����������Ҫ����ȭ (0-ȭͷ, 1-����, 2-��):");
			int num = scanner.nextInt();//������������ȭ
			t.setTomGuessNum(num);//����TomGuessNum
			int tomGuess = t.getTomGuessNum();//��Ҷ���t�ڵ��ã�����TomGuessNum
			arr1[i][j + 1] = tomGuess;// j + 1 ��ʾ�ڶ��� ���ڴ����ҵĳ�ȭ���

			//��ȡ���Եĳ�ȭ���
			int comGuess = t.computerNum();
			arr1[i][j + 2] = comGuess;// j + 1 ��ʾ������ ���ڴ�ŵ��Եĳ�ȭ���
		
			//�Ա���Һ͵��Եĳ�ȭ�����������isWin��
			String isWin = t.vsComputer();

			//��һά����arr2��Ž��
			arr2[i] = isWin;
			//�ö�ά����ĵ�һ�д�ž���
			arr1[i][j] = t.count;

			//��ÿһ�ֵ�����������
			System.out.println("================================================");
			System.out.println("����\t��ҵĳ�ȭ\t���Եĳ�ȭ\t��Ӯ���");
			System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" + isWin);			;
			System.out.println("================================================");
			System.out.println("\n\n");
			isWinCount = t.winCountNum(isWin);
		}


		//����Ϸ�����ս���������	
		System.out.println("����\t��ҵĳ�ȭ\t���Եĳ�ȭ\t\t��Ӯ���");
		for (int a = 0; a < arr1.length; a++) {
			for (int b = 0; b < arr1[a].length; b++) {
					System.out.print(arr1[a][b] + "\t\t");//���� ��ҵĳ�ȭ ���Եĳ�ȭ	
			}

			System.out.println(arr2[a]);//��Ӯ���
			System.out.println();			
		}
		System.out.println("��Ӯ��" + isWinCount + "��");			
	}
}

//Tom��
class Tom {	

	//��ҳ�ȭ������
	int tomGuessNum;//0,1,2
	//���Գ�ȭ������
	int comGuessNum;//0,1,2
	//���Ӯ�Ĵ���
	int winCountNum;
	//�����Ĵ���
	int count = 1;	//һ����������

	public void showInfo() {
		//...
	}

	//����������ɲ�ȭ�����ֵķ���
	public int computerNum() {
		Random r = new Random();//����һ��Random����
		comGuessNum = r.nextInt(3);// ���� ����0-2�������
		// System.out.println(comGuessNum);
		return comGuessNum;
	}

	public void setTomGuessNum(int tomGuessNum) {
		if (tomGuessNum > 2 || tomGuessNum < 0) {//����0,1,2
			//�׳��쳣
			throw new IllegalArgumentException("������������");			
		}
		this.tomGuessNum = tomGuessNum;
	}

	public int getTomGuessNum() {
		return tomGuessNum;
	}
	
	//�Ƚϲ�ȭ��� 0-ʯͷ 1-���� 2-��
	public String vsComputer() {

		if (tomGuessNum == 0 && comGuessNum == 1) {//��-ʯͷ ��-����
			return "��Ӯ�ˣ�";
		} else if (tomGuessNum == 1 && comGuessNum == 2) {//��-���� ��-��
			return "��Ӯ�ˣ�";
		} else if (tomGuessNum == 2 && comGuessNum == 0) {//��-�� ��-ʯͷ
			return "��Ӯ�ˣ�";
		} else if (tomGuessNum == comGuessNum) {//ƽ��
			return "ƽ�֡�";
		} else {
			return "�����ˣ�";
		}
	}

	public int winCountNum(String s) {
		count++;	//������Ĵ���
		if (s.equals("��Ӯ�ˣ�")) {	//ͳ��Ӯ�Ĵ���
			winCountNum++;
		}
		return winCountNum;
	}	
	 
		
}




