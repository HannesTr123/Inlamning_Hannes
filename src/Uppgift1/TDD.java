package Uppgift1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TDD {
    @Test
    //Testar så räknaren för "tecken" räknar korrekt
    public void testTecken(){
        Counter counter = new Counter();
        counter.Lines("Hej hur är läget?");

        int expected = 14;
        int actual = counter.getantalTecken();

        assertEquals(expected,actual);
    }

    @Test
    //Testar så räknaren för "rader" räknar korrekt
    public void testRader() {
        Counter counter = new Counter();
        counter.Lines("Hej!");
        counter.Lines("Läget?");
        counter.Lines("Gött!");

        int expected = 3;
        int actual = counter.getantalRader();

        assertEquals(expected,actual);

    }

    @Test
    //Testar så de längsta ordet skrivs ut korrekt
    public void testlangstaOrd(){
        Counter counter = new Counter();
        counter.Lines("Hej hur mår du?");
        counter.Lines("Jättebra");

        String expected = "Jättebra";
        String actual = counter.getlangstaOrd();

        assertEquals(expected,actual);

    }
}