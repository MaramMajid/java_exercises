
package rightmostdigits;

import java.util.ArrayList;
import java.util.List;


public class RightMostDigits {

    /**
     * Given a list of non-negative integers, return an integer list of the rightmost digits. 

     */
    public static void main(String[] args) {
       
      List<Integer> nums =new ArrayList<Integer>();
      nums.add(99);
      nums.add(344);
      nums.add(454); 
      nums.add(22);
      nums.add(77);
      nums.add(990);
     List<Integer> rightDigit1= rightDigit1(nums);
     System.out.print("{");//print the list - first way 
    int i=0;
    for(i=0;i<rightDigit1.size()-1;i++){System.out.print(rightDigit1.get(i)+" ,");}
     System.out.print(rightDigit1.get(i)+"}");
     
     List<Integer> rightDigit2= rightDigit1(nums);
     System.out.print("{");//print the list - second way 
     i=0;
     
    for(i=0;i<rightDigit2.size()-1;i++){System.out.print(rightDigit2.get(i)+" ,");}
     System.out.print(rightDigit2.get(i)+"}");
    }
  
    
    
  public static List<Integer>rightDigit1(List<Integer> nums) {//first method
   List<Integer> Newnums =new ArrayList<Integer>();
   
    for(int i=0;i<nums.size();i++){
    String str = String.valueOf(nums.get(i));
    int index=str.length()-1;
    char ctr=str.charAt(index);
    Newnums.add(Integer. parseInt(""+ctr));
   
     }
        return Newnums;
  
}
  
  
  public List<Integer> rightDigit2(List<Integer> nums) {//second method
   nums.replaceAll(n -> n % 10);
    return nums;
 
 }
  
  
}
