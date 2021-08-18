package com.dinglearn.poly_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //使用多态机制,可以统一的管理主人喂食的问题
    //animal 编译类型就是 Animal 可以指向(接受)Animal子类的对象
    //animal 编译类型就是 Food 可以指向(接受)Food子类的对象
    public void feed(Animal animal, Food food) {
        System.out.println("主人" + name + "给" + animal.getName() +
                "吃" + food.getName());
    }

    //主人给小狗 喂食 骨头
//    public void feed(Dog dog, Bone bone) {
//        System.out.println("主人" + name + "给" + dog.getName() +
//                "吃" + bone.getName());
//    }
//
    //主人给小猫 喂食 黄花鱼 croaker
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("主人" + name + "给" + cat.getName() +
//                "吃" + fish.getName());
//    }

    //如果动物很多,食物很多
    //====> feed 方法很多,不利于管理和维护
    //Pig ---> Rice
    //Tiger ---> Meat
    //...


    /**
     * 问题:代码的复用性不高,而且不利于维护
     * 解决方案:多态 polymorphic
     */
}
