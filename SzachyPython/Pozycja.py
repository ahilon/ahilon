# Python version 3.6

class Pozycja:
    x = 0
    y = 0

    def __init__(self, pole):
        x = ord(pole[0]) - ord('A') + 1
        y = ord(pole[1]) - ord('0')

        if(self.czyPoprawnaPozycja(x,y)):
            self.x = x
            self.y = y
        else:
            self.x = 1
            self.y = 1

    def ustawXY(self, pole):
        x = ord(pole[0]) - ord('A') + 1
        y = ord(pole[1]) - ord('0')

        if (self.czyPoprawnaPozycja(x, y)):
            self.x = x
            self.y = y
        else:
            print("Błędne współrzędne!")


    def zwrocX(self):
        return self.x

    def zwrocY(self):
        return self.Y

    def zwrocPole(self):
        return chr(self.x + ord('A') - 1) + chr(self.y + ord('1') - 1)

    def wypiszPole(self):
        print(chr((self.x + ord('A') - 1)) + chr(self.y + ord('1') - 1))

    def czyPoprawnaPozycja(self,x,y):
        if(x<1 or x>8):
            return False
        if(y<1 or y>8):
            return False
        return True


