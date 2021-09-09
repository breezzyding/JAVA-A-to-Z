package com.dinglearn.enum_;

/**
 * @author Ding
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SPRING);
    }
}

enum Season2 {


    //定义了四个对象,限定
//    public final static Season SPRING = new Season("春天", "温暖");
//    public final static Season WINTER = new Season("冬天", "寒冷");
//    public final static Season SUMMER = new Season("夏天", "炎热");
//    public final static Season AUTUMN = new Season("秋天", "凉爽");
    //如果使用了enum来实现枚举类
    //1.使用关键字enum替代class
    //2.public final static Season SPRING = new Season("春天", "温暖");
    //  直接使用SPRING("春天", "温暖") 解读 常量名(实参列表)
    //3.如果有多个常量(对象),使用,号间隔即可
    //4.如果使用enum来实现枚举,要求将定义常量对象,写在前面
    //5.如果我们使用的是无参构造器,创建常量对象,则可以省略()
    //6.枚举对象必须放在枚举类的行首
    SPRING("春天", "温暖"), WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"), SUMMER("夏天", "炎热");
//    What();//调用了无参构造器
    private String name;
    private String desc;

//    private Season2() {//无参构造器
//
//    }
    private Season2(String name, String desc) {
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


//课堂练习
enum Gender{
    BOY, GIRL; //这里其实是调用了Gender类的无参构造器
}