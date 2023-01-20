import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        long sum = 0;
        long max = 0;
        
        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            
            if (score[i] > max) {
                max = score[i];
            }
            
            sum += score[i];
        }
        
        System.out.println(sum * 100.0 / max / N);
    }
}