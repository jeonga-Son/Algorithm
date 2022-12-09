import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = 0;
        int count = 0;
        
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (max < num) {
                max = num;
                count = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}