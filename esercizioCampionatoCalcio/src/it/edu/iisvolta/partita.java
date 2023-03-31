package it.edu.iisvolta;

import java.util.Random;

public class partita {
	
	private squadra squadraCasa, squadraFuori;
	private int golCasa, golFuori;
	
	public partita(squadra squadraCasa, squadra squadraFuori) 
	{
		super();
		this.squadraCasa = squadraCasa;
		this.squadraFuori = squadraFuori;
		golCasa=0;
		golFuori=0;
	}

	public squadra getSquadraCasa() {
		return squadraCasa;
	}

	public squadra getSquadraFuori() {
		return squadraFuori;
	}

	public int getGolCasa() {
		return golCasa;
	}

	public int getGolFuori() {
		return golFuori;
	}

	public void setGolCasa(int golCasa) {
		if(golCasa<0)
			System.out.println("Nr di gol non valido!");
		else
			this.golCasa = golCasa;
	}

	public void setGolFuori(int golFuori) {
		if(golFuori<0)
			System.out.println("Nr di gol non valido!");
		else
			this.golFuori = golFuori;
	}
	
	public void simulaPartita()
	{
		Random r=new Random();
		
		golCasa=r.nextInt(6);
		golFuori=r.nextInt(6);
		
		if(golCasa > golFuori)
		{
			squadraCasa.setPunti(squadraCasa.getPunti()+3);
		}
		else if(golCasa<golFuori)
		{
			squadraFuori.setPunti(squadraFuori.getPunti()+3);
		}
		else 
		{
			squadraCasa.setPunti(squadraCasa.getPunti()+1);
			squadraFuori.setPunti(squadraFuori.getPunti()+1);
		}
	}
}
