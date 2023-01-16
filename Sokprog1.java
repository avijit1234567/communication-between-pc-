/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokprog1;

/**
 *
 * @author USER
 */

import java.io.*;  
import java.net.*;  

public class Sokprog1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{  
ServerSocket ss=new ServerSocket(6666);  
Socket s=ss.accept();//establishes connection 
//It is used by the server to read the data from the client system
DataInputStream dis=new DataInputStream(s.getInputStream());  
String  str=(String)dis.readUTF();  
System.out.println("message= "+str);  
ss.close();  
}catch(Exception e){System.out.println(e);}  
    }
    
}
