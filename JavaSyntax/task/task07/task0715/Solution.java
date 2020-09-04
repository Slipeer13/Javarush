package com.javarush.task.task07.task0715;                                                                                                                                                      
import java.util.ArrayList;                                                                                                                                                     
/*                                                                                                                                                       
Продолжаем мыть раму                                                                                                                                                      
*/                                                                                                                                                      
                                                                                                                                                      
public class Solution {                                                                                                                                                      
    public static void main(String[] args) {                                                                                                                                                      
        ArrayList<String> list = new ArrayList<>();                                                                                                    
        list.add("мама");                                                                                                    
        list.add("мыла");                                                                                                    
        list.add("раму");                                                                                                    
        for (int i = 1; i <= list.size(); i++)                                                                                                    
        {                                                                                                    
        if (i % 2 !=0)                                                                                                    
        list.add(i, "именно");                                                                                                    
        }                                                                                                    
        for (String x : list)                                                                                                    
        {                                                                                                    
        System.out.println(x);                                                                                                    
        }                                                                                                    
                                                                                                            
                                                                                                    
//напишите тут ваш код                                                                                                                                                      
    }                                                                                                                                                      
}                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
