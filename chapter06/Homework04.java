public class Homework04 {
	public static void main(String[] args) {
		
		//已知有个升序的数组,要求插入一个元素,该数组的顺序依然是升序，
		//比如{10, 12, 45, 90} 添加23后,数组为{10, 12, 23, 45, 90}
		

		//思路分析
		//扩容 + 定位
		//1.先确定 添加数应该插入到哪个索引
		//2.然后扩容
		
		
		//定义数组
		int[] nums = {10, 12, 45, 65, 90, 97};

		int insertNum = 66;

		int index = -1;//index就是要插入的位置

		//遍历插入 如果发现 insertNum <= arr[i],说明i就是要插入的位置
		//使用index 保留i index = i
		//若遍历结束，没有发现 insertNum <= arr[i]
		//说明index = nums.length 即添加到nums的末尾
		for (int i = 0; i < nums.length; i++) {
			if (insertNum <= nums[i]) {//比较大小
				index = i;//保存
				break;//因为是升序数列 而且不跳出会影响想index的定位
			}
		}

		//判断index 的值
		if (index == -1) {//说明还没有找到位置
			index = nums.length;//添加到末尾
		}

		//扩容
		//先创建一个新的数组 大小nums.length + 1
		int[] numsNew = new int[nums.length + 1];
		//将nums的元素拷贝到arrNew，并且跳过index 位置
		/*
		分析：
		int[] nums = {10, 12, 45, 90};
		numsNew = {                }
		遍历 使用i
		i != index 那么就放入元素 且跳过index
		最后补充上index 
		 */
		
		//i是指向新数组的，j是指向旧数组
		for (int i = 0, j = 0; i < numsNew.length; i++) {
			
			if (i != index) {//说明可以把nums的元素拷贝到numsNew
				numsNew[i] = nums[j];
				j++;//每做一次拷贝，就后移一位，进行对准
			}else {//i这个位置就是要插入的数
				numsNew[i] = insertNum;
			}			
		}
		
		//让nums指向numsNew 原来的数组就成为垃圾 被销毁
		nums = numsNew;


		System.out.println("=======插入后numsNew如下=======");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
	}
}