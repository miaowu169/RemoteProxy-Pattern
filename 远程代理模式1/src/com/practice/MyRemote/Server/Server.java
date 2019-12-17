package com.practice.MyRemote.Server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import com.practice.MyRemote.AccountStatus;
import com.practice.MyRemote.Imple.AccountStatusHelper;

/**
 * 创建RMI注册表，启动RMI服务，并将远程对象注册到RMI注册表中。
 */

public class Server {
	private static final String HOST = "localhost";
	private static final int PORT = 9090;
	
	public static void main(String [] args) {
		try {
			//创建对象, 准备将这个对象作为远程对象注册
			AccountStatus accountStatusHelper = new AccountStatusHelper(true);
			
			LocateRegistry.createRegistry(PORT);
			//绑定的URL标准格式为：rmi://host:port/name(其中协议名可以省略，下面两种写法都是正确的）
			Naming.bind("rmi://" + HOST + ":" + PORT + "/AccountStatusHelper",accountStatusHelper);
			System.out.println("---->远程对象绑定成功！");
		}catch(RemoteException e) {
			System.out.println("创建远程对象发生异常！");
			e.printStackTrace();
		}catch(AlreadyBoundException e) {
			System.out.println("发生重复绑定对象异常！");
			e.printStackTrace();
		}catch(MalformedURLException e) {
			System.out.println("发生URL畸形异常！");
			e.printStackTrace();
		}
	}
}
