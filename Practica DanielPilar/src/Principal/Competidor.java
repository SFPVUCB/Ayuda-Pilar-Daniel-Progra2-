package Principal;

import java.util.Collection;

public class Competidor implements Comparable<Competidor>
{
	private String nombre;
	private float lanzamiento;

	
	public Competidor(String nombre, float lanzamiento) 
	{
		
		this.nombre = nombre;
		this.lanzamiento = lanzamiento;
	}
	public Competidor() 
	{
		this.nombre = nombre;
		this.lanzamiento = lanzamiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getLanzamiento() {
		return lanzamiento;
	}
	public void setLanzamiento(float lanzamiento) {
		this.lanzamiento = lanzamiento;
	}
	@Override
	public String toString() {
		return "\n--------------------------------"
				+ "\nCompetidor "
				+ "\nNombre= "+ nombre 
				+ "\nLanzamiento= " + lanzamiento
				+"\n--------------------------------";
	}

	@Override
	
	public int compareTo(Competidor o) {
		// 
		if(o.getLanzamiento()>lanzamiento)
		{
			return 1;
		}
		else if (o.getLanzamiento()>lanzamiento)
		{
			return 0;
		}else
		{
			return -1;
		}
		
	
	
	}

}
