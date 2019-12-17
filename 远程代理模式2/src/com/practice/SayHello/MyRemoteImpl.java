package com.practice.SayHello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	private static final long serialVersionUID = 1L;

	protected MyRemoteImpl() throws RemoteException {}

	public String sayHello() throws RemoteException {
		return "server says:'Hello'";
	}	
}
