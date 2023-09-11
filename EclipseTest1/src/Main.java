import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		/*Prostokat p1 = new Prostokat(3,6);
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
		System.out.println("\n---------------------------------------------------------------\n");*/
		
		
		Scanner scan = new Scanner(System.in);

		boolean wyborexit = true;
		do
		{
			System.out.print("Wybierz figure:\n1.Kwadrat\n2.Prostokąt\n3.Koło\n4.Trójkąt\nWybor: ");
			int wybor = scan.nextInt();
			
			double d1,d2,d3;
			switch(wybor)
			{
				case 1:
					System.out.print("Podaj dlugosc boku: ");
					d1 = scan.nextDouble();
					Kwadrat k1 = new Kwadrat(Math.abs(d1));
					System.out.println(k1.toString()+"\n");
					k1.Rysuj();
					System.out.println();
					k1.RysujFull();
					break;
				case 2:
					System.out.print("Podaj dlugosc boku: ");
					d1 = scan.nextDouble();
					System.out.print("\nPodaj dlugosc drugiego boku: ");
					d2 = scan.nextDouble();
					Prostokat p1 = new Prostokat(Math.abs(d1),Math.abs(d2));
					System.out.println(p1.toString()+"\n");
					p1.Rysuj();
					System.out.println();
					p1.RysujFull();
					break;
				case 3:
					System.out.print("Podaj dlugosc promienia: ");
					d1 = scan.nextDouble();
					Kolo ko1 = new Kolo(Math.abs(d1));
					System.out.println(ko1.toString()+"\n");
					ko1.Rysuj();
					System.out.println();
					ko1.RysujFull();
					break;
				case 4:
					System.out.print("Trójkąt równoboczny?\n1.Tak\n2.Nie\nWybór: ");
					wybor = scan.nextInt();
					Trojkat t1;
					if(wybor == 1 || wybor == 1)
					{
						System.out.print("Podaj dlugosc boku: ");
						d1 = scan.nextDouble();
						t1 = new Trojkat(Math.abs(d1));
					}
					else if (wybor == 2 || wybor == 2)
					{
						System.out.print("Podaj dlugosc pierszego boku: ");
						d1 = scan.nextDouble();
						System.out.print("Podaj dlugosc drugiego boku: ");
						d2 = scan.nextDouble();
						System.out.print("Podaj dlugosc trzeciego boku: ");
						d3 = scan.nextDouble();
						t1 = new Trojkat(Math.abs(d1),Math.abs(d2),Math.abs(d3));
					}
					else
					{
						t1 = new Trojkat(0);
					}
					System.out.println(t1.toString()+"\n");
					t1.Rysuj();
					System.out.println();
					t1.RysujFull();
					break;
				default:
					System.out.print("Błąd. Nieprawidłowy wybór.");
					break;
			}
		
			System.out.println("\n\n---------------------------------------------------------------\n");
			System.out.print("Chcesz wykonać program jeszcze raz? \n1.Tak\n2.Nie\nWybor: ");
			
			if (scan.nextInt() == 1)
				wyborexit = true;
			else
				wyborexit = false;
		
		}while(wyborexit);
			scan.close();

			System.out.print("\n\n\nPowered by\n"
					+ "KTea Inc.");
		System.exit(0);
	}
}
