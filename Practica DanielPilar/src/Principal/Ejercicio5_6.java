package Principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5_6 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresar un numero n");
		int n = leer.nextInt();	
		ArrayList<MedallasPais> medalleros = new ArrayList<MedallasPais>();
		for (int i=0;i<n;i++)
		{
			System.out.println("Ingresar Pais");
			String nombrepais= leer.next();
			MedallasPais medallero = new MedallasPais(nombrepais);
			medalleros.add(medallero);
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Se muestran los paises con las Posiciones 0,n/2,n-2");
		System.out.println("Y se Asignan las medallas a las respectivas posiciones");
		System.out.println("-------------------------------------------------");
	
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				medalleros.get(i).ganoMedallaOro();
				System.out.println(medalleros.get(i));
				System.out.println("n= " +n+" Posicion 0 = "+i);
			}
			if(i==(n/2))
			{
				medalleros.get(i).ganoMedallaBronce();
				System.out.println(medalleros.get(i));
				System.out.println("n= " +n+" Posicion n/2 = "+i);
			}
			if(i==(n-2))
			{
				medalleros.get(i).ganoMedallaPlata();
				System.out.println(medalleros.get(i));
				System.out.println("n= " +n+" Posicion n-2 = "+i);
			}
		}
	
		Collections.sort(medalleros);
		System.out.println("-------------------------------------------------");
		System.out.println("Maximo ganador de oro"+medalleros.get(0));
		System.out.println("-------------------------------------------------");
		
		

	}

}
