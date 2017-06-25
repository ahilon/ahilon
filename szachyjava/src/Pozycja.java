
public class Pozycja {

    // Pozycje podajemy jako np. B5
    // a parametry przechowywane są jako int, x i y
    // z przedziału <1;8>
    int x;
    int y;

    // Konstruktor jedyny
    Pozycja(String pole){
        pole = pole.toUpperCase();
        ustawXY(pole);
    }

    // Zwraca wartosci x i y jako int
    public int dajX() {
        return x;
    }

    public int dajY() {
        return y;
    }

    //Sprawdza, czy pole jest poprawnie zdefiniowane,
    // tzn. czy znajduje sie na planszy
    // true, jezeli tak
    public boolean czyPoprawnaPozycja(String pole) {
        pole = pole.toUpperCase();
        if(pole.charAt(0) - 'A' + 1  < 1) {
            return false;
        }
        if(pole.charAt(0) - 'A' + 1  > 8) {
            return false;
        }
        if(pole.charAt(1) < 1) {
            return false;
        }
        if(pole.charAt(1) > '8') {
            return false;
        }

        return true;

    }

    // prywatne funkcje ustawiajacy X i Y
    private void ustawX(String pole){
        x = pole.charAt(0) - 'A' + 1;
    }

    private void ustawY(String pole){
        y = pole.charAt(1) - '1' + 1;
    }

    // ustawia wartosci XY jezeli podane zostało poprawne pole
    public void ustawXY(String pole){
        pole = pole.toUpperCase();
        if(czyPoprawnaPozycja(pole)){
            ustawX(pole);
            ustawY(pole);
        } else {
            System.out.println("Błędna Pozycja!");
        }
    }

    // Wypisuje wspolrzedna X
    public void wypiszX() {
        int tmp = 'A';
        tmp = tmp + x - 1;
        char xName = (char) tmp;
        System.out.println("x: " + xName + "(" + x + ")");
    }
    // Wypisuje wspolrzedna Y
    public void wypiszY() {
        System.out.println("y: " + y);
    }

    // Wypisuje wspolrzedne XY
    public void wypiszXY() {
        wypiszX();
        wypiszY();
    }

    // Zwraca wartość pola jako String
    // np. "B5", "A3"
    public String dajPozycje() {
        int tmp = 'A';
        tmp = tmp + x - 1;
        char xName = (char) tmp;
        String pole = xName + Integer.toString(y);
        return pole;
    }


}
