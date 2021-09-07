//package com.dinglearn.enum_;
//
///**
// * @author Ding
// * @version 1.0
// */
//public class Enumeration01 {
//    public static void main(String[] args) {
//        //使用
//        Season spring = new Season("春天","温暖");
//        Season winter = new Season("冬天","寒冷");
//        Season summer = new Season("夏天","炎热");
//        Season autumn = new Season("秋天","凉爽");
////        autumn.setName("XXX");
////        autumn.setDesc("XXX");"
//        //因为对于季节来言,他的对象(具体值),是固定的四个,不会有更多
//        //当前设计思路,不能体现季节是固定的四个对象
//        //因此,这样的设计不好 ===> 枚举类 (把具体的对象一个一个地列举出来)
//        Season other = new Season("今天","难捱");
//
//
//    }
//}

//class Season{
//    private String name;
//    private String desc;
//
//    public Season(String name, String desc) {
//        this.name = name;
//        this.desc = desc;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//}
