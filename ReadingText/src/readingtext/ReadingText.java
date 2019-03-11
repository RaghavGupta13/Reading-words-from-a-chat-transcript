/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingtext;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Raghav Gupta
 */
public class ReadingText {
    
    
    public static void main(String[] args) throws FileNotFoundException {
        
        String token ;
        
        
        File file = new File("C:\\Users\\Raghav Gupta\\Documents\\read.txt");
        Scanner sc = new Scanner(file);
        
        
        
        List<String> words = new ArrayList<>();
        
        while(sc.hasNext()){
            
            token = sc.next();
            words.add(token);
            
        }
        sc.close();
        
        String[] wordArray = words.toArray(new String[0]);
        
        for(String s : wordArray){
           
            if(s.length() > 4){
        
        System.out.println(s);
            
        }}}

    
}
    
        
        
    
    

