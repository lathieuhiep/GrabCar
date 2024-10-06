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
    public String showInfo() {
        return "Mã xe: " + carId + "\n" +
                "Biển số xe: " + number + "\n" +
                "Mã tài khoản: " + userId + "\n" +
                "Họ tên người dùng: " + userName + "\n" +
                "Vị trí đầu: " + startPos + "\n" +
                "Vị trí cuối: " + destPos + "\n" +
                "Số km: " + kmTotal + "\n" +
                "Chi phí: " + cost;
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
