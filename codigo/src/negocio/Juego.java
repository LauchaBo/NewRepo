package negocio;

import java.util.Date;

import views.JuegoView;

import java.util.ArrayList;

public class Juego {
	private ArrayList<Jugador> jugadores;
	private ArrayList<Partida> partidas;
	private Partida partidaActiva;
	private int idJuego;
	private Pareja parejaA;
	private Pareja parejaB;
	private String categoriaParA;
	private String categoriaParB;
	private Date fecha;
	private String tipo;
	private boolean terminada;
	
	public Juego(String tipo, Pareja parejaA, Pareja parejaB) {
		this.jugadores = new ArrayList<Jugador>();
		this.partidas = new ArrayList<Partida>();
		//idJuego
		this.parejaA = parejaA;
		this.parejaB = parejaB;
		this.categoriaParA = parejaA.getCategoria();
		this.categoriaParB = parejaB.getCategoria();
		this.fecha = new Date().now();
		this.tipo = tipo;
		this.terminada = false;
		
		for(jug : parejaA.getJugadores()) {
			jugadores.add(jug);
		}
		for(jug : parejaB.getJugadores()) {
			jugadores.add(jug);
		}		
	}
	
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	public void cerrarPartida(Pareja ganadora, int puntos) {
		terminada = true;
		ganadora.agregarPartida()
	}
	
	public void verificarGanador() {
		//Partida tiene un int ganador. Como chequeamos?
	}
	
	public JuegoView getView() {
		JuegoView juegoView= new JuegoView(jugadores, partidas, partidaActiva, parejaA, parejaB, categoriaParA, categoriaParB, fecha, tipo, terminada);
		return juegoView;
	}
	
	public void crearPartida() {
		Partida partida = new Partida();
		partidaActiva = partida;
	}
	
	public boolean cantarEnvite(int idJugador, int idEnvite) {
		partidaActiva.cantarEnvite(idJugador, idEnvite);
	}
	
	public Jugador buscarJugador(String usuario) {
		for(Jugador jug : jugadores)
			if(jug.getUsuario().getApodo() == usuario)
				return jug;
		return null;
	}
	
	public void jugarCarta(int numero, String palo, String jugador) {
		partidaActiva.jugarCarta(numero, palo, jugador);
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public ArrayList<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}

	public Partida getPartidaActiva() {
		return partidaActiva;
	}

	public void setPartidaActiva(Partida partidaActiva) {
		this.partidaActiva = partidaActiva;
	}

	public Pareja getParejaA() {
		return parejaA;
	}

	public void setParejaA(Pareja parejaA) {
		this.parejaA = parejaA;
	}

	public Pareja getParejaB() {
		return parejaB;
	}

	public void setParejaB(Pareja parejaB) {
		this.parejaB = parejaB;
	}

	public String getCategoriaParA() {
		return categoriaParA;
	}

	public void setCategoriaParA(String categoriaParA) {
		this.categoriaParA = categoriaParA;
	}

	public String getCategoriaParB() {
		return categoriaParB;
	}

	public void setCategoriaParB(String categoriaParB) {
		this.categoriaParB = categoriaParB;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdJuego() {
		return idJuego;
	}

	public String getTipo() {
		return tipo;
	}
}
