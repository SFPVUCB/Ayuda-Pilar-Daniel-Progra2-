package Principal;

public class Naipe 
{

	private String palo;
	private String numero;
	
	public Naipe(String palo, String numero) 
	{
		this.palo = palo;
		this.numero = numero;
	}
	public Naipe() 
	{
		this.palo = "";
		this.numero = "";
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) 
	{
		if(Integer.parseInt(palo)==1)
		{
			this.palo = "oros";
		}
		if(Integer.parseInt(palo)==2)
		{
			this.palo = "copas";
		}
		if(Integer.parseInt(palo)==3)
		{
			this.palo = "espadas";
		}
		if(Integer.parseInt(palo)==4)
		{
			this.palo = "bastos";
		}
		
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Carta : " + numero+ " "+ palo ;
	}
	
}