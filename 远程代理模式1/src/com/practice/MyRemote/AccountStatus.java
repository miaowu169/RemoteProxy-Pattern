package com.practice.MyRemote;

import java.rmi.Remote;
import java.rmi.RemoteException;
/*
 * �ͻ��˺ͷ����ͳһ�Ľӿڣ�ֻ��Ҫ����˸�������ӿ�ʵ����Ӧ�Ĺ��ܣ�Ȼ��ע����ȥ��
 * �ͻ��˾Ϳ��Ը�������ӿ���ʹ����Ӧ�Ĺ���
 *
 * ����һ��Զ�̽ӿڣ�����̳�Remote�ӿڣ�������ҪԶ�̵��õķ��������׳�RemoteException�쳣
 */
public interface AccountStatus extends Remote {
	public void OnlineStatus() throws RemoteException;//�������״̬
	public void OfflineStatus() throws RemoteException;//�������״̬
}
