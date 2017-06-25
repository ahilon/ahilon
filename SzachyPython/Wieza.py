import Pozycja
from Figura import Figura

class Wieza(Figura):

    def __init__(self, pole, kolor):
        Figura.__init__(self, pole, kolor)
        self.name = "Wieza"



    def wypiszPole(self):
        return self.pozycja.wypiszPole()

    def czyDozwolonyDlaFigury(self, x, y):
        if(x == self.pozycja.x and y != self.pozycja.y):
            return True
        if(x != self.pozycja.x and y == self.pozycja.y):
            return True

        return False

    def toString(self):
        return self.name + " " + self.kolor + " " + self.pozycja.zwrocPole()



