package businessDelegate;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import excepciones.ComunicacionException;
import interfaces.iRemota;
public class businessDelegate {
	
		private iRemota ir;
		
		public businessDelegate() throws ComunicacionException{
			try {
				ir = (iRemota) Naming.lookup(""); //PONER LA URL DEL SERVER ENTRE COMILLAS
			} catch (MalformedURLException e) {
				throw new ComunicacionException("La direccion especificada no es correcta");
			} catch (RemoteException e) {
				throw new ComunicacionException("Error en las comunicaciones");
			} catch (NotBoundException e) {
				throw new ComunicacionException("El servidor no esta disponible");		
			}
		}
		
		
	/*
	 * Metodos de la forma 
	 * 
	 * public int suma(int a, int b) throws ComunicacionException{
		try {
			return ir.suma(a, b);
		} catch (RemoteException e) {
			throw new ComunicacionException("Error en las comunicaciones");	
		}
	 * 
	 * 
	 * 
	 * 
	 */
	}