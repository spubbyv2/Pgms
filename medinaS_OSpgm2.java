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
import java.lang.Math;
public class medinaS_OSpgm2
{

    public static String hexBinary(String reader)
    {


        if (reader.contains("0"))
        

            reader = reader.replace("0", "0000");


        if (reader.contains("1"))
        

            reader = reader.replace("1", "0001");

        
        if (reader.contains("2"))
        

            reader = reader.replace("2", "0010");

        
        if (reader.contains("3"))
        

            reader = reader.replace("3", "0011");

        
        if (reader.contains("4"))
        

            reader = reader.replace("4", "0100");

        
        if (reader.contains("5"))
        

            reader = reader.replace("5", "0101");

        
        if (reader.contains("6"))
        

            reader = reader.replace("6", "0110");

        
        if (reader.contains("7"))
        

            reader = reader.replace("7", "0111");

        
        if (reader.contains("8"))
        

            reader = reader.replace("8", "1000");

        
        if (reader.contains("9"))
        

            reader = reader.replace("9", "1101");
        
                                              
        if (reader.contains("A"))
        

            reader = reader.replace("A", "1010");
                
        
        if (reader.contains("B"))
        

            reader = reader.replace("B", "1011");
                
                   
        if (reader.contains("C"))
        

            reader = reader.replace("C", "1100");
                
        
        if (reader.contains("D"))
        

            reader = reader.replace("D", "1101");

        
        if (reader.contains("E"))
        

            reader = reader.replace("E", "1110");

        
        if (reader.contains("F"))
        

            reader = reader.replace("F", "1111");
        
        return reader;
    
    }

    public static double binaryDec(String binary)
    {

        double result = 0;
        
        for (int x = 0; x < binary.length(); x++)
        {
            
            if (binary.charAt(x) == '1')
            {

                result = result + Math.pow(2, binary.length() - 1 - x);
                
               
            }
            
        
        }
       
        return result;
            
    }


    public static void main(String args[]) throws IOException
    {

        
        String binary;
        double decimal;
        FileReader file = new FileReader("RAMerrors8x4f.6");
        Scanner scnr = new Scanner(file);
        

        System.out.printf("%s\n", "Hex Error    Binary                                     Decimal");
        while (scnr.hasNextLine())
        {

          String reader = scnr.nextLine();
          binary = hexBinary(reader);
          decimal = binaryDec(binary);

          System.out.printf("%s = %s = %.0f \n", reader, binary, decimal);  
         
          
        }

        
    
    }



}   