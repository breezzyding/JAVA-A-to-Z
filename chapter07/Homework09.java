public class Homework09 {
	public static void main(String[] args) {
		
		/*
			����Music�࣬������������name������ʱ��times����
			���в���play���ܺͷ��ر���������Ϣ�Ĺ��ܷ���getInfo
		 */
		
		Music myMusic = new Music("It Takes Two", 159);

		myMusic.play();
		System.out.println(myMusic.getInfo());
				
	}
}

class Music {

	String name;
	int times;

	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}

	public void play() {
		System.out.println("���ڲ��� " + name + 
			" ʱ��Ϊ" + times + "��");
	}

	public String getInfo() {		
		return "������" + name + " ����ʱ��Ϊ" + times + "��";
	}

	
	
	
}