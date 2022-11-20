import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();
        int total = 0;
            
        for (int i = 1; i <= num; i++) {
            total += i;
        }
        
        System.out.println(total);
    }
}