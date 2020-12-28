
package isthissumexistinarray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author maram
 */
public class IsThisSumExistInArray {

    /**
     * Given an array of ints , return true if 
     * the sum of any two elements in the array are equal to  required sum value.
     */
    public static void main(String[] args) {
       int[] Array={1,3,8,9,3,5,10,3};//this is the array of ints 
       
      System.out.println("The first way,Is this sum exist ?"+FirstWay(Array,8));
     System.out.println("The second way , Is this sum exist ?"+FirstWay(Array,8));
     System.out.println("The Third way , Is this sum exist ?"+FirstWay(Array,8));
       
    }
       public static boolean  FirstWay(int A[],int sum ) {//here i will use the traditional way to solve is problem using nested for loop
      for(int i=0;i<A.length;i++){
      int Temp=A[i];
      for(int j=0;j<A.length;j++)
      { if(Temp+A[j]==8){
          return true;}
       }
       }
        return false;// Brute force ,it's take o(n^2)
       
    }
    public static boolean secondWay(int A[],int sum ) {//create a hash table of all the elements in the array. then scan over the array and check
HashSet<Integer> values = new HashSet<Integer>();
for (int i = 0; i < A.length; i++) {
if (values.contains(sum-A[i])) 
return true;
values.add(A[i]); 
}
return false;//Hashing tech,This solution runs in expected time O(n)
}
       
 public static boolean ThirdWay(int A[],int sum ) {
     
     /*
     A fourth option is to sort the array, then walk two pointers inward from the ends of the
array, at each point looking at their sum. If it's exactly k, then we're done. If it exceeds k,
then any sum using the larger element is too large, so we walk that pointer inwards. If
it's less than  k, then any sum using the lower element is too small, so we walk that
pointer inwards.

     */
   Arrays.sort(A);
int lhs = 0, rhs = A.length-1;
while (lhs < rhs) {
int TempSum = A[lhs] + A[rhs];
if (TempSum == sum) return true;
else if (TempSum < sum) lhs++;
else rhs--;
}
return false;// Sorting and Walking Inward,this takes time O(n log n)
}

}
