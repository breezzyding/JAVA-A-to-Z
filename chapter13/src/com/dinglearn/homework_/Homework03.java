package com.dinglearn.homework_;

public class Homework03 {
    /*
     * (1)编写java程序,输入形式为:Ding han zhang的人名,以Zhang,Han .S的形式打印
     *    其中.S是中间单词的首字母
     * (2)例如输入 "William Jefferson Clinton" 输出 Clinton,Willian .J
     *
     * 思路分析
     * 1.对输入的字符串进行分割 split("")
     * 2.对得到的String[] 进行格式化String.format()
     * 3.对输入的字符串进行校验
     *
     */
    public static void main(String[] args) {
        String name1 = "William Jefferson Clinton";
        rewriteName(name1);
        String name2 = "Ding Han Zhang";
        rewriteName(name2);


    }

    public static void rewriteName(String name) {

        if (name == null) {
            System.out.println("str 不能为空");
            return;
        }

        String[] names = name.split(" ");
        if (names.length != 3) {
            System.out.println("输入的字符串格式不对");
            return;
        }

        String format = String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }



}


