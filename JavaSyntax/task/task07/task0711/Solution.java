package com.javarush.task.task07.task0711;                                                                                                                                                      
import java.util.ArrayList;                                                                                                    
import java.io.BufferedReader;                                                                                                    
import java.io.InputStreamReader;                                                                                                                                                    
/*                                                                                                                                                       
Удалить и вставить                                                                                                                                                      
*/                                                                                                                                                      
                                                                                                                                                      
public class Solution {                                                                                                                                                      
    public static void main(String[] args) throws Exception {                                                                                                                                                      
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));                                                                                                    
        ArrayList<String> list = new ArrayList<String>();                                                                                                    
        for(int i = 0;i < 5; i++){                                                                                                    
            list.add(buff.readLine());                                                                                                    
                                                                                                    
        }                                                                                                    
        for (int i =0; i < 13;i++) {                                                                                                    
            list.add(0, list.get(list.size() -1));                                                                                                    
            list.remove(list.size() -1);                                                                                                    
        }                                                                                                    
                                                                                                            
        for(int i = 0;i < list.size(); i++){                                                                                                       
        System.out.println(list.get(i));                                                                                                    
                                                                                                    
        }                                                                                                    
//напишите тут ваш код                                                                                                                                                      
    }                                                                                                                                                      
}                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
