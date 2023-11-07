package Uppgift1;

import static org.junit.Assert.assertEquals;
public class Counter {
    int antalTecken = 0;
    int antalRader = 0;
    String langstaOrd = "";
    int antalOrd = 0;


    public void Lines(String input) {
        antalTecken += input.replaceAll("\\s+","").length();
        antalRader++;

        String[] Ord = input.split("\\s+");
        antalOrd += Ord.length;

        for (String langsta : Ord){
            if (langsta.length() > langstaOrd.length()){
                langstaOrd = langsta;
            }
        }
    }

    public void summary() {

        System.out.println("Antal tecken: " + antalTecken);
        System.out.println("Antal rader: " + antalRader);
        System.out.println("Antal ord: " + antalOrd);
        if (!langstaOrd.isEmpty()) {
            System.out.println("Det längsta ordet är: " + langstaOrd);
        }
        System.out.println("Programmet avslutas");
    }

    public int getantalTecken () {

        return antalTecken;
    }

    public int getantalRader () {

        return antalRader;
    }

    public String getlangstaOrd() {

        return langstaOrd;
    }
}