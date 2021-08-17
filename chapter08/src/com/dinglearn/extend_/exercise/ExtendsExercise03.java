package com.dinglearn.extend_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {

        /**
         * 编写Computer类 包含CPU 内存 硬盘等属性，getDetail方法用于返回Computer的详细信息
         * 编写PC子类，继承Computer类，添加特有属性 品牌brand
         */
        PC pc = new PC("intel", 16, 500, "IBM");
        NotePad notePad = new NotePad("M1", 16, 500, "white");
        pc.printInfo();
        notePad.printInfo();
    }
}

class Computer {//父类
    private String cpu;
    private int ram;
    private int disk;

    public Computer(String cpu, int ram, int disk) {
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    //返回Computer详细信息
    public String getDetails() {
        return "Computer‘s Information:" + "CPU " + cpu +
                " RAM " + ram + " Disk " + disk;
    }
}

class PC extends Computer {//子类

    private String brand;

    //根据继承的规则，自动把构造器的调用写好
    //这里也体现：继承设计的基本思想，父类构造器完成父类属性初始化
    //子类的构造器完成子类属性初始化
    public PC(String cpu, int ram, int disk, String brand) {
        super(cpu, ram, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC信息如下：");
//        System.out.println(getCpu() + getRam() + getDisk());
        System.out.println(getDetails() + " Brand " + brand);
    }
}

class NotePad extends Computer {

    private String color;

    public NotePad(String cpu, int ram, int disk, String color) {
        super(cpu, ram, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("NotePad信息如下：");
        System.out.println(getDetails() + " Color " + color);
    }
}





