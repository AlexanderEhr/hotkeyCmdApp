package com.example;

public class KeyAction {
    private KeySimulator keySimulator;

    public KeyAction(KeySimulator keySimulator) {
        this.keySimulator = keySimulator;
    }

    public void simulateKeys(String[] keys) throws Exception {
        for (String key : keys) {
            if (key.length() != 1) {
                throw new IllegalArgumentException("Nur einzelne Zeichen sind erlaubt: " + key);
            }
            keySimulator.simulateKeyPress(key.charAt(0));
        }
    }
}
