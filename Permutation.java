import java.util.Scanner;
 
public class Permutation{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        permutation(str);
    }
    
    /**Init Function
     * @param str String to be permuted
     */
    public static void permutation(String str) { 
        permutation("", str); 
    }

    /**Actual Recurssive function.
     * 
     * @param prefix Charaters that were permuted.
     * @param str Remaining Characters to be permuted.
     */
    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
 
}

https://spark.adobe.com/page/zjbI2J4aAWoCr/
