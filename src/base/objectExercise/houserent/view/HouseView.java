package base.objectExercise.houserent.view;

import base.objectExercise.houserent.domain.House;
import base.objectExercise.houserent.service.HouseService;
import base.objectExercise.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接受用户数据
    private HouseService houseService = new HouseService(10);


    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("\n==========房屋出租系统菜单===========");
            System.out.println("\t\t  1 新 增 房 源");
            System.out.println("\t\t  2 查 找 房 屋");
            System.out.println("\t\t  3 删 除 房 屋 信 息");
            System.out.println("\t\t  4 修 改 房 屋 信 息");
            System.out.println("\t\t  5 房 屋 列 表");
            System.out.println("\t\t  6 退       出");
            System.out.println("请输入如你的选择1-6");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }


    //addHouse()方法，增加房屋的显示
    public void addHouse() {
        System.out.println("=============添加房屋=============");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt(10);
        System.out.print("状态：");
        String state = Utility.readString(3);
        //创建一个对象House,注意id是系统分配的
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("=============添加房屋成功=============");
        } else {
            System.out.println("=============添加房屋失败=============");
        }
    }


    //通过id查找房屋
    public void findHouse() {
        System.out.println("===============查找房屋信息=============");
        System.out.print("请输入你要查找的id:");
        int findId = Utility.readInt();

        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("===============查找的id不存在=================");
        }
    }

    //删除房屋信息
    public void delHouse() {
        char key = ' ';
        System.out.println("============删除房屋信息===========");
        System.out.println("请选择待删除的房屋编号（-1退出）：");
        int delId = Utility.readInt(2);
        if (delId == -1) {
            System.out.println("=========你放弃删除房屋信息===========");
            return;
        }
        //注意该方法具有循环判断的逻辑，必须输入Y/N
        char choice = Utility.readConfirmSelection();

        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("=============删除房屋成功=============");
            } else {
                System.out.println("=============房屋编号不存在，删除房屋失败=============");

            }
        } else {
            System.out.println("============删除房屋信息===========");

        }
    }


    //修改房屋信息
    public void update() {
        System.out.println("==========修改房屋信息============");
        System.out.println("请选择待修改房屋编号(-1表示退出)");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("==============你放弃修改房屋信息=================");
            return;
        }
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("============修改房屋信息不存在============");
            return;
        }
        System.out.println("姓名(" + house.getName() + ")");
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhone() + ")");
        String phone = Utility.readString(12, "");
        if (!"".equals(name)) {
            house.setName(name);
        }

        System.out.println("地址(" + house.getAddress() + ")");
        String address = Utility.readString(8, "");
        if (!"".equals(name)) {
            house.setName(name);
        }

        System.out.println("租金(" + house.getRent() + ")");
        int rent = Utility.readInt(-1);
        if (!"".equals(name)) {
            house.setName(name);
        }

        System.out.println("状态(" + house.getState() + ")");
        String state = Utility.readString(3, "");
        if (!"".equals(name)) {
            house.setName(name);
        }
        System.out.println("================修改房屋信息成功================");
    }

    //编写listHouses()显示房屋列表
    public void listHouses() {
        System.out.println("===================房屋列表===================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=============房屋列表显示完毕=============");
    }

    String detail = "---------------------------房屋列表----------------------------";


    //退出系统
    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }
}
