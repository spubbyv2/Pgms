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

        for (int x = 0; x < reader.length(); x++)
        {
        
        if (reader.charAt(x) == '0')
        

            reader = "0000";


        if (reader.charAt(x) == '1')
        

            reader = "0001";

        
        if (reader.charAt(x) == '2')
        

            reader = "0010";

        
        if (reader.charAt(x) == '3')
        

            reader = "0011";

        
        if (reader.charAt(x) == '4')
        

            reader = "0100";

        
        if (reader.charAt(x) == '5')
        

            reader = "0101";

        
        if (reader.charAt(x) == '6')
        

            reader = "0110";

        
        if (reader.charAt(x) == '7')
        

            reader = "0111";

        
        if (reader.charAt(x) == '8')
        

            reader = "1000";

        
        if (reader.charAt(x) == '9')
        

            reader = "1001";
        
                                              
        if (reader.charAt(x) == 'A')
        

            reader = "1010";
                
        
        if (reader.charAt(x) == 'B')
        

            reader = "1011";
                
                   
        if (reader.charAt(x) == 'C')
        

            reader = "1100";
                
        
        if (reader.charAt(x) == 'D')
        

            reader = "1101";

        
        if (reader.charAt(x) == 'E')
        

            reader = "1110";

        
        if (reader.charAt(x) == 'F')
        

            reader = "1111";

        }
        return reader;
    
    }

    public static double binaryDec(String binary)
    {
        long temp = 1;
        long sum = 0;
        
        for (int x = binary.length() - 1; x >= 0; x--)
        {
            
            if (binary.charAt(x) == '1')
            {

                for(int y = 0; y < binary.length - 1 - x; y++)
                {
                    temp = temp * 2;
                }        
                sum += temp;
                temp = 1;
            }
            
        
        }
       
        return sum;
            
    }


    public static void main(String args[]) throws IOException
    {

        
        String binary;
        long decimal;
        FileReader file = new FileReader("RAMerrors8x4f.6");
        Scanner scnr = new Scanner(file);
        

        System.out.printf("%s\n", "Hex Error    Binary                                     Decimal");
        while (scnr.hasNextLine())
        {

          String reader = scnr.nextLine();
          binary = hexBinary(reader);
          decimal = binaryDec(binary);

          System.out.printf("%s = %s = %d \n", reader, binary, decimal);  
         
          
        }

        
    
    }



}   
