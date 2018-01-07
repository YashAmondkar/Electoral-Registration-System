
package electoralclient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.*;  
import java.rmi.registry.*;  
import electoralinterface.ElectoralInterface;

/**
 *
 * @author Yash1861991
 */
public class ElectoralClient {

     static Integer flag=0;
     static String message="";
     static ElectoralInterface obj=null;  
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
   
        try {
             
         Registry reg=LocateRegistry.getRegistry("127.0.0.1",1099);
         obj=(ElectoralInterface)Naming.lookup("electoralserver");
         flag=obj.electoralserver();
            
           if (flag==1)
              {
                message=obj.exit();       
            }
  
            System.out.println("Electoral Server Message : "+message);
            
        } catch (Exception e) {
            
            System.out.println("Electoral Client ..... "+e.getMessage());
            e.printStackTrace();
        }

    }
    
}
