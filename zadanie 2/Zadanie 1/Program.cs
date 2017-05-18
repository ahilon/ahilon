using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Zadanie_1.Figury;
using Zadanie_1.figury;


namespace Zadanie_1
{
    class Program
    {
        static void Main(string[] args)
        {
            Pozycja p = new Pozycja("B5");
            Pozycja p2 = new Pozycja("D4");
			Figura f = new Pionek(p, Kolor.KOLOR_BIALY);
            Console.WriteLine(f.CzyMoznaPrzesunac(p2));
			Console.ReadKey ();
			Pionek p4 = new Pionek(p, Kolor.KOLOR_CZARNY);
			p4.CzyMoznaPrzesunac(p);
			Console.WriteLine (p4.CzyMoznaPrzesunac (p2) + " " + p4.kolor);




        }
    }
}
     
