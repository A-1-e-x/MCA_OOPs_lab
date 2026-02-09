import java.util.Scanner;
class complex
{
	double real,imaginary;
	complex(double r,double i)
	{
		real=r;
		imaginary=i;
	}
	complex add(complex c)
	{
		return new complex(this.real+c.real,this.imaginary+c.imaginary);
	}
	void display()
	{
    		if (imaginary >= 0)
       		 System.out.print(real + " + " + imaginary + "i");
    		else
        		System.out.print(real + " - " + (-imaginary) + "i");
	}
}

class complexaddition
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter real part of first complex number:");
		double r1=sc.nextDouble();
		System.out.print("Enter the imaginary part of first complex number:");
		double i1=sc.nextDouble();
		
		System.out.print("Enter real part of second complex number:");
		double r2=sc.nextDouble();
		System.out.print("Enter the imaginary part of second complex number:");
		double i2=sc.nextDouble();
		
		complex c1=new complex(r1,i1);
		complex c2=new complex(r2,i2);
		complex sum=c1.add(c2);
		c1.display();
		System.out.print("+");
		c2.display();
		System.out.print("\nSum=");
		sum.display();
	}
}
