package com.javarush.task.task07.task0718;                                                                                                                                                                                                        
import java.io.BufferedReader;                                                                                                                                                      
import java.io.InputStreamReader;                                                                                                                                                                                                       
import java.io.IOException;                                                                                                                                                       
import java.util.ArrayList;                                                                                                                                                                                                       
                                                                                                                                                                                                        
/*                                                                                                                                                                                                         
Проверка на упорядоченность                                                                                                                                                                                                        
*/                                                                                                                                                                                                        
public class Solution {                                                                                                                                                                                                        
    public static void main(String[] args) throws IOException {                                                                                                                                                                                                        
        ArrayList<String> list = new ArrayList<>();                                                                                                                                                      
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));                                                                                                                                                      
        for (int i = 0; i < 10; i++)                                                                                                                                                       
        {                                                                                                                                                      
            list.add(reader.readLine());                                                                                                                                                      
        }                                                                                                                                                      
        for (int i = 0; i < list.size() -1; i++)                                                                                                                                                       
        {                                                                                                                                                      
            int min = list.get(i).length();                                                                                                                                                      
            if(list.get(i + 1).length() < min)                                                  
            {                                                                                                                                                      
            System.out.println(i + 1);                                                   
            break;                                                                                                                                                     
            }                                                                                                                                                      
        }                                                                                                                                                      
                                                                                                                                                      
//напишите тут ваш код                                                                                                                                                      
                                                                                                                                                                                                        
    }                                                                                                                                                                                                        
}                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                                                                  
                                                 
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
