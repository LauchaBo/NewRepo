package controladores;

import java.util.ArrayList;

import negocio.Juego;
import negocio.Usuario;

public class SistemaHistorial {
	private ArrayList<Juego> juegos;
	private static SistemaHistorial instance;
	
	public SistemaHistorial() {
		this.setJuegos(new ArrayList<Juego>());
	}
	
	private static SistemaHistorial getInstance() {
		if (instance == null )
			instance = new SistemaHistorial();
		return instance;
	}
	
	public ArrayList<JuegoView> mostrarJuegosUsuario(int idUsuario) {
//		Usuario user = SistemaUsuarios.buscarUsuario(idUsuario);
//		ArrayList<JuegoView> juegosView = new ArrayList<JuegoView>();
//		for (Juego juego: this.juegos)
	}
	
	public JuegoView mostrarJuego(int idJuego) {
		Juego juego = SistemaJuego.buscarJuego(idJuego);
		return juego.getView();
	}

	public ArrayList<Juego> getJuegos() {
		return juegos;
	}

	public void setJuegos(ArrayList<Juego> juegos) {
		this.juegos = juegos;
	}
}
