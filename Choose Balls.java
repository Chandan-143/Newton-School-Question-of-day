import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int evenSumWays(int N, int M) {
    return (N*(N-1)/2)  + (M*(M-1)/2);
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(evenSumWays(N,M));

    }
}