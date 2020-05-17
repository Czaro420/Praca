package dyskitwarde;

public class SSD extends DyskTwardy {

    private String kosciPamieci;
    private String kontroler;

    public SSD(double cena, String model, String producent, int pojemnosc, String kontroler, String odczytLosowy) {
        super(cena, model, producent, pojemnosc);

        this.kosciPamieci = kontroler;
        this.kontroler = odczytLosowy;

        System.out.println("Konstruktor: SSD");
    }

    public void ustawKosciPamieci(String kosciPamieci) {
        this.kosciPamieci = kosciPamieci;
    }

    public void ustawKontroler(String kontroler) {
        this.kontroler = kontroler;
    }

    public String uzyskajKosciPamieci() {
        return this.kosciPamieci;
    }

    public String uzyskajKontroler() {
        return kontroler;
    }

    @Override
    public String toString() {
        return super.toString() + ", kosci pamieci: " + kosciPamieci + ", kontroler: " + kontroler;
    }
}