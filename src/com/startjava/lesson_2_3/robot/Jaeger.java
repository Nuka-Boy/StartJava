package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int strength;
    private int armor;
    
    public Jaeger() {
    }

    public Jaeger(String modelName, double height, double weight, int strength, int armor) {
        this.modelName = modelName;

        if (modelName.equals("CoyoteTango")) {
            mark = "Mark - 1";
            origin = "Japan";
            this.height = 85.34;
            this.weight = 2.312;
            this.strength = 7;
            this.armor = 4;
        } else {
            this.modelName = "";
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    } 

    boolean drift() {
        return true;
    }   

    String scanKaiju() {
        return "scanning";
    }

    void chackAttackSystem() {
        System.out.println("all systems are active");
    }
}