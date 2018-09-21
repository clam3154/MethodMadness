/**Calvin Lam 9/18/18
 *
 */
package CLam;

public class CLamLib
{
    public static void println(String str)
    {
        System.out.println(str);
    }
    public static String dateStr(String day)
    {
        /**Switch mm/dd/yyyy to dd-mm-yyyy
         *
         */
        String date = day.substring(3,5) + "-" + day.substring(0,2) + "-" + day.substring(6);
        System.out.println(date);
        return date;
    }
    public static String cutOut(String mainStr, String subStr)
    {
        /**Cuts out the second word from the first word
         *
         */
        String word = mainStr.substring(0, mainStr.indexOf(subStr));
        /**Letters before the second word
         *
         */
        word += mainStr.substring(subStr.length() + mainStr.indexOf(subStr));
        /**Letters after the second word
         *
         */
        System.out.println(word);
        return word;
    }
    public static int sumUpTo(int num)
    {
        /**Sums of number up to num
         *
         */
        int result = 0;
        for(int i = num; i > 0; i--)
        {
            result += i;
        }
        System.out.println(result);
        return result;
    }
    public static boolean isFibonnaci(int num)
    {
        int fib1 = 0;
        int fib2 = 1;
        while(fib1 <= num || fib2 <= num)
        {
            fib1 = fib1 + fib2;
            fib2 = fib1 + fib2;
            if (num == fib1 || num == fib2 || num == 0)
            {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
    public static boolean isPalindrome(String word)
    {
        String backward = "";
        for(int i = word.length(); i > 0; i--)
        {
            backward += word.substring(i-1,i);
        }
        if(backward.equals(word))
        {
            System.out.println(true);
            return true;
        }
        else
        {
            System.out.println(false);
            return false;
        }
    }
}
