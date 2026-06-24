# Bruchzahlen
> Ein einfaches Konsolenprogramm, das zwei Brüche einliest, eine Rechenoperation auswählt und das Ergebnis berechnet und kürzt.

---

## 📋 Projektinformationen

| Feld              | Inhalt                          |
|-------------------|---------------------------------|
| **Projektname**   | Bruchzahlen                     |
| **Klasse / Kurs** | 1a APC                          |
| **Schuljahr**     | 2026                            |
| **Abgabedatum**   | 24.06.2026                      |
| **Autor/in**      | Betül Celik                     |
| **Lehrer/in**     | Gerhard Jarz                    |
| **Fach**          | Programmieren / Java            |

---

## 📝 Projektbeschreibung

- **Ziel der Anwendung:** Das Programm ermöglicht das Rechnen mit Brüchen (Addition, Subtraktion, Multiplikation, Division) und gibt das Ergebnis automatisch gekürzt aus.
- **Hauptfunktionen:**
  - Einlesen von zwei Brüchen (Zähler und Nenner) über die Konsole.
  - Auswahl einer der vier Grundrechenarten über ein Menü (Switch-Case).
  - Berechnung des größten gemeinsamen Teilers (ggT) nach dem Euklidischen Algorithmus.
  - Berechnung des kleinsten gemeinsamen Vielfachen (kgV) – notwendig für Addition und Subtraktion.
  - Automatisches Kürzen des Ergebnisses.
  - Das Programm kann beliebig oft wiederholt werden.

---

## 📸 Bildschirmfoto

> Füge hier eine Bildschirmaufnahme des laufenden Programms ein.

![Bildschirmfoto des Programms](./bildschirmfoto.png)

<!-- So fügst du ein Bildschirmfoto ein:
     1. Aufnahme erstellen und als "bildschirmfoto.png" im Projektordner speichern
     2. Den Pfad oben anpassen, falls das Bild woanders liegt -->

---

## 🛠️ Entwicklungsumgebung

### Verwendete Programme & Werkzeuge

| Programm / Werkzeug | Version        | Zweck                            |
|---------------------|----------------|----------------------------------|
| IntelliJ IDEA       | Neueste Version | Entwicklungsumgebung            |
| Java Development Kit | 17 / 21       | Kompilieren und Ausführen        |
| Strukto.io          | Web-Version    | Erstellung des Struktogramms     |

### Zusatzpakete & Bibliotheken

| Paket / Bibliothek  | Version  | Zweck                                              |
|---------------------|----------|----------------------------------------------------|
| java.util.Scanner   | Standard | Einlesen von Benutzereingaben über die Konsole     |

### Betriebssystem (Entwicklung)

- **Betriebssystem:** Windows

---

## 🚀 Installation & Ausführung

### Voraussetzungen

- [x] Java ist installiert
- [x] Entwicklungsumgebung (IntelliJ) oder Kommandozeile ist vorhanden

### Schritte

```text
# 1. In den Projektordner wechseln
cd [Pfad-zum-Ordner]

# 2. Quellcode kompilieren (beide Dateien)
javac Bruchzahl.java Main.java

# 3. Programm starten
java Main
```

> **Hinweis:** Zähler und Nenner müssen ganze Zahlen (Integer) sein. Kommazahlen werden nicht unterstützt.

---

## 🔗 Quellen

### Verweise & Dokumentation

| Quelle                        | Beschreibung                                         |
|-------------------------------|------------------------------------------------------|
| Unterrichtsmaterial           | Unterlagen: OOP, Klassen und Methoden                |
| Java Scanner Dokumentation    | Offizielle Beschreibung der Scanner-Klasse           |
| Euklidischer Algorithmus      | Mathematisches Verfahren zur Berechnung des ggT      |

### KI-Unterstützung

| Werkzeug | Verwendete Anfrage / Zweck |
|----------|----------------------------|
| Claude (Anthropic) | „Hilfe bei der Erstellung des Quellcodes für eine Bruchzahlen-Klasse mit ggT, kgV und den vier Grundrechenarten." |

---

## ⚠️ Bekannte Probleme / Einschränkungen

- [x] Das Programm hat keine grafische Oberfläche, sondern läuft nur in der Text-Konsole.
- [x] Bei Eingabe von Buchstaben (anstatt von Zahlen) stürzt das Programm ab, da dies nicht abgefangen wird.
- [x] Division durch null (Nenner = 0) wird nicht abgefangen.

---

## 📄 Lizenz

Dieses Projekt wurde im Rahmen des Schulunterrichts erstellt und ist nicht für die kommerzielle Nutzung vorgesehen.
