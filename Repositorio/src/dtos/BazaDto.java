package dtos;

import java.io.Serializable;
import java.util.ArrayList;

import negocio.Jugada;

public class BazaDto implements Serializable {
	
	private static final long serialVersionUID = 3002182989121468107L;
	private int turno;
	private ArrayList<JugadaDto> jugadas;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//												//
	//--------------------------------------------------------------------------------------------------//
	public BazaDto( int turno, ArrayList<Jugada> jugadas) {
		this.turno=turno;
		for(Jugada jugada:jugadas) {
			JugadaDto jv=jugada.getView();
			this.jugadas.add(jv);
		}
	}
	public int getTurno() {
		return turno;
	}
	public ArrayList<JugadaDto> getJugadasView(){
		return jugadas;
	}
	
	public void setTurno(int turno) {
		this.turno = turno;
	}
	public void setJugadas(ArrayList<JugadaDto> jugadas) {
		this.jugadas = jugadas;
	}
}
