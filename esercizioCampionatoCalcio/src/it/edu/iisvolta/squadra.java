package it.edu.iisvolta;

public class squadra {

	private String nome;
	private int punti;
	
	public squadra(String nome) 
	{
		super();
		this.nome = nome;
		punti=0;
	}

	public int getPunti() 
	{
		return punti;
	}

	public void setPunti(int punti) 
	{
		if(punti<0)
			System.out.println("Punti non validi!");
		else
			this.punti = punti;
	}

	public String getNome() 
	{
		return nome;
	}
	
	
}
