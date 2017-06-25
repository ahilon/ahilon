import Pozycja
from Figura import Figura

class Krol(Figura):

    def __init__(self, pole, kolor):
        Figura.__init__(self, pole, kolor)
        self.name = "Krol"



    def wypiszPole(self):
        return self.pozycja.wypiszPole()

    def czyDozwolonyDlaFigury(self, x, y):
        #1
        if(x == self.pozycja.x - 1 and y == self.pozycja.y+1):
            return True
        #2
        if (x == self.pozycja.x and y == self.pozycja.y + 1):
            return True
        #3
        if (x == self.pozycja.x + 1 and y == self.pozycja.y + 1):
            return True
        #4
        if (x == self.pozycja.x + 1 and y == self.pozycja.y):
            return True
        #5
        if (x == self.pozycja.x + 1 and y == self.pozycja.y - 1):
            return True
        #6
        if (x == self.pozycja.x and y == self.pozycja.y - 1):
            return True
        #7
        if (x == self.pozycja.x - 1 and y == self.pozycja.y - 1):
            return True
        #8
        if (x == self.pozycja.x - 1 and y == self.pozycja.y):
            return True

        return False


    def toString(self):
        return self.name + " " + self.kolor + " " + self.pozycja.zwrocPole()


