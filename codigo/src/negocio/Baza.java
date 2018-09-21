package negocio;

import java.util.ArrayList;

import views.BazaView;

public class Baza {
	private int idBaza;
	private int turno;
	private ArrayList<Jugada> jugadas;

	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//												//
	//--------------------------------------------------------------------------------------------------//

	public Baza() {
		//this.idBaza=
		//this.turno=
		this.setJugadas(new ArrayList<Jugada>());
	}

	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	
	public int getIdBaza() {
		return idBaza;
	}

	public void setIdBaza(int idBaza) {
		this.idBaza = idBaza;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public ArrayList<Jugada> getJugadas() {
		return jugadas;
	}

	public void setJugadas(ArrayList<Jugada> jugadas) {
		this.jugadas = jugadas;
	}
	
	public void calcularEnvido() {
		//
	}
	public void calcularGanador() {
		Jugada mejorJugada = null; 
		for (Jugada jug: jugadas) {  // Recorro todas las jugadas y saco la de mejor ranking
			if (mejorJugada==null)
				mejorJugada=jug;
			else if (jug.rankingJugada<mejorJugada.rankingJugada)
				mejorJugada=jug;
			else if () // falta el caso en el que las cartas tienen el mismo ranking
		}				// si no me eequivoco pasa el que es mano
	}
	public void jugarCarta (Carta carta, Jugador jugador) {
		Jugada jugada= new Jugada(jugador, carta);
		this.jugadas.add(jugada);
	}
	public BazaView getView() {
		BazaView bazaView=new BazaView(idBaza,turno,jugadas);
		return bazaView;
	}

}
