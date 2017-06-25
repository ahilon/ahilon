
public class Krol extends Figura{

    public String nazwa = "Krol";
    public String kolor;

    Krol(String pole, String kolorFigury) {
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

        //1
        if(noweX == x-1 && noweY == y+1)
            return true;
        //2
        if(noweX == x && noweY == y+1)
            return true;
        //3
        if(noweX == x+1 && noweY == y+1)
            return true;
        //4
        if(noweX == x+1 && noweY == y)
            return true;
        //5
        if(noweX == x+1 && noweY == y-1)
            return true;
        //6
        if(noweX == x && noweY == y-1)
            return true;
        //7
        if(noweX == x-1 && noweY == y-1)
            return true;
        //8
        if(noweX == x-1 && noweY == y)
            return true;

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
