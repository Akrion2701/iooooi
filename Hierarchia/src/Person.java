
public abstract class Person {
	private String imie;
	private String nazwisko;
	private int wiek;
	
	public Person(String imiê,String nazwisko) {
		this.imie=imie;
		this.nazwisko=nazwisko;
	}
	
	public Person(String imiê,String nazwisko,int wiek) {
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.wiek=wiek;
	}
	public  void ustawImie(String str) {
		imiê=str;
	}
	public void ustawNazwisko(String str) {
		nazwisko=str;
	}
	public void ustawWiek(int w) {
		wiek=w;
	}
	public String podajImiê() {
		return imiê;
	}
	public String podajNazwisko() {
		return nazwisko;
	}
	public int podajWiek() {
		return wiek;
	}
}