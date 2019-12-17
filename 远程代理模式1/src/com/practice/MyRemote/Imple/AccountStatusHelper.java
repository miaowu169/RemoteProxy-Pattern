package com.practice.MyRemote.Imple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import com.practice.MyRemote.AccountStatus;

public class AccountStatusHelper extends UnicastRemoteObject implements AccountStatus {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private boolean Online = false;

	public AccountStatusHelper(boolean _Online) throws RemoteException {
		this.Online = _Online;
	}
	
	@Override
	public void OnlineStatus() throws RemoteException {
		System.out.println("玩家1正使用账号游戏中……");
	}

	@Override
	public void OfflineStatus() throws RemoteException {
		System.out.println("玩家1退出王者荣耀账号！");
	}

}
