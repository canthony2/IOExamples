/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioexamples;

import java.io.*;

/**
 *
 * @author canthony2
 */
public class Lab1 {
    public static void main(String[] args) {
        
        File file = new File("src" + File.separatorChar + "contactList.txt");
        
        BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(file));
           
           int lineCount = 0;
           Contact contact = null;
	   String line = in.readLine();
	   while(line != null){
		  if(lineCount == 0 || lineCount > 2) {
                      contact = new Contact();
                  }
		  line = in.readLine();  // strips out any carriage return chars
                  lineCount++;
	   }
	 
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
