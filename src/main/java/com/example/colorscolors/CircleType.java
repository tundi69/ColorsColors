package com.example.colorscolors;

import java.awt.Color;
        import java.io.IOException;
        import java.io.InputStream;
        import java.util.ArrayList;
        import java.util.HashSet;
        import java.util.Random;
        import java.util.Scanner;
        import java.util.Set;

public class CircleType {

    private Color specColor;
    private String nm;
    static ArrayList<String> randomList = new ArrayList<>();
    private ArrayList<String> guessList = new ArrayList<>();
    private ArrayList<Integer> foglaltList = new ArrayList<>();

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public CircleType(Color specColor) {
        this.specColor = specColor;
    }

    public String getString() {

        Scanner scanner = new Scanner(System.in);
        nm = scanner.nextLine();

        guessList.add(nm);
        return nm;
    }

    public ArrayList<String> addRndList() {

        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            int rndNumber = random.nextInt(8) + 1;
            nm = Integer.toString(rndNumber);
            randomList.add(nm);
        }
        return randomList;
    }

    public Color setCollor() {

        if (nm.equals("1"))
            specColor = Color.magenta;
        if (nm.equals("2"))
            specColor = Color.white;
        if (nm.equals("3"))
            specColor = Color.yellow;
        if (nm.equals("4"))
            specColor = Color.red;
        if (nm.equals("5"))
            specColor = Color.cyan;
        if (nm.equals("6"))
            specColor = Color.green;
        if (nm.equals("7"))
            specColor = Color.gray;
        if (nm.equals("8"))
            specColor = Color.pink;
        return specColor;

    }

    public int compareLists() {
        int match = 0;

        System.out.println(guessList);
        System.out.println(randomList);

        for (int c = 0; c < 4; c++) {
            System.out.println(guessList.get(c) + randomList.get(c));
            if (guessList.get(c).equals(randomList.get(c))) {
                match = match + 1;
            }
        }

        return match;
    }

    String compareListAgain() {
        int matchw = 0;
        int cw;

        for (int c = 0; c < 4; c++) {

            for (cw = 0; cw < 4; cw++) {

                if (foglaltList.contains(cw)) {
                    cw = cw + 1;
                }
                if (foglaltList.contains(cw)) {
                    cw = cw + 1;
                }
                if (foglaltList.contains(cw)) {
                    cw = cw + 1;
                }
                if (cw < 4 && guessList.get(c).equals(randomList.get(cw))) {
                    matchw = matchw + 1;

                    foglaltList.add(cw);
                    System.out.println(foglaltList);
                    cw = 4;
                }
            }
        }
        String matchwS = Integer.toString(matchw);
        return matchwS;
    }

    public CircleType() {
        super();
        this.guessList = guessList;
    }
}
