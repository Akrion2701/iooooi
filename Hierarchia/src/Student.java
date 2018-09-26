
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
	/*argument to obiekt klasy zajêcia, zwraca
	 *System.out.println z nazw¹ zajêæ, rodzajem oraz imie nazwisko studenta
	 */
	public void doDzie³a(Zajêcia zajêcia) {
		System.out.println(this.podajImiê()+" "+this.podajNazwisko()+" wzi¹³ udzia³ w: ");
		System.out.println(zajêcia.aktywnoœæ());
		
	}
	static {
		liczbaStudentów=0;
	}
}
