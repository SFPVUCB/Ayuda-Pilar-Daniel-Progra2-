package Principal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		Scanner leer = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> numerosclon = new ArrayList<Integer>();
		
		System.out.println("Ingresar cantidad de nuemros a generar");
		int cantidad = leer.nextInt();
		int azar=1+r.nextInt(99);
		
		for(int i=0;i<cantidad;i++)
		{
			numeros.add(azar);	
			azar=1+r.nextInt(99);
		}
		System.out.println("Numeros Generados");
		System.out.println("-------------------");
		System.out.println(numeros);
		System.out.println("-------------------");
		for (int n: numeros)
		{
			//3
			for(int i=0;i<cantidad;i++)
			{
				if(numeros.get(i)%n == 0)
		        {
		        	numerosclon.add(n);
		        }	
			}
			
		}
		System.out.println("Multiplos dentro de la lista");
		System.out.println("-------------------");
		System.out.println(numerosclon);
		System.out.println("-------------------");
		

	}
}
