package com.emisdep;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public String name = "";
    int health = 5;
    int mana = 4;
    int power = 6;
    List<Die> monsterDen = new ArrayList<>();

    public Player(String name){
        this.name = name;

    }

    public Player(String name, int mana, int health, int power, List monsterDen) {
    }

    public void addMana(int amt){
        mana += amt;
    }
}
