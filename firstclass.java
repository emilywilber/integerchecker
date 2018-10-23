
/**
 * Write a description of class firstclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class firstclass
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * 
     */
    public static boolean firstclass(int n)
    {
        int digit = 0;
        boolean haveseeneven = false;
   
        
        System.out.println("\ninput at program start " + n);
        
        while (n > 0)  {
            digit = n % 10;
            System.out.println("n at start loop " + n);
            System.out.println("digit " + digit);
            if ((digit % 2) == 1)  {
                // The digit is odd, and we've already seen even 
                System.out.println("digit is odd");
                if (haveseeneven)  {
                    System.out.println("digit is odd and we already saw even");
                    return false;
                }
            }
            else {
                // The digit is even, let's remember that
                System.out.println("digit is even!!!");
                haveseeneven = true;
            }
            n = n / 10;
            
        }
        
       
        System.out.println("returning true" + digit);
        return true;
    }

   
}
