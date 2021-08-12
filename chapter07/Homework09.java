public class Homework09 {
	public static void main(String[] args) {
		
		/*
			定义Music类，里面有音乐名name，音乐时长times属性
			并有播放play功能和返回本身属性信息的功能方法getInfo
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
		System.out.println("正在播放 " + name + 
			" 时长为" + times + "秒");
	}

	public String getInfo() {		
		return "音乐名" + name + " 音乐时长为" + times + "秒";
	}

	
	
	
}