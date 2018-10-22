package controladores;

import java.util.ArrayList;

import negocio.Grupo;
import negocio.Juego;
import negocio.Pareja;

public class SistemaJuego {
	private ArrayList<Juego> juegos;
	private Pool pool;
	private static SistemaJuego instance;
//	private Pool pool;
	
	public SistemaJuego() {
		this.juegos = new ArrayList<Juego>();
		this.pool = new Pool();
	}
	
	public static SistemaJuego getInstance() {
		if (instance == null)
			instance = new SistemaJuego();
		return instance;
	}
	
	public void crearJuego(String tipo, Pareja parejaA, Pareja parejaB) {
		Juego juego = new Juego(tipo, parejaA, parejaB);
		juegos.add(juego);
		juego.save();
	}
	
	public void bajaJuego(int idJuego) {
		Juego juego = buscarJuego(idJuego);
		juego.setActivo(false);
	}
	
	public boolean cantarEnvite(int idJugador, int idJuego, int idEnvite) {
		Juego juego = buscarJuego(idJuego);
		return juego.cantarEnvite(idJugador, idJuego, idEnvite);
	}
	
	public void crearGrupo(String nombre, String userAdmin, ArrayList<String> usuarios) {
		Grupo grupo = new Grupo(nombre, userAdmin, usuarios);
	}
	
	public void crearJuegoCerrado(int idGrupo, int idParejaA, int idParejaB) {
		Grupo grupo = new Grupo(parejaA, parejaB);
		grupo.crearJuego(parejaA, parejaB);
	}
	
	public void cerrarGrupo(int idGrupo) {
		Grupo grupo = buscarGrupo(idGrupo);
		grupo.setActivo(false);
	}
	
	public void notificarGrupo() {
		Grupo grupo = buscarGrupo(idGrupo);
		grupo.notificar();
	}
	
//	public JuegoView mostrarJuego(int idJuego) {
//		
//	}
	
	public void unirseAJuego(int idUsuario, String tipoJuego) {
		this.pool.agregarJugador(idUsuario, tipoJuego);
	}
	
	public void invitarUsuario(String usuarioAnfitrion, String usuarioInvitado) {
		//mostrar invitación a usuario
	}
	
	//segun DC debería retornar un boolean
	public void confirmarInvitacion(String usuarioAnfitrion, String usuarioInvitado) {
		this.pool.agregarPareja(usuarioAnfitrion, usuarioInvitado);
	}
	
	public void UnirParejaPool(String usuario1, String usuario2) {
		
	}
	
	public void jugarCarta(int numero, String palo, String usuario, int idJuego, int idPartida, int idMano, int idBaza) {
		Juego juego = buscarJuego(idJuego);
		juego.jugarCarta(numero, palo, usuario);
	}
}
