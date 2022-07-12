package curs8;

public class StaticExample {

	public static String nume;
	public static String departament = "QA";
	
	//JVM -pasul1: incarca prima data static care nu este asociat cu obiectul ci cu clasa(inainte de a se face un obicet din clasa)
	//JVM -pasul2: incarca obiectele(StaticExample persoana1 = new StaticExample();)
	//nume este asociat au StaticExample nu cu perosana1 care este obicetul
	//StaticExample.main() DbCon.openConnection()
	
	public static void main(String[] args) {
		//person1
		StaticExample persoana1 = new StaticExample();
		persoana1.nume = "Oana ";
		System.out.println(persoana1.nume + departament);
		
		//person2
		StaticExample persoana2 = new StaticExample();
		persoana2.nume = "Ioana ";
		System.out.println(persoana2.nume + departament);
		
		//person3
		departament = "DEV";
		StaticExample persoana3 = new StaticExample();
		persoana3.nume = "Matei ";
		System.out.println(persoana3.nume + departament);
		
		System.out.println("-----------------------------------------");
		System.out.println(persoana1.nume + departament);
		System.out.println(persoana2.nume + departament);
		System.out.println(persoana3.nume + departament);

	}

}
