
public class Main 
{

	public static void main(String[] args) 
	{
		Prostokat p1 = new Prostokat(2,4);
		Kwadrat k1 = new Kwadrat(2);
		Kolo ko1 = new Kolo(3);
		Trojkat t1 = new Trojkat(3);
		Trojkat t2 = new Trojkat(3,4,5);
		
		System.out.println(p1.toString()+"\n");
		System.out.println(k1.toString()+"\n");
		System.out.println(ko1.toString()+"\n");
		System.out.println(t1.toString()+"\n");
		System.out.println(t2.toString()+"\n");
		
		
		
	}

}
