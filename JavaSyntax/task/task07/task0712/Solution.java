package com.javarush.task.task07.task0712;                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                          
import java.io.IOException;                                                                                                                                                                                                        
import java.io.BufferedReader;                                                                                                                                                                                                        
import java.io.InputStreamReader;                                                   
import java.util.ArrayList;                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                          
/*                                                                                                                                                                                                                                                           
Самые-самые                                                                                                                                                                                                                                                          
*/                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                          
public class Solution {                                                                                                                                                                                                                                                          
    public static void main(String[] args) throws IOException {                                                                                                                                                                                                                                                          
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));                                                                                                                                                                                                        
        ArrayList<String> string = new ArrayList<String>();                                                                                                                                                                                                        
                                                                                                                                                                                                               
                                                                                                                                                                                                               
        for (int i = 0; i < 10; i++) {                                                                                                                                                                                                        
            string.add(buff.readLine());                                                                                                                                                                                                        
        }                                                                                                                                                               
        int max = string.get(0).length();                                                                                                                                                      
        int min = string.get(0).length();                                                                                                                                                      
                                                                                                                                                                                               
        for (int i = 1; i < string.size(); i++) {                                                                                                                                                                                                        
            if (string.get(i).length() >= max)                                                                                                                                                       
            max = string.get(i).length();                                                                                                                                                      
            if (string.get(i).length() <= min)                                                                                                                                                       
            min = string.get(i).length();                                                                                                                                                                                                        
        }                                                  
        int n = 0;                                                                                                                                                                                                        
        while (n < string.size()) {                                                  
        if (string.get(n).length() == max || string.get(n).length() == min) {                                                   
        System.out.println(string.get(n));                                                  
        break;                                                  
        }                                                  
        n++;                                                  
        }                                                  
                                                                                                                                                                                                       
                                                                                                                                                                                                        
//напишите тут ваш код                                                                                                                                                                                                                                                          
    }                                                                                                                                                                                                                                                          
}                                                  
                                                  
              
