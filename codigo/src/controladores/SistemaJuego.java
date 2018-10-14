package controladores;

import java.util.ArrayList;

import negocio.Juego;
import negocio.Pareja;

public class SistemaJuego {
	private ArrayList<Juego> juegos;
	private static SistemaJuego instance;
//	private Pool pool;
	
	public SistemaJuego() {
		this.juegos = new ArrayList<Juego>();
	}
	
	public static SistemaJuego getInstance() {
		if (instance == null)
			instance = new SistemaJuego();
		return instance;
	}
	
	public void crearJuego(String tipo, ArrayList<Pareja> parejas) {
		
	}
	
	public void bajaJuego(int idJuego) {
		
	}
	
	public boolean cantarEnvite(int idJuegado, int idJuego, int idEnvite) {
		return true;
	}
	
	public void crearGrupo(String nombre, String userAdmin, ArrayList<String> usuarios) {
		
	}
	
	public void crearJuegoCerrado(int idGrupo, int idParejaA, int idParejaB) {
		
	}
	
	public void cerrarGrupo(int idGrupo) {
		
	}
	
	public void notificarGrupo() {
		
	}
	
//	public JuegoView mostrarJuego(int idJuego) {
//		
//	}
	
	public void unirseAJuego(int idUsuario, String tipoJuego) {
		
	}
	
	public void invitarUsuario(String usuarioAnfitrion, String usuarioInvitado) {
		
	}
	
	public boolean confirmarInvitacion(String usuarioAnfitrion, String usuarioInvitado) {
		return true;
	}
	
	public void UnirParejaPool(String usuario1, String usuario2) {
		
	}
	
	public void jugarCarta(int numero, String palo, String usuario, int idJuego, int idPartida, int idMano, int idBaza) {
		
	}
}
