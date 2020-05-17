package dyskitwarde;

public class DyskTwardy implements Comparable<DyskTwardy>{

    private int pojemnosc;
    private String model;
    private String producent;
    private double cena;

    public DyskTwardy(double cena, String model, String producent, int pojemnosc) {
        this.cena = cena;
        this.model = model;
        this.producent = producent;
        this.pojemnosc = pojemnosc;

        System.out.println("Konstruktor: DyskTwardy");
    }

    public void ustawCene(double cena) {
        this.cena = cena;
    }

    public void ustawModel(String model) {
        this.model = model;
    }

    public void ustawProducent(String producent) {
        this.producent = producent;
    }

    public void ustawPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public double uzyskajCena() {
        return cena;
    }

    public int uzyskajPojemnosc() {
        return pojemnosc;
    }

    public String uzyskajModel() {
        return model;
    }

    public String uzyskajProducent() {
        return producent;
    }

    @Override
    public String toString() {
        return "Producent: " + producent + ", model: " + model + ", pojemnosc: " + pojemnosc + "GB, cena: " + cena + "zł";
    }

    @Override
    public int compareTo(DyskTwardy dyskTwardy) {
        return Double.compare(cena, dyskTwardy.cena);
    }
}