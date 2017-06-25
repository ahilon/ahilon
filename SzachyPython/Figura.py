from Pozycja import Pozycja

class Figura(object):


    def __init__(self, pole, kolor):

        self.kolor = kolor
        self.pozycja = Pozycja(pole)

    def wypiszPole(self):
        self.pozycja.wypiszPole(self)

    def ruch(self, pole):
        x = ord(pole[0]) - ord('A') + 1
        y = ord(pole[1]) - ord('0')


        if(self.czyDozwolonyRuch(x,y) == False):
            print("Niepoprawne pole")
        else :
            self.pozycja.ustawXY(pole)

    def czyPoprawnePole(self, x, y):
        if (x < 1 or x > 8):
            return False
        if (y < 1 or y > 8):
            return False
        return True

    def czyDozwolonyDlaFigury(self, x, y):

        return False



    def czyDozwolonyRuch(self,x,y):
        if(self.czyPoprawnePole(x,y) == False):
            return False

        if(self.czyDozwolonyDlaFigury(x,y) == False):
            return False

        return True


