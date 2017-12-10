package wbserver.bean;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import Server_RMI.Comunication_server;
import Server_RMI.Eleicao;
import Server_RMI.ListaCandidatos;
public class WbserverBean  {
    private Comunication_server server;
	private String password,username;
	private String teste;

	public WbserverBean() throws MalformedURLException{
		try {
			server = (Comunication_server) LocateRegistry.getRegistry(6500).lookup("connection_RMI");
		} catch (RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	public String getTestconnection() throws RemoteException{
		return teste = server.getTestconnection();
	}
	public void setPassword(String p){
		this.password=p;
	}

	public void setUsername(String u){
		this.username=u;
	}
	
	
}
