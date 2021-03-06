﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Zadanie_1.figury;

namespace Zadanie_1.Figury
{
    class Hetman : Figura
    {
        public Hetman(Pozycja pozycja, string kolor) : base(pozycja, kolor)
        {

        }
        public override bool CzyMoznaPrzesunac(Pozycja nowaPozycja)
        {
            return CzyPionowo(nowaPozycja) || CzyPoziomo(nowaPozycja) || CzySkos(nowaPozycja);
        }
    }
}
