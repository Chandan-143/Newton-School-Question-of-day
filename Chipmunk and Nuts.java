import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0; i<n; i++) {
            
            int a = sc.nextInt();

            if (a>10) {
                sum += a - 10;

            }
        }
        System.out.println(sum);
    }
}