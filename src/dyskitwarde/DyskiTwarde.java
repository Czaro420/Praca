package dyskitwarde;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DyskiTwarde 
{
    public static void main(String[] args) 
    {
        DyskTwardy dysk = new DyskTwardy(839.00, "WD60PURZ", "WD", 2000);
        System.out.println(dysk.toString());
        
        HDD dyskHDD = new HDD(839.00, "WD60PURZ", "WD", 2000, 2, 5400);
        System.out.println(dyskHDD.toString());
        
        SSD dyskSSD = new SSD(299.00, "M8VC", "Plextor", 512, "TLC", "Silicon Motion SM2258");
        System.out.println(dyskSSD.toString());
        
        // komentarz do zadania 1: konstruktor klasy bazowej wykonuje się w pierwszej kolejności
        
        //Zadanie2();
        
        //Zadanie3();
        // komentarz do zadania 3: rzutowanie do klasy bazowej nie zmienia zachowania obiektu
    }
    
    static void Zadanie2()
    {
        List<DyskTwardy> dyskiTwarde = new ArrayList<>();
        
        dyskiTwarde.add(new SSD(300.11, "M8VC", "Plextor", 512, "TLC", "Silicon Motion SM2258"));
        dyskiTwarde.add(new SSD(300.22, "M8VC", "Plextor", 512, "TLC", "Silicon Motion SM2258"));
        dyskiTwarde.add(new SSD(300.33, "M8VC", "Plextor", 512, "TLC", "Silicon Motion SM2258"));
        
        Collections.sort(dyskiTwarde);
        
        for (DyskTwardy dysk : dyskiTwarde)
            System.out.println(dysk.toString());
        
        Collections.reverse(dyskiTwarde);
        
        for (DyskTwardy dysk : dyskiTwarde)
            System.out.println(dysk.toString());
    }
    static void Zadanie3()
    {
        DyskTwardy dysk = new DyskTwardy(839.00, "WD60PURZ", "WD", 2000);
        System.out.println(dysk.toString());
        
        DyskTwardy dyskHDD = new HDD(839.00, "WD60PURZ", "WD", 2000, 2, 5400);
        System.out.println(dyskHDD.toString());
        
        DyskTwardy dyskSSD = new SSD(299.00, "M8VC", "Plextor", 512, "TLC", "Silicon Motion SM2258");
        System.out.println(dyskSSD.toString());
    }
}