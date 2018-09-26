
public class Kolokwium extends Zajecia{

		private String przedmiot;
		private String katedra;
		
		public Kolokwium(String str, String k) {
			przedmiot=str;
			katedra=k;
		}
		public String opis(){
			return przedmiot+", Katedra: "+katedra;
		}
		
		public String aktywnosc (){
			return " Kolokwium z "+this.opis();
		}
	}