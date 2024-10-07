package com.neos.components;

public class Schedule {
    private String carId;
    private String number;
    private String userId;
    private String userName;
    private char startPos;
    private char destPos;
    private int kmTotal;
    private int cost;

    public Schedule(String carId, String number, String userId, String userName, char startPos, char destPos, int kmTotal, int cost) {
        this.carId = carId;
        this.number = number;
        this.userId = userId;
        this.userName = userName;
        this.startPos = startPos;
        this.destPos = destPos;
        this.kmTotal = kmTotal;
        this.cost = cost;
    }

    // Phương thức hiển thị thông tin lộ trình
    public void showInfo() {
        System.out.println("Mã xe: " + carId);
        System.out.println("Biển số xe: " + number);
        System.out.println("Mã tài khoản: " + userId);
        System.out.println("Họ tên người dùng: " + userName);
        System.out.println("Vị trí đầu: " + startPos);
        System.out.println("Vị trí cuối: " + destPos);
        System.out.println("Số km: " + kmTotal);
        System.out.println("Chi phí: " + cost);
    }

    // các phương thức get
    public String getCarId() {
        return carId;
    }

    public String getNumber() {
        return number;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getStartPos() {
        return startPos;
    }

    public char getDestPos() {
        return destPos;
    }

    public int getKmTotal() {
        return kmTotal;
    }

    public int getCost() {
        return cost;
    }
}
