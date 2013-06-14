package com.nadika.example.clientshocket.clientshoket_sample;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.example.tutorial.AddressBookProtos.AddressBook;
import com.example.tutorial.AddressBookProtos.Person;

/**
 * @author Dinusha Nandika
 *
 */
public class ServerClient {

	
	private String serverName;
	private int port;
	
	

	/**
	 * @param serverName
	 * @param port
	 */
	public ServerClient(String serverName, int port) {
		super();
		this.serverName = serverName;
		this.port = port;
	}



	void creatClient() throws IOException{

        System.out.println("Connecting to " + serverName
                            + " on port " + port);
        Socket socket;
		
			
			
			     socket = new Socket(serverName, port);
					
				   
			        DataOutputStream out =
			                new DataOutputStream(socket.getOutputStream());
			          
			           
			           
			           //
			           Person.Builder person = Person.newBuilder();
			           person.setId(22);
			           person.setEmail("dnsw@gmail.com");
			           person.setName("dinu");

			           AddressBook.Builder addressBook = AddressBook.newBuilder();
			           addressBook.addPerson(person.build());
			           

			           
			      //     CodedOutputStream output=new CodedOutputStream();
						addressBook.build().writeTo(out);

			        
			        //
			        
						out.close();
						
						socket.close();
				
		       

        
     
	}
	
}
