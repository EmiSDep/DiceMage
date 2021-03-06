package com.emisdep;

import java.util.*;
import java.util.Map;

public class Cup extends Player{
    List<Die> dice = new ArrayList<>();


    public Cup(String name, int mana, int health, int power, List monsterDen){
        super(name, mana, health, power, monsterDen);
        while(dice.size() < 5) {
            dice.add(new Die());
        }
    }

    public void roll() {
        for (Die die : dice) {
            die.roll();
        }
    }

    public void roll(int selection) {
        dice.get(selection).roll();
    }

    public void roll(List<Integer> selections) {
        for (int selection : selections) {
            roll(selection);
        }
    }

    public String displayCup() {
        String output = "";
        for (Die die : dice) {
            output += die.faceUpValue + " ";
        }
        return output.trim();
    }


    public List<Integer> parseSelections(String input) {
        String[] inputArr = input.split(" "); // ["1", "2", "5"]
        // String[] -> List<Integer>
        List<Integer> selections = new ArrayList<>();
        for (String number : inputArr) {
            selections.add(Integer.parseInt(number) - 1);
        }

        return selections.contains(-1) ? new ArrayList<Integer>() : selections;
    }

}
