package com.neos.components;

import com.neos.models.FindAndMoveListener;

import java.util.ArrayList;

public class CarMgr implements FindAndMoveListener {
    private static CarMgr instance;
    private String name;
    private ArrayList<Car> listCar;

    public CarMgr(String name) {
        this.name = name;
        this.listCar = new ArrayList<>();
    }

    public static CarMgr getInstance(String name) {
        if (instance == null) {
            instance = new CarMgr(name);
        }

        return instance;
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
        int index = 0;
        for (Car car : listCar) {
            if (index >= 1) {
                System.out.println("=====================");
            }

            car.showInfo();

            index++;
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
        Car selectedCar = null;
        int minDistance = Integer.MAX_VALUE;
        int minCost = Integer.MAX_VALUE;

        for (Car car : listCar) {
            if ( car.getTypePos().equals(typePost) ) {
                // khoảng cách vị trí hiện tại đến xe
                int distance = Math.abs(startPos - car.getStartPos());

                if (distance < minDistance) {
                    int cost = distance * car.getPrice();

                    selectedCar = car;
                    minDistance = distance;
                    minCost = cost;
                } else if (distance == minDistance) {
                    int cost = distance * car.getPrice();

                    if (cost < minCost) {
                        selectedCar = car;
                        minCost = cost;
                    }
                }
            }
        }

        return selectedCar;
    }

    @Override
    public Schedule move(char startPos, char destPos, String carId, String userName, String userId) {
        Car car = findCar(carId);

        if ( car != null ) {
            return car.drive(startPos, destPos, userName, userId);
        }

        return null;
    }

    // Hiển thị tổng thu nhập của tất cả các ô tô
    public void showTotalCost() {
        int totalCost = 0;

        for (Car car : listCar) {
           totalCost += car.getCostTotal();
        }

        System.out.println("Tổng số tiền thu được của tất cả các ô tô: " + totalCost);
    }
}
