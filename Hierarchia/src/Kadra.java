
public class Kadra extends Person {
	private String tytul;

	public Kadra(String imie, String nazwisko) {
	this(imie, nazwisko,"mgr");
	
	}
	public Kadra(String imie, String nazwisko,String tytu³) {
		super(imie, nazwisko);
		this.tytul=tytul;
	}
	public void ustawTytul(String i) {
		tytul=i;
	}
	public String podajTytul() {
		return tytul;
	}
}