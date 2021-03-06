/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioexamples;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author canthony2
 */
public class Lab1 {
    public static void main(String[] args) {
        
        File file = new File("src" + File.separatorChar + "contactList.txt");
        
        BufferedReader in = null;
        List<Contact> contacts = new ArrayList<>();
        
        try {
	   in = new BufferedReader(new FileReader(file));
           
           int lineCount = 0;
           Contact contact = null;
	   String line = in.readLine();
	   while(line != null){
		  if(lineCount == 0) {
                      contact = new Contact();
                      contacts.add(contact);
                      
                      String[] parts = line.split(" ");
                      contact.setFirstName(parts[0]);
                      contact.setLastName(parts[1]);
                      
                      lineCount++;
                  } else if(lineCount > 2) {
                      contact = new Contact();
                      lineCount = 0;
                  }
                  
		  line = in.readLine();  // strips out any carriage return chars
                  if(lineCount == 1) {
                      contact.setAddress(line);
                      lineCount++;
                      
                  } else if(lineCount == 2) {
                      String[] planetParts = line.split(", ");
                      contact.setIsland(planetParts[0]);
                      String[] planetSectorParts = planetParts[1].split(" ");
                      contact.setPlanet(planetSectorParts[0]);
                      contact.setSector(planetSectorParts[1]);
                  }
	   }
           
            System.out.println(contacts.size());
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
    }
}
