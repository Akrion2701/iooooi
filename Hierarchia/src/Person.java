
public abstract class Person {
	private String imie;
	private String nazwisko;
	private int wiek;
	
	public Person(String imi�,String nazwisko) {
		this.imie=imie;
		this.nazwisko=nazwisko;
	}
	
	public Person(String imi�,String nazwisko,int wiek) {
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.wiek=wiek;
	}
	public  void ustawImie(String str) {
		imi�=str;
	}
	public void ustawNazwisko(String str) {
		nazwisko=str;
	}
	public void ustawWiek(int w) {
		wiek=w;
	}
	public String podajImi�() {
		return imi�;
	}
	public String podajNazwisko() {
		return nazwisko;
	}
	public int podajWiek() {
		return wiek;
	}
}