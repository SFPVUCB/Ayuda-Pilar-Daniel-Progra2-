package Principal;

public class Libro 
{
	//Caracteristicas del libro **ATRIBUTOS**
	private int codigo;
	private String titulo;
	private String autor;
	private String genero;
	private int paginas;
	private String estado;
	//Constructor vacio no recibe ningun dato
	//lo interesante de este constructor es que cuando no se pongan autor
	//automaticamente lo pondra como anonimo
	public Libro() 
	{
		this.codigo = 0;
		this.titulo = "";
		this.autor = "anonimo";
		this.genero = "";
		this.paginas = 0;
		this.estado = "";
	}
	//Segundo construtor para poder llenar los datos
	//con esto ya se hace evidencia la sobrecarga de constructores
	//notese que este si recibe parametros que seran seteados
	public Libro(int codigo, String titulo, String autor, String genero, int paginas, String estado) 
	{
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.paginas = paginas;
		this.estado= estado;
	
	}
	
	//Todos los sets y gets de las varaibles que nos permitiran acceder para mostrar y modificar los atributos

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) 
	{
		if(Integer.parseInt(estado)==1)
		{
			this.estado = "Disponible";

		}
		if(Integer.parseInt(estado)==2)
		{
			this.estado ="No Disponible";
		}
		if(Integer.parseInt(estado)==3)
		{
			this.estado = "Se perdio";
		}
		
	}
	//fin de los set y get
	
	//metodo TOSTRING 	que nos permite darle un formato de salida al objeto 
	@Override
	public String toString() {
		return "Libro "
				+"\n----------------------------"
				+"\n[Codigo= " + codigo+"]"
				+"\n[Titulo= " + titulo+"]"
				+"\n[Autor= " + autor+"]"
				+"\n[Genero= " + genero+"]"
				+"\n[#Paginas= " + paginas+"]"
				+"\n[Estado= " + estado + "]"
				+"\n----------------------------\n";
	}
	
	
	

}
