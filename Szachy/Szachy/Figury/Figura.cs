using System;

namespace Szachy.Figury
{
	public class Figura
	{
		
		public const char symbol_PustePole = ' ';
		public static char[,] ustawieniePoczatkowe;


		public Figura ()
		{
			ustawieniePoczatkowe = new char[Szachownica.wymiar, Szachownica.wymiar];
			intUstawieniePoczatkowe();
		}
		private void intUstawieniePoczatkowe()
		{
			for(int rzad =0; rzad <Szachownica.wymiar; rzad++)
			{
				for (int kolumna = 0; kolumna < Szachownica.wymiar; kolumna++) 
				{
					if (rzad == 1) {
						ustawieniePoczatkowe [rzad, kolumna] = Pionek.symbol_pionka;
					} else if (rzad == Szachownica.wymiar - 2) {
						ustawieniePoczatkowe [rzad, kolumna] = Pionek.symbol_pionka;
					} else if (rzad == 0 && kolumna == 0 || rzad == 0 && kolumna == Szachownica.wymiar - 1) {
						ustawieniePoczatkowe [rzad, kolumna] = Wieza.symbol_wieza;
					} else if (rzad == Szachownica.wymiar-1 && kolumna == 0 || rzad == Szachownica.wymiar-1 && kolumna == Szachownica.wymiar - 1) {
						ustawieniePoczatkowe [rzad, kolumna] = Wieza.symbol_wieza;
					}else if (rzad == 0 && kolumna == 1 || rzad == 0 && kolumna == Szachownica.wymiar - 2) {
						ustawieniePoczatkowe [rzad, kolumna] = Skoczek.symbol_skoczek;
					}else if (rzad == Szachownica.wymiar-1 && kolumna == 1 || rzad == Szachownica.wymiar-1 && kolumna == Szachownica.wymiar - 2) {
						ustawieniePoczatkowe [rzad, kolumna] = Skoczek.symbol_skoczek;
					}else if (rzad == 0 && kolumna == 2 || rzad == 0 && kolumna == Szachownica.wymiar - 3) {
						ustawieniePoczatkowe [rzad, kolumna] = Goniec.symbol_goniec;
					}else if (rzad == Szachownica.wymiar-1 && kolumna == 2 || rzad == Szachownica.wymiar-1 && kolumna == Szachownica.wymiar -3) {
						ustawieniePoczatkowe [rzad, kolumna] = Goniec.symbol_goniec;
					}else if (rzad == 0 && kolumna == 3 ) {
						ustawieniePoczatkowe [rzad, kolumna] = Hetman.symbol_hetman;
					}else if (rzad == Szachownica.wymiar-1 && kolumna == 3 ) {
						ustawieniePoczatkowe [rzad, kolumna] = Hetman.symbol_hetman;
					}else if (rzad == 0 && kolumna == 4 ) {
						ustawieniePoczatkowe [rzad, kolumna] = Krol.symbol_krol;
					}
					else if (rzad == Szachownica.wymiar - 1 && kolumna == 4 ) {
						ustawieniePoczatkowe [rzad, kolumna] = Krol.symbol_krol;
					}


					else 
					{
						ustawieniePoczatkowe[rzad, kolumna] = symbol_PustePole;
					}
				}
			}

		}
	}
}

