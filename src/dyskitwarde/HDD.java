package dyskitwarde;

public class HDD extends DyskTwardy {

    private int iloscTalerzy;
    private int predkoscObrotowa;

    public HDD(double cena, String model, String producent, int pojemnosc, int iloscTalerzy, int predkoscObrotowa) {
        super(cena, model, producent, pojemnosc);
        
        this.iloscTalerzy = iloscTalerzy;
        this.predkoscObrotowa = predkoscObrotowa;
        
        System.out.println("Konstruktor: HDD");
    }

    public void ustawPrekoscObrotowa(int prekoscObrotowa) {
        this.predkoscObrotowa = prekoscObrotowa;
    }

    public void ustawIloscTalerzy(int iloscTalerzy) {
        this.iloscTalerzy = iloscTalerzy;
    }

    public int uzyskajIloscTalerzy() {
        return iloscTalerzy;
    }

    public int uzyskajPrekoscObrotowa() {
        return predkoscObrotowa;
    }

    @Override
    public String toString() {
        return super.toString() + ", ilosc talerzy: " + iloscTalerzy + ", predkosc obrotowa: " + predkoscObrotowa + "obr./min";
    }
}