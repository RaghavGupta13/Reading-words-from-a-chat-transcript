/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingtext;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Raghav Gupta
 */
public class NewClass1 {
    
    public String[] s;
    public static void main(String[] args) throws FileNotFoundException {
        
        String token;
        
        
        File file = new File("C:\\Users\\Raghav Gupta\\Documents\\read.txt");
        Scanner sc = new Scanner(file);
        
        while(sc.hasNextLine()){
        token = sc.nextLine();
        String[] words = token.split("");
        
        System.out.println(words);
        }
        
        
        
            
        
        
            
        }
    
}
