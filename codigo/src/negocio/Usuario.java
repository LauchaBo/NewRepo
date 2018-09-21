package negocio;

public class Usuario {
	private String apodo;
	private String mail;
	private int puntos;
	private int idUsuario;
	private String password;
	private String categoria;
	private int partidasJugadas;
	private int partidasGanadas;
	private boolean online;
	private float promedio;
	private int nroRanking;
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
		public Usuario (String apodo, String mail, String password) {
			this.apodo=apodo;
			this.mail=mail;
			this.password=password;
			this.puntos=0;
			this.partidasGanadas=0;
			this.partidasJugadas=0;
			this.promedio=0;
			this.online=true;
			this.categoria="novato";
			//this.idUsuario=
			//this.nroRanking=
			
		}
	//--------------------------------------------------------------------------------------------------//
	//										//METODOS//													//
	//--------------------------------------------------------------------------------------------------//
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPartidasJugadas() {
		return partidasJugadas;
	}
	public void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}
	public int getPartidasGanadas() {
		return partidasGanadas;
	}
	public void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
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
	public float getPromedio() {
		return promedio;
	}
	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}
	
	public void calcularCategoria() {
		if (this.partidasJugadas>100&& this.puntos>500&&this.promedio>=5)
			this.categoria="calificado";
		else if (this.partidasJugadas>500&& this.puntos>3000 &&this.promedio>=6)
			this.categoria="experto";
		else if (this.partidasJugadas>1000 && this.puntos>8000 &&this.promedio>=8)
			this.categoria="master";
	}
	public boolean sosUsuario(int idUsuario) {
		return (this.idUsuario==idUsuario);
	}
	public float calcularPromedio() {
		//
		return 0;
	}
	public void agregarPartida( boolean ganada, int puntos) {
		this.partidasJugadas++;
		this.puntos=this.puntos+puntos;
		if (ganada)
			this.partidasGanadas++;
		this.calcularCategoria();
	}
	public boolean logIn(String apodo,String password) {
		if (this.apodo==apodo && this.password==password) {
			this.online=true;
			return true;
		}
		else
			return false;
	}
	public void logOut() {
		this.online=false;
		//cerrar partidas?
	}
	public void save() {
		
	}
	public void update() {
		
	}
	public void delete() {
		
	}
}
