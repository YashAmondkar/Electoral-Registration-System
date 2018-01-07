
package electoralserver;

import electoralinterface.ElectoralInterface;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;
import java.rmi.*;  
import java.rmi.registry.*;  

        /**
 *
 * @author Yash1861991
 */
public class ElectoralServer extends UnicastRemoteObject implements ElectoralInterface {

    
    public ElectoralServer()throws RemoteException
    {
        super();
    }
    
    public static void main(String[] args) {
       
        try {
            Registry reg=LocateRegistry.createRegistry(1099);
            ElectoralServer server=new ElectoralServer();
            Naming.rebind("electoralserver", server);
            
            System.out.println("Server is Ready......");
            System.out.println("Electoral Server is bound into Registry ..... ");
            
        } catch (Exception e) {
            System.out.println("Electoral Server ..... "+e.getMessage());
            e.printStackTrace();
        }
        
    }  
    
    public Integer electoralserver(){
        
        start s = new start();
        s.show();
        
        return 1;
        
    }
    
    public String exit(){
        return "Thank you using Electoral Registration System" ;
    }
    
}
