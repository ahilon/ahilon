import Pozycja
from Figura import Figura

class Krolowa(Figura):

    def __init__(self, pole, kolor):
        Figura.__init__(self, pole, kolor)
        self.name = "Krolowa"



    def wypiszPole(self):
        return self.pozycja.wypiszPole()

    def czyDozwolonyDlaFigury(self, x, y):
        #pion i poziom
        if (x == self.pozycja.x and y != self.pozycja.y):
            return True
        if (x != self.pozycja.x and y == self.pozycja.y):
            return True

        #skosy
        for i in range(1,8):

            tmpX = self.pozycja.x - i;
            tmpY = self.pozycja.y + i;
            if (x == tmpX and y == tmpY):
                return True

            tmpX = self.pozycja.x + i;
            tmpY = self.pozycja.y + i;
            if (x == tmpX and y == tmpY):
                return True

            tmpX = self.pozycja.x + i;
            tmpY = self.pozycja.y - i;
            if (x == tmpX and y == tmpY):
                return True

            tmpX = self.pozycja.x - i;
            tmpY = self.pozycja.y - i;
            if (x == tmpX and y == tmpY):
                return True

        return False

    def toString(self):
        return self.name + " " + self.kolor + " " + self.pozycja.zwrocPole()


