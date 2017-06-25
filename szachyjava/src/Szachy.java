
public class Szachy {

    public static void main(String[] args){
        // --------------------------- Pozycja ---------------------------
        System.out.println("--------------------------- Pozycja ---------------------------");
        Pozycja przyk = new Pozycja("B5");

        System.out.println(przyk.dajPozycje());
        przyk.wypiszXY();

        przyk.ustawXY("A5");
        System.out.println(przyk.dajPozycje());
        przyk.wypiszXY();

        // --------------------------- Wieza ---------------------------
        System.out.println("--------------------------- Wieza ---------------------------");
        Wieza wieza = new Wieza("C3","Czarny");
        System.out.println(wieza.toString());
        wieza.ruch("A3");
        System.out.println(wieza.toString());
        // teraz błędny ruch <- dla sprawdzenia
        wieza.ruch("C5");
        System.out.println(wieza.toString());

        // --------------------------- Goniec ---------------------------
        System.out.println("--------------------------- Goniec ---------------------------");
        Goniec goniec = new Goniec("B6", "Biały");
        System.out.println(goniec.toString());
        goniec.ruch("E3");
        System.out.println(goniec.toString());

        // --------------------------- Krolowa ---------------------------
        System.out.println("--------------------------- Krolowa ---------------------------");
        Krolowa krolowa = new Krolowa("H8", "Biały");
        System.out.println(krolowa.toString());
        krolowa.ruch("A1");
        System.out.println(krolowa.toString());

        // --------------------------- Krol ---------------------------
        System.out.println("--------------------------- Krol ---------------------------");
        Krol krol = new Krol("A8", "Biały");
        System.out.println(krol.toString());
        krol.ruch("B8");
        System.out.println(krol.toString());

        // --------------------------- Kon ---------------------------
        System.out.println("--------------------------- Kon ---------------------------");
        Kon kon = new Kon("D4", "Czarny");
        System.out.println(kon.toString());
        kon.ruch("F5");
        System.out.println(kon.toString());

        // --------------------------- Equals (rowne) ---------------------------
        System.out.println("--------------------------- Equals (rowne) ---------------------------");
        Kon kon2 = new Kon("E4", "Czarny");
        Goniec goniec2 = new Goniec("E4", "Czarny");

        System.out.println(goniec2.toString());
        System.out.println(kon2.toString());
        System.out.println(kon2.Equals(goniec2));

        // --------------------------- Equals (nierowne) ---------------------------
        System.out.println("--------------------------- Equals (nierowne) ---------------------------");
        goniec2.ruch("D3");
        System.out.println(goniec2.toString());
        System.out.println(kon2.toString());
        System.out.println(goniec2.Equals(kon2));
        System.out.println(goniec2.Equals("A2"));
    }
}
