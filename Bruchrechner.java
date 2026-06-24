public class Bruchzahl {

    private int zaehler;
    private int nenner;

    // Konstruktor
    public Bruchzahl(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    // Getter
    public int getZaehler() { return zaehler; }
    public int getNenner()  { return nenner; }

    // Ausgabe als String z.B. "2/6"
    public String toString() {
        return zaehler + "/" + nenner;
    }

    // ggT (größter gemeinsamer Teiler) - Euklidischer Algorithmus
    public int ggT(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }

    // kgV (kleinstes gemeinsames Vielfaches)
    public int kgV(int a, int b) {
        return Math.abs(a * b) / ggT(a, b);
    }

    // Kürzen
    public Bruchzahl kuerzen() {
        int g = ggT(zaehler, nenner);
        return new Bruchzahl(zaehler / g, nenner / g);
    }

    // Addition
    public Bruchzahl addieren(Bruchzahl b2) {
        int gemNenner = kgV(this.nenner, b2.getNenner());
        int neuerZaehler = (this.zaehler * (gemNenner / this.nenner))
                + (b2.getZaehler() * (gemNenner / b2.getNenner()));
        return new Bruchzahl(neuerZaehler, gemNenner).kuerzen();
    }

    // Subtraktion
    public Bruchzahl subtrahieren(Bruchzahl b2) {
        int gemNenner = kgV(this.nenner, b2.getNenner());
        int neuerZaehler = (this.zaehler * (gemNenner / this.nenner))
                - (b2.getZaehler() * (gemNenner / b2.getNenner()));
        return new Bruchzahl(neuerZaehler, gemNenner).kuerzen();
    }

    // Multiplikation
    public Bruchzahl multiplizieren(Bruchzahl b2) {
        return new Bruchzahl(this.zaehler * b2.getZaehler(),
                this.nenner  * b2.getNenner()).kuerzen();
    }

    // Division
    public Bruchzahl dividieren(Bruchzahl b2) {
        return new Bruchzahl(this.zaehler * b2.getNenner(),
                this.nenner  * b2.getZaehler()).kuerzen();
    }
}
