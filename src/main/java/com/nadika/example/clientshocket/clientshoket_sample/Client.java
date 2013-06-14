package com.nadika.example.clientshocket.clientshoket_sample;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class Client 
{
	static String serverName = "dinushaw";
   static  int port = 6666;
	
    public static void main( String[] args )
    {
    	
         
         int clientNo =Integer.parseInt(args[0]);
    	
    //	serverName = args[0];
      //  port = Integer.parseInt(args[1]);
        
         
         try
         {
        	 for (int i = 0; i < clientNo; i++) {
 				
        		 ServerClient client = new ServerClient(serverName, port);
        		 client.creatClient();
        	 }
        	 
         }catch(IOException e)
         {
            e.printStackTrace();
         }
    }
}
