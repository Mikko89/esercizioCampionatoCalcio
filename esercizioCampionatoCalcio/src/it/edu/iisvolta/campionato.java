package it.edu.iisvolta;

import java.util.ArrayList;

public class campionato {

	private String nome;
	private ArrayList<squadra> elencoSquadre;
	private ArrayList<partita> elencoPartite;
	
	public campionato(String nome)
	{
		super();
		this.nome=nome;
		elencoSquadre=new ArrayList<squadra>();
		elencoPartite=new ArrayList<partita>();
	}
	
	public void generaCalendario()
	{
		for(squadra s1: elencoSquadre)
			for(squadra s2: elencoSquadre)
				if(s1!=s2)
					elencoPartite.add(new partita(s1,s2));
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<squadra> getElencoSquadre() {
		return elencoSquadre;
	}

	public ArrayList<partita> getElencoPartite() {
		return elencoPartite;
	}
	
	
}
