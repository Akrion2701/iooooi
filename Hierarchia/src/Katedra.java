
public class Katedra extends Uczelnia {
	private String nazwaKatedry;
	private Kadra kierownik;
	
	public String opis(){
		return "Katedra :"+nazwaKatedry+" Kierownik :"+kierownik.podajTytul()+" "+
				kierownik.podajImie()+" "+kierownik.podajNazwisko();
	}
	public Katedra(String nazwa, Kadra k) {
		nazwaKatedry=nazwa;
		kierownik=k;
	}
	public String podajNazwe() {
		return nazwaKatedry;
	}
	public String kierownik() {
		return kierownik.podajImie()+" "+kierownik.podajNazwisko();
	}
	/*Metody tworz�ca i zwracaj�ca obiekt 
	 * klasy Zaj�cia.Seminarium
	 * lub .Kolokwium
	 */
	public Zaj�cia utw�rzSeminarium(String str) { 
	return new Seminarium(str, nazwaKatedry);
	}
	public Zaj�cia utw�rzKolokwium(String str) {
	return new Kolokwium(str, nazwaKatedry);
	}
	
}
