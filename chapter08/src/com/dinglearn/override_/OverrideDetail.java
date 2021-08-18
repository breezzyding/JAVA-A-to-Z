package com.dinglearn.override_;

public class OverrideDetail {
    /**
     * 1.子类的方法的参数,方法名称,要和父类方法的参数,方法名称完全一致
     * 2.子类方法的返回类型和父类返回类型一样,或者是父类返回类型的子类
     *   比如:父类 返回类型是 Object 子类方法返回类型是String
     *   public Object getInfo() ~ public String getInfo()
     *
     * 3.子类方法不能缩小父类方法的访问权限
     *    public > protected > 默认 > private
     *
     */

    /**
     * 课堂练习
     * 名称           发生范围    方法名             形参列表                返回类型                      修饰符
     * 重载overload   本类       一致     类型/个数/顺序至少一个不同           无要求                       无要求
     * 重写override   父子类     一致                一致             子类的返回类型和父类一致/是其子类     一致/放大
     *
     */
}
