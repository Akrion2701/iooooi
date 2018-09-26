
public class Main {

	public static void main(String[] args) {
	
		String[] przedmiot= {"Genetyka","Botanika"};//nazwa przedmiotu
		Student student=new Student("Kuba","Mak","1234");
		Kadra wyk�adowca=new Kadra("Franciszek","Kowalski","prof");
		Katedra zak�ad=new Katedra("Biologii ewolucyjnej",wyk�adowca);
		
		System.out.println("Nazwa uczelni: "+Uczelnia.nazwaUczelni);//pole statyczne
		System.out.println("Liczba student�w: "+Student.liczbaStudent�w);
		
		//tworzymy obiekt klasy Zaj�cia korzystaj�c z metody klasy Katedra
		//nast�pnie wysy�amy studenta na zaj�cia
		
		Zajecia poniedzialek1=zak�ad.utworzSeminarium(przedmiot[0]);
		Zajecia poniedzialek2=zak�ad.utworzKolokwium(przedmiot[1]);
		/*
		 * Przyk�ad interfejsu:
		 * metoda student.doDzie�a() wywo�uje
		 * metod� interfejsu aktywno��() 
		 * nale��c� do obiektu klasy Seminarium lub Kolokwium
		 */
		student.doDziela(poniedzialek1); 
		student.doDziela(poniedzialek2);
		
		
	}

}
