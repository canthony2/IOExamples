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
                      contact.setLastName(parts[0]);
                      
                      lineCount++;
                  } else if(lineCount > 2) {
                      contact = new Contact();
                      lineCount = 0;
                  } else {
                      lineCount++;
                  }
		  line = in.readLine();  // strips out any carriage return chars
                  if(lineCount == 1) {
                      contact.setAddress(line);
                  } else if(lineCount == 2) {
                      String[] cityParts = line.split(",");
                      
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
