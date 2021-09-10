package Principal;

public class Persona 
{
	private int ci;
	private String nombre;
	private String apellido;
	private long fono;
	private String direccion;
	private boolean enmora;
	
	
	public Persona() 
	{
		this.ci = 0;
		this.nombre = "";
		this.apellido = "";
		this.fono = 0;
		this.direccion = "";
		this.enmora=true;
	}
	
	public Persona(int ci, String nombre, String apellido, long fono, String direccion) 
	{
		this.ci = ci;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fono = fono;
		this.direccion = direccion;
		
	}
	
	
	public boolean isEnmora() {
		return enmora;
	}

	public void setEnmora(boolean enmora) {
		this.enmora = enmora;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public long getFono() {
		return fono;
	}

	public void setFono(long fono) {
		this.fono = fono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return 
				"Persona"
				+ "\n----------------------------"
				+ "\n[C.I.= " + ci + "]"
				+ "\n[Nombre= " + nombre +"]"
				+ "\n[Apellido= " + apellido + "]"
				+ "\n[Fono= " + fono + "]"
				+ "\n[Direccion= " + direccion + "]"
				+ "\n[Estado= " + enmora + "]"
				+ "\n----------------------------\n";
	}
	
	
	
	
	

}
