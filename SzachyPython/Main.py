import Pozycja
#import Figura
from Wieza import Wieza
from Goniec import Goniec
from Krolowa import Krolowa
from Krol import Krol


testW = Wieza("A6", "Czarny")
print(testW.toString())
testW.wypiszPole()
testW.ruch("E6")
testW.wypiszPole()


testG = Goniec("A1", "Biały")
print(testG.toString())
testG.wypiszPole()
testG.ruch("C3")
testG.wypiszPole()

testK = Krolowa("H8", "Biały")
print(testK.toString())
testK.wypiszPole()
testK.ruch("D4")
testK.wypiszPole()

testKr = Krol("A8", "Czarny")
print(testKr.toString())
testKr.wypiszPole()
testKr.ruch("B7")
testKr.wypiszPole()