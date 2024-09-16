package com.ppg.day06.myclass;

public class Water {
    String brand;
    String color;
    int vedtro;
    String modol;
    int buyNum;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVedtro() {
        return vedtro;
    }

    public void setVedtro(int vedtro) {
        this.vedtro = vedtro;
    }

    public String getModol() {
        return modol;
    }

    public void setModol(String modol) {
        this.modol = modol;
    }

    public int getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(int buyNum) {
        this.buyNum = buyNum;
    }

    public Water(String brand, int buyNum, String modol, String color, int vedtro) {
        this.brand = brand;
        this.buyNum = buyNum;
        this.modol = modol;
        this.color = color;
        this.vedtro = vedtro;
    }

    public String printWater() {
        return new StringBuilder()
                .append(this.brand).append(", ")
                .append(this.buyNum).append(", ")
                .append(this.color).append(", ")
                .append(this.vedtro).append(", ")
                .append(this.modol)
                .toString();
    }


    public Water() {
    }
}
