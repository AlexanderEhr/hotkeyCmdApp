package com.example;

import java.util.Scanner;

public class KeyHandler {
    private Scanner scanner;

    public KeyHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String[] getTwoKeys() {
        String[] keys = new String[2];
        System.out.print("Geben Sie die erste Taste ein: ");
        keys[0] = scanner.nextLine().trim();
        System.out.print("Geben Sie die zweite Taste ein: ");
        keys[1] = scanner.nextLine().trim();
        return keys;
    }

    public String getHotkey() {
        System.out.print("Geben Sie den Hotkey ein: ");
        return scanner.nextLine().trim();
    }

    public String getCommand() {
        System.out.print("Drücken Sie den Hotkey oder geben Sie 'exit' ein, um das Programm zu beenden: ");
        return scanner.nextLine().trim();
    }

    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
