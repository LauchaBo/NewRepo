package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.swing.JOptionPane;

import interfaces.iRemota;
import rmi.ObjetoRemoto;

public class Server {

	public Server() {
		init();		
	}

	private void init() {
		try {
			iRemota or = new ObjetoRemoto();
			LocateRegistry.createRegistry(1099); //Registro para aceptar conexiones en TCP 1099
			Naming.rebind("//localhost/Server", or);
			System.out.println("Servidor iniciado");
		//JOptionPane.showMessageDialog(null, "Servidor iniciado");
		} catch (RemoteException e) {
			e.printStackTrace();
			//JOptionPane.showMessageDialog(null, "Error de iniciaización del objeto remoto");
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "Error de publicación del objeto");

		}
		
	}
}
