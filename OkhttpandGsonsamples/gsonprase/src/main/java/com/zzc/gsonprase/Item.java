package com.zzc.gsonprase;

/**
 * Created by zzc on 2017/3/4.
 */

public class Item {
    private String price;
    private  String name;
    private Mode mode;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price='" + price + '\'' +
                ", name='" + name + '\'' +
                ", mode=" + mode.getColor()+"--"+mode.getVersion()+"--"+mode.getId()+"--"+
                '}';
    }
}
