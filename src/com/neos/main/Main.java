package com.neos.main;

import com.neos.components.Car;
import com.neos.components.CarMgr;
import com.neos.user.User;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Oto1", "Hoàng Văn Nam", "29B-1145", "Huyndai", "4 chỗ", 10000, 'A', 'B', 0, 0);
        Car car2 = new Car("Oto2", "Trần Tính", "29B-1234", "Toyota", "4 chỗ", 12000, 'B', 'C', 0, 0);
        Car car3 = new Car("Oto3", "Đặng Nam Anh", "29B-1115", "Audi", "7 chỗ", 13000, 'E', 'F', 0, 0);
        Car car4 = new Car("Oto4", "Nguyễn Tuấn Vũ", "29B-3452", "Mercedes", "7 chỗ", 13000, 'B', 'C', 0, 0);
        Car car5 = new Car("Oto5", "Trần Dục Đức", "29B-9821", "Hyundai", "4 chỗ", 8000, 'A', 'B', 0, 0);
        Car car6 = new Car("Oto6", "Trịnh Thị Thủy", "29B-2241", "Hyundai", "7 chỗ", 8000, 'B', 'C', 0, 0);

        // quản lý xe
        CarMgr carMgr = CarMgr.getInstance("Quản lý GrabCar");

        // thêm xe
        carMgr.addCar(car1);
        carMgr.addCar(car2);
        carMgr.addCar(car3);
        carMgr.addCar(car4);
        carMgr.addCar(car5);
        carMgr.addCar(car6);

        // hiển thị danh sách ô tô
        carMgr.showAllCarInfo();

        // tạo một người dùng
        User user1 = new User("User01", "password123", "Nguyen Van A");

        // Đăng ký lắng nghe và nhận phản hổi từ CarMgr
        user1.addFindAndMoveListener(carMgr);

        // tìm kiếm xe
        user1.findCar('A', 'C', "4 chỗ");

        // Hiển thị toàn bộ danh sách lộ trình đã đi của người dùng
        user1.showAllSchedule();

        // Hiển thị tổng thu nhập của tất cả các ô tô
        System.out.println();
        carMgr.showTotalCost();

    }
}