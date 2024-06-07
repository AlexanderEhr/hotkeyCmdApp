package com.example;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KeySimulator {
    private Robot robot;
    private static final Logger logger = Logger.getLogger(KeySimulator.class.getName());

    // Konstruktor initialisiert das Robot-Objekt zur Tastensimulation
    public KeySimulator() throws Exception {
        this.robot = new Robot();
    }

    // Methode zur Simulation eines Tastendrucks
    public void simulateKeyPress(char keyChar) {
        try {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(keyChar);
            if (keyCode != KeyEvent.VK_UNDEFINED) {
                // Drückt und lässt die Taste los
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
                logger.info("Taste simuliert: " + keyChar);
            } else {
                logger.warning("Unbekannter Tastencode für: " + keyChar);
            }
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, "Fehler bei der Simulation des Tastendrucks", e);
        }
    }
}
