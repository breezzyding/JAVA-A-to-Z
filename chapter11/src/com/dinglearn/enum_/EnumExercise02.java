package com.dinglearn.enum_;

/**
 * @author Ding
 * @version 1.0
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        System.out.println("===所有星期的信息如下===");
        for (Week week:values) {
            System.out.println(week);
        }
    }
}

enum Week {

    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"),
    SUNDAY("星期日");
    private final String chinaName;

    Week(String chinaName) {
        this.chinaName = chinaName;
    }

    @Override
    public String toString() {
        return chinaName;
    }
}
