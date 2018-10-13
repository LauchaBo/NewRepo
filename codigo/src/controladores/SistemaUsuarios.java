package controladores;

import java.util.ArrayList;

import negocio.Usuario;

public class SistemaUsuarios {
	private ArrayList<Usuario> usuarios;
	private static SistemaUsuarios instance;
	
	private SistemaUsuarios() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public static SistemaUsuarios getInstance() {
		if (instance == null) {
			instance = new SistemaUsuarios();
		}
		return instance;
	}
	
	public void altaUsuario(String apodo, String mail, String password, String password2) {
		if (password == password2) {
			Usuario user = new Usuario(apodo, mail, password);
			usuarios.add(user);
			user.save();
		}
	}
	
	public void modificarUsuario(String apodo, String mail, String password) {
		Usuario user = buscarUsuario(apodo);
		user.setMail(mail);
		user.setPassword(password);
		user.update();
	}
	
	public void bajaUsuario(String apodo) {
		Usuario user = buscarUsuario(apodo);
		if(user != null) {
			user.setActivo(false);
			user.delete();
		}
	}
	
	public Usuario buscarUsuario(String apodo) {
		int i=0;
		while(i<this.usuarios.size() && !this.usuarios.get(i).sosUsuario(apodo)) {
			i++;
		}
		if (i<this.usuarios.size())
			return this.usuarios.get(i);
		else {
			Usuario user = null;
//			try {
//				user = UsuarioDao.getInstace().buscarUsuario(usuario);
//			} catch (ConnectionException | UsuarioException e) {
//				e.printStackTrace();
//			}
			return user;
		}
	}
	
	public boolean logIn(String apodo, String password) {
		Usuario user = buscarUsuario(apodo);
		return user.logIn(apodo, password);
	}
	
	public void logOut(String apodo) {
		Usuario user = buscarUsuario(apodo);
		user.logOut();
	}
	
	public void generarRanking() {
		
	}
}
