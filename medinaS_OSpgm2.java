/********************************************************************* 
    Author     : Sebastian Medina 
    Course     : Computer Operating Systems Spring 
    Professor  : Michael Robinson 
    Program    : Program 2
    Purpose    : Converting hex to binary to decimal values
    Due Date   : 02/15/2024 

    Certification: 
    I hereby certify that this work is my own and none of it is the work of any other person. 


    ..........{ Sebastian Medina }.......... 
    
*********************************************************************/ 
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
public class medinaS_OSpgm2
{

    public static String hexBinary(String reader)
    {

       
        
       reader = reader.replace("A", "1010");  
       reader = reader.replace("B", "1011");
                
                 
        
        
        return reader;
    
    }


    public static void main(String args[]) throws IOException
    {

        
        FileReader file = new FileReader("RAMerrors8x4f.6");
        Scanner scnr = new Scanner(file);
        

        while (scnr.hasNextLine())
        {

          String reader = scnr.nextLine();
          System.out.printf("%s\n", reader);  
        
        }

        
    
    }











}   