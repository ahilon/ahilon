
public abstract class Figura {

    public Pozycja pozycja;
    public String nazwa;
    public String kolor;

    Figura(String pole){
        pozycja = new Pozycja(pole);
        // just Figura things....
    }

    public abstract void ruch(String pozycja);

    // metoda sprawdzająca czy można przesunąć figurę na wybrane pole
    // zawiera metody:
    // - czyPoprawnePole
    // - czyDozwolonyDlaFigury
    public abstract boolean czyDozwolonyRuch(int noweX, int noweY);

    // metoda sprawdzająca czy pole znajduje się na planszy
    public static boolean czyPoprawnePole(int noweX, int noweY){
        //czy mieści się na planszy
        if(noweX<1)
            return false;
        if(noweX>8)
            return false;
        if(noweY<1)
            return false;
        if(noweY>8)
            return false;

        return true;
    }

    // metoda sprawdzająca czy ruch dozwolony dla figury
    public abstract boolean czyDozwolonyDlaFigury(int noweX, int noweY, int x, int y);


    public boolean Equals(Figura innaFigura){

        if(pozycja.dajX() == innaFigura.pozycja.dajX()
                && pozycja.dajY() == innaFigura.pozycja.dajY()
                )
            return true;
        else
            return false;

    }

    // przeciazana wersja
    public boolean Equals(String innePole){

        if(pozycja.dajPozycje() == innePole)
            return true;
        else
            return false;

    }
}
