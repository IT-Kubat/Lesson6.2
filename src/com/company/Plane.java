package com.company;

public class Plane extends Transport {

    public Plane() {
    }

    private String type;



    public Plane(String type, int year, String model){
        this.setYear(year);
        this.model = model;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public void printInfo() {
//        System.out.println(this.getYear() + "  " + super.getModel() + "  " + this.type);
    public String printInfo() {
    return this.getYear() + "  " + super.getModel() + "  "+ this.type;
    }

}
