package com.neos.user;

import com.neos.components.Car;
import com.neos.components.Schedule;
import com.neos.models.FindAndMoveListener;

import java.util.ArrayList;

public class User {
    private String userId;
    private String pass;
    private String userName;
    private ArrayList<Schedule> listSchedule;
    private FindAndMoveListener findAndMoveListener;

    public User(String userId, String pass, String userName) {
        this.userId = userId;
        this.pass = pass;
        this.userName = userName;
        this.listSchedule = new ArrayList<>();
    }

    // Hiển thị thông tin người dùng
    public void showInfo() {
        System.out.println("Mã tài khoản: " + userId);
        System.out.println("Họ tên: " + userName);
    }

    // Đăng ký sự kiện tìm kiếm và di chuyển
    public void addFindAndMoveListener(FindAndMoveListener event) {
        this.findAndMoveListener = event;
    }

    // Tìm kiếm xe
   public void findCar(char startPos, char destPos, String typePos) {
        Car car = findAndMoveListener.find(startPos, destPos, typePos);

       if (car != null) {
           // in thông tin xe
           car.showInfo();

           // in thông tin lộ trình
           Schedule schedule = findAndMoveListener.move(startPos, destPos, car.getCarId(), userName, userId);
           schedule.showInfo();

           // thêm thông tin lộ trình vào danh sách
           listSchedule.add(schedule);
       }
   }

   // Hiển thị danh sách lộ trình đã đi
    public void showAllSchedule() {
        System.out.println("Danh sách lộ trình:");

        int totalCost = 0;
        for (Schedule schedule : listSchedule) {
            totalCost =+ schedule.getCost();

            schedule.showInfo();
            System.out.println();
        }

        System.out.println("Tổng chi phí: " + totalCost);
    }
}
