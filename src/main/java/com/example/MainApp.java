package com.example;

public class MainApp {
    public static void main(String[] args) {
        try {
            // Erstellen einer Instanz von CmdApplication und Ausführen der Anwendung
            CmdApplication app = new CmdApplication();
            app.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}