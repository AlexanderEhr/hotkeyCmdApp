package com.example;

import java.util.Scanner;

public class KeyInputHandler {
    private Scanner scanner;

    // Konstruktor initialisiert den Scanner für Benutzereingaben
    public KeyInputHandler() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Fordert den Benutzer auf, zwei Tasten einzugeben und gibt sie zurück.
     * @return Ein Array von zwei Strings, die die eingegebenen Tasten darstellen.
     */
    public String[] getTwoKeys() {
        String[] keys = new String[2];

        // Erste Taste eingeben
        System.out.print("Geben Sie die erste Taste ein: ");
        keys[0] = scanner.nextLine().trim();

        // Zweite Taste eingeben
        System.out.print("Geben Sie die zweite Taste ein: ");
        keys[1] = scanner.nextLine().trim();

        return keys;
    }

    /**
     * Fordert den Benutzer auf, einen Hotkey einzugeben und gibt ihn zurück.
     * @return Ein Array mit einem String, der den eingegebenen Hotkey darstellt.
     */
    public String getHotkey() {
        System.out.print("Geben Sie den Hotkey ein: ");
        return scanner.nextLine().trim();
    }

    /**
     * Schließt den Scanner und beendet die Ressourcennutzung.
     */
    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }
}

