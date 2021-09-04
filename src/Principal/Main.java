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
		int opcion=0;
		Random r = new Random();
		int random=1+r.nextInt(600);

		ArrayList<Persona> Personas = new ArrayList<Persona>();
		ArrayList<Libro> Libros = new ArrayList<Libro>();
		ArrayList<Prestamo> Prestamos = new ArrayList<Prestamo>();
		opcion = Integer.parseInt(JOptionPane.showInputDialog(
				"1.- Registrar Personas"
				+ "\n2.- Registrar Libros"
				+ "\n3.- Registrar Prestamos"
				+ "\n4.- Registrar Devoluciones"
				+ "\n5.- Listar Personas Registradas"
				+ "\n6.- Listar Libros Registrados"
				+ "\n7.- Listar Prestamos"
				+ "\n0.- Salir"
		)
		);
		while (opcion!=0)
		{
			switch (opcion)
			{
			case 1:
				Persona persona = new Persona();
				int ci=Integer.parseInt(JOptionPane.showInputDialog("Ingrese C.I."));
				persona.setCi(ci);
				String nombre = JOptionPane.showInputDialog("Ingrese Nombre.");
				persona.setNombre(nombre);
				String apellido = JOptionPane.showInputDialog("Ingrese Apellido");
				persona.setApellido(apellido);
				int fono=Integer.parseInt(JOptionPane.showInputDialog("Ingrese fono"));
				persona.setFono(fono);
				String direccion = JOptionPane.showInputDialog("Ingrese direccion");
				persona.setDireccion(direccion);
				Personas.add(persona);
				System.out.println("Registro con exito");
				System.out.println(persona);
				break;
			case 2:
				Libro libro = new Libro();
				libro.setCodigo(random);
				String titulo = JOptionPane.showInputDialog("Ingrese titulo.");
				libro.setTitulo(titulo);
				String autor = JOptionPane.showInputDialog("Ingrese Autor");
				libro.setAutor(autor);
				String genero=JOptionPane.showInputDialog("Ingrese Genero");
				libro.setGenero(genero);
				int pag = Integer.parseInt(JOptionPane.showInputDialog("Ingrese paginas"));
				libro.setPaginas(pag);
				String estado = JOptionPane.showInputDialog("Disponibilidad:"
							+ "\n1.-Disponible \n2.No Disponible \n3.Se Perdio");
				
				libro.setEstado(estado);
				Libros.add(libro);
				System.out.println("Registro con exito");
				System.out.println(libro);
				random=1+r.nextInt(600);
				break;
			case 3:
				if(Libros.size()>0 & Personas.size()>0)
				{
					Prestamo prestamo = new Prestamo();
					int busqueda1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese carnet del registrado"));
					for ( Persona p : Personas ) 
					{
						if(p.getCi()==busqueda1)
						{
							JOptionPane.showMessageDialog(null, "Se encontro");
							prestamo.setPersona(p);
							break;
						}
					}
					String busqueda2 = JOptionPane.showInputDialog("Ingrese nombre del libro");
					for ( Libro p : Libros ) 
					{
						if(p.getTitulo().equals(busqueda2))
						{
							JOptionPane.showMessageDialog(null, "Se encontro");
							if(p.getEstado().equals("Disponible"))
							{
								JOptionPane.showMessageDialog(null, "Se enccontro y esta disponible");
								prestamo.setLibro(p);
								p.setEstado("2");
								break;
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Se encontro pero no esta disponible");
							}		
						}	
					}
					Fecha fechain = new Fecha();
					int dia,mes,anio,dp;
					dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia actual"));
					fechain.setDia(dia);
					mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes actual"));
					fechain.setMes(mes);
					anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese anio actual"));
					fechain.setAnio(anio);
					prestamo.setFechain(fechain);
					
					dp= Integer.parseInt(JOptionPane.showInputDialog("Ingrese dias de prestamo"));
					prestamo.setDias(dp);
		
					Prestamos.add(prestamo);
		
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Necesita tener por lo menos person y libro registrados");
				}
				break;
			case 4:
				
				int busqueda1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese carnet del registrado"));
				for ( Prestamo p : Prestamos ) 
				{
					if(p.getPersona().getCi()==busqueda1)
					{
						JOptionPane.showMessageDialog(null, p.getLibro());
						int o = Integer.parseInt(JOptionPane.showInputDialog(null,"1 Devolver libro \n2 Reportar Perdida \n3 Pasar"));
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
				JOptionPane.showMessageDialog(null, Personas);
				break;
			case 6:
				JOptionPane.showMessageDialog(null, Libros);
				break;
			case 7:
				JOptionPane.showMessageDialog(null, Prestamos);
				break;
				
			}
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"1.- Registrar Personas"
							+ "\n2.- Registrar Libros"
							+ "\n3.- Registrar Prestamos"
							+ "\n4.- Registrar Devoluciones"
							+ "\n5.- Listar Personas Registradas"
							+ "\n6.- Listar Libros Registrados"
							+ "\n7.- Listar Prestamos"
							+ "\n0.- Salir"));	
		}
		JOptionPane.showMessageDialog(null,
				"*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
				+"\nGRACIAS POR USAR EL SISTEMA"
				+ "\n<3 <3 <3 VUELVA PRONTO <3 <3 <3"
				+ "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	}
}
