package com.practice.SayHello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
	public static int flag = 0;
	public static void main(String[] args){
		try {
				MyRemote accountStatus;
				accountStatus = (MyRemote)Naming.lookup("rmi://127.0.0.1:9090/MyRemoteImpl");
				System.out.println(accountStatus.sayHello());
		} catch (NotBoundException | MalformedURLException | RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} 

	}
}

