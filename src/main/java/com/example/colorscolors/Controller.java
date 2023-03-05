package com.example.colorscolors;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller {
    private Color specColor;
    private CircleType circleType = new CircleType(specColor);
    @FXML
    public Button startButton;
    @FXML
    public Button magenta;
    @FXML
    public Button white;
    @FXML
    public Button yellow;
    @FXML
    public Button red;
    @FXML
    public Button green;
    @FXML
    public Button cyan;
    @FXML
    public Button pink;
    @FXML
    public Button grey;
    @FXML
    private GridPane matrix = new GridPane();
    private String nm;
    int x = -2;
    int y = 2;
    int i = -1;
    @FXML
    public Label first;
    @FXML
    public Label second;
    @FXML
    public Label third;
    @FXML
    public Label fourth;
    @FXML
    public Label fifth;
    @FXML
    public Label sixth;
    @FXML
    public Label seventh;
    @FXML
    public Label eighth;
    @FXML
    public Label ninth;
    @FXML
    public Label tenth;
    private Button btn;
    int radius = 17;


    public void startGame(javafx.event.ActionEvent event) {

        circleType.addRndList();
        changeButtonVisibilityTrue();
        getInput(event);
    }

    public void checkResult() {
        i = i + 1;
        int match = circleType.compareLists();
        String matchS = Integer.toString(match);

        Label labelArray[];
        labelArray = new Label[10];
        labelArray[0] = first;
        labelArray[1] = second;
        labelArray[2] = third;
        labelArray[3] = fourth;
        labelArray[4] = fifth;
        labelArray[5] = sixth;
        labelArray[6] = seventh;
        labelArray[7] = eighth;
        labelArray[8] = ninth;
        labelArray[9] = tenth;

        if (match == 4) {
            labelArray[i].setText("you won!");
            revealSolution();
            changeVisibilityFalse();
            startButton.setOnAction(null);
        } else {
            int matchw = circleType.compareListAgain();
            int differency = (matchw - match);
            labelArray[i].setText(differency + " fit " + matchS);
            y = y + 1;
            if (y == 12) {
                labelArray[i].setText("game over!");
                revealSolution();
                changeVisibilityFalse();
                startButton.setOnAction(null);
            }
            x = -1;
        }
    }
    private void revealSolution(){
         int x = 0;
        for (String element : CircleType.randomList) {
            int numElement = Integer.parseInt(element);
             String stringColorName = ColorName.toString(numElement);
             Circle c = new Circle(radius, Color.valueOf(stringColorName));
             matrix.add(c, x, 0);
             x=x+1;}
        }


    public void changeButtonVisibilityTrue() {
        magenta.setVisible(true);
        white.setVisible(true);
        yellow.setVisible(true);
        red.setVisible(true);
        green.setVisible(true);
        cyan.setVisible(true);
        pink.setVisible(true);
        grey.setVisible(true);
    }


    public void changeVisibilityFalse() {
        //btn.setOnAction(null);
        magenta.setVisible(false);
        white.setVisible(false);
        yellow.setVisible(false);
        red.setVisible(false);
        green.setVisible(false);
        cyan.setVisible(false);
        pink.setVisible(false);
        grey.setVisible(false);
    }

    public void getInput(javafx.event.ActionEvent event) {
        x = x + 1;
        btn = (Button) event.getSource();
        String id = btn.getId();

        switch (id) {
            case "magenta":
                nm = String.valueOf(ColorName.MAGENTA.ordinal());
                CircleType.guessList.add(nm);
                Circle c = new Circle(radius, Color.MAGENTA);
                matrix.add(c, x, y);
                break;
            case "white":
                nm = String.valueOf(ColorName.WHITE.ordinal());
                CircleType.guessList.add(nm);
                Circle c2 = new Circle(radius, Color.WHITE);
                matrix.add(c2, x, y);
                break;
            case "yellow":
                nm = String.valueOf(ColorName.YELLOW.ordinal());
                CircleType.guessList.add(nm);
                Circle c3 = new Circle(radius, Color.YELLOW);
                matrix.add(c3, x, y);
                break;
            case "red":
                nm = String.valueOf(ColorName.RED.ordinal());
                CircleType.guessList.add(nm);
                Circle c4 = new Circle(radius, Color.RED);
                matrix.add(c4, x, y);
                break;
            case "green":
                nm = String.valueOf(ColorName.GREEN.ordinal());
                CircleType.guessList.add(nm);
                Circle c5 = new Circle(radius, Color.GREEN);
                matrix.add(c5, x, y);
                break;
            case "cyan":
                nm = String.valueOf(ColorName.CYAN.ordinal());
                CircleType.guessList.add(nm);
                Circle c6 = new Circle(radius, Color.CYAN);
                matrix.add(c6, x, y);
                break;
            case "pink":
                nm = String.valueOf(ColorName.PINK.ordinal());
                CircleType.guessList.add(nm);
                Circle c8 = new Circle(radius, Color.PINK);
                matrix.add(c8, x, y);
                break;
            case "grey":
                nm = String.valueOf(ColorName.GRAY.ordinal());
                CircleType.guessList.add(nm);
                Circle c7 = new Circle(radius, Color.GRAY);
                matrix.add(c7, x, y);
                break;
        }

        if (CircleType.guessList.size() == 4) {
            checkResult();
            CircleType.guessList.clear();
            CircleType.busyList.clear();

        }
    }
}



