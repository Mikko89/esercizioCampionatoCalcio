package it.edu.iisvolta;

public class Main {

	public static void main(String[] args) {
	
		campionato c=new campionato("Serie A");
		
		c.getElencoSquadre().add(new squadra("Lecce"));
		c.getElencoSquadre().add(new squadra("Napoli"));
		c.getElencoSquadre().add(new squadra("Roma"));
		c.getElencoSquadre().add(new squadra("Lazio"));
		c.getElencoSquadre().add(new squadra("Fanfulla Lodi"));
		
		c.generaCalendario();
		
		for(partita p: c.getElencoPartite())
		{
			p.simulaPartita();
			System.out.println(
					p.getSquadraCasa().getNome() +" - " +
					p.getSquadraFuori().getNome() + " : " +
					p.getGolCasa() + " - " +
					p.getGolFuori());
		}
		
		System.out.println("\n\nCLASSIFICA: ");
		for(squadra s: c.getElencoSquadre())
			System.out.println(s.getNome() + ": " +s.getPunti());
		
	}

}
