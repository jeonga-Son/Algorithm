import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] score;
        
        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int N = Integer.parseInt(st.nextToken());
            score = new int[N];
            
            double sum = 0;
            
            for (int j = 0; j < N; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
            }
            
            double avg = sum / N;
            double cnt = 0;
            
            for (int j = 0; j < N; j++) {
                if (avg < score[j]) {
                    cnt++;
                }
            }
            
            System.out.printf("%.3f%%\n", (cnt/N) * 100);
        }
    }
}