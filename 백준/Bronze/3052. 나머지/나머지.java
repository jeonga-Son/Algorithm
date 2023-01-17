import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[10];
        int[] arr = new int[1001];
        int cnt = 0;
        
        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(br.readLine());    
        }
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 42 == 0) {
                arr[num[i] % 42] = 1;
            }
            
            if (num[i] % 42 != 0) {
                arr[num[i] % 42] = 1;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}