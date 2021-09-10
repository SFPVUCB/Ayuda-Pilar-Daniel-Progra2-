package Principal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> numerosclon = new ArrayList<Integer>();
		
		Random r = new Random();
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresar cantidad de nuemros a generar");
		int cantidad = leer.nextInt();
		int azar=100+r.nextInt(899);
		int suma =0,promedio=0;
		for(int i=0;i<cantidad;i++)
		{
			numeros.add(azar);
			
			suma = suma + azar;
			
			azar=100+r.nextInt(899);
		}
		promedio = suma/cantidad;
		System.out.println("-----------------------------------------------------------");
		System.out.println("Promedio es : "+promedio);
		System.out.println(numeros);
		System.out.println("-----------------------------------------------------------");
		for(int i=0;i<cantidad;i++)
		{
			
			if(numeros.get(i)>promedio)
			{
				numerosclon.add(numeros.get(i));
			}
			
		}
		System.out.println("Lista clonada con los menores al promedio eliminados");
		System.out.println(numerosclon);
		System.out.println("-----------------------------------------------------------");
		int contador = 0,comparador=0;
		for(int i=0;i<cantidad;i++)
		{
			for(int j = 1; j <= numeros.get(i); j++)
	        {
	            if((numeros.get(i) % j) == 0)
	            {
	                contador++;
	            }
	        }
	        if(contador <= 2)
	        {
	            //System.out.println("El numero es primo");
	            if(numeros.get(i)>=comparador)
	            {
	            	comparador=numeros.get(i);
	            }
	        }
	        else
	        {
	           // System.out.println("El numero no es primo");
	        }
		}
		if(comparador==0)
		{
			System.out.println("No salio ningun numero primo");
		}
		else
		{
			System.out.println("El mayor numero primo de la lista es : \n"+comparador);
		}
		int contador1=0;
		for(int i=0;i<cantidad;i++)
		{
	        if(numeros.get(i)%10 == 0)
	        {
	        	contador++;
	        }		
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("Existen "+contador1+" multiplos de 10");
		System.out.println("-----------------------------------------------------------");
		
	}
}
