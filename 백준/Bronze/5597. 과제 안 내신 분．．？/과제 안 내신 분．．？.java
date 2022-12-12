import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] array = new boolean[31];
        
        for (int i = 0; i < 28; i++) {
            int student = Integer.parseInt(br.readLine());
            array[student] = true;
        }
        
        for (int i = 1; i <= 30; i++) {
            if (!array[i]) {
                System.out.println(i);
            }
        }
    }
}