package negocio;

import java.util.ArrayList;

import views.PartidaView;

public class Partida {
	private int idPartida;
	private int puntosTotalA;
	private int puntosTotalB;
	private Mazo mazo;
	private boolean finalizado;
	private int ganador;
	private ArrayList<Mano> manos;
	private Mano manoActiva;
	private ArrayList<Jugador> jugadores;
	
	public Partida() {
		//idPartida
		this.puntosTotalA = 0;
		this.puntosTotalB = 0;
		this.mazo = new Mazo();
		this.finalizado = false;
		this.ganador = 0;
		this.manos = new ArrayList<Mano>();
		this.manoActiva = new Mano();	
		this.jugadores = new ArrayList<Jugador>();
	}
	
	public void repartir() {
		for(int i=0; i<3; i++)
			for(Jugador jug:jugadores) {
				Carta carta = mazo.getCartasMazo().get(0);
				mazo.removeFirst();
				jug.setCartaMano(carta);
			}
	}
	
	public void nuevoMazo() {
		mazo = new Mazo();
	}
	
	public void agregarPuntosMano() {
		puntosTotalA += manoActiva.getPuntosA();
		puntosTotalB += manoActiva.getPuntosB();
	}
	
	public boolean cantarEnvite(int idJugador, int idJuego, int idEnvite) {
		return manoActiva.cantarEnvite(idJugador, idJuego, idEnvite);
	}
	
	public void jugarCarta(int numero, String palo, Jugador jugador) {
		Carta carta = new Carta(numero, palo);
		manoActiva.jugarCarta(carta, jugador);
	}
	
	public PartidaView getView() {
		PartidaView partidaView = new PartidaView(puntosTotalA, puntosTotalB, mazo, finalizado, ganador, manos, manoActiva);
		return partidaView;
	}

	public int getPuntosTotalA() {
		return puntosTotalA;
	}

	public void setPuntosTotalA(int puntosTotalA) {
		this.puntosTotalA = puntosTotalA;
	}

	public int getPuntosTotalB() {
		return puntosTotalB;
	}

	public void setPuntosTotalB(int puntosTotalB) {
		this.puntosTotalB = puntosTotalB;
	}

	public Mazo getMazo() {
		return mazo;
	}

	public void setMazo(Mazo mazo) {
		this.mazo = mazo;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public int getGanador() {
		return ganador;
	}

	public void setGanador(int ganador) {
		this.ganador = ganador;
	}

	public ArrayList<Mano> getManos() {
		return manos;
	}

	public void setManos(ArrayList<Mano> manos) {
		this.manos = manos;
	}

	public Mano getManoActiva() {
		return manoActiva;
	}

	public void setManoActiva(Mano manoActiva) {
		this.manoActiva = manoActiva;
	}

	public int getIdPartida() {
		return idPartida;
	}
	
	
}
