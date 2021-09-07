package com.dinglearn.enum_;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

/**
 * @author Ding
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.SUMMER);
        System.out.println(Season.SPRING);
    }
}

//演示定义枚举实现
class Season {
    private String name;
    private String desc;

    //定义了四个对象,限定
    public final static Season SPRING = new Season("春天","温暖");
    public final static Season WINTER = new Season("冬天","寒冷");
    public final static Season SUMMER = new Season("夏天","炎热");
    public final static Season AUTUMN = new Season("秋天","凉爽");

    //自定义类实现枚举 步骤
    //1.将构造器私有化--->防止直接 new
    //2.去掉set相关的方法--->防止属性被修改
    //3.在Season内部,直接创建固定的对象
    //4.优化,可以加入final修饰符
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
