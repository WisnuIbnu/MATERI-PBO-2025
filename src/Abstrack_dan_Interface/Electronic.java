package Abstrack_dan_Interface;

public class Electronic extends Product {

    private int warrantyPeriod;

    public Electronic(String name, int price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return super.toString() + ", Garansi: " + warrantyPeriod + " bulan";
    }
}

