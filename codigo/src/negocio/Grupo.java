package negocio;

import java.util.ArrayList;

import controladores.SistemaUsuarios;

public class Grupo {
	private ArrayList<Juego> juegos;
	private ArrayList<Pareja> parejas;
	private ArrayList<Usuario> usuarios;
	private Usuario admin;
	private String nombre;
	private int idGrupo;
	
	public Grupo() {
		
	}
	
	public void invitarUsuario(String apodo) {
		Usuario invitado = SistemaUsuarios.getInstance().buscarUsuario(apodo);
		usuarios.add(invitado);
		//save()
	}
	
	public void armarPareja(Usuario usuario1, Usuario usuario2) {
		
	}
	
	public void crearJuego(Pareja parejaA, Pareja parejaB) {
		
	}
	
	public void notificar() {
		
	}
	
	public void getView() {
		
	}
}
