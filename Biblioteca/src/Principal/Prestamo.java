package Principal;

public class Prestamo 
{
	Persona persona;
	Libro libro;
	Fecha fechain,fechaout;
	private int dias;
	
	public Prestamo()
	{
		this.persona = null;
		this.libro = null;
		this.fechain = null;
		this.fechaout = null;
		this.dias = 0;
	}
	
	public Prestamo(Persona persona, Libro libro, Fecha fechain, int dias)
	{
		this.persona = persona;
		this.libro = libro;
		this.fechain = fechain;
		this.fechaout = fechaout;
		this.dias = dias;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}	
	public Fecha getFechain() {
		return fechain;
	}

	public void setFechain(Fecha fechain) {
		this.fechain = fechain;
	}

	public Fecha getFechaout() {
		return fechaout;
	}

	public void setFechaout(Fecha fechaout) {
		this.fechaout = fechaout;
	}

	@Override
	public String toString() {
		return "\n*******EXTRACTO*******"
				+ "\n***DATOS CLIENTE: ***"
				+ "\nPersona [apellido =" + persona.getApellido()+"  CI: "+persona.getCi()
				+ "\n***DETALLES LIBRO ***"
				+ "\nlibro=" + libro.getTitulo()
				+ "\ncodigo=" + libro.getCodigo()
				+ "\n***DETALLES PRESTAMO***"
				+ "\nFecha salida " + fechain + "]"
				+ "\nFecha devolucion " + fechaout + "]"
				+ "\nDias de Prestamo: "+dias+" dias"
				+ "\n----------------------------\n";
	}
	
	
	
	
}
