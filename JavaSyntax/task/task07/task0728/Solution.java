package com.javarush.task.task07.task0728;                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                            
import java.io.BufferedReader;                                                                                                                                                                                                                                                                                                            
import java.io.InputStreamReader;                                                                                                                                                                                                                                                            
import java.util.Arrays;                                                                                                                                                                                                         
import java.util.Collections;                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                                                                            
/*                                                                                                                                                                                                                                                                                                             
В убывающем порядке                                                                                                                                                                                                                                                                                                            
*/                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                            
public class Solution {                                                                                                                                                                                                                                                                                                            
    public static void main(String[] args) throws Exception {                                                                                                                                                                                                                                                                                                            
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));                                                                                                                                                                                                                                                                                                            
        int[] array = new int[20];                                                                                                                                                                                                                                                                                                            
        for (int i = 0; i < 20; i++) {                                                                                                                                                                                                                                                                                                            
            array[i] = Integer.parseInt(reader.readLine());                                                                                                                                                                                                                                                                                                            
        }                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                            
        sort(array);                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                            
        for (int x: array) {                                                                                                                                                                                                                                                                                                            
            System.out.println(x);                                                                                                                                                                                                                                                                                                            
        }                                                                                                                                                                                                                                                                                                            
    }                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                            
    public static void sort(int[] array) {                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                
        int[] resultArray = new int[array.length];                                                                                                     
        resultArray = array.clone();                                                                                                    
        Arrays.sort(resultArray);                                                                                                                                             
        for (int i = 0; i < resultArray.length; i++) {                                                                                                                                                      
            array[i] = resultArray[resultArray.length -1 - i];                                                                                                                                                      
        }                                                                                                                                                          
                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                            
        //напишите тут ваш код                                                                                                                                                                                                                                                                                                            
    }                                                                                                                                                                                                                                                                                                            
}                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
