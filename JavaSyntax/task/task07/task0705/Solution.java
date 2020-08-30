package com.javarush.task.task07.task0705;                                                                                                                                                                                                        
import java.io.BufferedReader;                                                                                                                                                      
import java.io.InputStreamReader;                                                                                                                                                                                                      
/*                                                                                                                                                                                                         
Один большой массив и два маленьких                                                                                                                                                                                                        
*/                                                                                                                                                                                                        
                                                                                                                                                                                                        
public class Solution {                                                                                                                                                                                                        
    public static void main(String[] args) throws Exception {                                                                                                                                                                                                        
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));                                                                                                                                                      
        int[] array = new int[20];                                                                                                                                                      
        int[] array1 = new int[10];                                                                                                                                                      
        int[] array2 = new int[10];                                                                                                                                                      
        for (int i = 0; i < 20; i++) {                                                                                                                                                      
        array[i] = Integer.parseInt(buff.readLine());                                                                                                                                                      
        }                                                                                                                                                      
        for (int i = 0; i < 10; i++) {                                                                                                                                                      
        array1[i] = array[i];                                                                                                                                                      
        }                                                                                                                                                      
        for (int i = 0; i < 10; i++) {                                                                                                                                                      
        array2[i] = array[i + 10];                                                                                                                                                      
        System.out.println(array2[i]);                                                                                                                                                      
        }                                                                                                                                                      
        //напишите тут ваш код                                                                                                                                                                                                        
    }                                                                                                                                                                                                        
}                                                  
                                                  
                 
