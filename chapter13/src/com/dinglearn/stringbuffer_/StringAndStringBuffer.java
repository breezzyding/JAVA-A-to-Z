package com.dinglearn.stringbuffer_;

/**
 * @author Ding
 * @version 1.0
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {

        //看 String -> StringBuffer
        String str = "hello tom";
        //方式1 使用构造器
        //注意:返回的才是StringBuffer对象 对str本身没有影响
        StringBuffer stringBuffer1 = new StringBuffer(str);
        //方式2 使用的是append方法
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2 = stringBuffer2.append(str);

        //看看StringBuffer -> String
        //方式1
        StringBuffer stringBuffer3 = new StringBuffer("xiaoding");
        String s = stringBuffer3.toString();

        //方式2
        //使用构造器来搞定
        String s1 = new String(stringBuffer3);
    }
}
