package com.practice.MyRemote;

import java.rmi.Remote;
import java.rmi.RemoteException;
/*
 * 客户端和服务端统一的接口，只需要服务端根据这个接口实现相应的功能，然后注册上去，
 * 客户端就可以根据这个接口来使用相应的功能
 *
 * 定义一个远程接口，必须继承Remote接口，其中需要远程调用的方法必须抛出RemoteException异常
 */
public interface AccountStatus extends Remote {
	public void OnlineStatus() throws RemoteException;//玩家在线状态
	public void OfflineStatus() throws RemoteException;//玩家下线状态
}
