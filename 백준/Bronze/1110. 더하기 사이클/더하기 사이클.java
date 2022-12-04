import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int copy = N;
        int count = 0;
        
        while (true) {
            int left = copy / 10;
            int right = copy % 10;
            
            int sum = left + right;
            
            copy = right * 10 + sum % 10;
            count++;
            
            if (N == copy) {
                break;
            }
        }
        
        bw.write(count + "\n");
        
        bw.flush();
        bw.close();
        br.close();
    }
}