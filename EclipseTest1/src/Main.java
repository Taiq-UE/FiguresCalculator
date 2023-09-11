public class Main 
{
	public static final String ANSI_RED = "\u001B[31m";
	
	public static void main(String[] args) 
	{
		Prostokat p1 = new Prostokat(3,6);
		Kwadrat k1 = new Kwadrat(5);
		Kolo ko1 = new Kolo(6);
		Trojkat t1 = new Trojkat(8);
		Trojkat t2 = new Trojkat(7,5,5);
		
		System.out.println(p1.toString()+"\n");
		p1.Rysuj();
		System.out.println();
		p1.RysujFull();
		System.out.println("\n---------------------------------------------------------------\n");
		
		System.out.println(k1.toString()+"\n");
		k1.Rysuj();
		System.out.println();
		k1.RysujFull();
		System.out.println("\n---------------------------------------------------------------\n");
		
		System.out.println(ko1.toString()+"\n");
		ko1.Rysuj();
		System.out.println();
		ko1.RysujFull();
		System.out.println("\n---------------------------------------------------------------\n");
		
		System.out.println(t1.toString()+"\n");
		t1.Rysuj();
		System.out.println();
		t1.RysujFull();
		System.out.println("\n---------------------------------------------------------------\n");
		
		System.out.println(t2.toString()+"\n");
		t2.Rysuj();
		System.out.println();
		t2.RysujFull();
		System.out.println("\n---------------------------------------------------------------\n");
		
	}

}
