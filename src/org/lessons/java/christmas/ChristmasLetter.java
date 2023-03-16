package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChristmasLetter {

    private String name;
    private String address;
    private List<String> wishes;
    private boolean isGood;

    public ChristmasLetter(String name, String address, List<String> wishes) {
        this.name = name;
        this.address = address;
        this.wishes = wishes;
        Random rnd = new Random();
        this.isGood = rnd.nextBoolean();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public void send() throws RuntimeException {

        if(wishes.size()>5) throw new RuntimeException("Più di 5 desideri");
        if(!isGood) throw new RuntimeException("Cattivo");
        System.out.println(wishes+name+address);

    }

    @Override
    public String toString() {
        return "ChristmasLetter{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", wishes=" + wishes +
                '}';
    }
}
