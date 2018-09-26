
public class Student extends Person{
	public static int liczbaStudentow;
	private String numerIndeksu;
	
	public Student(String imie, String nazwisko) {
		this(imie, nazwisko,"");
		
	}
	public Student(String imie, String nazwisko,String numerIndeksu ) {
		super(imie, nazwisko);
		this.numerIndeksu=numerIndeksu;
		liczbaStudentow++;
	}
	public void ustawIndeks(String i) {
		numerIndeksu=i;
	}
	public String podajNumerIndeksu() {
		return numerIndeksu;
	}
	/*argument to obiekt klasy zaj�cia, zwraca
	 *System.out.println z nazw� zaj��, rodzajem oraz imie nazwisko studenta
	 */
	public void doDzie�a(Zaj�cia zaj�cia) {
		System.out.println(this.podajImi�()+" "+this.podajNazwisko()+" wzi�� udzia� w: ");
		System.out.println(zaj�cia.aktywno��());
		
	}
	static {
		liczbaStudent�w=0;
	}
}
