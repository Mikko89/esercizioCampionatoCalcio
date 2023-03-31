package it.edu.iisvolta;

public class Main {

	public static void main(String[] args) {
	
		campionato c=new campionato("Serie A");
		
		c.getElencoSquadre().add(new squadra("Lecce"));
		c.getElencoSquadre().add(new squadra("Napoli"));
		c.getElencoSquadre().add(new squadra("Roma"));
		c.getElencoSquadre().add(new squadra("Lazio"));
		
		c.generaCalendario();
		
		for(partita p: c.getElencoPartite())
			System.out.println(
					p.getSquadraCasa().getNome() +" - " +
					p.getSquadraFuori().getNome());
	}

}
