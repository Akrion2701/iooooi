
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
	/*Metody tworząca i zwracająca obiekt 
	 * klasy Zajęcia.Seminarium
	 * lub .Kolokwium
	 */
	public Zajęcia utwórzSeminarium(String str) { 
	return new Seminarium(str, nazwaKatedry);
	}
	public Zajęcia utwórzKolokwium(String str) {
	return new Kolokwium(str, nazwaKatedry);
	}
	
}
