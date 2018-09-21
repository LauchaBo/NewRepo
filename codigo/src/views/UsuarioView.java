package views;

public class UsuarioView {
	private String apodo;
	private String mail;
	private int puntos;
	private int idUsuario;
	private String categoria;
	private int partidasJugadas;
	private int partidasGanadas;
	private boolean online;
	private float promedio;
	private int nroRanking;	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	public UsuarioView(String apodo,String mail, int puntos, int idUsuario, String categoria, int partidasJugadas,int partidasGanadas,boolean online, float promedio, int ranking) {
		this.apodo=apodo;
		this.mail=mail;
		this.puntos=puntos;
		this.idUsuario=idUsuario;
		this.categoria=categoria;
		this.partidasJugadas=partidasJugadas;
		this.partidasGanadas=partidasGanadas;
		this.online=online;
		this.promedio=promedio;
		this.nroRanking=ranking;
	}
	
	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	
	public String getApodo() {
		return this.apodo;
	}
	public String getMail() {
		return this.mail;
	}
	public int getPuntos() {
		return this.puntos;	
	}
	public int getIdUsuario() {
		return this.idUsuario;
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

}
