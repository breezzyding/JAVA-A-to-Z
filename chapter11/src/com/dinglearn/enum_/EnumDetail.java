package com.dinglearn.enum_;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author Ding
 * @version 1.0
 */
public class EnumDetail {
    public static void main(String[] args) {
        /*
        1)使用enum关键字后,就不能再继承其他类了,因为enum会隐式继承Enum
          而Java是单继承机制
        2)枚举类和普通类一样,可以实现接口,如下形式
          enum 类名 implements 接口1 接口2
         */

        Music.HIPHOP.playing();
    }
}

interface IPlaying {
    public void playing();
}
enum Music implements IPlaying{
    CLASSICAL, HIPHOP, JAZZ, POP;

    @Override
    public void playing() {
        System.out.println("正在播放...");
    }
}
