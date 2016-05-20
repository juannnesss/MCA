/*
 Autor: Juan Sebastian Vargas
 Codigo:201215310
 */
import java.util.HashSet;

import java.util.Set;
class ProblemaB
{
    public static void main(String[] args)
    {
        //lectura de entrada
        int p =Integer.parseInt(args[0]);
        int q=Integer.parseInt(args[1]);
        
       
        

        // Se imprime la salida
        System.out.println(periodo(q)); // Display the string.
    }


    public static int length(int n)
    {
        return (int)(Math.log10(n)+1);
    }
    public static int periodo(int n)
    {
        int rem = (int)Math.pow(10,length(n)) ,       count = 0;
        Set<Integer> set = new HashSet<Integer>();
        while(true)
        {
            rem = (rem*10)% n;
            
            if(set.add(rem))
                count++;
            else
                break;
        }
        return count;
    }
    
}
