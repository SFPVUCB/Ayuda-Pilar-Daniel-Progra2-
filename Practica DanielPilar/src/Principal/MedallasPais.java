package Principal;

public class MedallasPais implements Comparable<MedallasPais>
{
	private String nombrepais;
	private int medallasOro;
	private int medallasPlata;
	private int medallasBronce;
	private int total;
	
	public MedallasPais(String nombrepais, int medallasOro, int medallasPlata, int medallasBronce)
	{
		this.nombrepais = nombrepais;
		this.medallasOro = medallasOro;
		this.medallasPlata = medallasPlata;
		this.medallasBronce = medallasBronce;
	}
	public MedallasPais(String nombrepais)
	{
		this.nombrepais = nombrepais;
		this.medallasOro = 0;
		this.medallasPlata = 0;
		this.medallasBronce = 0;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getNombrepais() {
		return nombrepais;
	}
	public void setNombrepais(String nombrepais) {
		this.nombrepais = nombrepais;
	}
	public int getMedallasOro() {
		return medallasOro;
	}
	public void setMedallasOro(int medallasOro) {
		this.medallasOro = medallasOro;
	}
	public int getMedallasPlata() {
		return medallasPlata;
	}
	public void setMedallasPlata(int medallasPlata) {
		this.medallasPlata = medallasPlata;
	}
	public int getMedallasBronce() {
		return medallasBronce;
	}
	public void setMedallasBronce(int medallasBronce) {
		this.medallasBronce = medallasBronce;
	}
	@Override
	public String toString() 
	{
		return "\n*** MEDALLAS DEL PAIS: ***"
				+"\nNombrepais = " + nombrepais 
				+"\nMedallasOro = " + medallasOro 
				+"\nMedallasPlata = "+ medallasPlata 
				+"\nMedallasBronce = " + medallasBronce ;
	}
	
	public void ganoMedallaOro()
	{
		setMedallasOro(getMedallasOro()+1);
		
	}
	public void ganoMedallaPlata()
	{
		setMedallasBronce(getMedallasBronce()+1);
	}
	public void ganoMedallaBronce()
	{
		setMedallasPlata(getMedallasPlata()+1);
	}
	public void totalMedallas()
	{
		setTotal(getMedallasOro()+getMedallasPlata()+getMedallasBronce());
	}
	@Override
	public int compareTo(MedallasPais o) 
	{
		if(o.getMedallasOro()>medallasOro)
		{
			return 1;
		}
		else if (o.getMedallasOro()>medallasOro)
		{
			return 0;
		}else
		{
			return -1;
		}
	}
	

	
	
	

}
