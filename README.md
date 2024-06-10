# Java Übung: Hotkey Simulator

Dieses Projekt ist ein einfacher Hotkey-Simulator, der in Java implementiert wurde. Der Benutzer gibt zwei Tasten ein, gefolgt von einer Hotkey-Taste. Wenn der Hotkey gedrückt wird, simuliert das Programm die Eingabe der beiden zuvor eingegebenen Tasten.

## Verzeichnisstruktur

```bash
src
└── com
└── example
├── CmdApplication.java
├── Configuration.java
├── KeyAction.java
├── KeyHandler.java
├── KeySimulator.java
└── MainApp.java
```

## Klassenbeschreibung

- **MainApp**: Startet die Anwendung.
- **CmdApplication**: Enthält die Hauptlogik der Anwendung.
- **Configuration**: Speichert Konfigurationsdaten wie die zu drückenden Tasten und den Hotkey.
- **KeyAction**: Definiert Aktionen für Tastenereignisse und simuliert die Eingaben.
- **KeyHandler**: Verwaltet die Benutzereingaben.
- **KeySimulator**: Verwendet die `Robot`-Klasse, um Tastendrücke zu simulieren.

## Verwendung

### Kompilieren

Navigieren Sie im Terminal zum `src`-Verzeichnis und kompilieren Sie die Klassen:

```sh
cd path/to/your/project/src
javac com/example/*.java
Ausführen
```

Führen Sie nach der Kompilierung die MainApp-Klasse aus:
````bash
java com.example.MainApp
````

Interaktion

    Geben Sie zwei Tasten ein, wenn Sie dazu aufgefordert werden.
    Geben Sie einen Hotkey ein.
    Drücken Sie den Hotkey oder geben Sie exit ein, um das Programm zu beenden.
    Wenn der Hotkey gedrückt wird, simuliert das Programm die Eingabe der beiden zuvor eingegebenen Tasten.

Beispiel
````bash
Geben Sie die erste Taste ein: a
Geben Sie die zweite Taste ein: b
Hotkey gesetzt: h
Drücken Sie den Hotkey oder geben Sie 'exit' ein, um das Programm zu beenden: h
Sie haben 'a' und 'b' eingegeben.
Drücken Sie den Hotkey oder geben Sie 'exit' ein, um das Programm zu beenden: exit
Programm beendet.
````
Voraussetzungen

    Java Development Kit (JDK) 11 oder höher

Lizenz

Dieses Projekt ist unter der MIT-Lizenz lizenziert. Weitere Informationen finden Sie in der LICENSE-Datei.
Autor

Erstellt von [Alexander Ehrlich].
