package com.example.colorscolors;

import java.util.ArrayList;
import java.util.Random;

public class CircleType {

    private String nm;
    static ArrayList<String> randomList = new ArrayList<>();
    static ArrayList<String> guessList = new ArrayList<>();
    static ArrayList<Integer> busyList = new ArrayList<>();

    public CircleType(javafx.scene.paint.Color specColor) {
    }

    public ArrayList<String> addRndList() {

        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            int rndNumber = random.nextInt(8);
            nm = Integer.toString(rndNumber);
            randomList.add(nm);
        }
        return randomList;
    }

    public int compareLists() {
        int match = 0;

        for (int c = 0; c < 4; c++) {
            if (guessList.get(c).equals(randomList.get(c))) {
                match = match + 1;
            }
        }
        return match;
    }

    int compareListAgain() {
        int matchw = 0;
        int cw;

        for (int c = 0; c < 4; c++) {

            for (cw = 0; cw < 4; cw++) {

                if (busyList.contains(cw)) {
                    cw = cw + 1;
                }
                if (busyList.contains(cw)) {
                    cw = cw + 1;
                }
                if (busyList.contains(cw)) {
                    cw = cw + 1;
                }
                if (cw < 4 && guessList.get(c).equals(randomList.get(cw))) {
                    matchw = matchw + 1;

                    busyList.add(cw);
                    cw = 4;
                }
            }
        }
        return matchw;
    }
}
