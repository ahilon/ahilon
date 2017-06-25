
public class Krolowa extends Figura{


    public String nazwa = "Krolowa";
    public String kolor;

    Krolowa(String pole, String kolorFigury) {
        super(pole);
        pozycja = new Pozycja(pole);
        this.kolor = kolorFigury;

    }

    @Override
    public void ruch(String nowePole){
        int noweX = nowePole.charAt(0) - 'A' + 1;
        int noweY = nowePole.charAt(1) - '1' + 1;

        if(czyDozwolonyRuch(noweX, noweY))
            pozycja.ustawXY(nowePole);
        else
            System.out.println("Błędny Ruch");


    }

    @Override
    public boolean czyDozwolonyDlaFigury(int noweX, int noweY, int x, int y) {

        // pion i poziom
        if(noweX == x && noweY != y)
            return true;
        if(noweX != x && noweY == y)
            return true;

        // skosy
        int tmpX;
        int tmpY;

        for(int i = 1; i<8; i++) {

            // lewo  - gora
            tmpX = x - i;
            tmpY = y + i;
            if(noweX == tmpX && noweY == tmpY)
                return true;

            // prawo  - gora
            tmpX = x + i;
            tmpY = y + i;
            if(noweX == tmpX && noweY == tmpY)
                return true;

            // prawo  - dol
            tmpX = x + i;
            tmpY = y - i;
            if(noweX == tmpX && noweY == tmpY)
                return true;

            // lewo  - dol
            tmpX = x - i;
            tmpY = y - i;
            if(noweX == tmpX && noweY == tmpY)
                return true;
        }

        return false;
    }

    public boolean czyDozwolonyRuch(int noweX, int noweY){
        //czy mieści się na planszy
        if(czyPoprawnePole(noweX, noweY) == false)
            return false;

        //czy dozwolony dla figury
        if(czyDozwolonyDlaFigury(noweX, noweY, pozycja.dajX(), pozycja.dajY()) == false)
            return false;

        return true;
    }

    @Override
    public String toString() {
        return nazwa + " " + kolor + " " + pozycja.dajPozycje();
    }
}
