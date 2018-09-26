
public class Seminarium extends Zajecia{
	private String przedmiot;
	private String katedra;
	public Seminarium(String str, String k) {
		przedmiot=str;
		katedra=k;
	}
	public String opis(){
		return przedmiot+", Katedra: "+katedra;
	}
	
	public String aktywnosc (){
		return " Seminarium z "+this.opis();
	}
}
