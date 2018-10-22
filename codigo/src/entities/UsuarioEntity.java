package entities;

import javax.persistence.*;

@Entity
@Table(name="Usuarios")
public class UsuarioEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String apodo;
	private String mail;
	private int puntos;
	private String categoria;
	private int partidasJugadas;
	private int partidasGanadas;
	private boolean online;
	private float promedio;
	private int nroRanking;	

	
	public UsuarioEntity() {
		
	}
	public UsuarioEntity(String apodo,String mail, int puntos, String categoria, int partidasJugadas,int partidasGanadas,boolean online, float promedio, int ranking) {
		this.apodo=apodo;
		this.mail=mail;
		this.puntos=puntos;
		this.categoria=categoria;
		this.partidasJugadas=partidasJugadas;
		this.partidasGanadas=partidasGanadas;
		this.online=online;
		this.promedio=promedio;
		this.nroRanking=ranking;
	}
	
	public String getApodo() {
		return this.apodo;
	}
	public String getMail() {
		return this.mail;
	}
	public int getPuntos() {
		return this.puntos;	
	}
	public String getCategoria() {
		return this.categoria;
	}
	public int getPartidasJugadas() {
		return this.partidasJugadas;
	}
	public int getPartidasGanadas() {
		return this.partidasGanadas;
	}
	public boolean estaOnline() { 
		return this.online;
	}
	public float getPromedio() {
		return this.promedio;
	}
	public int getRanking() {
		return this.nroRanking;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public int getNroRanking() {
		return nroRanking;
	}

	public void setNroRanking(int nroRanking) {
		this.nroRanking = nroRanking;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}

	public void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

}
