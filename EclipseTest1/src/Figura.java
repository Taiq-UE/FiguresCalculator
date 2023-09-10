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
	
	public String toString()
	{
		return super.toString() +
				"\nPrzekatna: " + Przekatna();
	}
 }

class Prostokat extends Kwadrat
{
	double dB;
	
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
	
	public String toString()
	{
		return super.toString() +
				"\nPrzekatna: " + Przekatna();
	}
}

class Trojkat extends Figura
{
	double dB, dC;
	
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
	
	
}
















