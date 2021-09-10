package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class Ejercicio4 
{
	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		ArrayList<Competidor> competidores = new ArrayList<Competidor>();
		
	
		System.out.println("Menu de Opciones"
				+ "\n1 Registrar competidor"
				+ "\n2.- Sacar podio "
				+ "\n3.- Sacar el promedio"
				+ "\n4.- Ordenar la lista del Mejor al peor"
				+ "\n5.- Listar competidores"
				+ "\n0.- Salir");
		int opcion = leer.nextInt();
		while (opcion!=0)
		{
			switch(opcion)
			{
			case 1:
				Competidor competidor = new Competidor();
				System.out.println("Ingresar nombre del competidor");
				String nombre = leer.next();
				competidor.setNombre(nombre);
				System.out.println("Dintancia del lanzamientod de martillo?");
				float distancia = leer.nextFloat();
				competidor.setLanzamiento(distancia);
				competidores.add(competidor);
				
				break;
			case 2:
				Collections.sort(competidores);
				System.out.println("Ganadores");
				for(int i=0; i<3;i++)
				{
					if(i==0)
					{
						System.out.println(i+1+" Medalla de Oro "+competidores.get(i));
					}
					if(i==1) 
					{
						System.out.println(i+1+" Medalla de Plata "+competidores.get(i));
					}
					else if(i==2)
					{
						System.out.println(i+1+" Medalla de Bronce "+competidores.get(i));
					}
					
				}
					
				
				break;
			case 3:
				float promedio = 0,contador=0;
				for (Competidor c : competidores)
				{
					contador = contador+c.getLanzamiento();
				}
				promedio=contador/competidores.size();
				System.out.println("\n--------------------------------");
				System.out.println("El promedio es las distancias es: "+promedio);
				System.out.println("\n--------------------------------");
				break;
			case 4:
				Collections.sort(competidores);
				System.out.println(competidores);
				
				break;
			case 5:
				System.out.println(competidores);
				break;
			
			}
			System.out.println("Menu de Opciones"
					+ "\n1 Registrar competidor"
					+ "\n2.- Sacar podio "
					+ "\n3.- Sacar el promedio"
					+ "\n4.- Ordenar la lista del Peor al Mejor"
					+ "\n5.- Listar competidores"
					+ "\n0.- Salir");
			opcion = leer.nextInt();
			
		}
		

	}

}
