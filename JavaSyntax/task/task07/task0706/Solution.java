package com.javarush.task.task07.task0706;                                                                                                                                                      
import java.io.BufferedReader;                                                                                                    
import java.io.InputStreamReader;                                                                                                                                                     
import java.io.IOException;                                                                                                                                                      
                                                                                                                                                      
/*                                                                                                                                                       
Улицы и дома                                                                                                                                                      
*/                                                                                                                                                      
                                                                                                                                                      
public class Solution {                                                                                                                                                      
    public static void main(String[] args) throws IOException {                                                                                                                                                      
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));                                                                                                    
        int[] array = new int[15];                                                   
        int even =0;                                                  
        int odd = 0;                                                                                         
        for (int i = 0; i < 15; i++) {                                                                                                                                                      
            array[i] = Integer.parseInt(buff.readLine());                                                   
        if (i % 2 == 0)                                                  
            even += array[i];                                                  
        else                                                  
            odd += array[i];                                                                                                                                            
        }                                                                                                    
        if (even > odd)                                                   
        System.out.println("В домах с четными номерами проживает больше жителей.");                                                  
        else                                                  
        System.out.println("В домах с нечетными номерами проживает больше жителей.");                                                                                           
//напишите тут ваш код                                                                                                                                                      
    }                                                                                                                                                      
}                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
