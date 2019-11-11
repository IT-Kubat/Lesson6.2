package com.company;

public class Istrebitel extends Plane {
    private String weapon;

    public Istrebitel() {
    }

    public Istrebitel(String type, int yaer, String model) {
        super(type, yaer, model);
    }

    public Istrebitel(String type, int yaer, String model, String weapon) {
        super(type, yaer, model);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
