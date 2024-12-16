// CVMath.java
package pkg;

public class CVMath {    
    public static void specialSquare(int n) {
        int count = 0;
        int x = 1;
        while (count < n) {
            int square = x * x;
            int k = 1;
            int sum = 0;
            while (sum < square) {
                sum += k;
                k++;
            }
            if (sum == square) {
                System.out.println(square);
                count++;
            }
            
            x++;
        }
    }
}
