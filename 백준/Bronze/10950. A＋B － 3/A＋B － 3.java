import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int T = stdIn.nextInt();
        int A = 0;
        int B = 0;
        
        for (int i = 0; i < T; i++) {
            A = stdIn.nextInt();
            B = stdIn.nextInt();
            
            if (A > 0 && B < 10) {
                System.out.println(A + B);
            }
        }
    }
}