package negocio;

import java.util.ArrayList;

import dtos.BazaDto;

public class Baza {
	private int idBaza;
	private int turno;
	private ArrayList<Jugada> jugadas;

	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//												//
	//--------------------------------------------------------------------------------------------------//

	public Baza() {
		//this.idBaza=
		this.turno=0;
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
		
	}
	public void calcularGanador(Jugador jugadorMano) {
		Jugada mejorJugada = null; 
		for (Jugada jug: jugadas) {  // Recorro todas las jugadas y saco la de mejor ranking
			if (mejorJugada==null)
				mejorJugada=jug;
			else if (jug.rankingJugada()<mejorJugada.rankingJugada())
				mejorJugada=jug;
			else if (mejorJugada.rankingJugada()==jug.rankingJugada()&&jug.getJugador().getUsuario().getApodo()==jugadorMano.getUsuario().getApodo()) {
				mejorJugada=jug;
			}
		}
	}
	public void jugarCarta (Carta carta, Jugador jugador) {
		Jugada jugada= new Jugada(jugador, carta);
		this.jugadas.add(jugada);
	}
	public BazaDto getView() {
		BazaDto bazaView=new BazaDto(turno,jugadas);
		return bazaView;
	}

}
