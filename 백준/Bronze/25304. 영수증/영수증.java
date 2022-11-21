import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int X = stdIn.nextInt();
        int N = stdIn.nextInt();
        int a = 0;
        int b = 0;
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            a = stdIn.nextInt();
            b = stdIn.nextInt();
            sum += a * b;
        }
        
        if (sum == X) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}