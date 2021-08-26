package com.dinglearn.homework.homework13;

/**
 * 案例题目描述
 * (1)做一个Student类,Student类有名称(name),性别(sex),年龄(age)
 * 学号(stu_id) 做合理封装,通过构造器在创建对象时将4个属性赋值
 * (2)写一个Teacher类,Teacher类有名称(name),性别(sex),年龄(age)
 * 工龄(work_age) 做合理封装,通过构造器在创建对象时将4个属性赋值
 * (3)抽取一个父类Person类,将共同属性和方法放到Person类
 * (4)学生需要有学习的方法(study),在方法里写上"我承诺,我会好好学习"
 * (5)教师需要有教学的方法(teach),在方法里写上"我承诺,我会认真教学"
 * (6)学生和教师都有玩的方法(play),学生玩的是足球,老师玩的是象棋
 * 此方法是返回字符串的,分别返回"xx爱玩足球"和"xx爱玩象棋"
 * (其中xx分别代表学生和老师的姓名)因为玩的方法名称都一样,所以要求
 * 此方法在父类中,子类实现重写。
 * <p>
 * <p>
 * (7)定义多态数组,里面保存2个学生和两个教师,要求按年龄从高到低排序
 * (8)定义方法,形参为Person类型,功能:调用学生的study或教师的teach方法
 */
public class Homework13 {
    public static void main(String[] args) {

        Student student = new Student("小丁", '男', 20, "05061122");
        student.printInfo();
        Teacher teacher = new Teacher("加一", '女', 19, 3);
        teacher.printInfo();


        //定义多态数组,里面保存2个学生和两个教师,要求按年龄从高到低排序
        Person[] persons= new Person[4];
        persons[0] = new Student("Xiaoding", '男', 17, "1122");
        persons[1] = new Student("Dhz", '男', 25, "0506");
        persons[2] = new Teacher("Jiayi", '女', 24, 3);
        persons[3] = new Teacher("Ljy", '女', 23, 2);

        Homework13 homework13 = new Homework13();
        homework13.bubbleSort(persons);

        //输出排序后的数组
        System.out.println("-----排序后的数组-----");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        //遍历数组,调用test方法
        System.out.println("==========================");
        for (int i = 0; i < persons.length; i++) {//遍历多态数组
            homework13.test(persons[i]);
        }

    }

    //方法完成年龄,从高到低完成排序
    Person temp = null;
    public void bubbleSort(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }


    //定义方法,形参为Person类型,功能:调用学生的study或教师的teach方法
    //分析这里会使用到向下转型和类型转换
    public void test(Person p) {
        if (p instanceof Student) {//p的运行类型如果是Student
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        } else {
            System.out.println("do nothing...");
        }
    }

}
