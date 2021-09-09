package com.dinglearn.enum_;

/**
 * @author Ding
 * @version 1.0
 * 演示Enum类的各种方法的使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season2枚举类,来演示各种方法
        Season2 autumn = Season2.AUTUMN;
        //输出枚举对象的名字
        System.out.println(autumn.name());

        //ordinal()输出的是该枚举对象的次序/编号.从0开始编号的
        //AUTUMN枚举对象是第三个,因此输出2
        System.out.println(autumn.ordinal());

        //从反编译可以看到有一个values方法,返回Season2[]
        //含有定义的所有枚举对象
        Season2[] values = Season2.values();
        for (Season2 season: values) {//增强for循环
            System.out.println(season);
        }
        System.out.println();

        //valueof:将字符串转换成枚举对象,要求字符串必须为已有的常量.否则会报错
        //执行流程
        //1.根据输入的"AUTUMN"到Season2的枚举对象去查找
        //2.如果找到了,就返回,如果没有找到,就报错
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1=" + autumn1);
        System.out.println(autumn == autumn1);//true
        //报错
        //Season2 ding = Season2.valueOf("DING");

        //compareTo:比较两个故事枚举常量,比较的就是编号
        //解读
        //1.就是把Season2.AUTUMN枚举对象的编号和Season2.SUMMER枚举对象的编号比较
        //2.看看结果
        System.out.println(Season2.AUTUMN.compareTo(Season2.SPRING));














//        //演示增强for循环
//        int[] nums = {1, 2, 9};
//        //普通for循环
//        System.out.println("----普通for循环----");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        System.out.println("----增强for循环----");
//        //增强for循环
//        for (int i : nums) {
//            //执行流程是 依次从nums数组中取出数据,赋给i
//            //如果取出完毕,则退出for循环
//            System.out.println("i=" + i);
//        }

    }
}


