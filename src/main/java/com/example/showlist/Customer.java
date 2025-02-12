package com.example.showlist;

public class Customer {
    public String name;
    public String date;
    public String address;
    public String img;
    public Customer(String name, String date, String address, String img){
        this.name= name;
        this.date= date;
        this.address=address;
        this.img= img;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}

