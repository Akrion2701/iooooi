
public class Main {

	public static void main(String[] args) {
	
		String[] przedmiot= {"Genetyka","Botanika"};//nazwa przedmiotu
		Student student=new Student("Kuba","Mak","1234");
		Kadra wyk³adowca=new Kadra("Franciszek","Kowalski","prof");
		Katedra zak³ad=new Katedra("Biologii ewolucyjnej",wyk³adowca);
		
		System.out.println("Nazwa uczelni: "+Uczelnia.nazwaUczelni);//pole statyczne
		System.out.println("Liczba studentów: "+Student.liczbaStudentów);
		
		//tworzymy obiekt klasy Zajêcia korzystaj¹c z metody klasy Katedra
		//nastêpnie wysy³amy studenta na zajêcia
		
		Zajecia poniedzialek1=zak³ad.utworzSeminarium(przedmiot[0]);
		Zajecia poniedzialek2=zak³ad.utworzKolokwium(przedmiot[1]);
		/*
		 * Przyk³ad interfejsu:
		 * metoda student.doDzie³a() wywo³uje
		 * metodê interfejsu aktywnoœæ() 
		 * nale¿¹c¹ do obiektu klasy Seminarium lub Kolokwium
		 */
		student.doDziela(poniedzialek1); 
		student.doDziela(poniedzialek2);
		
		
	}

}
