package Principal;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 
{

	public static void main(String[] args) 
	{
		
		Scanner leer = new Scanner(System.in);
		DecimalFormat formato1 = new DecimalFormat("#.00");
		Random r = new Random();
		int azar=1+r.nextInt(6);
		int limite=1+r.nextInt(100);
		int contador1=0,contador2=0,contador3=0,contador4=0,contador5=0,contador6=0;
		float promedio1=0,promedio2=0,promedio3=0,promedio4=0,promedio5=0,promedio6=0;		
		for(int i=0;i<limite;i++)
		{
			if(azar==1)
			{
				contador1++;		
			}
			if(azar==2)
			{
				contador2++;
			}
			if(azar==3)
			{
				contador3++;
			}
			if(azar==4)
			{
				contador4++;
			}
			if(azar==5)
			{
				contador5++;
			}
			if(azar==6)
			{
				contador6++;
			}
			azar=1+r.nextInt(6);
			System.out.println("numero = "+azar);
		}
		
		promedio1 = ((float) contador1/limite)*100;
		promedio2 = ((float) contador2/limite)*100;
		promedio3 = ((float) contador3/limite)*100;
		promedio4 = ((float) contador4/limite)*100;
		promedio5 = ((float) contador5/limite)*100;
		promedio6 = ((float) contador6/limite)*100;
		
		System.out.println("**********************************"
				+ "\nSe realizaron "+limite+" Lanzamientos"
				+ "\nPorcentajes de cada Cara del dado"
				+ "\nCara 1 "+formato1.format(promedio1)+"%"
				+ "\nCara 2 "+formato1.format(promedio2)+"%"
				+ "\nCara 3 "+formato1.format(promedio3)+"%"
				+ "\nCara 4 "+formato1.format(promedio4)+"%"
				+ "\nCara 5 "+formato1.format(promedio5)+"%"
				+ "\nCara 6 "+formato1.format(promedio6)+"%");
		System.out.println("\n**********************************");
	}

}
