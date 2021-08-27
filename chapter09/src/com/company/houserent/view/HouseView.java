package com.company.houserent.view;

import com.company.houserent.domain.House;
import com.company.houserent.service.HouseService;
import com.company.houserent.utils.Utility;
import sun.security.mscapi.CPublicKey;

/**
 * 1.显示界面
 * 2.接受用户输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {

    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接受用户选择
    private HouseService houseService = new HouseService(1);//设置数组的大小为10

    //显示主菜单
    public void mainMenu() {

        do {
            System.out.println("\n-------------房屋出租系统菜单-------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请输入你的选择(1-6):");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    deleteHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;

            }

        } while(loop);
    }


    //编写listHouses() 显示房屋列表
    public void listHouse() {
        System.out.println("-------------房屋列表-------------");
        System.out.println("编号\t\t房屋\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {//有坑
            if (houses[i] == null) {//如果为null,就不用再显示了
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("-------------房屋列表显示完毕-------------");
    }

    //编写addHouse() 接受用户输入,创建House对象,调用add方法
    public void addHouse() {
        System.out.println("-------------添加房屋-------------");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(3);
        //创建一个新的House对象,注意id是系统分配的,用户不能输入
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("-------------添加成功-------------");
        } else {
            System.out.println("-------------添加失败-------------");
        }
    }

    //编写deleteHouse() 接受输入的id号,调用delete方法
    public void deleteHouse() {
        System.out.println("-------------删除房屋-------------");
        System.out.print("请选择待删除房屋编号(-1退出):");
        int deleteId = Utility.readInt();
        if (deleteId == -1) {
            System.out.println("-------------放弃删除房屋信息-------------");
            return;
        }
        System.out.println("确认是否删除(Y/N),请小心选择。");
        char choice = Utility.readConfirmSelection();//该方法本身就有循环判断的逻辑,必须输出Y/N
        if (choice == 'Y') {//删除房屋
            if (houseService.delete(deleteId)) {
                System.out.println("-------------删除成功-------------");
            } else {
                System.out.println("-------------房屋编号不存在,删除失败-------------");
            }
        } else {
            System.out.println("-------------放弃删除房屋信息-------------");
        }
    }

    //编写exit() 完成退出确认
    public void exit() {
        //使用Utility提供方法,完成确认
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }


    //编写updateHouse() 修改房屋信息
    public void updateHouse() {
        System.out.println("-------------修改房屋信息-------------");
        System.out.print("请选择待修改房屋编号(-1退出):");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("-------------放弃修改房屋信息-------------");
            return ;
        }

        //根据输入得到updateId,查找对象
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("-------------你想修改的房屋信息不存在-------------");
            return ;
        }

        System.out.print("姓名("+house.getName()+"):");
        String name = Utility.readString(8,"");//这里如果用户直接回车表示不修改该信息,默认""
        if (!"".equals(name)) {//修改
            house.setName(name);
        }

        System.out.print("电话("+house.getPhone()+"):");
        String phone = Utility.readString(12);
        if (!"".equals(phone)) {//修改
            house.setPhone(phone);
        }

        System.out.print("地址("+house.getAddress()+"):");
        String address = Utility.readString(16);
        if (!"".equals(address)) {//修改
            house.setAddress(address);
        }

        System.out.print("月租("+house.getRent()+")");
        int rent = Utility.readInt(-1);
        if (rent != -1) {//修改
            house.setRent(rent);
        }

        System.out.print("状态("+house.getState()+")");
        String state = Utility.readString(3);
        if (!"".equals(state)) {//修改
            house.setState(state);
        }
        System.out.println("-------------修改房屋信息成功-------------");

    }

    //编写find() 查找房屋信息
    public void findHouse() {
        System.out.println("-------------查找房屋信息-------------");
        System.out.print("请输入要查找的id:");
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("-------------查找房屋信息不存在-------------");
        }
    }


}
