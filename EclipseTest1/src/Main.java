public class Main 
{
	public static final String ANSI_RED = "\u001B[31m";
	
	public static void main(String[] args) 
	{
		Prostokat p1 = new Prostokat(3,6);
		Kwadrat k1 = new Kwadrat(5);
		Kolo ko1 = new Kolo(7);
		Trojkat t1 = new Trojkat(3);
		Trojkat t2 = new Trojkat(3,4,5);
		
		System.out.println(p1.toString()+"\n");
		p1.RysujFull();
		System.out.println();
		p1.Rysuj();
		System.out.println("\n---------------------------------------------------------------\n");
		
		System.out.println(k1.toString()+"\n");
		k1.Rysuj();
		System.out.println();
		k1.RysujFull();
		System.out.println();
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		System.out.println(ko1.toString()+"\n");
		ko1.Rysuj();
		
		//System.out.println(t1.toString()+"\n");
		//System.out.println(t2.toString()+"\n");
		
		
		
	}

}
