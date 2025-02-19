/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volpintesta.test;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HelloWorld
{
    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
       FileReader reader = new FileReader("menu.txt");
       
        int scelta = 0;
       System.out.println("1 per leggere il menu");
       System.out.println("2 per dare una comanda");
       System.out.println("3 per entrare in modalità amministratore");
       System.out.println("4 per uscire");
       scelta = Integer.parseInt(input.nextLine());
        switch(scelta){
           case 1:
               int data = reader.read();
               while(data != -1){
                   System.out.print((char)data);
                   data = reader.read();
               }
               break;
               
           case 2:
               break;
               
           case 3:
               break;
               
           case 4:
               System.out.println("arrivederci");
               break;
               
       } 
    }
    
}
