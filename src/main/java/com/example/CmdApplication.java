package com.example;

public class CmdApplication {
    private KeySimulator keySimulator;
    private KeyHandler keyHandler;
    private KeyAction keyAction;
    private Configuration configuration;

    public CmdApplication() throws Exception {
        this.keySimulator = new KeySimulator();
        this.keyHandler = new KeyHandler();
        this.keyAction = new KeyAction(keySimulator);
        this.configuration = new Configuration();
    }

    public void run() {
        boolean running = true;

        // Benutzer wird aufgefordert, zwei Tasten einzugeben
        String[] keys = keyHandler.getTwoKeys();
        if (keys[0].equalsIgnoreCase("exit") || keys[1].equalsIgnoreCase("exit")) {
            running = false;
        } else {
            configuration.setKeys(keys);
            System.out.println("Sie haben '" + keys[0] + "' und '" + keys[1] + "' eingegeben.");
        }

        // Benutzer wird aufgefordert, den Hotkey einzugeben
        String hotkey = keyHandler.getHotkey();
        configuration.setHotkey(hotkey);
        System.out.println("Hotkey gesetzt: " + hotkey);

        // Schleife läuft, bis der Benutzer "exit" eingibt
        while (running) {
            String input = keyHandler.getCommand();

            if (input.equalsIgnoreCase("exit")) {
                running = false;
            } else if (input.equalsIgnoreCase(hotkey)) {
                try {
                    // Simulation der gespeicherten Tastendrücke
                    keyAction.simulateKeys(keys);
                } catch (Exception e) {
                    System.err.println("Fehler bei der Tastensimulation: " + e.getMessage());
                }
            } else {
                System.out.println("Ungültiger Hotkey. Bitte versuchen Sie es erneut.");
            }
        }

        // Scanner schließen und Ressourcen freigeben
        keyHandler.close();
        System.out.println("Programm beendet.");
    }
}
