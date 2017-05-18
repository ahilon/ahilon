using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Zadanie_1.Figury;

namespace Zadanie_1.figury
{
    class Goniec : Figura

    {
        public Goniec(Pozycja pozycja, string kolor) : base(pozycja, kolor)
        {
        }
        public override bool CzyMoznaPrzesunac(Pozycja nowaPozycja)

        {
            return CzySkos(nowaPozycja);

        }
    }
}
