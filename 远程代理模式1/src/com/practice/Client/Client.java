package com.practice.Client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.practice.MyRemote.AccountStatus;
/*
 * 用于调用远程服务
 * 
 * 客户端测试，在客户端调用远程对象上的远程方法，并返回结果
 */

public class Client {
	public static int flag = 0;
	public static void main(String[] args){
		new Thread(new Runnable() {
			public void run() {
				try {
					AccountStatus accountStatus;
					accountStatus = (AccountStatus)Naming.lookup("rmi://127.0.0.1:9090/AccountStatusHelper");
					accountStatus.OnlineStatus();
					Thread.sleep(1000);
					if(flag == 1) {
						accountStatus.OfflineStatus();
					}
				} catch (NotBoundException | MalformedURLException | RemoteException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		}).start();
		System.out.println("玩家2通过QQ登陆王者荣耀");
		flag = 1;
	}
}
