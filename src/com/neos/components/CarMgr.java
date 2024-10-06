package com.neos.components;

import com.neos.models.FindAndMoveListener;

import java.util.ArrayList;

public class CarMgr implements FindAndMoveListener {
    private String name;
    private ArrayList<Car> listCar;

    public CarMgr(String name) {
        this.name = name;
        this.listCar = new ArrayList<>();
    }

    // Thêm ô tô vào danh sách
    public void addCar(Car car) {
        for (Car c : listCar) {
            if ( c.getCarId().equals( car.getCarId() ) ) {
                System.out.println("Xe ô tô này đã đăng ký.");
                return;
            }
        }

        listCar.add(car);
    }

    // Hiển thị toàn bộ thông tin ô tô
    public void showAllCarInfo() {
        for (Car car : listCar) {
            car.showInfo();
        }
    }

    // Tìm kiếm ô tô theo mã
    public Car findCar(String carId) {
        for (Car car : listCar) {
            if ( car.getCarId().equals(carId) ) {
                return car;
            }
        }

        return null;
    }

    @Override
    public Car find(char startPos, char destPos, String typePost) {
        return null;
    }

    @Override
    public Schedule move(char startPos, char destPos, String carId, String userName, String userId) {
        return null;
    }
}
