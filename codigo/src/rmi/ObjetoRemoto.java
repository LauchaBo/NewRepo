package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import interfaces.iRemota;

public class ObjetoRemoto extends UnicastRemoteObject implements iRemota{

	private static final long serialVersionUID = 3377751303782597726L;
	
	public ObjetoRemoto() throws RemoteException {}


	/*
	 * 
	 * 
	 * ACA VAN LOS METODOS DE LA INTERFACE REMOTA LLAMANDO A LOS CONTROLADORES DE LA FORMA: 
	 * 
	 * public int suma(int a, int b) throws RemoteException {
		return new Controlador().sumar(a, b);
		}
	 * 
	 * 
	 */
}
