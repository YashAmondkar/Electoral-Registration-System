/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electoralinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;



/**
 *
 * @author Yash1861991
 */
public interface ElectoralInterface extends Remote{
    
    public Integer electoralserver()throws RemoteException;

    public String exit()throws RemoteException;
    
}
