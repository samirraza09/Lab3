package com.example.simpleparadox.listycity;

public class City {

    String province;
    String city;
    int position;

    public City(String province, String city) {
        this.province = province;
        this.city = city;
        this.position = -1;
    }

    public City(String province, String city, int position) {
        this.province = province;
        this.city = city;
        this.position = position;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
