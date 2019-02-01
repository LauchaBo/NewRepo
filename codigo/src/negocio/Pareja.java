package negocio;

import java.util.ArrayList;

import views.ParejaView;

public class Pareja {
	private int idPareja;
	private ArrayList<Jugador> jugadores;
	private String categoria;
	
	public Pareja(Usuario usuarioA, Usuario usuarioB) {
		//idPareja
		Jugador jugadorA = new Jugador(usuarioA);
		Jugador jugadorB = new Jugador(usuarioB);
		this.jugadores.add(jugadorA);
		this.jugadores.add(jugadorB);
		calcularCategoria();
	}
	
	public void calcularCategoria() {
		this.categoria = "novato";
		for(Jugador jug : jugadores)
			if(jug.getUsuario().getCategoria() == "calificado")
				this.categoria = "calificado";
		for(Jugador jug : jugadores)
			if(jug.getUsuario().getCategoria() == "experto")
				this.categoria = "experto";
		for(Jugador jug : jugadores)
			if(jug.getUsuario().getCategoria() == "master")
				this.categoria = "master";
	}
	
	public ParejaView getView() {
		ParejaView parejaView = new ParejaView(jugadores, categoria);
		return parejaView;
	}

	public int getIdPareja() {
		return idPareja;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public String getCategoria() {
		return categoria;
	}
}
