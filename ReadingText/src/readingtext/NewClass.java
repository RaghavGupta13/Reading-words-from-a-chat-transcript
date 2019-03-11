/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingtext;

import java.io.File;

/**
 *
 * @author Raghav Gupta
 */
public class NewClass {
    
    

    public static void main(String[] args) throws IOException {
    // TODO code application logic here

    // // read KeyWestTemp.txt

    // create token1
    String token1 = "";

    // for-each loop for calculating heat index of May - October

    // create Scanner inFile1
    Scanner inFile1;
        inFile1 = new Scanner(new File("C:\\Users\\Raghav Gupta\\Documents\\read.txt")).useDelimiter(",\\s*");

    // Original answer used LinkedList, but probably preferable to use ArrayList in most cases
    // List<String> temps = new LinkedList<String>();
    List<String> temps = new ArrayList<String>();

    // while loop
    while (inFile1.hasNext()) {
      // find next line
      token1 = inFile1.next();
      temps.add(token1);
    }
    inFile1.close();

    String[] tempsArray = temps.toArray(new String[0]);

    for (String s : tempsArray) {
      System.out.println(s);
    }
  }
}
    

