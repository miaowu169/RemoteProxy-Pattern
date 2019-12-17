package com.practice.SayHello;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
 
/**
 * ����RMIע�������RMI���񣬲���Զ�̶���ע�ᵽRMIע����С�
 */
public class Server {
    private static final String HOST = "localhost";
    private static final int PORT = 9090;
 
	public static void main(String args[]) {
 
        try {
            //����2������, ׼�����������������ΪԶ�̶���ע��
			MyRemote MyRemoteHelper = new MyRemoteImpl();
 
            LocateRegistry.createRegistry(PORT);
 
            //�󶨵�URL��׼��ʽΪ��rmi://host:port/name(����Э��������ʡ�ԣ���������д��������ȷ�ģ�

            Naming.bind("rmi://" + HOST + ":" + PORT + "/MyRemoteImpl", MyRemoteHelper);
 
            System.out.println("---->Զ�̶���󶨳ɹ���");
        } catch (RemoteException e) {
            System.out.println("����Զ�̶������쳣��");
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            System.out.println("�����ظ��󶨶����쳣��");
            e.printStackTrace();
        } catch (MalformedURLException e) {
            System.out.println("����URL�����쳣��");
            e.printStackTrace();
        }
    }
}