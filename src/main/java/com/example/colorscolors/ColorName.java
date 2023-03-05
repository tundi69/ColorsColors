
package com.example.colorscolors;


public enum ColorName {
    MAGENTA, WHITE, YELLOW, RED, GREEN, CYAN, GRAY, PINK;

    public static String toString(int i) {
        return values()[i].toString();
    }
}
