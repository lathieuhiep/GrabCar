package com.neos.components;

public class Car {
    private String carId;
    private String name;
    private String number;
    private String term;
    private String typePos;
    private int price;
    private char startPos;
    private char destPos;
    private int kmTotal;
    private int costTotal;

    public Car(String carId, String name, String number, String term, String typePos, int price, char startPos, char destPos, int kmTotal, int costTotal) {
        this.carId = carId;
        this.name = name;
        this.number = number;
        this.term = term;
        this.typePos = typePos;
        this.price = price;
        this.startPos = startPos;
        this.destPos = destPos;
        this.kmTotal = kmTotal;
        this.costTotal = costTotal;
    }

    // phương thức hiển thị thông tin
    public String showInfo() {
        return "Mã xe: " + carId + "\n" +
                "Tên lá xe: " + name + "\n" +
                "Biển số xe: " + number + "\n" +
                "Hãng xe: " + term + "\n" +
                "Loại xe: " + typePos + "\n" +
                "Giá cước trên 1 km: " + price + "\n" +
                "Vị trí hiện tại: " + startPos + "\n" +
                "Vị trí đích đến: " + destPos + "\n" +
                "Số km đã đi: " + kmTotal + "\n" +
                "Thu nhập hiện tại: " + costTotal;
    }

    // Phương thức hiển thị và trả về thu nhập
    public int showCost() {
        System.out.println("Giá cước 1km: " + price);
        System.out.println("Số km đã đi: " + kmTotal);
        System.out.println("Thu nhập: " + costTotal);

        return costTotal;
    }

    // Phương thức drive
    public Schedule drive(char startPos, char destPos, String userId, String userName) {
        this.startPos = startPos;
        this.destPos = destPos;

        int km = ( (int) destPos ) - ( (int) startPos);
        this.kmTotal =+ km;

        int cost = this.price * km;
        this.costTotal =+ cost;

        System.out.println("Số tiền khách trả của lộ trình: Từ " +  startPos + " đến " + destPos + " là: " + cost);

        return new Schedule(carId, number, userId, userName, startPos, destPos, km, cost);
    }

    // các phương thức get
    public String getCarId() {
        return carId;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getTerm() {
        return term;
    }

    public String getTypePos() {
        return typePos;
    }

    public int getPrice() {
        return price;
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

    public int getCostTotal() {
        return costTotal;
    }
}
