package base.objectExercise.houserent.service;

import base.objectExercise.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录id增长的情况

    //构造器
    public HouseService(int size) {
        houses = new House[size];//创建HouseService对象 ,指定数组大小
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
    }

    //list方法,返回houses
    public House[] list() {
        return houses;
    }

    public boolean add(House newHouse) {
        //新增一个房屋，把newHouse对象加入到HouseNum++中
        houses[houseNums++] = newHouse;

        //系统更新id的值
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int delId) {
        //应当要找到要删除的房屋信息对应的下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(delId == houses[i].getId()){
                index = i;//记录id的值
            }
        }
        //说明delID在数组不存在
        if(index == -1){
            return false;
        }
        for (int i = index; i < houseNums -1; i++) {
            houses[i] = houses[i+1];
        }
        //把最后一个房屋信息置空并减少一个房屋信息
        houses[--houseNums] = null;

        return true;
    }
    //findById方法，返回House对象或者null
    public House findById(int findId){
        for (int i = 0; i < houseNums; i++) {
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
}
