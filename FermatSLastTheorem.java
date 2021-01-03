
package fermat.slasttheorem;


public class FermatSLastTheorem {

    /**
     * Fermat Last Theorem says that there are no integers a, b,
and c such that a ^n + b ^n = c^n, except when n �<=2.
Write a method named checkFermat that takes four integers as parameters –
a, b, c and n – and checks to see if Fermat’s theorem holds. If n is greater
than 2 and  a ^n + b ^n = c^n, the program should display “Holy smokes, Fermat
was wrong!” Otherwise the program should display No, that doesnt work.”
Hint: You may want to use Math.pow.
     */
    public static void main(String[] args) {
        checkFermat(10,5,2,1);
    }
    
     public static void checkFermat(int a,int b, int c,int n) {
      double result = Math.pow(a,n)+Math.pow(b,n); 
      if(n>2) {
     if(result== Math.pow(c,n))
    System.out.println("Holy smokes, Fermat\n" +"was wrong!");} 
    
      System.out.println("No, that doesn’t work!");
}

}
