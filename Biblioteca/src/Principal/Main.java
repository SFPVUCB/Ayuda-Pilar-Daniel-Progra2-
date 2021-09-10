package Principal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		
		Random r = new Random();
		int random=1+r.nextInt(600);

		ArrayList<Persona> Personas = new ArrayList<Persona>();
		ArrayList<Libro> Libros = new ArrayList<Libro>();
		ArrayList<Prestamo> Prestamos = new ArrayList<Prestamo>();
		System.out.println("1.- Registrar Personas"
				+ "\n2.- Registrar Libros"
				+ "\n3.- Registrar Prestamos"
				+ "\n4.- Registrar Devoluciones"
				+ "\n5.- Listar Personas Registradas"
				+ "\n6.- Listar Libros Registrados"
				+ "\n7.- Listar Prestamos"
				+ "\n0.- Salir");
		
		
		int opcion=0;
		opcion = leer.nextInt();

		while (opcion!=0)
		{
			
			switch (opcion)
			{

			case 1:
				
				Persona persona = new Persona();
				
				System.out.println("Ingrese C.I.");
				int ci= leer.nextInt();
				persona.setCi(ci);
				
				System.out.println("Ingrese Nombre");
				String nombre = leer.next();
				persona.setNombre(nombre);
				
				System.out.println("Ingrese Apellido");
				String apellido = leer.next();
				persona.setApellido(apellido);
				
				System.out.println("Ingrese fono");
				int fono=leer.nextInt();
				persona.setFono(fono);
				
				System.out.println("Ingrese Direccion");
				String direccion = leer.next();
				persona.setDireccion(direccion);
				
				Personas.add(persona);
				System.out.println("Registro con exito");
				
				break;
			case 2:
				Libro libro = new Libro();
				libro.setCodigo(random);
				
				System.out.println("Ingrese titulo.");
				String titulo = leer.next();
				libro.setTitulo(titulo);
				
				System.out.println("Ingrese Autor");
				String autor = leer.next();
				libro.setAutor(autor);
				
				System.out.println("Ingrese Genero");
				String genero = leer.next();
				libro.setGenero(genero);
				
				System.out.println("Ingrese paginas");
				int pag = leer.nextInt();
				libro.setPaginas(pag);
				
				System.out.println("Disponibilidad:"+ "\n1.-Disponible \n2.No Disponible \n3.Se Perdio");
				String estado = leer.next();
				libro.setEstado(estado);
				Libros.add(libro);
				System.out.println("Registro con exito");
				random=1+r.nextInt(600);
				break;
			case 3:
				if(Libros.size()>0 & Personas.size()>0)
				{
					Prestamo prestamo = new Prestamo();
					System.out.println("Ingrese carnet del registrado");
					int busqueda1 = leer.nextInt();
					
					for ( Persona p : Personas ) 
					{
						if(p.getCi()==busqueda1)
						{
							System.out.println("Se encontro");
							prestamo.setPersona(p);
							break;
						}
					}
					
					System.out.println("mira la ventanita xdxd");
					String busqueda2 = JOptionPane.showInputDialog("titulo");
					
					for ( Libro p : Libros ) 
					{
						if(p.getTitulo().equals(busqueda2))
						{
							System.out.println("Se encontro");
							if(p.getEstado().equals("Disponible"))
							{
								System.out.println("Se enccontro y esta disponible");
								prestamo.setLibro(p);
								p.setEstado("2");
								break;
							}
							else
							{
								System.out.println("Se encontro pero no esta disponible");
							}		
						}	
					}
					Fecha fechain = new Fecha();
					int dia,mes,anio,dp;
					
					System.out.println("Ingrese dia actual");
					dia = leer.nextInt();
					fechain.setDia(dia);
					System.out.println(fechain);
					System.out.println("Ingrese mes actual");
					mes = leer.nextInt();
					fechain.setMes(mes);
					System.out.println("Ingrese anio actual");
					anio = leer.nextInt();
					fechain.setAnio(anio);
					System.out.println("Ingrese dia de prestamo");
					dp = leer.nextInt();
					prestamo.setDias(dp);
					Prestamos.add(prestamo);
		
				}
				else
				{
					System.out.println("********************ALERTA!!!!!**************************");
					System.out.println("Necesita tener por lo menos persona y libro registrados");
					System.out.println("*********************************************************");
				}
				break;
			case 4:
				
				
				System.out.println("Ingrese carnet del registrado");
				
				
				
				int busqueda1 = leer.nextInt();
				for ( Prestamo p : Prestamos ) 
				{
					if(p.getPersona().getCi()==busqueda1)
					{
						System.out.println(p.getLibro());
						
						System.out.println("1 Devolver libro \n2 Reportar Perdida \n3 Pasar");
						
						int o = leer.nextInt();
						if(o==1)
						{
							p.getLibro().setEstado("1");
							Prestamos.remove(p);
							break;
						}
						if(o==2)
						{
							p.getLibro().setEstado("3");
							p.getPersona().setEnmora(false);
							Prestamos.remove(p);
							break;
							
						}
						if(o==3)
						{
							break;
							
						}
					}	
				}
				break;
			case 5:
				System.out.print(Personas);
				break;
			case 6:
				System.out.println(Libros);
				break;
			case 7:
				System.out.println(Prestamos);
				break;
				
			}
			System.out.println(
					"1.- Registrar Personas"
							+ "\n2.- Registrar Libros"
							+ "\n3.- Registrar Prestamos"
							+ "\n4.- Registrar Devoluciones"
							+ "\n5.- Listar Personas Registradas"
							+ "\n6.- Listar Libros Registrados"
							+ "\n7.- Listar Prestamos"
							+ "\n0.- Salir");	
			opcion = leer.nextInt();
		}
		System.out.println(
				"*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
				+"\nGRACIAS POR USAR EL SISTEMA"
				+ "\n<3 <3 <3 VUELVA PRONTO <3 <3 <3"
				+ "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	}
}
