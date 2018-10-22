package views;

import java.util.ArrayList;
import java.util.Date;

import negocio.Jugador;
import negocio.Pareja;
import negocio.Partida;

public class JuegoView {
	private ArrayList<JugadorView> jugadores;
	private ArrayList<PartidaView> partidas;
	private PartidaView partidaActiva;
	private ParejaView parejaA;
	private ParejaView parejaB;
	private String categoriaParA;
	private String categoriaParB;
	private Date fecha;
	private String tipo;
	private boolean terminada;
	
	public JuegoView(ArrayList<Jugador> jugadores, ArrayList<Partida> partidas, Partida partidaActiva, Pareja parejaA, Pareja parejaB, String categoriaParA, String categoriaParB, Date fecha, String tipo, boolean terminada) {
		for(Jugador jug:jugadores)
			this.jugadores.add(jug.getView());
		for(Partida p:partidas)
			this.partidas.add(p.getView());
		this.parejaA = parejaA.getView();
		this.parejaB = parejaB.getView();
		this.categoriaParA = categoriaParA;
		this.categoriaParB = categoriaParB;
		this.fecha = fecha;
		this.tipo = tipo;
		this.terminada = terminada;	
	}

	public ArrayList<JugadorView> getJugadores() {
		return jugadores;
	}

	public ArrayList<PartidaView> getPartidas() {
		return partidas;
	}

	public PartidaView getPartidaActiva() {
		return partidaActiva;
	}

	public ParejaView getParejaA() {
		return parejaA;
	}

	public ParejaView getParejaB() {
		return parejaB;
	}

	public String getCategoriaParA() {
		return categoriaParA;
	}

	public String getCategoriaParB() {
		return categoriaParB;
	}

	public Date getFecha() {
		return fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean isTerminada() {
		return terminada;
	}
}
