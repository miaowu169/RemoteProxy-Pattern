package com.practice.Client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.practice.MyRemote.AccountStatus;
/*
 * ���ڵ���Զ�̷���
 * 
 * �ͻ��˲��ԣ��ڿͻ��˵���Զ�̶����ϵ�Զ�̷����������ؽ��
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
		System.out.println("���2ͨ��QQ��½������ҫ");
		flag = 1;
	}
}
