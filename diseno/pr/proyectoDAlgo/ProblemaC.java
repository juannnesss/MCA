/*
 Autor: Juan Sebastian Vargas
 Codigo:201215310
 */
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Set;
class ProblemaC
{
    public static void main(String[] args)
    {
        //lectura de la entrada
        String[] input=null;
        try
        {BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        line = stdin.readLine();
        input = line.split(" ");}
        catch (Exception e)
        {}
        //init varibles
        ArrayList<Integer> temp=new ArrayList<Integer>();
        temp.add(Integer.parseInt(args[0]));
        temp.add(Integer.parseInt(input[0]));
        boolean posible=false;
        int i=1;
        posible=findPartition(temp,temp.size());
        while(!posible&&i<input.length)
        {
            temp.add(Integer.parseInt(input[i]));
            i++;
            posible=findPartition(temp,temp.size());
            }
    //se genera respuesta
        String rta=null;
        if(posible)
        {rta="S";}
        else
        {rta="N";}
        System.out.println(rta); // Se imprime la salidaDisplay the string.
    }
    public static int length(int n)
    {
        return (int)(Math.log10(n)+1);
    }
    
    // A utility function that returns true if there is a
    // subset of arr[] with sun equal to given sum
    static boolean isSubsetSum (ArrayList<Integer> arr, int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;
        
        // If last element is greater than sum, then ignore it
        if (arr.get(n-1) > sum)
            return isSubsetSum (arr, n-1, sum);
        
        /* else, check if sum can be obtained by any of
         the following
         (a) including the last element
         (b) excluding the last element
         */
        return isSubsetSum (arr, n-1, sum) ||
        isSubsetSum (arr, n-1, sum-arr.get(n-1));
    }
    
    // Returns true if arr[] can be partitioned in two
    // subsets of equal sum, otherwise false
    static boolean findPartition (ArrayList<Integer> arr, int n)
    {
        // Calculate sum of the elements in array
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr.get(i);
        
        // If sum is odd, there cannot be two subsets
        // with equal sum
        if (sum%2 != 0)
            return false;
        
        // Find if there is subset with sum equal to half
        // of total sum
        return isSubsetSum (arr, n, sum/2);
    }
    
}
