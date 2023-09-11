import java.util.Arrays;

public class Figura 
{
	protected double dA;
	
	Figura(double a)
	{
		dA = a;
	}
	
	double Pole(){
		return 0;
	}
	double Obwod(){
		return 0;
	}
	public String toString()
	{
		return "Pole: " + Pole() + "\nObwod: " + Obwod();
	}
}

class Kwadrat extends Figura
{
	
	Kwadrat(double dA)
	{
		super(dA);
	}
	
	double Pole() 
	{
		return dA * dA;
	}
	double Obwod()
	{
		return (4*dA);
	}
	double Przekatna()
	{
		return (dA*Math.sqrt(2));
	}
	
	public void RysujFull()
	{
		for(int i = 0; i < dA; i++)
		{
			for(int j = 0; j < dA; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void Rysuj()
	{
		for(int i = 0; i < dA; i++)
		{
			for(int j = 0; j < dA; j++)
			{
				if(i == 0 | i == dA-1 | j == 0 | j == dA-1)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
	public String toString()
	{
		return "Kwadrat\nDlugosc boku a: " + dA + "\n" + super.toString() +
				"\nPrzekatna: " + Przekatna();
	}
	
 }

class Prostokat extends Kwadrat
{
	private double dB;
	
	Prostokat(double dA, double b)
	{
		super(dA);
		dB = b;
	}
	
	double Pole()
	{
		return dA * dB;
	}
	double Obwod()
	{
		return (2*dA) + (2*dB);
	}
	double Przekatna()
	{
		double a2, b2, wynik;
		a2 = dA*dA;
		b2 = dB*dB;
		wynik = a2 + b2;
		wynik = Math.sqrt(wynik);
	
		return wynik;
	}
	
	public void RysujFull()
	{
		for(int i = 0; i < dA; i++)
		{
			for(int j = 0; j < dB; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void Rysuj()
	{
		for(int i = 0; i < dA; i++)
		{
			for(int j = 0; j < dB; j++)
			{
				if(i == 0 | i == dA-1 | j == 0 | j == dB-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public String toString()
	{
		return "Prostokąt:\nDlugosc boku a: " + dA + "\nDlugosc boku b: " + dB + "\nPole: " + Pole() + "\nObwod: " + Obwod() +
				"\nPrzekatna: " + Przekatna();
	}
	
}

class Kolo extends Figura
{
	Kolo(double dA)
	{
		super(dA);
	}
	
	double Pole()
	{
		return Math.PI*dA*dA;
	}
	double Obwod()
	{
		return 2*Math.PI*dA;
	}
	double Przekatna()
	{
		return 2*dA;
	}
	
	void RysujFull()
	{
		for (int i = (int) -dA; i <= dA; i++) 
		{
	        for (int j = (int) -dA; j <= dA; j++) 
	        {
	            double odlegloscOdSrodka = Math.sqrt(i * i + j * j);
	            
	            if (odlegloscOdSrodka <= dA) 
	            {
	                System.out.print("* ");
	            } 
	            else 
	            {
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
	}
	void Rysuj()
	{
		for (int i = (int) -dA; i <= dA; i++) 
		{
	        for (int j = (int) -dA; j <= dA; j++) 
	        {
	            double odlegloscOdSrodka = Math.sqrt(i * i + j * j);
	           
	            if (Math.abs(odlegloscOdSrodka - dA) < 0.5) 
	            {
	                System.out.print("* ");
	            } 
	            else 
	            {
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
	}
	
	public String toString()
	{
		return "Koło:\n" + super.toString() +
				"\nPrzekatna: " + Przekatna();
	}
}

class Trojkat extends Figura
{
	private double dB, dC;
	
	Trojkat(double dA)
	{
		super(dA);
		dB = dC = dA;
	}
	Trojkat(double dA, double b, double c)
	{
		super(dA);
		dB = b;
		dC = c;
	}
	
	double Pole()
	{
		double p = (dA + dB + dC)/2;
		
		double wynik = p*(p-dA)*(p-dB)*(p-dC);
		
		return Math.sqrt(wynik);
	}
	
	double Obwod()
	{
		return dA + dB + dC;
	}
	
	boolean CzyTrojkat()
	{
		if(dA + dB < dC || dA + dC < dB || dB + dC < dA )
			return false;
		else
			return true;
	}
	
	public String toString()
	{
		if(CzyTrojkat())
			return "Trojkat:\nBoki: "+ dA + ", " + dB + ", " + dC + "\n"  + super.toString();
		else
			return "Błąd. Z podanych boków nie może powstać trójkąt";
	}
	
	public void RysujFull()
	{
		if(CzyTrojkat())
		{
			double arr[] = {dA, dB, dC};
			Arrays.sort(arr);
			
			for (int i = 1; i <= arr[0]; i++) 
			{
	            for (int j = 1; j <= arr[1]; j++) 
	            {
	                if (j <= i) 
	                {
	                    System.out.print("* ");
	                }
	            }
	            System.out.println();
			}
		}
		else
		{
			System.out.println(toString());
		}
	}
	
	public void Rysuj()
	{
		if(CzyTrojkat())
		{
			double arr[] = {dA, dB, dC};
			Arrays.sort(arr);
			
			for (int i = 0; i < arr[0]; i++) 
			{
			    for (int j = 0; j < arr[1]; j++) 
			    {
			        if (j == 0 || j == i || i == arr[0] - 1) 
			        {
			            System.out.print("* ");
			        } 
			        else 
			        {
			            System.out.print("  ");
			        }
			    }
			    System.out.println();
			}
		}
		else
		{
			System.out.println(toString());
		}
	}
	
}

