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
}
