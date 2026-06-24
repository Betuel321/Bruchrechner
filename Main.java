import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String weiter = "j";

        while (weiter.equalsIgnoreCase("j")) {

            // --- Bruch 1 eingeben ---
            System.out.println("\nEnter values for fraction one");
            System.out.print("Numerator   : ");
            int z1 = scanner.nextInt();
            System.out.print("Denominator : ");
            int n1 = scanner.nextInt();
            Bruchzahl b1 = new Bruchzahl(z1, n1);
            System.out.println("Fraction one : " + b1);

            // --- Bruch 2 eingeben ---
            System.out.println("\nEnter values for fraction two");
            System.out.print("Numerator   : ");
            int z2 = scanner.nextInt();
            System.out.print("Denominator : ");
            int n2 = scanner.nextInt();
            Bruchzahl b2 = new Bruchzahl(z2, n2);
            System.out.println("Fraction two : " + b2);

            // --- Rechenoperation wählen ---
            System.out.println("\nRechenoperation wählen:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraktion (-)");
            System.out.println("3. Multiplikation (*)");
            System.out.println("4. Division (/)");
            System.out.print("Auswahl: ");
            int auswahl = scanner.nextInt();

            Bruchzahl ergebnis = null;
            String opSymbol = "";

            switch (auswahl) {
                case 1:
                    ergebnis = b1.addieren(b2);
                    opSymbol = "+";
                    break;
                case 2:
                    ergebnis = b1.subtrahieren(b2);
                    opSymbol = "-";
                    break;
                case 3:
                    ergebnis = b1.multiplizieren(b2);
                    opSymbol = "*";
                    break;
                case 4:
                    ergebnis = b1.dividieren(b2);
                    opSymbol = "/";
                    break;
                default:
                    System.out.println("Ungültige Auswahl!");
                    continue;
            }

            System.out.println("\n" + opSymbol + "  :  " + b1 + " " + opSymbol + " " + b2 + " = " + ergebnis);

            // --- Wiederholen? ---
            scanner.nextLine(); // Enter schlucken
            System.out.print("\nNochmal? (j/n): ");
            weiter = scanner.nextLine();
        }

        System.out.println("Programm beendet.");
        scanner.close();
    }
}
