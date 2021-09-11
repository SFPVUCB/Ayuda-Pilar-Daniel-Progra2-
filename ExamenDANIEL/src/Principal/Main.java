package Principal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		ArrayList<Naipe> baraja = new ArrayList<Naipe>();
		ArrayList<Naipe> repartidas = new ArrayList<Naipe>();
		Scanner leer = new Scanner(System.in);
		Random r = new Random();
		int azar1=1+r.nextInt(4);
	
	
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<14;j++)
			{
				String numCadena1= String.valueOf(i);
				String numCadena2= String.valueOf(j);
				Naipe naipesito = new Naipe(numCadena1,numCadena2);
				
				baraja.add(naipesito);
			}
		}
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("***BARAJA***");
		System.out.println(baraja);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Ingresar cuantas cartas quiere repartir");
		int cantidad = leer.nextInt();
		
		for (int i=0;i<cantidad;i++)
		{
			repartidas.add(baraja.get(azar1));
			baraja.remove(baraja.get(azar1));
			azar1=1+r.nextInt(47);
			
		}
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("***REPARTIDAS***");
		System.out.println(repartidas);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("***BARAJA SIN LAS REPARTIDAS***");
		System.out.println(baraja);
		System.out.println("---------------------------------------------------------------------------");
		
	}

}
