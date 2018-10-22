package views;

import java.util.ArrayList;

import negocio.Jugador;

public class ParejaView {
	private ArrayList<JugadorView> jugadores;
	private String categoria;
	
	public ParejaView(ArrayList<Jugador> jugadores, String categoria) {
		for(Jugador jug:jugadores) {
			JugadorView jugadorView = jug.getView();
			this.jugadores.add(jugadorView);
		}
		this.categoria = categoria;	
	}

	public ArrayList<JugadorView> getJugadores() {
		return jugadores;
	}

	public String getCategoria() {
		return categoria;
	}
}
