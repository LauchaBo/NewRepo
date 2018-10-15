package views;

import java.util.ArrayList;

import negocio.Jugada;

public class BazaView {
	private int turno;
	private ArrayList<JugadaView> jugadas;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//												//
	//--------------------------------------------------------------------------------------------------//
	public BazaView( int turno, ArrayList<Jugada> jugadas) {
		this.turno=turno;
		for(Jugada jugada:jugadas) {
			JugadaView jv=jugada.getView();
			this.jugadas.add(jv);
		}
	}
	public int getTurno() {
		return turno;
	}
	public ArrayList<JugadaView> getJugadasView(){
		return jugadas;
	}
	

}
