/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maram
 */
public class NoZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
      List<String> str =new ArrayList<String>();
      str.add("cghz");
      str.add("nozzf");
      str.add("hzello");
    
     List<String>remove= noZ(str);
    System.out.print("{");//print the list - first way 
    int i=0;
    for(i=0;i<remove.size()-1;i++){System.out.print(remove.get(i)+" ,");}
     System.out.print(remove.get(i)+"}");

        
        
    }
    public static List<String> noZ(List<String> str) {
    List<String> NoZ =new ArrayList<String>();

      int i=0;
    for(i=0;i<str.size();i++){
   NoZ.add( str.get(i).replaceAll("z", ""));
      }    
        
        
        
        
      return NoZ;}

}
