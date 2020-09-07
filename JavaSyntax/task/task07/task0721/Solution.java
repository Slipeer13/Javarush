package com.javarush.task.task07.task0721;                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                          
import java.io.BufferedReader;                                                                                                                                                                                                                                                          
import java.io.IOException;                                                                                                                                                                                                                                                          
import java.io.InputStreamReader;                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                          
/*                                                                                                                                                                                                                                                           
Минимаксы в массивах                                                                                                                                                                                                                                                          
*/                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                          
public class Solution {                                                                                                                                                                                                                                                          
    public static void main(String[] args) throws IOException {                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                          
        int[] arr = getints();                                                                                                                                                                                                        
                                                                                                                                                                                                                
        int max = arr[0];                                                                                                                                                                                                        
        int min = arr[0];                                                                                                                                                                                                        
        for (int i = 1; i < arr.length; i++) {                                                                                                                                                                                                        
            if (arr[i] > max)                                                                                                                                                                                                        
            max = arr[i];                                                                                                                                                                                                        
            if (arr[i] < min)                                                                                                                                                                                                        
            min = arr[i];                                                                                                                                                                                                         
        }//напишите тут ваш код                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                          
        System.out.print(max + " " + min);                                                                                                                                                                                                                                                          
    }                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                          
    public static int[] getints() throws IOException {                                                                                                                                                      
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));                                                                                                                                                      
        int[] arr = new int[20];                                                                                                                                                                                                           
        for (int i = 0; i < arr.length; i++) {                                                                                                                                                                                                        
            arr[i] = Integer.parseInt(buff.readLine());                                                                                                                                                                                                        
                                                                                                                                                                                                        
        }                                                                                                                                                                                                        
        return arr;                                                                                                                                                                                                        
    }//напишите тут ваш код                                                                                                                                                                                                                                                          
}                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
