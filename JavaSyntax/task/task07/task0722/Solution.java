package com.javarush.task.task07.task0722;                                                                                                                                                                                                        
                                                                                                                                                                                                        
import java.io.BufferedReader;                                                                                                                                                                                                        
import java.io.IOException;                                                                                                                                                                                                        
import java.io.InputStreamReader;                                                                                                                                                       
import java.util.ArrayList;                                                                                                                                                                                                       
                                                                                                                                                                                                        
/*                                                                                                                                                                                                         
Это конец                                                                                                                                                                                                        
*/                                                                                                                                                                                                        
                                                                                                                                                                                                        
public class Solution {                                                                                                                                                                                                        
    public static void main(String[] args) throws IOException {                                                                                                                                                                                                        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));                                                                                                                                                       
        ArrayList<String> string = new ArrayList<>();                                                                                                                                                      
        for (int i = 0; i < 20; i++) {                                                                                                                                                      
            String s = reader.readLine();                                                                                                                                                      
            if (s.equals("end"))                                                                                                                                                      
            break;                                                                                                                                                      
            else                                                                                                                                                      
            string.add(s);                                                                                                                                                      
        }                                                                                                                                                                    
        for (int i = 0; i < string.size(); i++) {                                                                                                                                                      
            System.out.println(string.get(i));                                                                                                                                                      
        }                                                                                                                                                                                         
                                                                                                                                                                                                        
        //напишите тут ваш код                                                                                                                                                                                                        
    }                                                                                                                                                                                                        
}                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
