import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code her

        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        if(n<=m){
        
        System.out.print(m/n);
        }
        else{
            System.out.print(0);
        }


    }
}